package com.sneakers.urbnkicks

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        window.statusBarColor = android.graphics.Color.parseColor("#fff9ef")

        if (FirebaseAuth.getInstance().uid != null) {
            startActivity(Intent(this, ShopActivity::class.java))
            finish()
        }

        val signup_page = findViewById<TextView>(R.id.register)
        val sign_in_btn = findViewById<Button>(R.id.login_button)


        signup_page.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
            finish()
        }

        sign_in_btn.setOnClickListener {

            sign_in_btn.isEnabled = false
            signup_page.isEnabled = false

            val email = findViewById<TextView>(R.id.email_id)
            val pass = findViewById<TextView>(R.id.password)

            if (email.text.toString().isBlank()) {
                email.error = "Email cannot be Empty"
                sign_in_btn.isEnabled = true
                signup_page.isEnabled = true
                return@setOnClickListener
            } else if (pass.text.toString().isBlank()) {
                pass.error = "Password cannot be Empty"
                sign_in_btn.isEnabled = true
                signup_page.isEnabled = true
                return@setOnClickListener
            }

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email.text.toString(), pass.text.toString())
                .addOnSuccessListener {
                    Toast.makeText(this, "Signed In Successfully", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, ShopActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                .addOnFailureListener {

                    if (it.message == "The supplied auth credential is incorrect, malformed or has expired."){
                        Toast.makeText(this, "Email or Password is Incorrect", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                    }

                    sign_in_btn.isEnabled = true
                    signup_page.isEnabled = true
                }
        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
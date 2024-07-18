package com.sneakers.urbnkicks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.window.OnBackInvokedDispatcher
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class RegistrationActivity : AppCompatActivity() {

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_left, R.anim.alide_out_right)
        super.onBackPressed()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)

        val signin_page = findViewById<TextView>(R.id.back_to_login)
        val reg_button = findViewById<Button>(R.id.register_button)

        signin_page.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.alide_out_right)
            finish()
        }

        reg_button.setOnClickListener {

            reg_button.isEnabled = false
            signin_page.isEnabled = false

            val name = findViewById<TextView>(R.id.username)
            val email = findViewById<TextView>(R.id.email_id2)
            val password = findViewById<TextView>(R.id.pw)
            val c_password = findViewById<TextView>(R.id.cpw)

            if (password.text.toString().contains(" ")) {
                password.error = "Password cannot contain spaces"
                reg_button.isEnabled = true
                signin_page.isEnabled = true
                return@setOnClickListener
            } else if (password.text.toString().length < 8) {
                password.error = "Password has to be atleast 8 characters long"
                reg_button.isEnabled = true
                signin_page.isEnabled = true
                return@setOnClickListener
            } else if (password.text.toString() != c_password.text.toString()) {
                c_password.error = "Passwords do not match"
                reg_button.isEnabled = true
                signin_page.isEnabled = true
                return@setOnClickListener
            } else if (name.text.toString().isBlank() ) {
                name.error = "Please Enter Your Name"
                reg_button.isEnabled = true
                signin_page.isEnabled = true
                return@setOnClickListener
            } else if (name.text.toString().trim().length > 25) {
                name.error = "Name cannot be more than 25 Characters long"
                reg_button.isEnabled = true
                signin_page.isEnabled = true
                return@setOnClickListener
            }

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email.text.toString() , password.text.toString())
                .addOnSuccessListener {
                    uploadInfoToDB(name.text.toString().trim(), email.text.toString(), password.text.toString(), it.user!!.uid)
                }
                .addOnFailureListener {
                    reg_button.isEnabled = true
                    signin_page.isEnabled = true
                    Toast.makeText(this@RegistrationActivity, it.message, Toast.LENGTH_LONG).show()
                }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun uploadInfoToDB(name : String?, email : String?, pass : String?, uid : String?) {
        val ref = FirebaseDatabase.getInstance("https://urbnkicks-325ea-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference("/users/$uid")
        ref.setValue(UserData(uid, name, email, pass))
            .addOnSuccessListener {
                Toast.makeText(this@RegistrationActivity, "Account Created Successfully", Toast.LENGTH_LONG).show()
                startActivity(Intent(this@RegistrationActivity, ShopActivity::class.java))
                finish()
            }
            .addOnFailureListener {
                Toast.makeText(this@RegistrationActivity, "An Error Occurred", Toast.LENGTH_LONG).show()
                finish()
            }
    }
}
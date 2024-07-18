package com.sneakers.urbnkicks

import android.graphics.PorterDuff
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.stream.IntStream.range

class ShopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shop)


        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        var at_home = true

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentHodler, HomeFragment())
            commit()
        }

        findViewById<ImageView>(R.id.home).setColorFilter(
            ContextCompat.getColor(
                this,
                R.color.accent
            )
        )

        findViewById<ImageView>(R.id.home).setOnClickListener {
            if (!at_home) {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragmentHodler, HomeFragment())
                    commit()
                }
                resetNavMenu()
                findViewById<ImageView>(R.id.home).setColorFilter(
                    ContextCompat.getColor(
                        this,
                        R.color.accent
                    )
                )
            }

            at_home = true
        }

        findViewById<ImageView>(R.id.search).setOnClickListener {

                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragmentHodler, SearchFragment())
                    commit()

                }

            resetNavMenu()
            findViewById<ImageView>(R.id.search).setColorFilter(ContextCompat.getColor(this, R.color.accent))
            at_home = false
        }

        findViewById<ImageView>(R.id.wishlist).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentHodler, WishlistFragment())
                commit()
            }
            resetNavMenu()
            findViewById<ImageView>(R.id.wishlist).setColorFilter(ContextCompat.getColor(this, R.color.accent))
            at_home = false
        }

        findViewById<ImageView>(R.id.profile).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentHodler, ProfileFragment())
                commit()
            }
            resetNavMenu()
            findViewById<ImageView>(R.id.profile).setColorFilter(ContextCompat.getColor(this, R.color.accent))
            at_home = false
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun resetNavMenu() {
        findViewById<ImageView>(R.id.home).setColorFilter(null)
        findViewById<ImageView>(R.id.search).setColorFilter(null)
        findViewById<ImageView>(R.id.wishlist).setColorFilter(null)
        findViewById<ImageView>(R.id.profile).setColorFilter(null)
    }
}
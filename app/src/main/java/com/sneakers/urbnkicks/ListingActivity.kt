package com.sneakers.urbnkicks

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.squareup.picasso.Picasso

class ListingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listing)

        val item = intent.getParcelableExtra<ItemListing>("item")

        val shoeImageView      = findViewById<ImageView>(R.id.shoeImageView)
        val brandTextView      = findViewById<TextView>(R.id.brandTextView)
        val modelTextView      = findViewById<TextView>(R.id.modelTextView)
        val priceTextView      = findViewById<TextView>(R.id.priceTextView)
        val mrpTextView        = findViewById<TextView>(R.id.mrpTextView)
        val discountTextView   = findViewById<TextView>(R.id.discountTextView)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionTextView)
        val categoryTextView   = findViewById<TextView>(R.id.categoryTextView)
        val genderTextView     = findViewById<TextView>(R.id.genderTextView)
        val tagsTextView       = findViewById<TextView>(R.id.tagsTextView)

        val buy = findViewById<Button>(R.id.btnBuyNow)
        val add_to_cart = findViewById<Button>(R.id.btnAddToCart)

        buy.setOnClickListener {
            Toast.makeText(this, "Feature under Development", Toast.LENGTH_SHORT).show()
        }

        add_to_cart.setOnClickListener {
            Toast.makeText(this, "Feature under Development", Toast.LENGTH_SHORT).show()
        }

        // Populate each view with the corresponding data
        item?.let { listing ->
            // Load image using Picasso (or your preferred image loader)
            Picasso.get()
                .load(listing.image_link)
                .fit()
                .centerCrop()
                .into(shoeImageView)

            brandTextView.text = listing.brand ?: "N/A"
            modelTextView.text = listing.model ?: "N/A"

            // Price & MRP
            val priceValue = listing.price?.toInt() ?: 0
            val mrpValue   = listing.mrp?.toInt() ?: 0
            priceTextView.text = "₹$priceValue"
            mrpTextView.text   = "₹$mrpValue"

            // Calculate discount percentage
            val discountPercent = if (listing.mrp != null && listing.price != null && listing.mrp > 0) {
                (((listing.mrp - listing.price) / listing.mrp) * 100).toInt()
            } else 0
            discountTextView.text = "($discountPercent% OFF)"

            var description_text = listing.desc
            if (description_text == "none") {
                description_text = "Crafted for comfort and designed for everyday style, these shoes offer a perfect blend of durability, breathability, and all-day support. Whether you're heading out for a casual stroll or stepping into your daily routine, their versatile design and dependable construction make them a must-have in any wardrobe."
            }

            // Description
            descriptionTextView.text = description_text ?: "No description available."

            // Category, Gender, Tags
            categoryTextView.text = listing.category ?: "N/A"
            genderTextView.text   = listing.gender ?: "N/A"
            tagsTextView.text     = "Sneakers, ${listing.brand}, Lifestyle" ?: "N/A"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
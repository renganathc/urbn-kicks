package com.sneakers.urbnkicks

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sneakers.urbnkicks.ItemListing
import com.squareup.picasso.Picasso
import kotlin.math.roundToInt

class ItemListingAdapter(var items : List<ItemListing>, private val onItemClick: (ItemListing) -> Unit) : RecyclerView.Adapter<ItemListingAdapter.NAViewHolder>() {
    inner class NAViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NAViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_listing, parent, false)
        return NAViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: NAViewHolder, position: Int) {
        holder.itemView.apply {
            val brand = findViewById<TextView>(R.id.brand)
            val model = findViewById<TextView>(R.id.model)
            val price = findViewById<TextView>(R.id.price)
            val discount = findViewById<TextView>(R.id.discount)
            val shoe_img = findViewById<ImageView>(R.id.shoe_pic)

            val price_data = items[position].price
            val mrp_data = items[position].mrp

            val buck_price = price_data.toString()
            val char_price =  price_data.toString().toCharArray()

            var discount_data = (mrp_data!! - price_data!!)/mrp_data!!
            discount_data *= 100

            brand.text = items[position].brand
            model.text = items[position].model


            //if (char_price[char_price.size - 1] == '0') {
            //    price.text = price_data.toString() + "0"
            //} else {
                price.text = price_data.toString()
            //}

            discount.text = "[--" + discount_data.roundToInt().toString() + "%"

            Picasso.get()
                .load(items[position].image_link)
                .fit()
                .centerCrop()
                .into(shoe_img)


        }
        holder.itemView.setOnClickListener {
            onItemClick(items[position])
        }
    }
}
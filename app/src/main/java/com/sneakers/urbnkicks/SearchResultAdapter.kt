package com.sneakers.urbnkicks

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class SearchResultAdapter(val item : List<ItemListing>) : RecyclerView.Adapter<SearchResultAdapter.SearchResultViewHolder>() {
    inner class SearchResultViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchResultViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_search_result, parent, false)
        return SearchResultViewHolder(view)
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: SearchResultViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.model).text = item[position].model
            findViewById<TextView>(R.id.brand).text = item[position].brand
            findViewById<TextView>(R.id.price).text = item[position].price.toString()
            findViewById<TextView>(R.id.mrp).text = item[position].mrp.toString()

            Picasso.get()
                .load(item[position].image_link)
                .fit()
                .centerCrop()
                .into(findViewById<ImageView>(R.id.pic))
        }
    }


}
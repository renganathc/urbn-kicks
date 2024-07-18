package com.sneakers.urbnkicks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class BannerAdapter (var banner_info: List<Banner>) :
    RecyclerView.Adapter<BannerAdapter.BAViewHolder>() {
    inner class BAViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BAViewHolder {
        return BAViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.banner, parent, false))
    }

    override fun getItemCount(): Int {
        return banner_info.size
    }

    override fun onBindViewHolder(holder: BAViewHolder, position: Int) {
        holder.itemView.apply {
            val banner = findViewById<ImageView>(R.id.banner_img)

            Picasso.get()
                .load(banner_info[position].banner_link)
                .fit()
                .centerCrop()
                .into(banner)
        }
    }
}
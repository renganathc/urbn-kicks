package com.sneakers.urbnkicks

import android.content.ClipData.Item
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.log

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cart = view.findViewById<ImageView>(R.id.cart)


        var banner = ShopRepository().getBanners()
        var b_rv = view.findViewById<RecyclerView>(R.id.banner_recycler_view)

        b_rv.adapter = BannerAdapter(banner)
        b_rv.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        lifecycleScope.launch {
            if (banner.size > 1) {
                // delay(3700L)
                delay(2700L)
                b_rv.smoothScrollToPosition(1)
            }
        }

        lifecycleScope.launch {

            if (banner.size > 1) {
                var i = banner.size
                var reverse = false
                while (i % banner.size <= banner.size) {

                    delay(3000L)

                    if (reverse) i--
                    else i++

                    b_rv.smoothScrollToPosition(i % banner.size)

                    if ((!reverse && i % banner.size == 2) || (reverse && i % banner.size == 0)) {
                        if (reverse) {
                            reverse = false
                        } else {
                            reverse = true
                        }
                    }

                }
            }
        }

        lifecycleScope.launch {

            val new_arrivals = mutableListOf<ItemListing>()
            val popular = mutableListOf<ItemListing>()
            val sale = mutableListOf<ItemListing>()

            val na_rv = view.findViewById<RecyclerView>(R.id.new_arrivals_recycler_view)
            var pop_rv = view.findViewById<RecyclerView>(R.id.popular_shoes_recycler_view)
            var s_rv = view.findViewById<RecyclerView>(R.id.on_sale_recycler_view)

            val adapter_new = ItemListingAdapter(new_arrivals)
            val adapter_pop = ItemListingAdapter(popular)
            val adapter_sale = ItemListingAdapter(sale)

            FirebaseDatabase.getInstance("https://urbnkicks-325ea-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference("/products")
                .addChildEventListener(object : ChildEventListener {
                    override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
                        try {
                            val item = snapshot.getValue(ItemListing::class.java)
9
                            if (item!!.dashboard_cat == "NEW_ARRIVALS") {
                                if (item != null) {
                                    new_arrivals.add(item)
                                    new_arrivals.shuffle()
                                    Log.d("HOME_FRAGMENT_NEW", "Item added")
                                    Log.d("HOME_FRAGMENT_NEW", item.toString())

                                    adapter_new.notifyItemInserted(new_arrivals.size - 1)
                                } else {
                                    Log.e("HOME_FRAGMENT_NEW", "Item is null")
                                }
                            }

                            if (item!!.dashboard_cat == "POPULAR") {
                                if (item != null) {
                                    popular.add(item)
                                    popular.shuffle()
                                    Log.d("HOME_FRAGMENT_POP", "Item added")
                                    Log.d("HOME_FRAGMENT_POP", item.toString())

                                    adapter_pop.notifyItemInserted(popular.size - 1)
                                } else {
                                    Log.e("HOME_FRAGMENT_POP", "Item is null")
                                }
                            }

                            if (item!!.dashboard_cat == "SALE") {
                                if (item != null) {
                                    sale.add(item)
                                    sale.shuffle()
                                    Log.d("HOME_FRAGMENT_SALE", "Item added")
                                    Log.d("HOME_FRAGMENT_SALE", item.toString())

                                    adapter_sale.notifyItemInserted(sale.size - 1)
                                } else {
                                    Log.e("HOME_FRAGMENT_SALE", "Item is null")
                                }
                            }


                        } catch (e: Exception) {
                            Log.e("HOME_FRAGMENT", "Error casting snapshot to ItemListing", e)
                        }


                    }

                    override fun onChildChanged(
                        snapshot: DataSnapshot,
                        previousChildName: String?
                    ) {
                        TODO("Not yet implemented")
                    }

                    override fun onChildRemoved(snapshot: DataSnapshot) {
                        TODO("Not yet implemented")
                    }

                    override fun onChildMoved(snapshot: DataSnapshot, previousChildName: String?) {
                        TODO("Not yet implemented")
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }

                })

            na_rv.adapter = adapter_new
            na_rv.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

            pop_rv.adapter = adapter_pop
            pop_rv.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

            s_rv.adapter = adapter_sale
            s_rv.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        }


        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(b_rv)
    }

}
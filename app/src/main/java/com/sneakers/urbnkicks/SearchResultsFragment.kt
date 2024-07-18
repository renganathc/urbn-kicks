package com.sneakers.urbnkicks

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase

class SearchResultsFragment : Fragment(R.layout.fragment_search_results) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val search_result_items = mutableListOf<ItemListing>()

        val adapter = SearchResultAdapter(search_result_items)

        view.findViewById<RecyclerView>(R.id.search_results_recycler_view).adapter = adapter
        view.findViewById<RecyclerView>(R.id.search_results_recycler_view).layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        FirebaseDatabase.getInstance("https://urbnkicks-325ea-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference("/products")
            .addChildEventListener(object : ChildEventListener {
                override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
                    var item = snapshot.getValue(ItemListing::class.java)

                    search_result_items.add(item!!)
                    Log.d("TAG", item.toString())

                    search_result_items.shuffle()
                    adapter.notifyItemInserted(search_result_items.size - 1)
                }

                override fun onChildChanged(snapshot: DataSnapshot, previousChildName: String?) {
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
    }

}
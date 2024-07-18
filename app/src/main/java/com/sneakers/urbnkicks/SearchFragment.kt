package com.sneakers.urbnkicks

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SearchFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SearchFragment : Fragment(R.layout.fragment_search) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageView>(R.id.cart).setOnClickListener {
            view.findViewById<RecyclerView>(R.id.search_results_recycler_view).isVisible = true
        }

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

        val search_box = view.findViewById<EditText>(R.id.search_bar)

        search_box.doOnTextChanged { text, start, before, count ->

            val query = text?.trim()

            if (query != null) {
                if (query.isBlank()) {
                    search_result_items.clear()
                    lifecycleScope.launch {
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
                } else {
                    search_result_items.clear()
                    lifecycleScope.launch { FirebaseDatabase.getInstance("https://urbnkicks-325ea-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference("/products")
                        .addChildEventListener(object : ChildEventListener {
                            override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
                                var item = snapshot.getValue(ItemListing::class.java)

                                if (item!!.desc!!.contains(query)) {

                                    search_result_items.add(item!!)
                                    Log.d("TAG", item.toString())

                                    search_result_items.shuffle()
                                    adapter.notifyItemInserted(search_result_items.size - 1)
                                }
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

            }
        }

    }

}
package com.sneakers.urbnkicks

import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Button
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
import com.google.firebase.database.Transaction
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.logging.Handler

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

        val search_result_items = mutableListOf<ItemListing>()

        val adapter = SearchResultAdapter(search_result_items)

        view.findViewById<ImageView>(R.id.cart).setOnClickListener {
            Toast.makeText(requireContext(), "Feature under Development", Toast.LENGTH_SHORT).show()
        }

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

        /* search_box.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                val query = search_box.text.toString().trim()

                    if (query.isBlank()) {
                        search_result_items.clear()
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

                    } else {
                        search_result_items.clear()
                        var count = 0
                        FirebaseDatabase.getInstance("https://urbnkicks-325ea-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference("/products")
                            .addChildEventListener(object : ChildEventListener {
                                override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
                                    var item = snapshot.getValue(ItemListing::class.java)

                                    if (item!!.brand!!.contains(query)) {
                                        Toast.makeText(view.context, "$count", Toast.LENGTH_SHORT).show()
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

                        val handler = android.os.Handler(Looper.getMainLooper())
                        handler.postDelayed({
                            Toast.makeText(view.context, "$count", Toast.LENGTH_SHORT).show()
                        }, 5000)


                    }

                true
            } else {
                false // Return false to let the event pass on to other listeners
            }
        } */

        search_box.setOnEditorActionListener { v, actionId, event ->
                view.findViewById<RecyclerView>(R.id.search_results_recycler_view).isVisible = true
                true
        }
    }

}
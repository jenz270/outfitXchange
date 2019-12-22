package com.jienihou.outfitxchange

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx



/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [home_screen.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [home_screen.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeScreen : Fragment() {
    private lateinit var bottomNavigationView: BottomNavigationViewEx
    private lateinit var categoryAdapter: CategoryRVAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_screen, container, false)

        // Logo bar
         val toolbar = view?.findViewById(R.id.toolbar) as Toolbar
        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        // Categories Grid Recycler View
        val categoryRV = view.findViewById(R.id.rv_categories) as RecyclerView
        val columns = 2
        categoryRV.layoutManager = GridLayoutManager(this.context, columns)
        categoryAdapter = CategoryRVAdapter()
        categoryRV.adapter = categoryAdapter
        addCategories()

        // Bottom Navigation View
        bottomNavigationView = view.findViewById(R.id.bottom_navigation) as BottomNavigationViewEx
        bottomNavigationView.enableItemShiftingMode(false)
        bottomNavigationView.setTextVisibility(false)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_home -> Navigation.findNavController(view)
                    .navigate(R.id.home_screen)
                R.id.action_messages -> Navigation.findNavController(view)
                    .navigate(R.id.messages_view)
                R.id.action_add -> Navigation.findNavController(view)
                    .navigate(R.id.new_post_view)
                R.id.action_favorites ->Navigation.findNavController(view)
                    .navigate(R.id.favourites_view)
                R.id.action_account -> Navigation.findNavController(view)
                    .navigate(R.id.user_view)
            }
            true
        }
        return view
    }

    private fun addCategories(){
        val data = CategoryDataSource.createCategories()
        categoryAdapter.categoryList(data)
    }

}

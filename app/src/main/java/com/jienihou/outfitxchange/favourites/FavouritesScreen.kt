package com.jienihou.outfitxchange.favourites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.MainActivity
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.source.FavouriteDataSource
import com.jienihou.outfitxchange.data.source.MessageDataSource
import com.jienihou.outfitxchange.messages.MessageRVAdapter

/**
 * FavouritesScreen shows the favourites screen
 */
class FavouritesScreen : Fragment() {

    private val favouritesAdapter = FavouritesRVAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_favourites_view, container, false)

        // Logo bar view
        val toolbar = view?.findViewById(R.id.toolbar) as Toolbar
        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        // Favourites Recycler View
        val favouritesRV = view.findViewById(R.id.rv_favourites) as RecyclerView
        favouritesRV.layoutManager = LinearLayoutManager(this.context)
        favouritesRV.adapter = favouritesAdapter
        addFavourites()

        // Bottom Navigation View
        (activity as MainActivity).setupBottomNavigationView(view)

        // Inflate the layout for this fragment
        return view
    }

    // addFavourites populates the favourites data into the recycler view
    private fun addFavourites() {
        val data = FavouriteDataSource.createFavourites()
        favouritesAdapter.favouritesList(data)
    }
}

package com.jienihou.outfitxchange.productdetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import com.jienihou.outfitxchange.R

/**
 * ProductDetailsScreen shows the product details of an item
 */
class ProductDetailsScreen : Fragment() {
    private lateinit var bottomNavigationView: BottomNavigationViewEx

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product_details_screen, container, false)

        // Logo bar
        val toolbar = view?.findViewById(R.id.toolbar) as Toolbar
        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        // Product Detail Page View
        val image = view?.findViewById(R.id.image) as ImageView
        // TODO: Set the image with the information from previous fragment
        // image.setImageDrawable()

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
                R.id.action_favorites -> Navigation.findNavController(view)
                    .navigate(R.id.favourites_view)
                R.id.action_account -> Navigation.findNavController(view)
                    .navigate(R.id.user_view)
            }
            true
        }
        return view
    }
}

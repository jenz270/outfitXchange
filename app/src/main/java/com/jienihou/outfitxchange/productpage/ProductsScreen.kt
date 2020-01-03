package com.jienihou.outfitxchange.productpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import com.jienihou.outfitxchange.MainActivity
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.source.ProductDataSource

/**
 * ProductsScreen shows the products
 */
class ProductsScreen : Fragment() {
        companion object {
            const val columns = 2
        }

        private lateinit var bottomNavigationView: BottomNavigationViewEx
        private val productAdapter = ProductRVAdapter()

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_products_screen, container, false)

            // Logo bar
            val toolbar = view?.findViewById(R.id.toolbar) as Toolbar
            (activity as AppCompatActivity).setSupportActionBar(toolbar)

            // Products Grid Recycler View
            val productRV = view.findViewById(R.id.rv_products) as RecyclerView
            productRV.layoutManager = GridLayoutManager(this.context, columns)
            productRV.adapter = productAdapter
            addProducts()

            // Bottom Navigation View
            (activity as MainActivity).setupBottomNavigationView(view)

            return view
        }

    // addProducts populates the data into the recycler view
    private fun addProducts(){
        val data = ProductDataSource.createProducts()
        productAdapter.productList(data)
    }
}

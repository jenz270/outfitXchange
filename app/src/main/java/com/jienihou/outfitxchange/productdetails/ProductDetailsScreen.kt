package com.jienihou.outfitxchange.productdetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import com.jienihou.outfitxchange.MainActivity
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

        // Logo bar view
        val toolbar = view?.findViewById(R.id.toolbar) as Toolbar
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        val heartImage = view.findViewById(R.id.outline_heart) as ImageView
        heartImage.setOnClickListener{
            if(it.isActivated){
                Toast.makeText(this.context, "Removed from Favourites", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this.context, "Added to Favourites", Toast.LENGTH_SHORT).show()
            }
            it.isActivated = !it.isActivated
        }

        // Product Detail Page View
        val image = view.findViewById<ImageView>(R.id.image)
        val brandName = view.findViewById<TextView>(R.id.product_title)
        val productStyle = view.findViewById<TextView>(R.id.product_style)
        val productSize = view.findViewById<TextView>(R.id.product_size)
        val rentPrice = view.findViewById<TextView>(R.id.rent_price)
        var productDetails = ProductDetailsHelper()

        // TODO: Replace with different image if the product image is not found
        val imageName = productDetails.retrieveImageName("imageName", arguments) ?: R.drawable.no_image
        image.setImageResource(imageName)
        brandName.text = productDetails.retrieveBrandName("brandName", arguments)
        productStyle.text = productDetails.retrieveProductStyle("productStyle", arguments)
        productSize.text = productDetails.retrieveProductSize(context, R.string.product_size_text,"size","gender", arguments)
        rentPrice.text = productDetails.retrieveRentPrice(context, R.string.product_rent_price_text,"rentPrice","duration", arguments)

        // Bottom Navigation View
        (activity as MainActivity).setupBottomNavigationView(view)

        return view
    }
}

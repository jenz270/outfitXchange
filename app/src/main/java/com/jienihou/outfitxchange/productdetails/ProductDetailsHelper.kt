package com.jienihou.outfitxchange.productdetails

import android.content.Context
import android.os.Bundle

/**
 * ProductDetailsHelper is a helper class to return the product details information
 */
class ProductDetailsHelper {

    // retrieves the Image name and returns the int
    fun retrieveImageName(imageName: String, arguments: Bundle?) : Int? {
        return arguments?.getInt(imageName)
    }

    // retrieves the brand name and returns the string name
    fun retrieveBrandName(brandName: String, arguments: Bundle?) : String? {
        return arguments?.getString(brandName)
    }

    // retrieves the product style and returns the style name string
    fun retrieveProductStyle(productStyle: String, arguments: Bundle?) : String? {
        return arguments?.getString(productStyle)
    }

    // retrieves the product size, then returns the product size string and replaces the formatted strings
    fun retrieveProductSize(context: Context?, productSizeText: Int, size: String, gender: String, arguments: Bundle?) : String? {
        return context?.getString(productSizeText, arguments?.getString(size), arguments?.getString(gender))
    }

    // retrieves the rent price, then returns the rent price string and replaces the formatted strings
    fun retrieveRentPrice(context: Context?, productRentPriceText: Int, rentPrice: String, duration: String, arguments: Bundle?) : String? {
        return context?.getString(productRentPriceText, arguments?.getString(rentPrice), arguments?.getString(duration))
    }
}
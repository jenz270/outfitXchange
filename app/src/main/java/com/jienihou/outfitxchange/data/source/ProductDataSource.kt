package com.jienihou.outfitxchange.data.source

import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.ProductItem

/**
 * CategoryDataSource consists of all the data for the Recycler View
 */
class ProductDataSource {
    companion object {
        fun createProducts(): List<ProductItem>{
            return listOf(
                ProductItem(
                    R.drawable.shoe, "Shoes", "Balenciaga",
                    "Triple S Blue Red", 8.5, 100
                ),
                ProductItem(
                    R.drawable.shoe_six, "Shoes", "Jimmy Choo",
                    "Love 100", 6.5, 50
                ),
                ProductItem(
                    R.drawable.shoe_two, "Shoes", "Gucci",
                    "Aces", 7.5, 100
                ),
                ProductItem(
                    R.drawable.shoe_three, "Shoes", "YSL",
                    "Opyum", 9.0, 80
                ),
                ProductItem(
                    R.drawable.shoe_four, "Shoes", "Louboutin",
                    "Pigalle Plato", 8.0, 120
                ),
                ProductItem(
                    R.drawable.shoe_five, "Shoes", "Louis Vuitton",
                    "Archlight Sneakers", 9.5, 90
                )
            )
        }
    }
}
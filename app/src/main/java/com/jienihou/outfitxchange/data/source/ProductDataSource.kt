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
                    "Triple S Blue Red", 8.5, "Mens", 100.00, "Week"
                ),
                ProductItem(
                    R.drawable.shoe_six, "Shoes", "Jimmy Choo",
                    "Love 100", 6.5, "Womens",50.00, "Day"
                ),
                ProductItem(
                    R.drawable.shoe_two, "Shoes", "Gucci",
                    "Aces", 7.5, "Mens",100.00, "Day"
                ),
                ProductItem(
                    R.drawable.shoe_three, "Shoes", "YSL",
                    "Opyum", 9.0, "Womens",200.00, "Month"
                ),
                ProductItem(
                    R.drawable.shoe_four, "Shoes", "Louboutin",
                    "Pigalle Plato", 8.0, "Womens",120.00, "Week"
                ),
                ProductItem(
                    R.drawable.shoe_five, "Shoes", "Louis Vuitton",
                    "Archlight Sneakers", 9.5, "Womens",90.00, "Week"
                )
            )
        }
    }
}
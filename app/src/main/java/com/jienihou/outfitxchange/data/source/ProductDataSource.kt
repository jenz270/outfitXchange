package com.jienihou.outfitxchange.data.source

import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.Category
import com.jienihou.outfitxchange.data.ProductItem

/**
 * CategoryDataSource consists of all the data for the Recycler View
 */
class ProductDataSource {
    companion object {
        fun createProducts(): List<ProductItem> {
            return listOf (
                ProductItem(
                    imageName = R.drawable.shoe,
                    category = Category.SHOES.category,
                    brandName = "Balenciaga",
                    productStyle = "Triple S Blue Red",
                    size = 8.5,
                    gender = "Mens",
                    rentPrice = 100.00,
                    duration = "Week"
                ),
                ProductItem(
                    imageName = R.drawable.shoe_six,
                    category = Category.SHOES.category,
                    brandName = "Jimmy Choo",
                    productStyle = "Love 100",
                    size = 6.5,
                    gender = "Womens",
                    rentPrice = 50.00,
                    duration = "Day"
                ),
                ProductItem(
                    imageName = R.drawable.shoe_two,
                    category = Category.SHOES.category,
                    brandName = "Gucci",
                    productStyle = "Aces",
                    size = 7.5,
                    gender =  "Mens",
                    rentPrice = 100.00,
                    duration = "Day"
                ),
                ProductItem(
                    imageName = R.drawable.shoe_three,
                    category = Category.SHOES.category,
                    brandName = "YSL",
                    productStyle = "Opyum",
                    size = 9.0,
                    gender = "Womens",
                    rentPrice = 200.00,
                    duration = "Month"
                ),
                ProductItem(
                    imageName = R.drawable.shoe_four,
                    category = Category.SHOES.category,
                    brandName = "Louboutin",
                    productStyle =  "Pigalle Plato",
                    size = 8.0,
                    gender = "Womens",
                    rentPrice = 120.00,
                    duration = "Week"
                ),
                ProductItem(
                    imageName = R.drawable.shoe_five,
                    category = Category.SHOES.category,
                    brandName = "Louis Vuitton",
                    productStyle = "Archlight Sneakers",
                    size = 9.5,
                    gender = "Womens",
                    rentPrice = 90.00,
                    duration = "Week"
                )
            )
        }
    }
}
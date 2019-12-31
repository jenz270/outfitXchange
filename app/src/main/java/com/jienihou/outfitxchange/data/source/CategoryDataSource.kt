package com.jienihou.outfitxchange.data.source

import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.CategoryItem

/**
 * CategoryDataSource consists of all the data for the Recycler View
 */
class CategoryDataSource{
    companion object{
        fun createCategories(): List<CategoryItem>{
            return listOf(
                CategoryItem(R.drawable.sweater, "Tops"),
                CategoryItem(R.drawable.category_three, "Pants"),
                CategoryItem(R.drawable.category_five, "Bags"),
                CategoryItem(R.drawable.category_two, "Outerwear"),
                CategoryItem(R.drawable.shoe, "Shoes"),
                CategoryItem(R.drawable.category_six, "Accessories")
                )
        }
    }
}
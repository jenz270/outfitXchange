package com.jienihou.outfitxchange.data.source

import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.Category
import com.jienihou.outfitxchange.data.CategoryItem

/**
 * CategoryDataSource consists of all the data for the Recycler View
 */
class CategoryDataSource {
    companion object {
        fun createCategories() = listOf(
                CategoryItem(R.drawable.sweater, Category.TOPS.category),
                CategoryItem(R.drawable.category_three, Category.PANTS.category),
                CategoryItem(R.drawable.category_five, Category.BAGS.category),
                CategoryItem(R.drawable.category_two, Category.OUTERWEAR.category),
                CategoryItem(R.drawable.shoe, Category.SHOES.category),
                CategoryItem(R.drawable.category_six, Category.ACCESSORIES.category)
        )
    }
}
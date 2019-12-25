package com.jienihou.outfitxchange

import com.jienihou.outfitxchange.models.CategoryItem

class CategoryDataSource{
    companion object{
        fun createCategories(): ArrayList<CategoryItem>{
            val list = ArrayList<CategoryItem>()
            list.add(
                CategoryItem(
                    R.drawable.sweater,
                    "Tops"
                )
            )
            list.add(
                CategoryItem(
                    R.drawable.sweater,
                    "Pants"
                )
            )
            list.add(
                CategoryItem(
                    R.drawable.sweater,
                    "Bags"
                )
            )
            list.add(
                CategoryItem(
                    R.drawable.sweater,
                    "Outerwear"
                )
            )
            list.add(
                CategoryItem(
                    R.drawable.sweater,
                    "Shoes"
                )
            )
            list.add(
                CategoryItem(
                    R.drawable.sweater,
                    "Accessories"
                )
            )
            return list
        }
    }
}
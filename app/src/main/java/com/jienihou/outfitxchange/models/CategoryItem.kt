package com.jienihou.outfitxchange.models

data class CategoryItem (var imageName: Int, var category: String){
    override fun toString(): String{
        return "CategoryItem(imageName='$imageName, category='$category')"
    }
}

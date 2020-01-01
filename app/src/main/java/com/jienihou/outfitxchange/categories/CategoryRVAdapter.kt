package com.jienihou.outfitxchange.categories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.CategoryItem

/**
 * CategoryRVAdapter is the recyclerview adapter used for displaying categories
 */
class CategoryRVAdapter : RecyclerView.Adapter<CategoryViewHolder>() {
    private var categoryItems: List<CategoryItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.category_card_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(categoryItems[position])
    }

    override fun getItemCount(): Int {
        return categoryItems.size
    }

    fun categoryList(categoryList: List<CategoryItem>){
        categoryItems = categoryList
    }
}
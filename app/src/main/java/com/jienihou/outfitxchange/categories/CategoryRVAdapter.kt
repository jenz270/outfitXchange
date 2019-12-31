package com.jienihou.outfitxchange.categories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.CategoryItem

/**
 * CategoryRVAdapter is the recyclerview adapter used for displaying categories
 */
class CategoryRVAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var categoryItems: List<CategoryItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.category_card_item,
                parent,
                false
            )
        )
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is CategoryViewHolder){
            holder.bind(categoryItems[position])
        }
    }

    override fun getItemCount(): Int {
        return categoryItems.size
    }

    fun categoryList(categoryList: List<CategoryItem>){
        categoryItems = categoryList
    }
}
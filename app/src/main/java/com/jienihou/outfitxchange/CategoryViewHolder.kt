package com.jienihou.outfitxchange

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.models.CategoryItem
import kotlinx.android.synthetic.main.rv_card_item.view.*

class CategoryViewHolder constructor(itemView: View): RecyclerView.ViewHolder(itemView){
    private val image = itemView.image
    private val categoryName = itemView.card_text

    fun bind(categoryItem: CategoryItem){
        image.setImageResource(categoryItem.imageName)
        categoryName.text = categoryItem.category
    }

}
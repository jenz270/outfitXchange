package com.jienihou.outfitxchange.categories

import android.view.View
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.CategoryItem
import kotlinx.android.synthetic.main.category_card_item.view.*

/**
 * CategoryViewHolder is the view holder that displays the data
 */
class CategoryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val image = itemView.image
    private val categoryName = itemView.card_text

    fun bind(categoryItem: CategoryItem) {
        image.setImageResource(categoryItem.imageName)
        categoryName.text = categoryItem.category

        // shoes are the only category that will lead to another page at the moment.
        if(categoryItem.category == "Shoes") {
            itemView.setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(R.id.action_home_screen_to_products_screen)
            }
        }
    }
}
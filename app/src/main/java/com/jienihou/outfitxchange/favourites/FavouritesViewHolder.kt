package com.jienihou.outfitxchange.favourites

import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.FavouriteItem
import kotlinx.android.synthetic.main.favourite_card_item.view.*
/**
 * FavouritesViewHolder is the view holder that shows the favourites data
 */
class FavouritesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val productImage = itemView.product_photo
    private val productTitle = itemView.product_title
    private val productDescription = itemView.product_description
    val crossedHeartImage: ImageView = itemView.favourite_image

    fun bind(favouriteItem: FavouriteItem) {
        productImage.setImageResource(favouriteItem.productImage)
        productTitle.text = favouriteItem.productTitle
        productDescription.text = favouriteItem.productDescription

        // TODO: Add the product item that is needed in the bundle
        // Using only the balenciaga shoe as an example for now for flow.
        if (favouriteItem.productTitle == "Balenciaga") {
            val bundle = bundleOf(
                "profileImage" to favouriteItem.productImage,
                "productTitle" to favouriteItem.productTitle
            )
            itemView.setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(R.id.action_messages_view_to_message_detail_screen, bundle)
            }
        }
    }

}
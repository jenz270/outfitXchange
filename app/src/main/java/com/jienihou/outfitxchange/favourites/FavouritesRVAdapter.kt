package com.jienihou.outfitxchange.favourites

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.FavouriteItem

/**
 * FavouritesRVAdapter binds the favourites view and view holder
 */
class FavouritesRVAdapter : RecyclerView.Adapter<FavouritesViewHolder>() {
    private var favouriteItems: MutableList<FavouriteItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavouritesViewHolder {
        return FavouritesViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.favourite_card_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: FavouritesViewHolder, position: Int) {
        holder.bind(favouriteItems[position])
        holder.crossedHeartImage.setOnClickListener{
           removeAt(position)
        }
    }

    override fun getItemCount(): Int {
        return favouriteItems.size
    }

    fun favouritesList(favouritesList: MutableList<FavouriteItem>) {
        favouriteItems = favouritesList
    }

    private fun removeAt(position: Int) {
        favouriteItems.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, favouriteItems.size)
    }
}
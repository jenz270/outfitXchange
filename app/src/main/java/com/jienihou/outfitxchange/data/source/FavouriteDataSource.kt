package com.jienihou.outfitxchange.data.source

import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.FavouriteItem

/**
 * FavouriteDataSource consists of all the favourites data for the Recycler View
 */
class FavouriteDataSource {
    companion object {
        fun createFavourites() = mutableListOf(
            FavouriteItem(
                R.drawable.shoe,
                "Balenciaga",
                "Triple S Blue Red"
            ),
            FavouriteItem(
                R.drawable.shoe_six,
                "Jimmy Choo",
                "Love 100"
            ),
            FavouriteItem(
                R.drawable.shoe_three,
                "YSL",
                "Opyum"
            )
        )
    }
}
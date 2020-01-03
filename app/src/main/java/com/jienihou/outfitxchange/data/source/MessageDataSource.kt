package com.jienihou.outfitxchange.data.source

import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.MessageItem

/**
 * MessageDataSource consists of all the data for the Recycler View
 */
class MessageDataSource {
    companion object {
        fun createMessages() = listOf(
            MessageItem(
                R.drawable.portrait,
                "Balenciaga",
                "Hey There, yes!  How long are you thinking of renting them for?"
            ),
            MessageItem(
                R.drawable.portrait,
                "Gucci",
                "Hey There, yes!  How long are you thinking of renting them for?"
            ),
            MessageItem(
                R.drawable.portrait,
                "Prada",
                "Hey There, yes!  How long are you thinking of renting them for?"
            ),
            MessageItem(
                R.drawable.portrait,
                "Burberry",
                "Hey There, yes!  How long are you thinking of renting them for?"
            )
        )
    }
}
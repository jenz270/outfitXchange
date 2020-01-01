package com.jienihou.outfitxchange.data.source

import com.jienihou.outfitxchange.data.DetailedMessageItem

/**
 * DetailedMessageDataSource consists of all the message details
 */
class DetailedMessageDataSource{
    companion object{
        fun createDetailedMessages() = listOf(
            DetailedMessageItem(
                "User",
                "Hi There, just would like to know if the shoes are still available?"
            ),
            DetailedMessageItem(
                 "Jenny",
                "Hey There, yes!  How long are you thinking of renting them for?"
            ),
            DetailedMessageItem(
                "User",
                "About 2 weeks?"
            ),
            DetailedMessageItem(
                "Jenny",
                "Sure! Let me know when you are able to pick them up."
            ),
            DetailedMessageItem(
                "User",
                "I will pick them up this friday if possible! Will pay you by etransfer."
            ),
            DetailedMessageItem(
                "Jenny",
                "Ok! Sounds good to me. See you friday!"
            ),
            DetailedMessageItem(
                "User",
                "Thanks."
            )
        )
    }
}
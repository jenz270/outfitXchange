package com.jienihou.outfitxchange.messagedetails

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.data.DetailedMessageItem
import kotlinx.android.synthetic.main.detailed_message_card_item.view.*

/**
 * MessageViewHolder is the view holder that displays the data
 */
class DetailedMessageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val greyCard = itemView.card_item
    private val blueCard = itemView.card_item_blue
    private val greyMessage = itemView.message_text
    private val blueMessage = itemView.blue_message_text

    fun bind(messageItem: DetailedMessageItem){
        // if the user sent the message, then we will populate the blue box
        if (messageItem.sender == "User"){
            blueCard.visibility = View.VISIBLE
            greyCard.visibility = View.INVISIBLE
            blueMessage.text = messageItem.message
        } else {
            blueCard.visibility = View.INVISIBLE
            greyCard.visibility = View.VISIBLE
            greyMessage.text = messageItem.message
        }
    }

}
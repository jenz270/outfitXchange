package com.jienihou.outfitxchange.messages

import com.jienihou.outfitxchange.data.MessageItem
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.R
import kotlinx.android.synthetic.main.message_card_item.view.*

/**
 * MessageViewHolder is the view holder that displays the data
 */
class MessageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val profileImage = itemView.profile_photo
    private val productTitle = itemView.product_title
    private val messageText = itemView.message_text

    fun bind(messageItem: MessageItem) {
        profileImage.setImageResource(messageItem.profileImage)
        productTitle.text = messageItem.productTitle
        messageText.text = messageItem.message

        // TODO: Display details based on message clicked
        // Using only the balenciaga shoe as an example for now for flow.
        if (messageItem.productTitle == "Balenciaga") {
            val bundle = bundleOf(
                "profileImage" to messageItem.profileImage,
                "productTitle" to messageItem.productTitle
            )
            itemView.setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(R.id.action_messages_view_to_message_detail_screen, bundle)
            }
        }
    }

}
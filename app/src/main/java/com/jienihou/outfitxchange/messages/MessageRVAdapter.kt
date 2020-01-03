package com.jienihou.outfitxchange.messages

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.MessageItem

class MessageRVAdapter : RecyclerView.Adapter<MessageViewHolder>() {
    private var messageItems: List<MessageItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.message_card_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.bind(messageItems[position])
    }

    override fun getItemCount(): Int {
        return messageItems.size
    }

    fun messageList(messageList: List<MessageItem>) {
        messageItems = messageList
    }
}
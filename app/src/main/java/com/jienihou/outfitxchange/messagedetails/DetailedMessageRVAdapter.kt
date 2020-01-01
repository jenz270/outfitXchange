package com.jienihou.outfitxchange.messagedetails

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.DetailedMessageItem

class DetailedMessageRVAdapter : RecyclerView.Adapter<DetailedMessageViewHolder>() {
    private var messageItems: List<DetailedMessageItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailedMessageViewHolder {
        return DetailedMessageViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.detailed_message_card_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DetailedMessageViewHolder, position: Int) {
        holder.bind(messageItems[position])
    }

    override fun getItemCount(): Int {
        return messageItems.size
    }

    fun detailedMessageList(detailedMessageList: List<DetailedMessageItem>){
        messageItems = detailedMessageList
    }
}
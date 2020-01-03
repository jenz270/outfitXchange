package com.jienihou.outfitxchange.messages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import com.jienihou.outfitxchange.MainActivity
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.source.MessageDataSource

/**
 * MessagesScreen shows the message list
 */
class MessagesScreen : Fragment() {

    private val messageAdapter = MessageRVAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_messages_view, container, false)

        // Logo bar view
        val toolbar = view?.findViewById(R.id.toolbar) as Toolbar
        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        // Messages Page Recycler View
        val messagesRV = view.findViewById(R.id.rv_messages) as RecyclerView
        messagesRV.layoutManager = LinearLayoutManager(this.context)
        messagesRV.adapter = messageAdapter
        addMessages()

        // TODO: set the visibility of the dot to only visible if the message is recent and never clicked
        // val notification = view.findViewById<ImageView>(R.id.notification_dot)

        // Bottom Navigation View
        (activity as MainActivity).setupBottomNavigationView(view)

        // TODO: set message notification on bottom navigation

        return view
    }

    // addMessages populates the data into the recycler view
    private fun addMessages() {
        val data = MessageDataSource.createMessages()
        messageAdapter.messageList(data)
    }
}

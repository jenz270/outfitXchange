package com.jienihou.outfitxchange.messagedetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import com.jienihou.outfitxchange.MainActivity
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.source.DetailedMessageDataSource

/**
 * MessageDetailScreen shows the message details
 */
class MessageDetailScreen : Fragment() {
    private lateinit var bottomNavigationView: BottomNavigationViewEx
    private val detailedMessageAdapter = DetailedMessageRVAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_message_detail_screen, container, false)

        // Logo bar view
        val toolbar = view?.findViewById(R.id.toolbar) as Toolbar
        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        // Message Detail Page View
        val profileImage = view.findViewById<ImageView>(R.id.profile_image)
        val productTitle = view.findViewById<TextView>(R.id.product_title_text)
        val sendMessage = view.findViewById<ImageButton>(R.id.send_button)
        val message = view.findViewById<EditText>(R.id.send_text)
        val messageDetails = MessageDetailsHelper()

        val imageName = messageDetails.retrieveProfileImage("profileImage", arguments) ?: R.drawable.no_image
        profileImage.setImageResource(imageName)
        productTitle.text = messageDetails.retrieveProductTitle("productTitle", arguments)

        // TODO: implement message icon click
        sendMessage.setOnClickListener{
           val sendString = message.text.toString()
        }

        // Message Detail Recycler View
        val messagesRV = view.findViewById(R.id.rv_messages_detail) as RecyclerView
        messagesRV.layoutManager = LinearLayoutManager(this.context)
        messagesRV.adapter = detailedMessageAdapter
        addDetailedMessages()

        // Bottom Navigation View
        (activity as MainActivity).setupBottomNavigationView(view)

        return view
    }

    // addMessages populates the data into the recycler view
    private fun addDetailedMessages(){
        val data = DetailedMessageDataSource.createDetailedMessages()
        detailedMessageAdapter.detailedMessageList(data)
    }
}

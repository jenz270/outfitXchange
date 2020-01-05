package com.jienihou.outfitxchange.userprofile


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.jienihou.outfitxchange.MainActivity
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.UserProfileOptions

/**
 * UserProfileScreen shows the user profile
 */
class UserProfileScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_user_view, container, false)

        // Logo bar view
        val toolbar = view?.findViewById(R.id.toolbar) as Toolbar
        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        // User Profile View
        val listingsText = view.findViewById<TextView>(R.id.manage_listings_text)
        val emailText = view.findViewById<TextView>(R.id.change_email_text)
        val passwordText = view.findViewById<TextView>(R.id.change_password_text)

        val listingsBox = view.findViewById<ImageView>(R.id.manage_listings_box)
        val changeEmailBox = view.findViewById<ImageView>(R.id.change_email_box)
        val changePasswordBox = view.findViewById<ImageView>(R.id.change_password_box)

        listingsText.text = UserProfileOptions.MANAGE_LISTINGS.profileOptions
        emailText.text = UserProfileOptions.CHANGE_EMAIL.profileOptions
        passwordText.text = UserProfileOptions.CHANGE_PASSWORD.profileOptions

        listingsBox.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_user_view_to_manage_user_listings)}
        changeEmailBox.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_user_view_to_user_change_email)}
        changePasswordBox.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_user_view_to_user_change_password)}

        // Bottom Navigation View
        (activity as MainActivity).setupBottomNavigationView(view)

        // Inflate the layout for this fragment
        return view
    }


}

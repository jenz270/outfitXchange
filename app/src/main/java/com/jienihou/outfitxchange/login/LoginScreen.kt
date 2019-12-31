package com.jienihou.outfitxchange.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.jienihou.outfitxchange.R

/**
 * LoginScreen shows the login fragment
 */
class LoginScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login_screen, container, false)

        view.findViewById<ImageView>(R.id.next_button).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_login_screen_to_home_screen)
        }

        view.findViewById<TextView>(R.id.forgot_password_text).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_login_screen_to_forgot_password_screen)
        }
        return view
    }
}

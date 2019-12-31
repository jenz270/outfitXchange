package com.jienihou.outfitxchange

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.jienihou.outfitxchange.R


/**
 * MainLoginScreen shows the title screen
 */
class MainLoginScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main_login_screen, container, false)
        view.findViewById<ImageView>(R.id.login_circle).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_main_login_screen_to_login_screen)
        }
        view.findViewById<ImageView>(R.id.signup_circle).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_main_login_screen_to_sign_up_screen)
        }
        return view
    }
}

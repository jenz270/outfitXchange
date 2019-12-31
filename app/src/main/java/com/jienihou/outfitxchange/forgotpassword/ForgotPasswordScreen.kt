package com.jienihou.outfitxchange.forgotpassword

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.jienihou.outfitxchange.R
import kotlinx.android.synthetic.main.fragment_forgot_password_screen.*

/**
 * ForgotPasswordScreen shows the forgot password fragment
 */
class ForgotPasswordScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_forgot_password_screen, container, false)
        view.findViewById<ImageView>(R.id.next_button).setOnClickListener {
            val snackbar =
                Snackbar.make(forgot_password_background, "Temporary Passcode Sent!", Snackbar.LENGTH_LONG)
            snackbar.show()
        }

        return view
    }
}

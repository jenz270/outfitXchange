package com.jienihou.outfitxchange

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_sign_up_screen.*

/**
 * Sign Up Screen subclass.
 */
class SignUpScreen : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up_screen, container, false)

        // TODO: Consider using a Toast instead, see: https://github.com/Muddz/StyleableToast
        view.findViewById<ImageView>(R.id.next_button).setOnClickListener {
            val snackbar = Snackbar.make(sign_up_background, "Sign Up Successful!", Snackbar.LENGTH_LONG)
            snackbar.show()
        }

        return view
    }
    // TODO: Redirect user back to main login page to login
}

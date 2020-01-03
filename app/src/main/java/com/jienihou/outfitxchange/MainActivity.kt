package com.jienihou.outfitxchange

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx


/**
 * MainActivity is the main point of the app
 * where all the views are created on top
 */
class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationViewEx

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }

    fun setupBottomNavigationView(view: View) {
        bottomNavigationView = view.findViewById(R.id.bottom_navigation) as BottomNavigationViewEx
        bottomNavigationView.enableItemShiftingMode(false)
        bottomNavigationView.setTextVisibility(false)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_home -> Navigation.findNavController(view)
                    .navigate(R.id.home_screen)
                R.id.action_messages -> Navigation.findNavController(view)
                    .navigate(R.id.messages_view)
                R.id.action_add -> Navigation.findNavController(view)
                    .navigate(R.id.new_post_view)
                R.id.action_favorites -> Navigation.findNavController(view)
                    .navigate(R.id.favourites_view)
                R.id.action_account -> Navigation.findNavController(view)
                    .navigate(R.id.user_view)
            }
            true
        }
    }
}

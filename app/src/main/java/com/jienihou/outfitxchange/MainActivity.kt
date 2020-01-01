package com.jienihou.outfitxchange

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/**
 * MainActivity is the main point of the app
 * where all the views are created on top
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
}

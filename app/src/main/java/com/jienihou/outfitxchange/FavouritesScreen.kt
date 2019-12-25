package com.jienihou.outfitxchange

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [favourites_view.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [favourites_view.newInstance] factory method to
 * create an instance of this fragment.
 */
class FavouritesScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favourites_view, container, false)
    }
}

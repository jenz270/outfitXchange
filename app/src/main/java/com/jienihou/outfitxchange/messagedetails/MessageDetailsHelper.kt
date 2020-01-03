package com.jienihou.outfitxchange.messagedetails

import android.os.Bundle

/**
 * MessageDetailsHelper is a helper class to return the message details information
 */
class MessageDetailsHelper {

    // retrieves the profile image name and returns the int
    fun retrieveProfileImage(profileImage: String, arguments: Bundle?) : Int? {
        return arguments?.getInt(profileImage)
    }

    // retrieves the product title and returns the string title
    fun retrieveProductTitle(productTitle: String, arguments: Bundle?) : String? {
        return arguments?.getString(productTitle)
    }
}
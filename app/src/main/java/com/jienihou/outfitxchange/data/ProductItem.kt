package com.jienihou.outfitxchange.data

/**
 * ProductItem holds the data for each product item
 */
data class ProductItem (
    val imageName: Int,
    val category: String,
    val brandName: String,
    val productStyle: String,
    val size: Double,
    val gender: String,
    val rentPrice: Double,
    val duration: String
)
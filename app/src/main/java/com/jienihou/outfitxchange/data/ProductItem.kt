package com.jienihou.outfitxchange.data

/**
 * ProductItem holds the data for each Category Item
 */
data class ProductItem(
    val imageName: Int, val category: String, val brandName: String,
    val productTitle: String, val size: Double, val rentPrice: Int)
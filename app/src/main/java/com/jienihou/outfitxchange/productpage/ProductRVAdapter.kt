package com.jienihou.outfitxchange.productpage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.ProductItem

/**
 * CategoryRVAdapter is the recyclerview adapter used for displaying categories
 */

class ProductRVAdapter : RecyclerView.Adapter<ProductViewHolder>() {
    private var productItems: List<ProductItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.product_card_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(productItems[position])
    }

    override fun getItemCount(): Int {
        return productItems.size
    }

    fun productList(productList: List<ProductItem>){
        productItems = productList
    }
}
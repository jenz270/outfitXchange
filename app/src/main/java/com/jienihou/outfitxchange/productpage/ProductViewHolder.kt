package com.jienihou.outfitxchange.productpage

import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.jienihou.outfitxchange.R
import com.jienihou.outfitxchange.data.ProductItem
import kotlinx.android.synthetic.main.product_card_item.view.image

/**
 * CategoryViewHolder is the view holder that displays the data
 */
class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val image = itemView.image

    fun bind(productItem: ProductItem){
        image.setImageResource(productItem.imageName)

        // TODO: Display details based on product clicked
        // Using only the balenciaga shoe as an example for now for flow.
        if(productItem.brandName == "Balenciaga") {
            var bundle = bundleOf(
                "imageName" to productItem.imageName,
                "category" to productItem.category,
                "brandName" to productItem.brandName,
                "productTitle" to productItem.productTitle,
                "size" to productItem.size.toString(),
                "gender" to productItem.gender,
                "rentPrice" to (productItem.rentPrice).toString(),
                "duration" to productItem.duration
            )
            itemView.setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(R.id.action_products_screen_to_product_details_screen, bundle)
            }
        }
    }

}
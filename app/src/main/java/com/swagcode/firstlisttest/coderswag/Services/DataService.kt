package com.swagcode.firstlisttest.coderswag.Services
import com.swagcode.firstlisttest.coderswag.Model.Category
import com.swagcode.firstlisttest.coderswag.Model.Product
import java.util.*

object DataService {

    val names = listOf(
            Category("Hadi Dhahd", "shirtimage"),
            Category("HadiDhahds", "shirtimage"),
            Category("HadiDhahd", "shirtimage")
            )

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage" ),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Colored Shirt", "19$", "hat01"),
            Product("Colored Shirt blue ", "12$", "hat02"),
            Product("Colored Shirt black", "11$", "hat03"),
            Product("Colored Shirt red", "14$", "hat04")
    )

    val hoodies = listOf(
            Product("Black Hoodie", "21$", "hoodie01"),
            Product("Red Hoodie", "21$", "hoodie02"),
            Product("Blue Hoodie", "21$", "hoodie03"),
            Product("N Hoodie", "21$", "hoodie04")
    )
    val shirts = listOf(
            Product("Black Shirt", "31$", "shirt01"),
            Product("Red Shirt", "11$", "shirt02"),
            Product("Blue Shirt", "11$", "shirt03"),
            Product("N Shirt", "51$", "shirt04")
    )


}
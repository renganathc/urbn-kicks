package com.sneakers.urbnkicks

class ShopRepository {

    fun getBanners(): List<Banner> {
        return listOf(
            Banner("https://firebasestorage.googleapis.com/v0/b/urbnkicks-325ea.appspot.com/o/banner_2.jpg?alt=media&token=d57a1821-56d6-4a04-bacb-9eef77ed8db0"),
            Banner("https://firebasestorage.googleapis.com/v0/b/urbnkicks-325ea.appspot.com/o/sale.jpg?alt=media&token=7ffd4525-5f02-4c24-ab75-403c54047609"),
            Banner("https://firebasestorage.googleapis.com/v0/b/urbnkicks-325ea.appspot.com/o/newbalance2.jpg?alt=media&token=52e11ddc-7132-4af1-a6f7-8bd7a775b2ce"),
        )
    }
}
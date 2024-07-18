package com.sneakers.urbnkicks

data class ItemListing(val brand: String?, val model: String?, val desc: String?, val price: Double?, val mrp: Double?, val image_link: String?, val gender: String?, val category: String?, val dashboard_cat: String?, val tags: String?) {
    // No-argument constructor for Firebase
    constructor() : this(null, null, null, null, null, null, null, null, null, null)
}
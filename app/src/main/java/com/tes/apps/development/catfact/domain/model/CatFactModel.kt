package com.tes.apps.development.catfact.domain.model

data class CatFactModel(
    val height: Int,
    val width: Int,
    val url: String,
    val name: String?,
    val origin: String?,
    val adaptability: Int?,
    val catFriendly: Int?,
    val dogFriendly: Int?,
    val desc: String?,
    val intelligence: Int?,
    val affectionLevel: Int?,
    val lifeSpan: String?
)

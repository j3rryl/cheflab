package com.example.cheflab.models

data class RecipeItem(
    var meal_type: String,
    var recipe_title: String,
    var number_of_people: Int,
    var difficulty:String,
    var ingredients:String,
    var preparation_steps:String,
    var imageId: Int
)

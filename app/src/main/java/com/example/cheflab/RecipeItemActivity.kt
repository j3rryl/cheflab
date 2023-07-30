package com.example.cheflab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.flaviofaria.kenburnsview.KenBurnsView
import com.squareup.picasso.Picasso

class RecipeItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_item)

        val toolbar: Toolbar = findViewById(R.id.recipe_item_toolbar)
        setSupportActionBar(toolbar)

        // Title
        supportActionBar?.title = "Recipe Items"

        val recipe_title = intent.getStringExtra("recipe_title")
        val recipe_type = intent.getStringExtra("recipe_type")
        val recipe_difficulty = intent.getStringExtra("recipe_difficulty")
        val recipe_image = intent.getIntExtra("recipe_image", R.drawable.ugali)
        val recipe_quantity = intent.getIntExtra("recipe_quantity",3)
        val recipe_ingredients = intent.getStringExtra("recipe_ingredients")
        val recipe_preparation_steps = intent.getStringExtra("recipe_preparation_steps")
        supportActionBar?.title = recipe_title

        val recipeIngredients: TextView = findViewById(R.id.recipe_ingredients)
        val recipePreparationSteps: TextView = findViewById(R.id.recipe_preparation_steps)
        val recipeType: TextView = findViewById(R.id.recipe_type)
        val recipeDifficulty: TextView = findViewById(R.id.cooking_difficulty)
        val recipeQuantity: TextView = findViewById(R.id.recipe_quantity)
        val kenBurnsView: KenBurnsView = findViewById(R.id.kbView)

        recipePreparationSteps.text = recipe_preparation_steps
        recipeType.text= recipe_type
        recipeIngredients.text = recipe_ingredients
        recipeDifficulty.text = "Difficulty: "+recipe_difficulty
        recipeQuantity.text = recipe_quantity.toString()
        Picasso.get().load(recipe_image).into(kenBurnsView)
    }
}
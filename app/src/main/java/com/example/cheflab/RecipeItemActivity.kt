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
        val meal_type = intent.getStringExtra("meal_type")
        val difficulty = intent.getStringExtra("difficulty")
        val image_id = intent.getIntExtra("image_id", R.drawable.ugali)
        val people_served = intent.getIntExtra("people_served",3)
        val ingredients = intent.getStringExtra("ingredients")
        val prep = intent.getStringExtra("preparation_steps")
        supportActionBar?.title = recipe_title

//        val rTitle: TextView = findViewById(R.id.recipe_title)
        val rIngredients: TextView = findViewById(R.id.ingredients)
        val rPrepSteps: TextView = findViewById(R.id.prep_steps)
        val rRecipeMealType: TextView = findViewById(R.id.recipe_meal)
        val rCookingDifficulty: TextView = findViewById(R.id.cooking_difficulty)

        val rNumberPeopleServed: TextView = findViewById(R.id.number_people_served)
        val kenBurnsView: KenBurnsView = findViewById(R.id.kbView)

        rPrepSteps.text = prep
        rRecipeMealType.text= meal_type
        rIngredients.text = ingredients
        rCookingDifficulty.text = "Difficulty: "+difficulty
        rNumberPeopleServed.text = people_served.toString()
        Picasso.get().load(image_id).into(kenBurnsView)


    }
}
package com.example.cheflab.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.cheflab.R
import com.example.cheflab.models.RecipeItem

class RecipeAdapter(private val context: Activity, private val arrayList: ArrayList<RecipeItem>): ArrayAdapter<RecipeItem>(context,
    R.layout.recipe_card, arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.recipe_card, null)

        val imageView: ImageView = view.findViewById(R.id.recipe_photo)
        val recipeTitle: TextView = view.findViewById(R.id.recipe_title)
        val mealType: TextView = view.findViewById(R.id.recipe_meal_type)

        val recipeDifficulty: TextView = view.findViewById(R.id.recipe_difficulty)

        imageView.setImageResource(arrayList[position].imageId)
        recipeTitle.text=arrayList[position].recipe_title
        mealType.text=arrayList[position].meal_type
        recipeDifficulty.text="Difficulty: "+arrayList[position].difficulty

        return view
    }
}
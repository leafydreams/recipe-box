package com.example.demo

class RecipeService (val recipeRepository: RecipeRepository) {
    fun create(recipe: Recipe): Recipe {
        return recipeRepository.save(recipe)
    }

}
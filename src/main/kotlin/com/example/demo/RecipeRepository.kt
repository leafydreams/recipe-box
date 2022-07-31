package com.example.demo

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface RecipeRepository : MongoRepository<Recipe,UUID> {
}
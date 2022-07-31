package com.example.demo

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.Mockito.mock
import org.mockito.kotlin.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import kotlin.random.Random

class RecipeServiceTests {
    @Nested
    class Create {
        @Test
        fun `Given recipe Should return saved recipe`(){
            // Arrange
            val inputRecipe = Random.nextRecipe()
            val expectedRecipe = Random.nextRecipe()
            val recipeRepository = mock<RecipeRepository>()
            whenever(recipeRepository.save(inputRecipe))
                .thenReturn(expectedRecipe)
            val service = RecipeService(recipeRepository)
            // Act
            val actualRecipe: Recipe = service.create(inputRecipe)
            // Assert
            assertThat(actualRecipe).isEqualTo(expectedRecipe)
            verify(recipeRepository, times(1)).save(inputRecipe)
        }

        @Test
        fun `Given an invalid recipe Should throw error`(){
            TODO()
        }
    }

    @Nested
    class GetAll {
        @Test
        fun `Should return recipe list When recipe exists`(){
            TODO()
        }

        @Test
        fun `Should return empty list When recipe does not exist`(){
            TODO()
        }
    }

    @Nested
    class GetOne {
        @Test
        fun `Given id Should return recipe When id exists`(){
            TODO()
        }

        @Test
        fun `Given id Should throw error When id does not exist`(){
            TODO()
        }

    }

    @Nested
    class Update {
        @Test
        fun `Given id and valid recipe Should return updated recipe When id exists`(){
            TODO()
        }

        @Test
        fun `Given id and valid recipe Should throw error When id does not exist`(){
            TODO()
        }

        @Test
        fun `Given and invalid recipe Should throw error`(){
            TODO()
        }

    }

    @Nested
    class Delete {
        @Test
        fun `Given id Should call delete When id exists`(){
            TODO()
        }

        @Test
        fun `Given id Should throw error When id does not exist`(){
            TODO()
        }

    }
}
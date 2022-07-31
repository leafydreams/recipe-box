package com.example.demo

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class RecipeRepositoryTests {
    @Nested
    class Create {
        @Test
        fun `Given recipe Should increase collection size`(){
            TODO()
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
        fun `Given id and valid recipe Should update recipe When id exists`(){
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
        fun `Given id Should decrease collection count When id exists`(){
            TODO()
        }

        @Test
        fun `Given id Should throw error When id does not exist`(){
            TODO()
        }

    }

}
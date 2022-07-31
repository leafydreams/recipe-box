package com.example.demo

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class RecipeControllerTests {

    // POST /api/recipe
    @Nested
    class Create {
        @Test
        fun `Given JSON recipe Should return a 201 created response`(){
            TODO()
        }

        @Test
        fun `Given an invalid recipe Should should return a 422 unprocessible entity response`(){
            TODO()
        }
    }

    // GET /api/recipe
    @Nested
    class GetAll {
        @Test
        fun `Should return recipe list and 200 ok response When recipe exists`(){
            TODO()
        }

        @Test
        fun `Should return empty list and 200 ok When recipe does not exist`(){
            TODO()
        }
    }

    // GET /api/recipe/{id}
    @Nested
    class GetOne {
        @Test
        fun `Given id Should return JSON recipe and 200 ok When id exists`(){
            TODO()
        }

        @Test
        fun `Given id Should throw error and return 404 not found response When id does not exist`(){
            TODO()
        }

    }

    // PUT /api/recipe/{id}
    @Nested
    class Update {
        @Test
        fun `Given id and valid recipe Should return updated JSON recipe and 200 ok When id exists`(){
            TODO()
        }

        @Test
        fun `Given id and valid recipe Should throw error and return 404 not found response When id does not exist`(){
            TODO()
        }

        @Test
        fun `Given and invalid recipe Should throw error and return 404 not found response`(){
            TODO()
        }

    }

    // DELETE /api/recipe/{id}
    @Nested
    class Delete {
        @Test
        fun `Given id Should return a 204 no content response When id exists`(){
            TODO()
        }

        @Test
        fun `Given id Should throw error and return 404 not found response When id does not exist`(){
            TODO()
        }

    }

}
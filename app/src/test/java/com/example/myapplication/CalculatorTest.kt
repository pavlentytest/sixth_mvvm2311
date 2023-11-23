package com.example.myapplication

import org.junit.Assert.*

import org.junit.After
import org.junit.Assert
import org.junit.Assume
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    var calculator: Calculator? = null

    @Before
    fun setUpsrthsfg() {
        calculator = Calculator()
    }

    @After
    fun tearDowndfghdfgh() {
        calculator = null
    }

    @Test
    fun mult22rtrty() {
        //Assert => если тест не пройден - AssertionError (Exception)
        //Assume => если тест не пройден - Ignored ("Warning")
        Assert.assertEquals(100, calculator?.mult(20,4) ?: 0)
    }

    @Test
    fun test2() {
        Assert.assertEquals(100, calculator?.mult(20,5) ?: 0)
    }

    @Test
    fun test3() {
        Assume.assumeNotNull(4,5,2,45,null)
    }


    @Test(expected = NullPointerException::class)
    fun test4() {
        calculator?.getLength("null")
    }
}
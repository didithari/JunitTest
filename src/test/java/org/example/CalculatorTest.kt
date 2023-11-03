package org.example

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

//ab


//Membuat class dengan nama CalculatorTest
class CalculatorTest {

    //Disini saya membuat Method dan menggunakan assertEquals untuk membandingkan dua data
    @Test
    fun add() {
        val calculator = Calculator()
        val expected = 10
        assertEquals(expected, calculator.add(5, 5))
    }

    //Disini  membuat Method sub untuk memperbaiki sub Method Calculator
    @Test
    fun `Test calculator can subtract two numbers`() {
        val calculator = Calculator()
        assertEquals(5, calculator.sub(15, 10))}}

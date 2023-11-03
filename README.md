# JunitTest
# JUnitTest
Nama : Aditya HAri kurniawan
Nim :E41222911
Membuat JUnit Test menggunakan InteliiJ
Pertama kita buat project baru
Lalu buat class baru dengan nama Calculator
Lalu beri code pada class Calculator

package io.automationhacks
class Calculator {
fun add(first: Int, second: Int): Int {
return first + second
}
}

Lalu run class Calculator
Setelah itu pergi ke build.gradle file dan menambahkan dependencies baru 

dependencies {
testImplementation 'org.jetbrains.kotlin:kotlin-test'
}

Lalu Generate Test class Calculator
setelah itu beri code pada Calculator Test

package io.automationhacks
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class CalculatorTest {

@Test
fun add() {
val calculator = Calculator()
val expected = 10
assertEquals(expected, calculator.add(5, 5))
}
}

Setelah itu run class Calculator Test dengan Coverage
Dan akan muncul hasil dari Calculator Test

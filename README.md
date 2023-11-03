# JunitTest
# JUnitTest
Nama : Aditya HAri kurniawan
Nim :E41222911
- Membuat JUnit Test menggunakan InteliiJ
1. Pertama kita buat project baru
2. Lalu buat class baru dengan nama Calculator
3. Lalu beri code pada class Calculator

package io.automationhacks
class Calculator {
fun add(first: Int, second: Int): Int {
return first + second
}
}

4. Lalu run class Calculator
5. Setelah itu pergi ke build.gradle file dan menambahkan dependencies baru 

dependencies {
testImplementation 'org.jetbrains.kotlin:kotlin-test'
}

6. Lalu Generate Test class Calculator
7. setelah itu beri code pada Calculator Test

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

8.Setelah itu run class Calculator Test dengan Coverage
Dan akan muncul hasil dari Calculator Test

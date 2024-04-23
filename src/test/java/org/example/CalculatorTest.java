
//  B211202047
//  EMİN KÜÇÜK
//  SOFTWARE VERIFICATION AND VALIDATION
//  HOMEWORK 1
//  https://github.com/emikucuk/SVV_HW_1.git

package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }
    @ParameterizedTest
    @CsvSource({"10, 2, 5", "10, 4, 2.5", "12.5, 2.5, 5", "10, 2.5, 4", "12.5, 5, 2.5"})
    void testAllDivisions(float dividend, float divisor, float expected) {
        assertEquals(expected, Calculator.divide(dividend, divisor));
    }
    @Test
    void testDivision6() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );
        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }
}
package Task5_id9202;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fizzBuzz1() {
        String expected = "FizzBuzz";
        assertEquals(expected, Main.fizzBuzz(15));
    }

    @Test
    void fizzBuzz2() {
        String expected = "Fizz";
        assertEquals(expected, Main.fizzBuzz(9));
    }

    @Test
    void fizzBuzz3() {
        String expected = "Buzz";
        assertEquals(expected, Main.fizzBuzz(10));
    }

    @Test
    void fizzBuzz4() {
        String expected = "1534";
        assertEquals(expected, Main.fizzBuzz(1534));
    }
}
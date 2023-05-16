package Task2_id9199;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void absOf0() {
        int number = 0;
        int expected = 0;

        int result = Main.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void absOfGreaterThan0() {
        int expected = 1;
        int number = 1;

        int result = Main.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void absOfLessThan0() {
        int expected = 1;
        int number = -1;

        int result = Main.findAbsolute(number);
        assertEquals(expected, result);
    }
}
package Task3_id9200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void nextDay1() {
        FDate expected = new FDate(27, 5, 2132);
        FDate input = new FDate(-100,-100,2142);

        FDate result = Main.formatDate(input);
        assertEquals(expected.toString(), result.toString());
    }

    @Test
    void nextDay2() {
        FDate expected = new FDate(2, 3, 2022);
        FDate input = new FDate(30,2,2022);

        FDate result = Main.formatDate(input);
        assertEquals(expected.toString(), result.toString());
    }

    @Test
    void testIsLeapYear() {
        boolean expected = false;
        int input = 2023;

        boolean result = Main.isLeapYear(input);
        assertEquals(expected, result);
    }
}
package Task3_id9200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void nextDay() {
        FDate expected = new FDate(28, 5, 2132);
        FDate input = new FDate(-100,-100,2142);

        FDate result = Main.nextDay(input);
        assertEquals(expected.toString(), result.toString());
    }
}
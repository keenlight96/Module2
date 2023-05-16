package Task4_id9201;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void classify1() {
        String expected = "Tam giác cân";
        String result = Main.classify(5,5,3);
        assertEquals(expected, result);
    }
    @Test
    void classify2() {
        String expected = "Tam giác đều";
        String result = Main.classify(5,5,5);
        assertEquals(expected, result);
    }

    @Test
    void classify3() {
        String expected = "Tam giác thường";
        String result = Main.classify(4,5,6);
        assertEquals(expected, result);
    }

    @Test
    void classify4() {
        String expected = "Không phải tam giác";
        String result = Main.classify(1,2,3);
        assertEquals(expected, result);
    }

}
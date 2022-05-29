package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void firstTest() {
        Assertions.assertTrue(2 < 3);
    }
    @Test
    void secondTest() {
        Assertions.assertTrue(3 < 1);
    }
}

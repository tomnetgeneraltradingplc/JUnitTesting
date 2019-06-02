package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
class StringLengthTest {

    @Test
    void isStringLengthIs3() {

        int actualValue = "Thomas".length();
        int expectedValue = 6;

        assertEquals(expectedValue, actualValue);

    }
}
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
        int str1 = "tom".length();
        int str2 = "Run".length();
        int str3 = "May".length();
        assertEquals(3, str1);
        assertEquals(3, str2);
        assertEquals(3, str3);
    }
}
package edu.sandiego.comp305;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testReverseString() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }
}
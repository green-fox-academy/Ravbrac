package number_converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberConverterTest {

    @Test
    void converterMax99Test() {
        assertEquals("five", NumberConverter.converter(5));
    }

    @Test
    void converterMax1MTest() {
        assertEquals("three hundred and ninety-four", NumberConverter.converter(394));
    }
}
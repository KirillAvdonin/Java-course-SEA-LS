package edu.hw3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertToRomanTest {
    @Test
    void convertToRomanTest() {
        assertEquals("XXV", new ConvertToRoman().convertToRoman(25));

        assertEquals("MMM", new ConvertToRoman().convertToRoman(3000));

        assertEquals("MCMLXXXVII", new ConvertToRoman().convertToRoman(1987));

        assertEquals("CMXLV", new ConvertToRoman().convertToRoman(945));

        assertEquals("LV", new ConvertToRoman().convertToRoman(55));

        assertEquals("V", new ConvertToRoman().convertToRoman(5));
    }
}

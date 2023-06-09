package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class CombinerTest {

    @Test
    public void shouldCombineTwoBigDecimals() {
        BigDecimal one = new BigDecimal(13);
        BigDecimal two = new BigDecimal(123812348);
        String result = Combiner.combineTwoItems(one, two);
        String expected = "First item: " + one + "; Second item: " + two;
        assertEquals(result, expected);
    }

    @Test
    public void shouldCombineBigDecimalAndString() {
        String one = "Hello world!";
        BigDecimal two = new BigDecimal(123812348);
        String result = Combiner.combineTwoItems(one, two);
        String expected = "First item: " + one + "; Second item: " + two;
        assertEquals(result, expected);
    }


    @Test
    public void shouldCombineLocalDateAndString() {
        String one = "Hello world!";
        LocalDate two = LocalDate.now();
        String result = Combiner.combineTwoItems(one, two);
        String expected = "First item: " + one + "; Second item: " + two;
        assertEquals(result, expected);
    }

}

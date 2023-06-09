package io.codelex.oop.generics;


import io.codelex.oop.summary.generics.Combiner;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
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

}

package io.codelex.javaadvanced.joiner;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoinerTest {

    @Test
    public void ShouldJoinIntegers() {
        Joiner<Integer> joiner = new Joiner<>("-");
        String result = joiner.join(1, 2, 3, 4, 5);
        assertEquals("1-2-3-4-5", result);
    }

    @Test
    public void ShouldJoinBigDecimal() {
        Joiner<BigDecimal> joiner = new Joiner<>("-");
        BigDecimal veryBig = new BigDecimal(111);
        String result = joiner.join(veryBig, veryBig, veryBig, veryBig);
        assertEquals("111-111-111-111", result);
    }
}

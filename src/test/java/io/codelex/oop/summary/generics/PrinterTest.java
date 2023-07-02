package io.codelex.oop.summary.generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.time.LocalDate;

public class PrinterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }


    @Test
    public void shouldReturnBigDecimalToString() {
        BigDecimal target = new BigDecimal(34212);
        Printer<BigDecimal> printer = new Printer<>(target);
        String result = printer.getThingToPrint();
        String expected = "34212";
        assertEquals(result, expected);
    }

    @Test
    public void shouldReturnDoubleToString() {
        Double target = 13.0;
        Printer<Double> printer = new Printer<>(target);
        String result = printer.getThingToPrint();
        String expected = "13.0";
        assertEquals(result, expected);
    }

    @Test
    public void shouldReturnLocalDateToString() {
        Printer<LocalDate> printer = new Printer<>(LocalDate.now());
        String result = printer.getThingToPrint();
        String expected = LocalDate.now().toString();
        assertEquals(result, expected);
    }

    @Test
    public void shouldPrintBigDecimal() {
        BigDecimal target = new BigDecimal(34212);
        Printer<BigDecimal> printer = new Printer<>(target);
        printer.print();
        String expected = "34212" + System.lineSeparator();
        assertEquals(expected, outContent.toString());
    }
}

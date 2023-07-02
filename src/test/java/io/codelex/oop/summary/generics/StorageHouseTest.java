package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class StorageHouseTest {

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
    public void shouldAddIntegers() {
        Integer integer = 15;
        StorageHouse<Integer> storage = new StorageHouse<>(integer);
        storage.addMoreItems(16);
        storage.addMoreItems(17);
    }

    @Test
    public void shouldAddBigDecimals() {
        BigDecimal bigDecimal = new BigDecimal(1423);
        StorageHouse<BigDecimal> storage = new StorageHouse<>(bigDecimal);
        storage.addMoreItems(new BigDecimal(23423));
        storage.addMoreItems(new BigDecimal(238482));
    }

    @Test
    public void shouldGetTheFirstItemGiven() {
        String string = "Hello world!";
        StorageHouse<String> storage = new StorageHouse<>(string);
        Optional<String> result = storage.getMaybeFirstItem();
        String expected = "Hello world!";
        assertEquals(result.get(), expected);
    }

    @Test
    public void shouldGetTheFirstItemGivenEvenAfterAddingMoreStrings() {
        String string = "Hello world!";
        StorageHouse<String> storage = new StorageHouse<>(string);
        storage.addMoreItems("Whoops");
        storage.addMoreItems("It works?!");
        Optional<String> result = storage.getMaybeFirstItem();
        String expected = "Hello world!";
        assertEquals(result.get(), expected);
    }

    @Test
    public void shouldPrintAllBigDecimals() {
        BigDecimal bigDecimal = new BigDecimal(1423);
        StorageHouse<BigDecimal> storage = new StorageHouse<>(bigDecimal);
        storage.addMoreItems(new BigDecimal(23423));
        storage.addMoreItems(new BigDecimal(238482));
        // God damn windows!
        String expected = "1423" + System.lineSeparator()
                + "23423" + System.lineSeparator()
                + "238482" + System.lineSeparator();
        storage.printItems();
        assertEquals(expected, outContent.toString());
    }
}

package ch.hesge.cours634.counter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main {
    @Test
    public void testConstructor1() {
        assertDoesNotThrow(() -> new UpperLimitedPositiveCounter(1, 15));
    }

    @Test
    public void testConstructor2() {
        assertDoesNotThrow(() -> new UpperLimitedPositiveCounter(0, 15));
    }

    @Test
    public void testConstructor3() {
        assertThrows(CounterException.class, () -> {
            Counter counter = new UpperLimitedPositiveCounter(-1, 15);
        });
    }

    @Test
    public void testInc1() throws CounterException {
        Counter counter = new UpperLimitedPositiveCounter(10, 15);
        counter.inc();
        counter.inc();
        counter.inc();
        counter.inc();
        assertEquals(14, counter.getValue());
    }

    @Test
    public void testInc2() throws CounterException {
        Counter counter = new UpperLimitedPositiveCounter(10, 15);
        counter.inc();
        counter.inc();
        counter.inc();
        counter.inc();
        counter.inc();
        assertEquals(15, counter.getValue());
    }

    @Test
    public void testInc3() {
        assertThrows(CounterException.class, () -> {
            Counter counter = new UpperLimitedPositiveCounter(10, 15);
            counter.inc();
            counter.inc();
            counter.inc();
            counter.inc();
            counter.inc();
            counter.inc();
        });
    }

    @Test
    public void testAdd1() throws CounterException {
        Counter counter = new UpperLimitedPositiveCounter(10, 15);
        counter.add(4);
        assertEquals(14, counter.getValue());
    }


    @Test
    public void testAdd2() throws CounterException {
        Counter counter = new UpperLimitedPositiveCounter(10, 15);
        counter.add(5);
        assertEquals(15, counter.getValue());
    }

    @Test
    public void testAdd3() {
        assertThrows(CounterException.class, () -> {
            Counter counter = new UpperLimitedPositiveCounter(10, 15);
            counter.add(6);
        });
    }
}
package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    public UpperLimitedPositiveCounter(int start, int max) throws CounterException {
        super(start, max);
        if (start < 0)
            throw new CounterException();
    }
}

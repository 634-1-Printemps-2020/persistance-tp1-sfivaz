package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    int start;
    int current;
    int max;

    public Counter(int start, int max) {
        this.start = start;
        this.max = max;
        current = start;
    }

    @Override
    public void inc() throws CounterException {
        if (current == max)
            throw new CounterException();
        current += 1;
    }

    @Override
    public void add(int step) throws CounterException {
        if (current + step > max)
            throw new CounterException();
        else if (current + step < start)
            throw new CounterException();
        else
            current += step;
    }

    @Override
    public int getValue() {
        return current;
    }
}

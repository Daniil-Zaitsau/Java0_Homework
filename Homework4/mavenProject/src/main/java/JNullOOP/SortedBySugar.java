package JNullOOP;

import java.util.Comparator;

public class SortedBySugar implements Comparator<Confection> {
    @Override
    public int compare(Confection o1, Confection o2) {
        return Integer.compare(o1.getSugar(), o2.getSugar());
    }
}

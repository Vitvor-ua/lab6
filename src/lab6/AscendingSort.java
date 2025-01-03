package lab6;

import java.util.Collections;
import java.util.List;

/**
 * Concrete sorting strategy using ascending order.
 *
 * @param <T> the type of elements to be sorted
 */
public class AscendingSort<T extends Comparable<T>> implements SortStrategy<T> {
    @Override
    public void sort(List<T> items) {
        Collections.sort(items);
    }
}
package lab6;

import java.util.List;

/**
 * Strategy interface for sorting algorithms.
 *
 * @param <T> the type of elements to be sorted
 */
public interface SortStrategy<T> {
    /**
     * Sorts the given list based on the strategy.
     *
     * @param items the list to be sorted
     */
    void sort(List<T> items);
}
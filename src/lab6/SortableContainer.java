package lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic container class for sortable data.
 *
 * @param <T> the type of elements contained
 */
public class SortableContainer<T extends Comparable<T>> {
    private final List<T> items = new ArrayList<>();
    private SortStrategy<T> sortStrategy;

    /**
     * Sets the sorting strategy.
     *
     * @param sortStrategy the sorting strategy to use
     */
    public void setSortStrategy(SortStrategy<T> sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    /**
     * Adds an item to the container.
     *
     * @param item the item to add
     */
    public void add(T item) {
        items.add(item);
    }

    /**
     * Returns the items in the container.
     *
     * @return the list of items
     */
    public List<T> getItems() {
        return items;
    }

    /**
     * Sorts the items using the current strategy.
     *
     * @throws IllegalStateException if no strategy is set
     */
    public void sort() {
        if (sortStrategy == null) {
            throw new IllegalStateException("Sort strategy is not set.");
        }
        sortStrategy.sort(items);
    }
}
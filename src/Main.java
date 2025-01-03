import lab6.*;

public class Main {
    public static void main(String[] args) {
        // Integer container example
        SortableContainer<Integer> intContainer = new SortableContainer<>();
        intContainer.add(5);
        intContainer.add(2);
        intContainer.add(9);
        intContainer.setSortStrategy(new AscendingSort<>());
        intContainer.sort();
        System.out.println("Sorted integers (ascending): " + intContainer.getItems());

        intContainer.setSortStrategy(new DescendingSort<>());
        intContainer.sort();
        System.out.println("Sorted integers (descending): " + intContainer.getItems());

        // String container example
        SortableContainer<String> stringContainer = new SortableContainer<>();
        stringContainer.add("apple");
        stringContainer.add("banana");
        stringContainer.add("cherry");
        stringContainer.setSortStrategy(new AscendingSort<>());
        stringContainer.sort();
        System.out.println("Sorted strings (ascending): " + stringContainer.getItems());

        stringContainer.setSortStrategy(new DescendingSort<>());
        stringContainer.sort();
        System.out.println("Sorted strings (descending): " + stringContainer.getItems());
    }
}
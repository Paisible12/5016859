public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Alice", 300.0),
                new Order(2, "Bob", 100.0),
                new Order(3, "Charlie", 400.0),
                new Order(4, "Dave", 450.0)
        };

        // Bubble Sort
        BubbleSort.bubbleSort(orders);
        System.out.println("Bubble Sorted Orders: ");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reset orders array
        orders = new Order[]{
                new Order(1, "Alice", 300.0),
                new Order(2, "Bob", 100.0),
                new Order(3, "Charlie", 400.0),
                new Order(4, "Dave", 450.0)
        };

      
        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("Quick Sorted Orders: ");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

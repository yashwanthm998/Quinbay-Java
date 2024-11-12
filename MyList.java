import java.util.*;

class operations {
    private int[] array;
    private int size; 

    private static final int capacity = 100;

    public operations() {
        array = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        inc_capacity(); 
        array[size++] = value;
    }

   
    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        red_capacity();
    }

    public void deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteByIndex(i); 
                return;
            }
        }
        System.out.println("Value " + value + " not found.");
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return array[index];
    }

    private void inc_capacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
    private void red_capacity() {
        if (size < array.length / 4 && array.length > capacity) {
            int newCapacity = array.length / 2;
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
    public int size() {
        return size;
    }
}


public class MyList {
    public static void main(String[] args) {
        operations list = new operations();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new value");
            System.out.println("2. Delete an element by index");
            System.out.println("3. Delete an element by value");
            System.out.println("4. Retrieve a value by index");
            System.out.println("5. Display list size");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to add: ");
                    int val = scanner.nextInt();
                    list.add(val);
                    System.out.println("Added " + val + " to the list.");
                    break;

                case 2:
                    System.out.print("Enter the index to delete: ");
                    int del = scanner.nextInt();
                    try {
                        list.deleteByIndex(del);
                        System.out.println("Deleted element at index " + del);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter the value to delete: ");
                    int val_del = scanner.nextInt();
                    list.deleteByValue(val_del);
                    break;

                case 4:
                    System.out.print("Enter the index to retrieve: ");
                    int rev = scanner.nextInt();
                    try {
                        int retrievedValue = list.get(rev);
                        System.out.println("Element at index " + rev + ": " + retrievedValue);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Current list size: " + list.size());
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

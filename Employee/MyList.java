package Employee;

import java.util.*;
import java.text.SimpleDateFormat;

class Operations {
    private Employee[] array;
    private int size;

    private static final int capacity = 100;

    public Operations() {
        array = new Employee[capacity];
        size = 0;
    }

    public void add(Employee employee) {
        inc_capacity();
        array[size++] = employee;
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

    public void deleteByValue(Employee employee) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(employee)) {
                deleteByIndex(i);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public Employee get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return array[index];
    }

    private void inc_capacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            Employee[] newArray = new Employee[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    private void red_capacity() {
        if (size < array.length / 4 && array.length > capacity) {
            int newCapacity = array.length / 2;
            Employee[] newArray = new Employee[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    public int size() {
        return size;
    }
    public void displayList() {
        if (size == 0) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Employee List:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}

public class MyList {
    public static void main(String[] args) {
        Operations list = new Operations();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Date format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new Employee");
            System.out.println("2. Delete an Employee by index");
            System.out.println("3. Delete an Employee by value");
            System.out.println("4. Retrieve an Employee by index");
            System.out.println("5. Display list size");
            System.out.println("6. Display all Employees");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    String id = scanner.next();
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Employee Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter Employee Date of Joining (yyyy-mm-dd): ");
                    String dateString = scanner.next();

                    try {
                        Date dateOfJoining = sdf.parse(dateString);
                        Employee employee = new Employee(id, name, age, dateOfJoining);
                        list.add(employee);
                        System.out.println("Added Employee: " + employee);
                    } catch (Exception e) {
                        System.out.println("Invalid date format. Please use yyyy-mm-dd.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the index to delete: ");
                    int del = scanner.nextInt();
                    try {
                        list.deleteByIndex(del);
                        System.out.println("Deleted Employee at index " + del);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    String empIdToDelete = scanner.next();
                    Employee empToDelete = null;
                    for (int i = 0; i < list.size(); i++) {
                        Employee emp = list.get(i);
                        if (emp.getId().equals(empIdToDelete)) {
                            empToDelete = emp;
                            break;
                        }
                    }
                    if (empToDelete != null) {
                        list.deleteByValue(empToDelete);
                        System.out.println("Deleted Employee: " + empToDelete);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the index to retrieve: ");
                    int rev = scanner.nextInt();
                    try {
                        Employee retrievedEmployee = list.get(rev);
                        System.out.println("Employee at index " + rev + ": " + retrievedEmployee);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Current list size: " + list.size());
                    break;

                case 6:
                    list.displayList();
                    break;

                case 7:
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
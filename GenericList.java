class gen_list<T> {
    private T[] data;
    private int size;

    public gen_list() {
        data = (T[]) new Object[100];
        size = 0;
    }

    public void add(T value) {
        if (size == data.length) {
            growArray();
        }
        data[size++] = value;
    }

    public void deleteAtIndex(int index) {
        if (index<0 || index>=size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i=index; i<size-1; i++) {
            data[i] = data[i+1];
        }
        data[--size] = null;
        if (size< data.length/2) {
            shrinkArray();
        }
    }

    public void deleteByValue(T value) {
        for (int i=0; i<size; i++) {
            if (data[i].equals(value)) {
                deleteAtIndex(i);
                return;
            }
        }
        System.out.println("Value not found in the list");
    }

    public T get(int index) {
        if (index<0 || index>=size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return data[index];
    }

    private void growArray() {
        T[] newData = (T[]) new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    private void shrinkArray() {
        if (data.length > 100) { 
            int newCapacity = Math.max(100, data.length/2);
            T[] newData = (T[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public int size() {
        return size;
    }

    public void display() {
        System.out.print("MyList: ");
        for (int i=0; i<size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

public class GenericList {
    public static void main(String[] args) {
        gen_list<Integer> intList = new gen_list<>();
        System.out.println("Integer list:");
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.display(); 
        intList.deleteByValue(20);
        intList.display();

        gen_list<String> stringList = new gen_list<>();
        System.out.println("\nString list:");
        stringList.add("Hello");
        stringList.add("World");
        stringList.display(); 
        stringList.deleteAtIndex(1);
        stringList.display(); 
        
        System.out.println("\nCustom class list:");
        gen_list<Person> personList = new gen_list<>();
        personList.add(new Person("Yashwanth", 21));
        personList.add(new Person("Arasappa", 21));
        personList.display(); 
        personList.deleteByValue(new Person("Arasappa", 21));
        personList.display();
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
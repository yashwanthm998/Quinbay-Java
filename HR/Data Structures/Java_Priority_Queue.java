import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    public int compareTo(Student other) {
        
        if (Double.compare(other.cgpa, this.cgpa) != 0) {
            return Double.compare(other.cgpa, this.cgpa);
        }
       
        int nameCompare = this.name.compareTo(other.name);
        if (nameCompare != 0) {
            return nameCompare;
        }
        
        return Integer.compare(this.id, other.id);
    }
}


class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>();

        for (String event : events) {
            String[] parts = event.split(" ");
            String command = parts[0];
            
            if (command.equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                Student student = new Student(id, name, cgpa);
                queue.add(student);
            } else if (command.equals("SERVED")) {
                queue.poll(); 
            }
        }

        List<Student> students = new ArrayList<>(queue);
        Collections.sort(students); 
        return students;
    }
}


public class Java_Priority_Queue{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
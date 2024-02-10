package algorithm.practice.collection.collections;

import java.util.*;

class Student{

    private int id;
    private String name;
    private double cgpa;


    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getCGPA(){
        return cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getCGPA() != s2.getCGPA() ? s2.getCGPA() - s1.getCGPA() > 0 ? 1 : -1 : !s1.getName().equals(s2.getName()) ? s1.getName().compareTo(s2.getName()) :  s1.getID() > s2.getID() ? 1 : -1;
            }
        });

        for (String str: events) {
            String isENTER = str.split(" ")[0];

            if (isENTER.equals("ENTER")) {
                int id = Integer.parseInt(str.split(" ")[3]);
                String name = str.split(" ")[1];
                double cgpa = Double.parseDouble(str.split(" ")[2]);

                priorityQueue.add(new Student(id, name, cgpa));

            } else priorityQueue.poll();
        }

        List<Student> result = new ArrayList<>();

        while (!priorityQueue.isEmpty()) {
            result.add(priorityQueue.poll());
        }

        return result;


    }
}

public class PriorityQueueTest {

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
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }

//    sample input
//    12
//    ENTER John 3.75 50
//    ENTER Mark 3.8 24
//    ENTER Shafaet 3.7 35
//    SERVED
//    SERVED
//    ENTER Samiha 3.85 36
//    SERVED
//    ENTER Ashley 3.9 42
//    ENTER Maria 3.6 46
//    ENTER Anik 3.95 49
//    ENTER Dan 3.95 50
//    SERVED


//    output
//     Dan
//     Ashley
//     Shafaet
//     Maria
}

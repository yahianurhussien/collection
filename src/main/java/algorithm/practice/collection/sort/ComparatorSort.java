package algorithm.practice.collection.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class Student {
    private final int id;
    private final String fname;
    private final double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class MySort implements Comparator<Student> {
    public int compare(Student std1, Student std2) {
        if (std1.getCgpa() == std2.getCgpa()) {
            if (std1.getFname().equals(std2.getFname())) {
                return std1.getId() - std2.getId() > 0 ? 1 : -1;
            }
            return std1.getFname().compareTo(std2.getFname());
        }
        return std2.getCgpa() - std1.getCgpa() > 0 ? 1 : -1;


    }

}

//Complete the code
public class ComparatorSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(new MySort());
        // Collections.sort(studentList, new MySort());
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}


//   Input
//           5
//           33 Rumpa 3.68
//           85 Ashis 3.85
//           56 Samiha 3.75
//           19 Samara 3.75
//           22 Fahim 3.76

//output
//        Ashis
//        Fahim
//        Samara
//        Samiha
//        Rumpa
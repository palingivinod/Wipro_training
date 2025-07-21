import java.util.*;
import java.util.stream.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name + ", Mark: " + marks;
    }
}

public class TestPassCount {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Vinnu", 75));
        studentList.add(new Student(2, "Chinnu", 90));
        studentList.add(new Student(3, "Bunny", 56));
        studentList.add(new Student(4, "Sunny", 33));
        studentList.add(new Student(5, "Ssn", 90));

        List<Student> passedStudents = studentList.stream()
            .filter(s -> s.marks >= 50)
            .collect(Collectors.toList());

        System.out.println("Students who passed the exam :");
        passedStudents.forEach(System.out::println);

        int count = passedStudents.size();
        System.out.println("Total no of students passed: " + count);
    }
}

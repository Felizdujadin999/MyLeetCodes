package LeetCodes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentDriver {
    public static void main(String[] args) {
        Student student1 = new Student("Felix", 20);
        Student student2 = new Student("Joshua", 30);
        Student student3 = new Student("Spencer", 25);
        Student student4 = new Student("Yinka", 31);
        Student student5 = new Student("Moyin", 25);

        Comparator<Student> comparator = (c1, c2) -> {
            if (c1.getAge() > c2.getAge()) return 1;
            else if (c2.getAge() > c1.getAge()) return -1;
            return 0;
        };

//        Comparator<Student> nameComparator = (s1, s2) -> s1.getName().compareTo(s2.getName());

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        System.out.println("Unsorted list: " + students);
        students.sort(comparator);
        System.out.println("Sorted list of students lexicographically by age: " + students);

        students.sort(Comparator.comparing(Student::getAge).thenComparing(Student::getName));
        System.out.println("Sorted list of students by age and name: " + students);

    }
}

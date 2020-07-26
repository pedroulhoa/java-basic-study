package set.exercise.application;

import set.exercise.entities.Course;
import set.exercise.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many students for course A? ");
        int nA = sc.nextInt();
        Course courseA = new Course();
        Set<Student> studentsA = new HashSet<>();
        for (int i = 1; i <= nA; i++) {
            Integer n = sc.nextInt();
            studentsA.add(new Student(n));
        }
        courseA.setStudent(studentsA);

        System.out.println("How many students for course B? ");
        int nB = sc.nextInt();
        Course courseB = new Course();
        Set<Student> studentsB = new HashSet<>();
        for (int i = 1; i <= nB; i++) {
            Integer n = sc.nextInt();
            studentsB.add(new Student(n));
        }
        courseB.setStudent(studentsB);

        System.out.println("How many students for course C? ");
        int nC = sc.nextInt();
        Course courseC = new Course();
        Set<Student> studentsC = new HashSet<>();
        for (int i = 1; i <= nC; i++) {
            Integer n = sc.nextInt();
            studentsC.add(new Student(n));
        }
        courseC.setStudent(studentsC);

        Set<Student> totalStudentsCourses = new HashSet<>(courseA.getStudent());
        totalStudentsCourses.addAll(courseB.getStudent());
        totalStudentsCourses.addAll(courseC.getStudent());

        System.out.println("Total students: " + totalStudentsCourses.size());

        sc.close();

    }

}

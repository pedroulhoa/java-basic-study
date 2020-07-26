package set.exercise.entities;

import java.util.Set;

public class Course {

    private Set<Student> student;

    public Course() {
    }

    public Set<Student> getStudent() {
        return student;
    }

    public void setStudent(Set<Student> student) {
        this.student = student;
    }

}

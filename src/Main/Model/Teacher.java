package Main.Model;

import java.util.List;

public class Teacher extends Person{
    private List<Course> courses;
    private int teacherId;

    @Override
    public String toString() {
        return "Teacher{" +
                "courses=" + courses +
                ", teacherId=" + teacherId +
                '}';
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher(String firstName, String lastName, List<Course> courses) {
        super(firstName, lastName);
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}

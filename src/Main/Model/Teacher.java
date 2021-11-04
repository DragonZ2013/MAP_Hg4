package Main.Model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private List<Course> courses;
    private int teacherId;

    @Override
    public String toString() {
        return "Teacher{" +
                "courses=" + this.coursesToId() +
                ", teacherId=" + teacherId +
                ", firstName=" + this.getFirstName()+
                ", lastName=" + this.getLastName()+
                '}';
    }

    public List<Integer> coursesToId(){
        List<Integer> retList = new ArrayList<>();
        for(Course c : this.courses)
            retList.add(c.getCourseId());
        return retList;
    }
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher(String firstName, String lastName, List<Course> courses,int teacherId) {
        super(firstName, lastName);
        this.courses = courses;
        this.teacherId = teacherId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}

package Main.Controller;

import Main.Model.Course;
import Main.Model.Student;
import Main.Repository.CourseRepository;
import Main.Repository.StudentRepository;
import Main.Repository.TeacherRepository;

import java.util.Comparator;
import java.util.List;

public class Controller {
    CourseRepository cr = new CourseRepository();
    TeacherRepository tr = new TeacherRepository();
    StudentRepository sr = new StudentRepository();

    public Controller(CourseRepository cr, TeacherRepository tr, StudentRepository sr) {
        this.cr = cr;
        this.tr = tr;
        this.sr = sr;
    }

    public List<Student> SortStudents(){
        List<Student> studentList = sr.getAll();


        return studentList;
    }

    public List<Student> FilterStudents(){
        List<Student> studentList = sr.getAll();


        return studentList;
    }

    public List<Course> SortCourses(){
        List<Course> courseList = cr.getAll();
        Comparator<Course> courseComparator = (o1, o2) -> Integer.valueOf(o1.getCredits()).compareTo(Integer.valueOf(o2.getCredits()));
        List<Course> retList = courseList.stream().sorted(courseComparator).toList();


        return retList;
    }

    public List<Course> FilterCourses(){
        List<Course> courseList = cr.getAll();


        return courseList;
    }

}

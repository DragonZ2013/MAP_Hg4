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

    /**
     * Returns the list of students sorted by their LastName - WIP - FirstName sorting, thenComparing breaks
     * @return retList List<Student>
     */
    public List<Student> SortStudents(){
        List<Student> studentList = sr.getAll();
        Comparator<Student> studentComparator = Comparator.comparing(o -> o.getLastName());//.thenComparing(o -> o.getFirstName());
        List<Student> retList = studentList.stream().sorted(studentComparator).toList();
        return retList;
    }

    public List<Student> FilterStudents(){
        List<Student> studentList = sr.getAll();


        return studentList;
    }

    /**
     * Returns the list of courses sorted by their credits
     * @return retList List<Course>
     */
    public List<Course> SortCourses(){
        List<Course> courseList = cr.getAll();
        Comparator<Course> courseComparator = Comparator.comparing(o -> Integer.valueOf(o.getCredits()));
        List<Course> retList = courseList.stream().sorted(courseComparator).toList();


        return retList;
    }

    public List<Course> FilterCourses(){
        List<Course> courseList = cr.getAll();



        return courseList;
    }

}

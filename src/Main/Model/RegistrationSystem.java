package Main.Model;

import Main.Repository.CourseRepository;
import Main.Repository.StudentRepository;
import Main.Repository.TeacherRepository;

import java.util.List;

public class RegistrationSystem {

    CourseRepository cr = new CourseRepository();
    TeacherRepository tr = new TeacherRepository();
    StudentRepository sr = new StudentRepository();

    boolean register (Course course, Student student){
        return false;
    }

    List<Course> retrieveCoursesWithFreePlaces(){
        return null;
    }

    List<Student> retrieveStudentsEnrolledForACourse(Course course){
        return null;
    }

    List<Course> getAllCourses()
    {
        return cr.getAll();
    }

}

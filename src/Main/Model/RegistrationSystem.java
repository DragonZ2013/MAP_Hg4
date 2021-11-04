package Main.Model;

import Main.Repository.CourseRepository;
import Main.Repository.StudentRepository;
import Main.Repository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class RegistrationSystem {

    CourseRepository cr = new CourseRepository();
    TeacherRepository tr = new TeacherRepository();
    StudentRepository sr = new StudentRepository();

    boolean register (Course course, Student student){
        return false;
    }

    List<Course> retrieveCoursesWithFreePlaces(){
        List<Course> retList = new ArrayList<>();
        List<Course> allList = cr.getAll();
        for(Course course: allList) {
            if(course.getMaxEnrollment()>course.getStudentsEnrolled().size())
                retList.add(course);
        }
        return retList;
    }

    List<Student> retrieveStudentsEnrolledForACourse(Course course){
        return course.getStudentsEnrolled();
    }

    List<Course> getAllCourses()
    {
        return cr.getAll();
    }

}

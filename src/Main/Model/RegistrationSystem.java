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
        if(course.getMaxEnrollment()>course.getStudentsEnrolled().size()){
            List<Student> courseEnrolled = course.getStudentsEnrolled();
            List<Course> studentEnrolled = student.getEnrolledCourses();
            courseEnrolled.add(student);
            studentEnrolled.add(course);
            Course courseUpdated = new Course(course.getName(),course.getTeacher(),course.getMaxEnrollment(),courseEnrolled,course.getCredits(),course.getCourseId());
            cr.update(courseUpdated);
            Student studentUpdated = new Student(student.getFirstName(),student.getLastName(),student.getStudentId(),student.getTotalCredits(),studentEnrolled);
            sr.update(studentUpdated);
            return true;

        }
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

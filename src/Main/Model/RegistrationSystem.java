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

    /**
     * registers a student to a given course, updating credits and respective Lists
     * @param course
     * @param student
     * @return true on success, false on failure
     */
    boolean register (Course course, Student student){
        if(course.getMaxEnrollment()>course.getStudentsEnrolled().size()){
            List<Student> courseEnrolled = course.getStudentsEnrolled();
            List<Course> studentEnrolled = student.getEnrolledCourses();
            courseEnrolled.add(student);
            studentEnrolled.add(course);
            int studentNewCredits = student.getTotalCredits()+course.getCredits();
            Course courseUpdated = new Course(course.getName(),course.getTeacher(),course.getMaxEnrollment(),courseEnrolled,course.getCredits(),course.getCourseId());
            cr.update(courseUpdated);
            Student studentUpdated = new Student(student.getFirstName(),student.getLastName(),student.getStudentId(),studentNewCredits,studentEnrolled);
            sr.update(studentUpdated);
            return true;

        }
            return false;
    }

    /**
     * returns the courses which have more spots than occupied places (have empty places)
     * @return List<Course>
     */
    List<Course> retrieveCoursesWithFreePlaces(){
        List<Course> retList = new ArrayList<>();
        List<Course> allList = cr.getAll();
        for(Course course: allList) {
            if(course.getMaxEnrollment()>course.getStudentsEnrolled().size())
                retList.add(course);
        }
        return retList;
    }

    /**
     * returns all the students registered to a particular Course
     * @param course
     * @return List<Student>
     */
    List<Student> retrieveStudentsEnrolledForACourse(Course course){
        return course.getStudentsEnrolled();
    }

    /**
     * returns all of the Courses
     * @return List<Course>
     */
    List<Course> getAllCourses()
    {
        return cr.getAll();
    }

}

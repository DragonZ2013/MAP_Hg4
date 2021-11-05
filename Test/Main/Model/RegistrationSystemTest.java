package Main.Model;

import Main.Repository.CourseRepository;
import Main.Repository.StudentRepository;
import Main.Repository.TeacherRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationSystemTest {


    @Test
    void register() {
    }

    @Test
    void retrieveCoursesWithFreePlaces() {
    }

    @Test
    void retrieveStudentsEnrolledForACourse() {
    }

    @Test
    void getAllCourses() {
        RegistrationSystem registrationSystem = new RegistrationSystem();
        CourseRepository courseRepository = new CourseRepository();
        StudentRepository studentRepository = new StudentRepository();
        TeacherRepository teacherRepository = new TeacherRepository();
        registrationSystem.setCr(courseRepository);
        registrationSystem.setSr(studentRepository);
        registrationSystem.setTr(teacherRepository);
        Teacher teacher1 = new Teacher("Bob","William",new ArrayList<>(),1);
        Course course1 = new Course("name1",teacher1,5,new ArrayList<>(),20,1);
        Student student1 = new Student("Emil","Iulian",1,0,new ArrayList<>());
        courseRepository.create(course1);
        studentRepository.create(student1);
        teacherRepository.create(teacher1);
        assertEquals(registrationSystem.getAllCourses(), List.of(course1));

        Course course2 = new Course("Course1",teacher1,7,new ArrayList<>(),20,1);
        courseRepository.update(course2);
        assertEquals(registrationSystem.getAllCourses(),Arrays.asList(course1));

        Course course3 = new Course("Course2",teacher1,10,new ArrayList<>(),24,2);
        courseRepository.create(course3);

        assertEquals(registrationSystem.getAllCourses(), Arrays.asList(course2,course3));



    }
}
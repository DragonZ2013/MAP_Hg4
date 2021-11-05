package Main.Model;

import Main.Repository.CourseRepository;
import Main.Repository.StudentRepository;
import Main.Repository.TeacherRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
        RegistrationSystem rs = new RegistrationSystem();
        CourseRepository cr = new CourseRepository();
        StudentRepository sr = new StudentRepository();
        TeacherRepository tr = new TeacherRepository();
        rs.setCr(cr);
        rs.setSr(sr);
        rs.setTr(tr);
        Teacher t1 = new Teacher("Bob","William",new ArrayList(),1);
        Course c1 = new Course("name1",t1,5,new ArrayList(),20,1);
        Student s1 = new Student("Emil","Iulian",1,0,new ArrayList());
        cr.create(c1);
        sr.create(s1);
        tr.create(t1);
        assertEquals(rs.getAllCourses(),Arrays.asList(c1));
        Course c2 = new Course("Course1",t1,7,new ArrayList(),20,1);
        cr.update(c2);
        assertEquals(rs.getAllCourses(),Arrays.asList(c2));
        c1.setCourseId(2);
        cr.create(c1);
        assertEquals(rs.getAllCourses(), Arrays.asList(c2,c1));



    }
}
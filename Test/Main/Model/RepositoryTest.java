package Main.Model;
import Main.Repository.CourseRepository;
import Main.Repository.StudentRepository;
import Main.Repository.TeacherRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    /**
     * Tests for CourseRepository functions
     */
    @Test
    void courseRepositoryTest(){
        CourseRepository courseRepository = new CourseRepository();
        Teacher teacher1 = new Teacher ("Robert","Danil",new ArrayList<>(),1);
        Course course1 = new Course("Course1",teacher1,10,new ArrayList<>(),20,1);
        courseRepository.create(course1);
        assertEquals(courseRepository.getAll(), List.of(course1));
        Course course2 = new Course("Course2",teacher1,15,new ArrayList<>(),25,2);
        courseRepository.create(course2);
        assertEquals(courseRepository.getAll(),Arrays.asList(course1,course2));
        Course course3 = new Course("Course Statistics",teacher1,12,new ArrayList<>(),18,1);
        courseRepository.update(course3);
        assertEquals(courseRepository.getAll(),Arrays.asList(course3,course2));
        courseRepository.delete(course1);
        assertEquals(courseRepository.getAll(), List.of(course2));
    }

    /**
     * Tests for StudentRepository functions
     */
    @Test
    void studentRepositoryTest(){
        StudentRepository studentRepository = new StudentRepository();
        Student student1 = new Student("Radu","Bogdan",1,10,new ArrayList<>());
        Student student2 = new Student("Luciana","Oprea",2,20,new ArrayList<>());
        Student student3 = new Student("Ionel","Palea",1,16,new ArrayList<>());
        studentRepository.create(student1);
        assertEquals(studentRepository.getAll(),List.of(student1));
        studentRepository.create(student2);
        assertEquals(studentRepository.getAll(),Arrays.asList(student1,student2));
        studentRepository.update(student3);
        assertEquals(studentRepository.getAll(),Arrays.asList(student3,student2));
        studentRepository.delete(student3);
        assertEquals(studentRepository.getAll(),List.of(student2));
    }

    /**
     * Tests for TeacherRepository functions
     */
    @Test
    void teacherRepositoryTest(){
        TeacherRepository teacherRepository = new TeacherRepository();
        Teacher teacher1 = new Teacher("Popovici","Ion",new ArrayList<>(),1);
        Teacher teacher2 = new Teacher("Raul","Postescu",new ArrayList<>(),2);
        Teacher teacher3 = new Teacher("Laura","Jalea",new ArrayList<>(),1);
        teacherRepository.create(teacher1);
        assertEquals(teacherRepository.getAll(),List.of(teacher1));
        teacherRepository.create(teacher2);
        assertEquals(teacherRepository.getAll(),Arrays.asList(teacher1,teacher2));
        teacherRepository.update(teacher3);
        assertEquals(teacherRepository.getAll(),Arrays.asList(teacher3,teacher2));
        teacherRepository.delete(teacher3);
        assertEquals(teacherRepository.getAll(),List.of(teacher2));
    }


}

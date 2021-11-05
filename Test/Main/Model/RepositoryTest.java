package Main.Model;
import Main.Repository.CourseRepository;
import Main.Repository.StudentRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
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


}

package Main.Model;
import Main.Repository.CourseRepository;
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


}

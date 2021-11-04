package Main.Repository;

import Main.Model.Course;
import Main.Model.Student;

public class CourseRepository extends InMemoryRepository<Course>{

    public CourseRepository() {
        super();
    }

    @Override
    public Course update(Course obj) {
        Course courseToUpdate = this.repoList.stream()
                .filter(course -> course.getCourseId() == obj.getCourseId())
                .findFirst()
                .orElseThrow();
        courseToUpdate.setCredits(obj.getCredits());
        courseToUpdate.setMaxEnrollment(obj.getMaxEnrollment());
        courseToUpdate.setName(obj.getName());
        courseToUpdate.setTeacher(obj.getTeacher());
        courseToUpdate.setStudentsEnrolled(courseToUpdate.getStudentsEnrolled());

        return courseToUpdate;
    }
}

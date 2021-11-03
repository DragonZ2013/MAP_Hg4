package Main.Repository;

import Main.Model.Course;

public class CourseRepository extends InMemoryRepository<Course>{

    public CourseRepository() {
        super();
    }

    @Override
    public Course update(Course obj) {
        return null;
    }
}

package Main.Repository;

import Main.Model.Student;
import Main.Model.Teacher;

public class TeacherRepository extends InMemoryRepository<Teacher>{


    public TeacherRepository() {
        super();
    }

    @Override
    public Teacher update(Teacher obj) {
        Teacher teacherToUpdate = this.repoList.stream()
                .filter(teacher -> teacher.getTeacherId() == obj.getTeacherId())
                .findFirst()
                .orElseThrow();
        teacherToUpdate.setCourses(obj.getCourses());
        teacherToUpdate.setFirstName(obj.getFirstName());
        teacherToUpdate.setLastName(obj.getLastName());

        return teacherToUpdate;
    }
}

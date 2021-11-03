package Main.Repository;

import Main.Model.Teacher;

public class TeacherRepository extends InMemoryRepository<Teacher>{


    public TeacherRepository() {
        super();
    }

    @Override
    public Teacher update(Teacher obj) {
        return null;
    }
}

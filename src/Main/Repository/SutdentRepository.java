package Main.Repository;

import Main.Model.Student;

public class SutdentRepository extends InMemoryRepository<Student>{

    public SutdentRepository() {
        super();
    }

    @Override
    public Student update(Student obj) {
        return null;
    }
}

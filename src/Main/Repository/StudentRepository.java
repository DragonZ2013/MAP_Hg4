package Main.Repository;

import Main.Model.Student;

public class StudentRepository extends InMemoryRepository<Student>{

    /**
     * Constructor for StudentRepository objects
     */
    public StudentRepository() {
        super();
    }

    /**
     * Updates a Student object from the Memory Repository array given the ID of the parameter object
     * @param obj
     * @return Student -modified object
     */
    @Override
    public Student update(Student obj) {
        Student studentToUpdate = this.repoList.stream()
                .filter(student -> student.getStudentId() == obj.getStudentId())
                .findFirst()
                .orElseThrow();
        studentToUpdate.setEnrolledCourses(obj.getEnrolledCourses());
        studentToUpdate.setTotalCredits(obj.getTotalCredits());
        studentToUpdate.setFirstName(obj.getFirstName());
        studentToUpdate.setLastName(obj.getLastName());

        return studentToUpdate;
    }
}

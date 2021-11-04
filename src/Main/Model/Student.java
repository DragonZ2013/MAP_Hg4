package Main.Model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int studentId;
    private int totalCredits;
    private List<Course> enrolledCourses;

    /**
     * Constructor for Student objects
     * @param firstName
     * @param lastName
     * @param studentId
     * @param totalCredits
     * @param enrolledCourses
     */
    public Student(String firstName, String lastName, int studentId, int totalCredits, List<Course> enrolledCourses) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.totalCredits = totalCredits;
        this.enrolledCourses = enrolledCourses;
    }

    /**
     * Converstion to String for Student objects
     * @return String
     */
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", totalCredits=" + totalCredits +
                ", enrolledCourses=" + coursesToId() +
                ", firstName=" + this.getFirstName()+
                ", lastName=" + this.getLastName()+
                '}';
    }

    /**
     * Converts the course array to an int array, used to avoid recursive printing
     * @return List<Integer>
     */
    public List<Integer> coursesToId(){
        List<Integer> retList = new ArrayList<>();
        for(Course c : this.enrolledCourses)
            retList.add(c.getCourseId());
        return retList;
    }

    /**
     * getter for Student.studentId
     * @return int
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * setter for Student.studentId
     * @param studentId
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * getter for Student.totalCredits
     * @return int
     */
    public int getTotalCredits() {
        return totalCredits;
    }

    /**
     * setter for Student.totalCredits
     * @param totalCredits
     */
    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    /**
     * getter for Student.enrolledCourses
     * @return List<Course>
     */
    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    /**
     * setter for Student.enrolledCourses
     * @param enrolledCourses
     */
    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}

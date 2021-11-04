package Main;

import Main.Model.Course;
import Main.Model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher t = new Teacher("fN","lN",new ArrayList(),1);
        Course c = new Course("name1",t,5,new ArrayList(),20,1);
        List tempList = new ArrayList();
        tempList.add(c);
        t.setCourses(tempList);
        System.out.println(t);
        System.out.println(c);
    }
}

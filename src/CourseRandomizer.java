import courseselector.*;
import enums.Course;

import java.util.List;

public class CourseRandomizer {
    public static void main(String[] args) {
        CourseSelector courseSelector = new CourseSelector();
        List<Course> courseList = courseSelector.generateRandomCourseList();

        int index = 0;
        for(Course course : courseList) {
            index++;
            System.out.print(index + ": " + course.getCourseName() + " [" + course.getMountainName() + "] \n");
            if (index % 4 == 0) {
                System.out.print("\n");
                index = 0;
            }
        }
    }
}
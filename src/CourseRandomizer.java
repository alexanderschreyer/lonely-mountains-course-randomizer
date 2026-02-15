import courseselector.*;
import enums.Course;

import java.util.List;

public class CourseRandomizer {
    public static void main(String[] args) {
        CourseSelector courseSelector = new CourseSelector();
        courseSelector.setIncludeDlc(true);
        List<Course> courseList = courseSelector.generateRandomCourseList();
        printTourList(courseList);
    }

    public static void printTourList(List<Course> courseList) {
        int tourIndex = 1;
        int courseIndex = 0;

        for(Course course : courseList) {
            if (courseIndex == 0) {
                System.out.print("Tour " + tourIndex + "\n");
                tourIndex++;
            }
            courseIndex++;
            System.out.print(courseIndex + ": " + course.getCourseName() + " [" + course.getMountainName() + "] \n");
            if (courseIndex % 4 == 0) {
                System.out.print("\n");
                courseIndex = 0;
            }
        }
    }
}
package part2.task7;

import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // додавання студента до курсу
    }

    // Додаткові методи...
}

package model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private List<Assignment> assignments;
    private List<User> users;

    public Course(String name) {
        this.name = name;
        assignments = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
           // user.addCourse(this);
        }
    }

    public void removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
            //user.removeCourse(this);
        }
    }
}

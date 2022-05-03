package model;

import java.util.ArrayList;
import java.util.List;

public class Assignment {

    private String name;
    private boolean daily;
    private boolean weekly;
    private boolean monthly;
    private boolean repeat;
    private String type; //daily, weekly, monthly, with given times
    private int times; //how many times will it be repeated? -> only if with G type
    private Course course;
    private String platform;
    private List<String> repeats;

    public Assignment(String name, Course course) {
        this.name = name;
        this.course = course;
        times = -1;
        repeats = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}

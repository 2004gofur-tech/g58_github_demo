package uz.pdp.Dars6;

import java.util.List;

public final class Student {
    private final String name;
    private final int level;
    private final int age;
    private final List<String> lessons;
    private final School school;

    public Student(String name, int level, int age, List<String> lessons, School school) throws CloneNotSupportedException {
        this.name = name;
        this.level = level;
        this.age = age;
        this.lessons = List.copyOf(lessons);
        this.school = (School) school.clone();
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getAge() {
        return age;
    }

    public List<String> getLessons() {
        return List.copyOf(lessons);
    }

    public School getSchool() throws CloneNotSupportedException {
        return (School) school.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", age=" + age +
                ", lessons=" + lessons +
                ", school=" + school +
                '}';
    }
}

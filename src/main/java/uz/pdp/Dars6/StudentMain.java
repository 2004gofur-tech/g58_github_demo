package uz.pdp.Dars6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) throws CloneNotSupportedException {

        List<String> lessons = new ArrayList<>();
        lessons.add("Ona tili");
        lessons.add("Rus tili");
        lessons.add("Matematika");

        School school = new School();
        school.setId(45);
        school.setName("Alisher Navoiy nomidagi");

        Student student = new Student("Ali", 6, 13, lessons, school);
        System.out.println(student);

        lessons.add(2,"3ewiufh");
        school.setName("iqwyefibjnklml");

        System.out.println(student);
    }
}

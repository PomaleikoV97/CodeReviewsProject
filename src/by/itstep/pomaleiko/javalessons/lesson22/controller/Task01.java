package by.itstep.pomaleiko.javalessons.lesson22.controller;

import by.itstep.pomaleiko.javalessons.lesson22.model.entity.Student;

public class Task01 {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 4, true);

        student.setName("Alexandra");
        System.out.println(student.getInfo());
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setFirstName("John");
        student1.setLastName("Doe");
        student1.setId(1);

        student2.setFirstName("Jane");
        student2.setLastName("Doe");
        student2.setId(2);

        student3.setFirstName("Joe");
        student3.setLastName("Doe");
        student3.setId(3);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students.get(0).getFirstName());

        School school1 = new School();
        school1.addStudent(student1);
        school1.addStudent(student2);
        school1.addStudent(student3);

        System.out.println(school1.toString());
        System.out.println("Student: " + school1.getStudentById(5));

        school1.deleteStudentById(3);
        System.out.println("Students:" + school1.toString());

        //Courses
        Course course1 = new Course();
        course1.setCourseName("Math");
        course1.setTeacher("Mr. White");
        course1.setRoom("Room1");

        student1.addCourse(course1);

        System.out.println("Classes: " + student1.getCourses());


        //Pharmacy
        Medication med1 = new Medication();
        med1.setName("med1");
        med1.setPrice(3.20);
        med1.setAvailablity(true);

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.save(med1);

        System.out.println("get count:" + pharmacy.getCount());
        System.out.println("found med 1:" + pharmacy.find("med1"));
        System.out.println("found med 2:" + pharmacy.find("med2"));
        System.out.println(pharmacy.toString());

        Medication med2 = new Medication();
        med1.setName("med2");
        med1.setPrice(10.20);
        med1.setAvailablity(false);
        pharmacy.save(med2);
        System.out.println("get count:" + pharmacy.getCount());
        System.out.println(pharmacy.toString());

        pharmacy.delete("med1");
        System.out.println("get count:" + pharmacy.getCount());
        System.out.println(pharmacy.toString());


    }
}
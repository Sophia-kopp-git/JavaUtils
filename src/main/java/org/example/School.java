package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student ){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students.toString() +
                '}';
    }

    public Student getStudentById(int id){
        for (Student student : students){
            if (student.getId() == id){
                return student;
            }
        }

        return null;
    }
    public void deleteStudentById(int id){
        Student student = getStudentById(id);
        students.remove(student);
    }
    public List<Course>  getCoursesByStudentsId(int id){
        Student student = getStudentById(id);
        return student.getCourses();
    }
}

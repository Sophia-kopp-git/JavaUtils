package org.example;

import java.util.*;

public class School {
    private Map<Integer, Student> students = new Map<Integer, Student>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public Student get(Object key) {
            return null;
        }

        @Override
        public Student put(Integer key, Student value) {
            return null;
        }

        @Override
        public Student remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends Integer, ? extends Student> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<Integer> keySet() {
            return Set.of();
        }

        @Override
        public Collection<Student> values() {
            return List.of();
        }

        @Override
        public Set<Entry<Integer, Student>> entrySet() {
            return Set.of();
        }
    };

    public void addStudent(Student student ){
        students.put(student.getId(), student);
    }

    public Map<Integer,Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students.toString() +
                '}';
    }

    public Student getStudentById(int id){
        for (Student student : students.values()){
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

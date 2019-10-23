/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * @author dsmale
 */
public class Admin {

    public static void assignCourse(UniPeople personToJoin, Course courseToJoin) {
        personToJoin.setCourse(courseToJoin);

    }

    public static void getDetails(Lecturer lecturer) {

        if (lecturer.getCourse() != null) {
            System.out.println("Name = " + lecturer.getName() + ", Id = " + lecturer.getId() + ", Course = " + lecturer.getCourse());
        }
        System.out.println("Name = " + lecturer.getName() + ", Id = " + lecturer.getId());
    }

    public static void getDetails(Student student) {
        if (student.getCourse() != null) {
            System.out.println("Name = " + student.getName() + ", Id = " + student.getId() + ", Course = " + student.getCourse());
        }
        System.out.println("Name = " + student.getName() + ", Id = " + student.getId());
    }
}

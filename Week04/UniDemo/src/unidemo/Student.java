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
public class Student extends UniPeople {

    public Student(String id, String name) {
        super(id, name);
    }

    public void attendClass() {

        System.out.println(getName() + " is attending " + getCourse().getCode() + " in room " + getCourse().getRoom());
    }

    public void doCoursework() {
        System.out.println(getName() + " is doing coursework " + getCourse().getCoursework());

    }

    
    
}

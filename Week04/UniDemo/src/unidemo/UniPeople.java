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
public abstract class UniPeople {
    
    private Course course;
    private String id;
    private String name;

    public UniPeople(String id, String name) {
        this.id = id;
        this.name = name;
    }   
    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    
    
    
}

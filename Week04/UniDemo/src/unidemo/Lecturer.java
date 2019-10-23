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
public class Lecturer extends UniPeople implements ITeach{

 @Override
    public void setCoursework(String courseworkName) {
        setCoursework(courseworkName);
        
    }
    
@Override
    public void teach()
    {
        System.out.println(getName() + " is teaching " + getCourse().getCode() + " in room" + getCourse().getRoom());
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }
    
    
    
}

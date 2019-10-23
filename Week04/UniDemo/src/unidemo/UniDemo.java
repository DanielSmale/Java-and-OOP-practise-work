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
public class UniDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // • create a new lecturer, student, and course.

        Lecturer lecturer = new Lecturer("1", "That one");
        Student student = new Student("01", "Me");
        Course course = new Course("420", "024");
        
        //• print details of the student
        Admin.getDetails(student);
        
        //• associate both the lecturer and the student with the course
        Admin.assignCourse(student, course);
        Admin.assignCourse(lecturer, course);
        
        //make the lecturer teach and the student attend
        lecturer.teach();
        student.attendClass();
        
        //• make the student attempt the coursework
        student.doCoursework();
        
        //• set the coursework
        lecturer.setCoursework("Java part 1");
        
      //  • make the student attempt the coursework again
      student.doCoursework();
      
      //• print out the details of the lecturer
     Admin.getDetails(lecturer);

        
    }
    
}

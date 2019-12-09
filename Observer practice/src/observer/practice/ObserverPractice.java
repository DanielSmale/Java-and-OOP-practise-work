/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer.practice;
/**
 *
 * @author Student
 */
public class ObserverPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     Newspaper bugle = new Newspaper();
 Reporter peter = new Reporter();

bugle.RegisterObserver(peter);

    }

}

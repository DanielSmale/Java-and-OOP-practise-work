/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Reporter implements Observer {

int numberOfReaders =104;


public Reporter(Observable observable){
observable.registerObserver(this);
}

public void update(int data){
System.Out.Println(data);
}

}

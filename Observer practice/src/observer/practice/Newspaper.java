package observer.practice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
import java.util.ArrayList;
public class Newspaper implements Observable {

private ArrayList<Observer> observers;
private int data =10;

@Override
public void registerObserver(Observer observer){
observers.add(observer);
}

@Override
public void removeObserver(Observer observer){
observers.remove(observer);
}

@Override
public void notifyObservers(){
for(int i =0; i< observers.size(); i++){
observers.get(i).update(data);
}
}


}

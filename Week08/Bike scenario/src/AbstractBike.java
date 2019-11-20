/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author dsmale
 */
public abstract class AbstractBike {
    
ArrayList<AbstractBike> bikePool = new ArrayList<AbstractBike>();    


protected String description = "Unknown bike";

    public abstract double cost();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsmale
 */
public class BackLight extends BikeExtrasDecorator {

    public BackLight(AbstractBike abstractBike) {
        super(abstractBike);
    }

    @Override
    public double cost() {
        return 10;
    }

}

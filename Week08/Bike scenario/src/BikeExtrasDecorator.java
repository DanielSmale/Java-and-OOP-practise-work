/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsmale
 */
public abstract class BikeExtrasDecorator extends AbstractBike {

    AbstractBike abstractBike;

    public BikeExtrasDecorator(AbstractBike abstractBike) {
        this.abstractBike = abstractBike;
    }

}

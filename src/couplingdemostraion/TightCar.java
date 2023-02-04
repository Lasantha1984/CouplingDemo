/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package couplingdemostraion;

/**
 *
 * @author user
 */
public class TightCar {

    Engine engine;

    public TightCar(Engine e) {
        this.engine = e;
        System.out.println("The car object is Tightly coupled with engine Object here,\n"
                + " That's why engine is required when instantiating the car.");

    }
}

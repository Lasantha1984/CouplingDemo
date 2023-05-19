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

    public TightCar() {
        this.engine = new Engine();
        System.out.println("The car object is Tightly coupled with engine Object here,\n"
                + " That's why engine instantiate when instantiating the car.");

    }
}

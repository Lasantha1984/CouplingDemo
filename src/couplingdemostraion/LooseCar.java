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
public class LooseCar {
    Engine engine;

    public LooseCar() {
        System.out.println("The car object is loosdly coupled with engine Object here,\n"
                + " That's why engine is not required when instantiating the car.");
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Engine set later");
             
    }
    
}

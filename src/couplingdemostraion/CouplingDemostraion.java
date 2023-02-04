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
public class CouplingDemostraion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Engine engine1 = new Engine();
        engine1.setCapasity(2000);
//        Tightly couple example
//        At the instanciation of the Car object engine is required.
        TightCar tightCar = new TightCar(engine1);
          
//        Loose couple example.
//        At the instanciation of the Car object engine is not required.
//        Engin can be set later.
        LooseCar looseCar = new LooseCar();
        looseCar.setEngine(engine1);

    }

}

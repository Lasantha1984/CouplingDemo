
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
//        At the instanciation of the Car object instantiate engine as well .
        TightCar tightCar = new TightCar();
     
//        Loose couple example.
//        At the instanciation of the Car object engine is not instantiate.
//        Engin can be set later.
        LooseCar looseCar = new LooseCar();
        looseCar.setEngine(engine1);

    }

}

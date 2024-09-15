package Composition;
// Composition Example

// Component class 1: Engine
class Engine {
    public void start() {
        System.out.println("Engine is starting...");
    }

    public void stop() {
        System.out.println("Engine is stopping...");
    }
}

// Component class 2: Transmission
class Transmission {
    public void shiftGear() {
        System.out.println("Shifting gears...");
    }
}

// Car class that uses composition
public class Car {
    private Engine engine;
    private Transmission transmission;

    // Constructor injection for composition
    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void drive() {
        System.out.println("Car is moving...");
        transmission.shiftGear();
    }
}



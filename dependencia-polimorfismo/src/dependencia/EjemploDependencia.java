package dependencia;

class Engine {
    public void start() {
        System.out.println("Engine started");
        // Lógica de inicio del motor
    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        // Otro lógica de inicio del automóvil
    }
}

public class EjemploDependencia {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.start();
    }
}

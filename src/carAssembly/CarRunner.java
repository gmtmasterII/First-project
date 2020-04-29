package carAssembly;

public class CarRunner {
    public static void main(String[] args) {
        CarBody car = new CarBody();
        car.setColor("black");
        car.setInteriorMaterial("leather");
        car.setHorsePower(200);
        car.setName("Mercedes");

        Tuning tune = new Tuning();
        tune.setHorsePowerIncrease(150);
        tune.setColor("pink");
        tune.setInteriorMaterial("leather combined");

        car.setTuning(tune);
        System.out.println(car.getInfo());

        Tuning tune2019 = new Tuning();
        tune2019.setInteriorMaterial("Crocodile leather");
        tune2019.setColor("Chrome");
        tune2019.setHorsePowerIncrease(-200);

        car.setTuning(tune2019);
        System.out.println(car.getInfo());

    }
}
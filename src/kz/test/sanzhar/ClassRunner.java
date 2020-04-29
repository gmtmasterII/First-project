package kz.test.sanzhar;

public class ClassRunner {
    public static void main (String [] args) {
        Passat vw = new Passat("Red");
        vw.fillTheGas(50);
        vw.fillTheGas(20);
        System.out.println(vw.getGasVolume());
        vw.addPassenger(1);
        vw.addPassenger(2);
        System.out.println(vw.getPassengerNumber());
    }

}

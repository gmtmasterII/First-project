package test2.sanzhar;

import static test2.sanzhar.Dentist.*;

public class Main {
    public static void main (String[] args) {
        Dentist smith = new Dentist();
        smith.name = "Smith";
        smith.getMoney = 400;
        smith.tooth = 33;
        smith.checkTooth = true;

        smith.getMoney();
        {
            System.out.println(getMoney + " USD received");
        }
        smith.removeTooth();
        {
            System.out.println(checkTooth);
        }
        smith.removeTooth();
        {
            System.out.println(tooth-1 + " tooth left");
        }
    }
}
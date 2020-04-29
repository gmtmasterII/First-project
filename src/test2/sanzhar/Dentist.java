package test2.sanzhar;

import javafx.scene.control.skin.CellSkinBase;

public class Dentist {
    public static String name;
    public static int getMoney;
    public static int tooth;
    public static boolean checkTooth;


    public void getMoney() {
        if (getMoney<499)
            System.out.println(getMoney + " is insufficient");
        else
            System.out.println(getMoney +" USD received");
    }

    public void removeTooth() {
        if (checkTooth)
        System.out.println("Tooth shall be removed");
        else
            System.out.println();
    }


}

package test3.sanzhar;

import java.util.PrimitiveIterator;

public class Dentist {
    private String name;
    private int money;
    public int tooth = 32;
    private boolean isResultOk;

    void addMoney(int amount) {
        money = amount;
    };
    int removeTooth (int toothCount) {
        tooth=tooth-toothCount;
        return tooth;
    }
    int getMoney() {
        return money;
    }

    int getTooth() {
        return tooth;
    }
    void setName(String n) {
        name = n;
    }
    String getName() {
        return name;
    }
}
package basket;

import java.util.ArrayList;

public class Basket {
    String color;
    ArrayList listOfGroceries;

    void setColor(String n) {
        color = n;
    }

    String getColor() {
        return color;
    }

    void setListOfGroceries(ArrayList a) {
        listOfGroceries = a;
    }

    ArrayList getListOfGroceries() {
        return listOfGroceries;
    }

    String getInfo() {
        return color + " " + listOfGroceries;
    }
}


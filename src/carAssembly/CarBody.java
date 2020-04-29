package carAssembly;

public class CarBody {
    String name;
    String interiorMaterial;
    String color;
    int horsePower;
    String previousColor;
    String previousInteriorMaterial;
    int previousHorsePower;



    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void setInteriorMaterial(String m) {
        interiorMaterial = m;
    }

    String getInteriorMaterial() {
        return interiorMaterial;
    }

    void setColor(String c) {
        color = c;
    }

    String getColor() {
        return color;
    }

    void setHorsePower(int h) {
        horsePower = h;
    }

    int getHorsePower() {
        return horsePower;
    }

    void setTuning (Tuning tune) {
        previousColor = color;
        previousHorsePower = horsePower;
        previousInteriorMaterial = interiorMaterial;
        color = tune.getColor();
        interiorMaterial = tune.newInteriorMaterial;
        horsePower = horsePower + tune.horsePowerIncrease;
    };

    String getInfo() {
        return "previous color was: " + previousColor + " . Previous HP was: " + previousHorsePower + " . Previous interior material was " + previousInteriorMaterial + "\n" +
                "New color is: " + color + ". New HP is " + horsePower + ". New interior material is: " + interiorMaterial + ". ";
    }
}

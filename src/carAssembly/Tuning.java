package carAssembly;

public class Tuning {
    String newColor;
    String newInteriorMaterial;
    int horsePowerIncrease;

    void setColor(String i) {
        newColor = i;
    }

    String getColor() {
        return newColor;
    }

    void setInteriorMaterial(String m) {
        newInteriorMaterial = m;
    }

    String getInteriorMaterial() {
        return newInteriorMaterial;
    }

    void setHorsePowerIncrease(int h) {
        horsePowerIncrease = h;
    }

    int getHorsePower() {
        return horsePowerIncrease;
    }
}

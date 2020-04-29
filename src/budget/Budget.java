package budget;

public class Budget {
    String name;
    int amount;

    void setName(String n) {
        name = n;
    }

    void setAmount (int b) {
        amount = b;
    }

    String getInfo() {
        return "Budget name: " + name + "; Budget amount: " + amount;

    }

    void increaseAmount(int b) {
        amount = amount + b;
    }

    void decreaseAmount(int c) {
        amount = amount - c;
    }

    int getAmount(){
        return amount;
    }

}

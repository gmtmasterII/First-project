package cooking;

public class Ingredients {
    String name;
    int quantity;

    void setName(String n) {
        name = n;
    }

    String getName(){
        return name;
    }

    void setQuantity(int q) {
        quantity = q;
    }

    int getQuantity(){
        return quantity;
    }
    public boolean equals (Object obj){
        if (name.equals(((Ingredients)obj).getName())) {
            return true;


        }
        return false;
    }

}

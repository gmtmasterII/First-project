package cooking;

import java.util.ArrayList;

public class Pizza {
    String name;
    ArrayList<String> ingredients = new ArrayList();
    int duration;
    float price;
    CookingMethod howToCook = CookingMethod.OVEN;
    float discount;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void setDuration(int d) {
        duration = d;
    }

    void addIngredients(String i) {
        ingredients.add(i);
    }

    void setCookingMethod(CookingMethod c) {
        howToCook = c;
    }

    CookingMethod getHowToCook() {
        return howToCook;
    }

    void setFryingPanMethod() {
        howToCook = CookingMethod.FRYING_PAN;
    }

    void setPrice(int p) {
        price = p;
    }

    float getPrice() {
        return price;
    }

    void setDiscount(float d) {
        discount = d;
    }

    float getDiscount() {
        return  discount;
    }


    String cookMeal() {
        if (ingredients.contains("Flour") && ingredients.contains("Barm")) {
            if (ingredients.contains("Mozarella") && ingredients.contains("Pepperoni sausage")) {
                if (howToCook == CookingMethod.OVEN) {
                    return "Pepperoni oven " + price;
                } else if (howToCook == CookingMethod.FRYING_PAN) {
                    price = price + 2;
                    return "Pepperoni frying pan " + price;
                } else if (howToCook == CookingMethod.MW_OVEN) {
                    price = price / 2;
                    return "you MW_oven pepperoni pizza" + price;
                }
                else if (discount > 0) {
                    price = (price*discount)/100;
                    return price;
                 }

            }
        }

        if (ingredients.contains("Flour") && ingredients.contains("Barm")) {
            if (ingredients.contains("Cheese") && ingredients.contains("Tomato")) {
                if (howToCook == CookingMethod.OVEN) {
                    return "Margarita oven";
                } else if (howToCook == CookingMethod.FRYING_PAN) {
                    return "Margarita frying pan";
                } else if (howToCook == CookingMethod.MW_OVEN) {
                    price = price / 2;
                    return "you MW_oven margarita pizza price is " + price;
                }
            }

        }
        return "unknown pizza";
    }

}
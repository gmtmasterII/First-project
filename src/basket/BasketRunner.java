package basket;

import java.util.ArrayList;

public class BasketRunner {
    public static void main (String[] args){
        Basket basket = new Basket();
        basket.setColor("red");

        System.out.println(basket.getInfo());

        Purchase apple = new Purchase();
        apple.setGrocery("apple");

        Purchase pineapple = new Purchase();
        pineapple.setGrocery("pineapple");

        ArrayList listOfGroceries = new ArrayList();
        listOfGroceries.add(apple.getGrocery());
        listOfGroceries.add(pineapple.getGrocery());

        basket.setListOfGroceries(listOfGroceries);

        System.out.println(basket.getInfo());


    }
}

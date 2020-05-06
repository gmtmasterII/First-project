package cooking;

public class CookingRunner {
    public static void main(String[] args) {
        Pizza pepperoni = new Pizza();
        pepperoni.setName("Pepperoni");
        pepperoni.setDuration(1);
        pepperoni.setFryingPanMethod();
        pepperoni.setPrice(10);
        pepperoni.setDiscount(30);

        System.out.println(pepperoni.getDiscount());

        Ingredients flour = new Ingredients(); //мука
        flour.setName("Flour");
        flour.setQuantity(300);

        Ingredients barm = new Ingredients(); //дрожжи
        barm.setName("Barm");
        barm.setQuantity(10);

        Ingredients pepperoniSausage = new Ingredients();
        pepperoniSausage.setName("Pepperoni sausage");
        pepperoniSausage.setQuantity(100);

        Ingredients mozarella = new Ingredients();
        mozarella.setName("Mozarella");
        mozarella.setQuantity(130);

        pepperoni.addIngredients(flour.getName());
        pepperoni.addIngredients(barm.getName());
        pepperoni.addIngredients(pepperoniSausage.getName());
        pepperoni.addIngredients(mozarella.getName());

        System.out.println(pepperoni.cookMeal());

        Pizza margarita = new Pizza();
        margarita.setPrice(6);
        margarita.setCookingMethod(CookingMethod.MW_OVEN);

        Ingredients cheese = new Ingredients();
        cheese.setName("Cheese");

        Ingredients tomato = new Ingredients();
        tomato.setName("Tomato");

        margarita.addIngredients(flour.getName());
        margarita.addIngredients(barm.getName());
        margarita.addIngredients(cheese.getName());
        margarita.addIngredients(tomato.getName());

        System.out.println(margarita.cookMeal());
    }
}

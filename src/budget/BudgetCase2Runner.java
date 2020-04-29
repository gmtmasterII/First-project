package budget;

public class BudgetCase2Runner {
    public static void main (String[] args){
        Budget minFin = new Budget();
        minFin.setName("MinFin");
        minFin.setAmount(1000);

        Budget minBudget = new Budget();
        minBudget.setName("MinBudget");
        minBudget.setAmount(3000);

        minFin.increaseAmount(minBudget.getAmount());
        System.out.println(minFin.getAmount());
    }
}

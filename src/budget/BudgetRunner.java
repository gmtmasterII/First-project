package budget;
//создается два объекта, со своими бюджетами. И затем создается третий объект, который включает бюджеты двух предыдущих объектов
public class BudgetRunner {
    public static void main (String[] args){
        Budget minFin = new Budget();
        minFin.setName("Minfin");

        minFin.setAmount(1000);
        minFin.increaseAmount(500);
        minFin.decreaseAmount(100);

        Budget minBudget = new Budget();
        minBudget.setName("MinBudget");
        minBudget.setAmount(3000);

        Budget minEconomics = new Budget();
        minBudget.setName("MinEconomics");
        minEconomics.increaseAmount(minFin.getAmount()+minBudget.getAmount());



    }
}

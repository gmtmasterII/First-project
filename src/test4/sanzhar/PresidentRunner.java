package test4.sanzhar;

public class PresidentRunner {
    public static void main (String[] args) {
        President obama = new President(); // Обама - объект класса;
        obama.setAge(58);
        System.out.println(obama.getAge());

        obama.setName("Obama");
        System.out.println(obama.getName());

        obama.setYearsInPower(8);
        System.out.println(obama.getYearsInPower());

        President trump = new President();

        trump.setName("Trump");
        System.out.println(trump.getName());

        trump.setAge(73);
        System.out.println(trump.getAge());

        trump.setYearsInPower(4);
        System.out.println(trump.getYearsInPower());

        int obamaAge = obama.getAge();
        int trumpAge = trump.getAge();
        System.out.println("Difference in age " + (trumpAge-obamaAge));

        PresidentsWife michele = new PresidentsWife();
        michele.setName("Michele");
        System.out.println(michele.getName());

        obama.setWife(michele);
        PresidentsWife wifeOfPresidentObama = obama.getWife();
        System.out.println("President "+obama.getName() + " is married to " + wifeOfPresidentObama.getName());

        PresidentsWife melania = new PresidentsWife();
        melania.setName("Melania");
        System.out.println(melania.getName());

        trump.setWife(melania);
        PresidentsWife wifeOfPresidentTrump = trump.getWife();
        System.out.println("President "+trump.getName() + " is married to " + wifeOfPresidentTrump.getName());



    }
}

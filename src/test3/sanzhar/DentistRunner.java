package test3.sanzhar;

public class DentistRunner {
    public static void main (String[] args) {
        Dentist smith = new Dentist();
        smith.setName("Smith");
        String dentistName = smith.getName();
        System.out.println(dentistName);

        smith.addMoney(500);
        int moneyAmount = smith.getMoney();
        System.out.println(moneyAmount);

        smith.getTooth();
        int toothAmount = smith.getTooth();
        System.out.println(toothAmount);

        smith.removeTooth(1);
        int toothLeft = smith.getTooth();
        System.out.println(toothLeft);
    }
}

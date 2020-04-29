package kz.test.sanzhar;

public class SimpleRunner {
    public static void main(String[] args) {
        String myname = "Sanzhar"; //создание переменной String
        //String myname = new String("Sanzhar");//создание переменной String
        //Passat passatForSanzhar = new Passat("Red");
        Integer wage = 0;
        //myname = "patrick";
        System.out.println(myname.replace("S", "Z").toUpperCase() + " wage equals to " + wage);
        String newname = "Patrick";
        Integer patrickwage = 1;
        System.out.println(newname + " wage equals to " + patrickwage.getClass().getName());
        newname = "Dave";
        Integer davewage = 2;
        System.out.println(newname + " wage equals to " + davewage);
        String anothername = "Talgat";
        Integer talgatwage = 3;
        System.out.println(anothername + " wage equals to " + talgatwage);
        System.out.println("total wage is " +(wage+davewage+talgatwage+patrickwage));

    }
}

package covid;

public class Virus {
    String name;
    int days; // period
    int infectedPersonPerDay; // number of infected persons
    double infectCasesPerMonth; //infected person per period;


    void setName(String n) {
        name = n;

    }
    String getName() {
        return name;
    }

    void setDays(int j) {
        days = j;
    }

    int getDays() {
        return days;
    }

    void setInfectedPersonPerDay(int a) {
        infectedPersonPerDay = a;
    }

    int getInfectedPersonPerDay() {
        return infectedPersonPerDay;
    }


    String getAdvise() {
        infectCasesPerMonth = days * infectedPersonPerDay;
        return "The number of infected person per " + days + " days is " + infectCasesPerMonth;
    }
}

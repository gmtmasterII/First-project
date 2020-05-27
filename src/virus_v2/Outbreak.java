package virus_v2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Outbreak {
    String name;
    ArrayList<Virus> listOfViruses = new ArrayList();
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;
    Date s1;
    Date s2;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void addVirus(Virus v) {
        listOfViruses.add(v);
    }

    String getInfo() {
        return "There are " + listOfViruses.size() + " viruses in the country";
    }

    //gregorian calendar methods
    void setStartDate(GregorianCalendar d) {
        startDate = d;
    }

    GregorianCalendar getStartDate() {
        return startDate;
    }

    void setEndDate(GregorianCalendar e) {
        endDate = e;
    }

    GregorianCalendar getEndDate() {
        return endDate;
    }

    //Date methods
    void setS1(Date d) {
        s1 = d;
    }

    Date getS1() {
        return s1;
    }

    void setS2(Date s) {
        s2 = s;
    }

    Date getS2() {
        return s2;
    }


    String getAddInfo() {
        String summary = "";
        int abilityToInfect = 0;
        for (Virus aVirusFromTheList : listOfViruses) {
            summary = summary + "\n" + "Virus name: " + aVirusFromTheList.getName() + "; ";

            abilityToInfect = abilityToInfect + aVirusFromTheList.getAbilityInfectPerMonth();
        }
        return summary + "\n" + "Total infected cases per month: " + abilityToInfect +
                " Start date " + startDate.get(Calendar.YEAR) + " " + startDate.get(Calendar.MONTH) + " " + startDate.get(Calendar.DAY_OF_MONTH) +
                " End date" + endDate.get(Calendar.MONTH) + " " + endDate.get(Calendar.MONTH) + " " + endDate.get(Calendar.DAY_OF_MONTH);
    }

    String getOutBreakDuration() {
        long diff = (s2.getTime()-s1.getTime())/(1000 * 60 * 60 * 24);
        return "" + diff;

    }
}

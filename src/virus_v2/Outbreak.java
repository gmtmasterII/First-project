package virus_v2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Outbreak {
    String name;
    ArrayList<Virus> listOfViruses = new ArrayList();
    private Date startDate;
    private Date endDate;
    long difference;

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
    void setStartDate(Date d) {
        startDate = d;
    }

    Date getStartDate() {
        return startDate;
    }

    void setEndDate(Date e) {
        endDate = e;
    }

    Date getEndDate() {
        return endDate;
    }


    void setPeriodDifference() {
        difference = (endDate.getTime()-startDate.getTime())/(1000 * 60 * 60 * 24);
    }

    long getPeriodDifference() {
        return difference;
    }

    String getAddInfo() {                                                                                                //возвращает список вирусов в эпидемии
        String summary = "";
        int abilityToInfect = 0;
        long periodDifference = 0;

        for (Virus aVirusFromTheList : listOfViruses) {
            summary = summary + "\n" + "Virus name: " + aVirusFromTheList.getName() + "; ";
            abilityToInfect = abilityToInfect + aVirusFromTheList.getAbilityInfectPerMonth();
        }
        return summary + "\n" + "Total infected cases per month: " + abilityToInfect
            + "\n" +  "Outbreak length: " + getPeriodDifference();

    }


}

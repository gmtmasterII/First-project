package virus_v2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class Outbreak {
    String name;
    HashMap<String, Virus> mapOfViruses = new HashMap<>();
    private LocalDate startDate;
    private LocalDate endDate;
    long difference;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void addVirus(Virus v) {
        mapOfViruses.put(v.getVirusCode(), v);
    }


    String getInfo() {
        return "There are " + mapOfViruses.size() + " viruses in the country";
    }

    void setStartDate(LocalDate d) {
        startDate = d;
    }

    LocalDate getStartDate() {
        return startDate;
    }

    void setEndDate(LocalDate e) {
        endDate = e;
    }

    LocalDate getEndDate() {
        return endDate;
    }

    long getPeriodDifference() {
        return ChronoUnit.DAYS.between(startDate, endDate);
        }

    String getAddInfo() {
        //возвращает список вирусов в эпидемии

        final String format = "%-40s%s%n";
        String summary = "";
        int abilityToInfect = 0;
        long periodDifference = 0;

        for (Virus aVirusFromTheList : mapOfViruses.values()) {
            summary = summary + "\n" + "Virus name: " + aVirusFromTheList.getName() + "; ";
            abilityToInfect = abilityToInfect + aVirusFromTheList.getAbilityInfectPerMonth();
        }
        return summary + "\n" + "Total infected cases per month: " + abilityToInfect
            + "\n" +  "Outbreak length: " + getPeriodDifference();
    }

}

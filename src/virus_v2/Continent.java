package virus_v2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Continent {
    String name;
    HashMap<String, Country> mapOfCountries = new HashMap<>();
    ArrayList<Outbreak> listOfOutbreaks = new ArrayList<>();
    HashMap<String, Virus> mapOfViruses = new HashMap<>();
    Outbreak duration;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void addCountry(Country c) {
        mapOfCountries.put(c.getCode(), c);
    }

    String getCountry(String c) {
        Country country = mapOfCountries.get(c);
        return country.getName();
    }

    String getTotalInfo() {
        String consolidatedCountryInfo = "";
        String consolidatedOutbreakInfo = "";
        String consolidatedVirusInfo = "";
        long period = 0;
        String durationNotification = "";

        try {
            for (Country country : mapOfCountries.values()) {
                consolidatedOutbreakInfo = "";
                for (Outbreak outbreak : country.listOfOutbreaks) {
                    for (Virus virus : outbreak.mapOfViruses.values()) {
                        consolidatedVirusInfo = consolidatedVirusInfo + ", " + virus.getName();
                    }
                    period = outbreak.getPeriodDifference();
                    if (period > 100)
                    {
                        durationNotification = "; Info: опасно";

                    }


                    consolidatedOutbreakInfo = consolidatedOutbreakInfo + " " + outbreak.getName() + ";" + "\n" + "Duration of the outbreak: " + outbreak.getPeriodDifference()  + durationNotification;
                    }
                consolidatedCountryInfo = consolidatedCountryInfo + " \n" + "Country name: " + country.getName() + ";" + "\n" + "Outbreaks: " + consolidatedOutbreakInfo + "\n" + "viruses: "
                        + consolidatedVirusInfo + ";";
            }
        }
            catch (Exception e) {
            System.out.printf(e.toString());
        }
        return consolidatedCountryInfo;
    }
}
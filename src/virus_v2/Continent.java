package virus_v2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Continent {
    String name;
    HashMap<String, Country> mapOfCountries = new HashMap<>();
    ArrayList<Outbreak> listOfOutbreaks = new ArrayList<>();
    HashMap<String, Virus> mapOfViruses = new HashMap<>();

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void addCountry(Country c) {
        mapOfCountries.put(c.getCode(), c);
    }

    String getContinentInfo() {
        String countries = "";
        for (Country countriesList : mapOfCountries.values()) {
            countries = countries + "\n" + countriesList.getName();
        }
        return "Continent " + name + " has following countries: " + "\n" + countries;
    }

    String getCountry(String c) {
        Country country = mapOfCountries.get(c);
        return country.getName();
    }

    String getTotalInfo() {
        String consolidatedCountryInfo = "";
        String consolidatedOutbreakInfo = "";
        String consolidatedVirusInfo = "";
        int a = 1;
        int b = 0;

        try {
            for (Country country : mapOfCountries.values()) {
                consolidatedOutbreakInfo = "";
                for (Outbreak outbreak : country.listOfOutbreaks) {
                    for (Virus virus : outbreak.mapOfViruses.values()) {
                        consolidatedVirusInfo = consolidatedVirusInfo + " " + virus.getName();
                    }
                    consolidatedOutbreakInfo = consolidatedOutbreakInfo + outbreak.getName();
                }

                consolidatedCountryInfo = consolidatedCountryInfo + " \n" + "Country name: " + country.getName() + "\n" + "Outbreaks: " + consolidatedOutbreakInfo + "\n" + "viruses: " + consolidatedVirusInfo;
                int name = a/b;
            }
        } catch (Exception e) {
            System.out.printf(e.getMessage());


        }
        return consolidatedCountryInfo;
    }
}

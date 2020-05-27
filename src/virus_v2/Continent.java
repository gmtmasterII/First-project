package virus_v2;

import java.util.ArrayList;

public class Continent {
    String name;
    ArrayList<Country> listOfCountries = new ArrayList();

    void setName(String n){
        name = n;
    }

    String getName(){
        return name;
    }

    void addCountry(Country c) {
        listOfCountries.add(c);
    }

    String getCountryInfo(){
        String countries = "";
        for (Country countriesList: listOfCountries) {
            countries = countries + "\n" + countriesList.getName();
        }
        return "Continent " + name + " has following countries: " + "\n" + countries;
    }


}

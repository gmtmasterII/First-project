package virus_v2;

import kz.test.sanzhar.SimpleRunner;

import java.util.ArrayList;

public class Country {
    String name;
    ArrayList<Outbreak> listOfOutbreaks = new ArrayList();

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void addOutbreak(Outbreak o) {
        listOfOutbreaks.add(o);
    }

    String getOutbreakInfo() {
        String outbreaks = " ";
        for (Outbreak n: listOfOutbreaks){
            outbreaks = outbreaks + n.getName() + ", ";
        }
            return "Country name " + name + "\n" +
                    listOfOutbreaks.size() + " outbreaks has been detected." + "\n" +
                        "Name of outbreaks: " + outbreaks;
    }


}

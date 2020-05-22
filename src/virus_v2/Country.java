package virus_v2;

import kz.test.sanzhar.SimpleRunner;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Country {
    String name;
    ArrayList<Outbreak> listOfOutbreaks = new ArrayList();
    ArrayList<Virus> listOfViruses2 = new ArrayList();


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
        String outbreakViruses = "";

        for (Outbreak n : listOfOutbreaks) {
            outbreaks = outbreaks + n.getName() + n.getAddInfo() + ", ";
        }
        return "Country name " + name + "\n" +
                listOfOutbreaks.size() + " outbreaks has been detected." + "\n" +
                "Name of outbreak: " + outbreaks;

    }

    String getOutbreakInfo2() {
        String consolidatedOutbreakInfo = "";
        String consolidatedVirusInfo = "";

        for(Outbreak outbreak: listOfOutbreaks) {
          for(Virus virus: outbreak.listOfViruses) {
              consolidatedVirusInfo = consolidatedVirusInfo + "\n" + virus.getName();
            }
            consolidatedOutbreakInfo = consolidatedOutbreakInfo + "\n >>" + outbreak.getName() + "\n" + consolidatedVirusInfo;
        }
        return consolidatedOutbreakInfo;
    }

}

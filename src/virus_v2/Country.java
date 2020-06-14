package virus_v2;

import java.util.ArrayList;

public class Country {
    String name;
    ArrayList<Outbreak> listOfOutbreaks = new ArrayList();
    String code;


    void setCode(String c) {
        code = c;
    }

    String getCode() {
        return code;
    }

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void addOutbreak(Outbreak o) {
        listOfOutbreaks.add(o);
    }

    String getOutbreakInfo() {                                                                                                  //возвращает список эпидемий и вирусы внутри эпидемий
        String outbreaks = " ";
        String outbreakViruses = "";

        for (Outbreak n : listOfOutbreaks) {
            outbreaks = outbreaks + n.getName() + n.getAddInfo() + ", ";
        }
        return "Country name " + name + "\n" +
                listOfOutbreaks.size() + " outbreaks has been detected." + "\n" +
                "Name of outbreak: " + outbreaks;
    }

    String getOutbreakInfo2() {                                                                                             //возвращает список эпидемий и вирусы внутри эпидемий (через вложенный цикл)
        String consolidatedOutbreakInfo = "";
        String consolidatedVirusInfo = "";

        for(Outbreak outbreak: listOfOutbreaks) {
            consolidatedVirusInfo = "";
          for(Virus virus: outbreak.mapOfViruses.values()) {
              consolidatedVirusInfo = consolidatedVirusInfo + "\n" + virus.getName();
            }
            consolidatedOutbreakInfo = consolidatedOutbreakInfo + "\n >>" + outbreak.getName() + "\n" + consolidatedVirusInfo;
        }
        return consolidatedOutbreakInfo;
    }

}

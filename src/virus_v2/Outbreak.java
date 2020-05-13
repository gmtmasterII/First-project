package virus_v2;

import java.util.ArrayList;

public class Outbreak {
    String name;
    ArrayList<Virus> listOfViruses = new ArrayList();

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
    //в этом методе необходимо реализовать вывод списка всех вирусов (аналогично RunnerCheckFor). Метод вызывается наряду с getInfo.
    String getAddInfo() {
        String summary = "";
        for(Virus aVirusFromTheList: listOfViruses) {
            System.out.println(aVirusFromTheList.getName());
        }
        return summary;
    }



}

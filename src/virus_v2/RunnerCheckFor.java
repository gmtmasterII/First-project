package virus_v2;

import java.util.ArrayList;

public class RunnerCheckFor {
    public static void main(String[] args) {
        ArrayList<Virus> list = new ArrayList();

        Virus coronavirus = new Virus();
        coronavirus.setName("Covid-19");

        Virus tvirus = new Virus();
        tvirus.setName("T-Virus");

        list.add(coronavirus);
        list.add(tvirus);

        for(Virus aVirusFromTheList: list) {
            System.out.println(aVirusFromTheList.getName());
        }
    }
}

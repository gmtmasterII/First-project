package virus_v2;

import java.util.Date;
import java.util.GregorianCalendar;

public class OutbreakRunner {
    public static void main(String[] args) {

        //Outbreak 2018
        Outbreak outbreak2018 = new Outbreak();
        outbreak2018.setName("Outbreak 2018");

        GregorianCalendar calendar2018Start = new GregorianCalendar(2018, 3, 12, 11, 34);
        Date start2018 = calendar2018Start.getTime();
        outbreak2018.setStartDate(start2018);
        GregorianCalendar calendar2018End = new GregorianCalendar(2018, 10, 5, 3, 4);
        Date end2018 = calendar2018End.getTime();
        outbreak2018.setEndDate(end2018);
        outbreak2018.setPeriodDifference();

        Virus xVirus = new Virus();
        xVirus.setName("X-Virus");
        xVirus.setAbilityInfectPerMonth(900);

        Virus iVirus = new Virus();
        iVirus.setName("iVirus");
        iVirus.setAbilityInfectPerMonth(43);

        outbreak2018.addVirus(xVirus);
        outbreak2018.addVirus(iVirus);


        //Outbreak 2019 and viruses
        Outbreak outbreak2019 = new Outbreak();
        outbreak2019.setName("Outbreak-2019");

        GregorianCalendar calendar2019Start = new GregorianCalendar(2019, 1, 1, 21, 40);
        Date Start2019 = calendar2019Start.getTime();
        outbreak2019.setStartDate(Start2019);
        GregorianCalendar calendar2019End = new GregorianCalendar(2019, 12, 31, 23, 59);
        Date End2019 = calendar2019End.getTime();
        outbreak2019.setEndDate(End2019);
        outbreak2019.setPeriodDifference();

        Virus coronavirus = new Virus();
        coronavirus.setName("Covid-19");
        coronavirus.setAbilityInfectPerMonth(50);

        Virus tvirus = new Virus();
        tvirus.setName("T-Virus");
        tvirus.setAbilityInfectPerMonth(20);

        Virus svirus = new Virus();
        svirus.setName("S-Virus");
        svirus.setAbilityInfectPerMonth(30);

        Virus avirus = new Virus();
        avirus.setName("A-Virus");
        avirus.setAbilityInfectPerMonth(10);

        outbreak2019.addVirus(coronavirus);
        outbreak2019.addVirus(tvirus);
        outbreak2019.addVirus(svirus);
        outbreak2019.addVirus(avirus);

        //Outbreak 2020 and viruses
        Outbreak outbreak2020 = new Outbreak();
        outbreak2020.setName("Outbreak-2020");

        GregorianCalendar calendar2020Start = new GregorianCalendar(2020, 00, 3, 12, 00);
        Date start2020 = calendar2020Start.getTime();
        outbreak2020.setStartDate(start2020);
        GregorianCalendar calendar2020End = new GregorianCalendar(2020, 12, 31, 23, 59);
        Date end2020 = calendar2020End.getTime();
        outbreak2020.setEndDate(End2019);
        outbreak2020.setPeriodDifference();

        Virus flue = new Virus();
        flue.setName("Flue");
        flue.setAbilityInfectPerMonth(2000);

        Virus adenovirus = new Virus();
        adenovirus.setName("Adenovirus");
        adenovirus.setAbilityInfectPerMonth(2500);

        outbreak2020.addVirus(flue);
        outbreak2020.addVirus(adenovirus);

        //Added country Krakozhia
        Country krakozhia = new Country();
        krakozhia.setName("Krakozhia");

        krakozhia.addOutbreak(outbreak2019);
        krakozhia.addOutbreak(outbreak2020);

        //Added country Vadia
        Country vadia = new Country();
        vadia.setName("Vadia");

        vadia.addOutbreak(outbreak2018);

       //Added continent Europia
        Continent europia = new Continent();
        europia.setName("Europia");
        europia.addCountry(krakozhia);
        europia.addCountry(vadia);

        System.out.println(outbreak2018.getAddInfo());





    }
}

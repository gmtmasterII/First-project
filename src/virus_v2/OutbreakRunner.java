package virus_v2;

import java.util.Date;
import java.util.GregorianCalendar;

public class OutbreakRunner {
    public static void main(String[] args) {

        //Outbreak 2019 and viruses
        Outbreak outbreak2019 = new Outbreak();
        outbreak2019.setName("Outbreak-2019");

        //GregorianCalendar startDayInCalendar2019 = new GregorianCalendar(2019, 1, 12);
        //outbreak2019.setStartDate(startDayInCalendar2019);
        //GregorianCalendar endDayInCalendar2019 = new GregorianCalendar(2019, 12, 30);
        //outbreak2019.setEndDate(endDayInCalendar2019);

        Date s1 = new GregorianCalendar(2019, 1, 1, 21, 40).getTime();
        outbreak2019.setS1(s1);
        Date s2 = new GregorianCalendar(2019, 12, 30, 22, 00).getTime();
        outbreak2019.setS2(s2);

        System.out.println(outbreak2019.getOutBreakDuration());



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
        GregorianCalendar startDayInCalendar2020 = new GregorianCalendar(2020, 1, 1);
        outbreak2020.setStartDate(startDayInCalendar2020);
        GregorianCalendar endDayInCalendar2020 = new GregorianCalendar(2020, 12, 31);
        outbreak2020.setEndDate(endDayInCalendar2020);

        Virus flue = new Virus();
        flue.setName("Flue");
        flue.setAbilityInfectPerMonth(2000);

        Virus adenovirus = new Virus();
        adenovirus.setName("Adenovirus");
        adenovirus.setAbilityInfectPerMonth(2500);

        outbreak2020.addVirus(flue);
        outbreak2020.addVirus(adenovirus);

       // System.out.println(outbreak2020.getAddInfo());

        //Added country Krakozhia
        Country krakozhia = new Country();
        krakozhia.setName("Krakozhia");

        krakozhia.addOutbreak(outbreak2019);
        krakozhia.addOutbreak(outbreak2020);

        //System.out.println(krakozhia.getOutbreakInfo());
        //System.out.println(krakozhia.getOutbreakInfo2());

       //Outbreak 2018
        Outbreak outbreak2018 = new Outbreak();
        outbreak2018.setName("Outbreak 2018");
        GregorianCalendar startDayInCalendar2018 = new GregorianCalendar(2018, 16, 3);
        outbreak2018.setStartDate(startDayInCalendar2018);
        GregorianCalendar endDayInCalendar2018 = new GregorianCalendar(2018, 12, 31);
        outbreak2018.setEndDate(endDayInCalendar2018);

        Virus xVirus = new Virus();
        xVirus.setName("X-Virus");
        xVirus.setAbilityInfectPerMonth(900);

        Virus iVirus = new Virus();
        iVirus.setName("iVirus");
        iVirus.setAbilityInfectPerMonth(43);

        outbreak2018.addVirus(xVirus);
        outbreak2018.addVirus(iVirus);

        //Added country
        Country vadia = new Country();
        vadia.setName("Vadia");

        vadia.addOutbreak(outbreak2018);

        Continent europia = new Continent();
        europia.setName("Europia");
        europia.addCountry(krakozhia);
        europia.addCountry(vadia);

        //System.out.println(europia.getCountryInfo());


    }
}

package virus_v2;

import java.time.LocalDate;
import java.time.Month;

public class OutbreakRunner {
    public static void main(String[] args) {

        Outbreak outbreak2018 = new Outbreak();
        outbreak2018.setName("Outbreak 2018");

        LocalDate startDate2018 = LocalDate.of(2018, Month.JANUARY, 1);
        outbreak2018.setStartDate(startDate2018);
        LocalDate endDate2018 = LocalDate.of(2018, Month.DECEMBER, 31);
        outbreak2018.setEndDate(endDate2018);
        outbreak2018.setPeriodDifference();

        Virus xVirus = new Virus();
        xVirus.setName("X-Virus");
        xVirus.setVirusCode("X");
        xVirus.setAbilityInfectPerMonth(900);

        Virus iVirus = new Virus();
        iVirus.setName("iVirus");
        iVirus.setVirusCode("i");
        iVirus.setAbilityInfectPerMonth(43);

        outbreak2018.addVirus(xVirus);
        outbreak2018.addVirus(iVirus);

        Outbreak outbreak2019 = new Outbreak();
        outbreak2019.setName("Outbreak-2019");

        LocalDate startDate2019 = LocalDate.of(2019, 03, 18);
        outbreak2019.setStartDate(startDate2019);
        LocalDate endDate2019 = LocalDate.of(2019, 12, 7);
        outbreak2019.setEndDate(endDate2019);
        outbreak2019.setPeriodDifference();

        Virus coronavirus = new Virus();
        coronavirus.setName("Covid-19");
        coronavirus.setVirusCode("Sars-Cov");
        coronavirus.setAbilityInfectPerMonth(50);

        Virus tvirus = new Virus();
        tvirus.setName("T-Virus");
        tvirus.setVirusCode("T");
        tvirus.setAbilityInfectPerMonth(20);

        Virus svirus = new Virus();
        svirus.setName("S-Virus");
        svirus.setVirusCode("S");
        svirus.setAbilityInfectPerMonth(30);

        Virus avirus = new Virus();
        avirus.setName("A-Virus");
        avirus.setVirusCode("A");
        avirus.setAbilityInfectPerMonth(10);

        outbreak2019.addVirus(coronavirus);
        outbreak2019.addVirus(tvirus);
        outbreak2019.addVirus(svirus);
        outbreak2019.addVirus(avirus);

        Outbreak outbreak2020 = new Outbreak();
        outbreak2020.setName("Outbreak-2020");

        LocalDate startDate2020 = LocalDate.of(2020, 2, 12);
        outbreak2020.setStartDate(startDate2020);
        LocalDate endDat2020 = LocalDate.of(2020, 12, 20);
        outbreak2020.setEndDate(endDat2020);
        outbreak2020.setPeriodDifference();

        Virus flue = new Virus();
        flue.setName("Flue");
        flue.setAbilityInfectPerMonth(2000);

        Virus adenovirus = new Virus();
        adenovirus.setName("Adenovirus");
        adenovirus.setVirusCode("A");

        adenovirus.setAbilityInfectPerMonth(2500);

        outbreak2020.addVirus(flue);
        outbreak2020.addVirus(adenovirus);

        Country krakozhia = new Country();
        krakozhia.setName("Krakozhia");
        krakozhia.setCode("KR");

        krakozhia.addOutbreak(outbreak2019);
        krakozhia.addOutbreak(outbreak2020);

        Country vadia = new Country();
        vadia.setName("Vadia");
        vadia.setCode("VD");

        vadia.addOutbreak(outbreak2018);

        Continent europia = new Continent();
        europia.setName("Europia");
        europia.addCountry(krakozhia);
        europia.addCountry(vadia);

        //System.out.println(europia.getTotalInfo());
        //System.out.println(krakozhia.getOutbreakInfo2());
        System.out.println(outbreak2018.getAddInfo());

        }
}

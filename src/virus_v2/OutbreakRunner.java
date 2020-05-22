package virus_v2;

public class OutbreakRunner {
    public static void main(String[] args) {
        Outbreak outbreak2019 = new Outbreak();
        outbreak2019.setName("Outbreak-2019");

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


       // System.out.println(outbreak2019.getInfo());
       // System.out.println(outbreak2019.getAddInfo());

        Outbreak outbreak2020 = new Outbreak();
        outbreak2020.setName("Outbreak-2020");

        Virus flue = new Virus();
        flue.setName("Flue");
        flue.setAbilityInfectPerMonth(2000);

        Virus adenovirus = new Virus();
        adenovirus.setName("Adenovirus");
        adenovirus.setAbilityInfectPerMonth(2500);

        outbreak2020.addVirus(flue);
        outbreak2020.addVirus(adenovirus);

       // System.out.println(outbreak2020.getAddInfo());

        Country krakozhia = new Country();
        krakozhia.setName("Krakozhia");

        krakozhia.addOutbreak(outbreak2019);
        krakozhia.addOutbreak(outbreak2020);

        //System.out.println(krakozhia.getOutbreakInfo());
        System.out.println(krakozhia.getOutbreakInfo2());


    }
}

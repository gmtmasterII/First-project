package virus_v2;

public class OutbreakRunner {
    public static void main(String[] args) {
        Outbreak krakozhia = new Outbreak();
        krakozhia.setName("Krakozhia");

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


        krakozhia.addVirus(coronavirus);
        krakozhia.addVirus(tvirus);
        krakozhia.addVirus(svirus);
        krakozhia.addVirus(avirus);


        System.out.println(krakozhia.getInfo());
        System.out.println(krakozhia.getAddInfo());


    }
}

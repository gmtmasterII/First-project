package virus_v2;

public class OutbreakRunner {
    public static void main(String[] args) {
        Outbreak krakozhia = new Outbreak();
        krakozhia.setName("Krakozhia");

        Virus coronavirus = new Virus();
        coronavirus.setName("Covid-19");

        Virus tvirus = new Virus();
        tvirus.setName("T-Virus");

        krakozhia.addVirus(coronavirus);
        krakozhia.addVirus(tvirus);

        System.out.println(krakozhia.getInfo());
        System.out.println(krakozhia.getAddInfo());


    }
}

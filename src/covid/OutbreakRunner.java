package covid;

public class OutbreakRunner {
    public static void main(String[] args) {
        CountryOutbreak krakozhia = new CountryOutbreak();
        krakozhia.setName("Republic of Krakozhia");
        krakozhia.setPopulation(10000000);

        Virus coronavirus = new Virus();
        coronavirus.setName("Covid-19");
        coronavirus.setInfectedPersonPerDay(100);
        coronavirus.setDays(30);

        krakozhia.setVirus(coronavirus);

        System.out.println(coronavirus.getAdvise());

    }
}

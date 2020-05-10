package covid;

public class CountryOutbreak {
    String name;
    int population;
    int infectedPopulation;
    int uninfectedPopulation = population-infectedPopulation;
    boolean OutbreakBegin;


    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void setPopulation(int p) {
        population = p;
    }

    int getPopulation() {
        return population;
    }

    void setInfectedPopulation(int b) {
        infectedPopulation = b;
    }

    int getInfectedPopulation() {
        return infectedPopulation;
    }

    void setVirus(Virus c){
        infectedPopulation = c.getInfectedPersonPerDay();
    }


    String getInfo() {
        if(infectedPopulation >10) {
            return "Number of infected is " + infectedPopulation + ". Please stay home." ;
        }
        return "It is safe to go outside";
        }





}

package virus_v2;

public class Virus {
    String name;
    int abilityInfectPerMonth;
    String virusCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAbilityInfectPerMonth() {
        return abilityInfectPerMonth;
    }

    public void setAbilityInfectPerMonth(int abilityInfectPerMonth) {
        this.abilityInfectPerMonth = abilityInfectPerMonth;
    }


    void setVirusCode(String c){
        virusCode = c;
    }

    String getVirusCode() {
        return virusCode;
    }
}

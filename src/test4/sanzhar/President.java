package test4.sanzhar;

public class President {
    int age;
    String name;
    int yearsInPower;
    PresidentsWife wife;

    void setAge (int ageOfPresident) {
        age = ageOfPresident;
        };

    int getAge () {
        return age;

    };

    void setName(String nameOfPresident) {
        name = nameOfPresident;
    }

    String getName(){
        return name;
    };

    void setYearsInPower (int NumberOfYears)
    {
        yearsInPower = NumberOfYears;}

    int getYearsInPower() {
        return yearsInPower;

    }

    void setWife(PresidentsWife w){
        wife = w;
    };

    PresidentsWife getWife()
    {
        return wife;
    }
};
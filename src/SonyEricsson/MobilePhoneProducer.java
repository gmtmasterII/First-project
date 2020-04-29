package SonyEricsson;

public class MobilePhoneProducer {
    String name;
    int capitalization;

    void setName(String b) {
        name = b;
    }

    String getName() {
        return name;
    }

    void setAcquisition (MobilePhoneProducer anotherCompany) {
        name = name + " " + anotherCompany.getName();
        capitalization = capitalization + anotherCompany.getCapitalization();
    }

    String getInfo() {
        return name + " " + capitalization;
    }

    void setBrandAcquisition (String x) {
        name = name + " " + x;
    }

    void setCapitalization (int a) {
        capitalization = a;
    }

    int getCapitalization() {
        return capitalization;
    }

}

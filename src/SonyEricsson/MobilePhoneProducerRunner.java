package SonyEricsson;

public class MobilePhoneProducerRunner {
    public static void main (String[] args){

        MobilePhoneProducer sony = new MobilePhoneProducer();
        sony.setName("Sony");
        sony.setCapitalization(1000);

        MobilePhoneProducer ericsson = new MobilePhoneProducer();
        ericsson.setName("Ericsson");
        ericsson.setCapitalization(800);

        sony.setAcquisition(ericsson);
        System.out.println(sony.getInfo());

        //sony.setBrandAcquisition(ericsson.getName());


    }
}

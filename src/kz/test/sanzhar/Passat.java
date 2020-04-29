package kz.test.sanzhar;
    //класс
public class Passat {
        //переменные класса
        Integer gasVolume = 0;
        Integer person = 0;
        //конструктор
        Passat(String c) {
        }
        void fillTheGas(Integer amount) {
            gasVolume = gasVolume+amount;
        }
        Integer getGasVolume() {
            return gasVolume;
        }
        Integer addPassenger (Integer p) {
            person=person + p;
            return person;
        }
        Integer getPassengerNumber () {
            return person;
        }
    }
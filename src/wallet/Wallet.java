package wallet;

public class Wallet {
    int numberOfMoney;
    String currency;
    int currencyTopUp;

    void setNumberOfMoney(int m) {
    }

    int getNumberOfMoney(){
        return numberOfMoney;
    }

    void setCurrency(String c) {
        currency = c;
    }

    String getCurrency() {
        return currency;
    }

    void setCurrencyTopUp (int s) {
        currencyTopUp = currencyTopUp + s;
    };

    int getCurrencyTopUp(){
        return currencyTopUp;
    };

    void setNewCash(Wallet g) {
        currencyTopUp = currencyTopUp + g.currencyTopUp;
        }

     String getInfo() {
        return currency + " " + currencyTopUp;

     }

}

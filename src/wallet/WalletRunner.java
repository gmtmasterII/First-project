package wallet;

public class WalletRunner {
    public static void main (String[] args){
        Wallet leatherWallet = new Wallet();
        leatherWallet.setCurrency("USD");
        leatherWallet.setCurrencyTopUp(100);

        Wallet fabricWallet = new Wallet();
        fabricWallet.setCurrency("USD");
        fabricWallet.setCurrencyTopUp(150);

        leatherWallet.setNewCash(fabricWallet);

        System.out.println(leatherWallet.getInfo());

        System.out.println(leatherWallet.getCurrencyTopUp());
    }

}

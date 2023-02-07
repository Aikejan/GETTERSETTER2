public class Wallet {
    private int walleymoney;
    private int card;

    public int getWalleymoney() {
        return walleymoney;
    }

    public void setWalleymoney(int walleymoney) {
        this.walleymoney = walleymoney;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }
    int addmoneytocard(int sum){
        return card+sum;
    }int ceooutmoney(int sum1){
        return card-sum1;
    }
}

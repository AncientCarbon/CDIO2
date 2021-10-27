public class Konto {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Konto(int balance){
        this.balance = 1000;
    }
    public int addScore(int point){ // Laver et ny variabel med typen Felt
        this.balance += point;
        if (balance < 0)
            balance = 0;
        return this.balance;
    }

}

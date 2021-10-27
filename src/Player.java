public class Player {
    private String name;
    private Konto konto;

    public Player(String name) {
        this.name = name;
        this.konto = new Konto(1000);
    }

    public int addScore(int point){ // Laver et ny variabel med typen Felt
        int newBalance = this.konto.getBalance() + point;

        if (newBalance < 0)
            newBalance = 0;

        this.konto.setBalance(newBalance);

        return this.konto.getBalance();
    }

    public int getBalance() {
        return this.konto.getBalance();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class Player {
    private String name;
    private Konto konto;
    private int balance;

    public Player(String name) {
        this.name = name;
        this.konto = new Konto();
    }

    public int addScore(int point){ // Laver et ny variabel med typen Felt
        this.balance += point;
        if (balance < 0)
            balance = 0;
        return this.balance;
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
public class Player {
    public String name;
    public int balance;

    public Player(String _name){
        this.name = _name;
        this.balance = 1000;
    }

    public int addScore(Field felt){ // Laver et ny variabel med typen Felt
        this.balance += felt.point;
        return this.balance;
    }
}
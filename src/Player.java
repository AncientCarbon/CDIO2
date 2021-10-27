public class Player {
    private String name;
    public int balance;

    public Player(String name){
        this.name = name;
        this.balance = 1000;
    }

    public int addScore(int point){ // Laver et ny variabel med typen Felt
        this.balance += point;
        return this.balance;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }



}
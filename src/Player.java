public class Player {
    private String name;
    private Konto n = new Konto(1000);

    public Player(String name){
        this.name = name;
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
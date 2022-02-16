public class Player {

    private String name;
    private int dunkHeight;
    private int recoverPercentage;

    public Player(String name, int dunkHeight, int recoverPercentage) {
        this.name = name;
        this.dunkHeight =dunkHeight;
        this.recoverPercentage = recoverPercentage;
    }

    public String getName() {
        return name;
    }

    public int getDunkHeight() {
        return dunkHeight;
    }
    public int getRecoverPercentage(){
        return recoverPercentage;
    }
}
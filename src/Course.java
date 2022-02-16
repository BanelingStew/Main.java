public class Course {
    String result;
    private int hoopHeight;
    private int averagePercentage;

    public Course(int hoopHight, int averagePercentage) {
        this.hoopHeight = hoopHight;
        this.averagePercentage = averagePercentage;
    }

    public String doIt(Team team){
        result = "Team Name: "+ team.getName()+ " " + '\n';
        for(Player player: team.getPlayers()){
            result += "Player Name: " + player.getName()+ " " + '\n';
            int value1 = player.getDunkHeight();
            int value2 = player.getRecoverPercentage();
            testHoopHeight(value1);
            testAveragePercentage(value2);


        }

        return result;
    }

    private void testHoopHeight(int value){
        if(value<hoopHeight) result += "Has Dunked the ball "+ '\n';

    }

    private void testAveragePercentage(int value){
        if(value<averagePercentage) result += "Has beaten average percentage score"+ '\n';

    }


}
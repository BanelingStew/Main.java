
public class Java2HW1 {

    public static void main(String[] args) {
        Player[] player = new Player[4];
        player[0] = new Player("Coby Bryant", 100, 150);
        player[1] = new Player("Kevin Durant", 200, 200);
        player[2] = new Player("Shaquil O'Neal", 300, 100);
        player[3] = new Player("Magic Johnson", 400,50);
       Team team = new Team("Los Angeles Lakers",player);

        Course course = new Course(250,300);
        String result = course.doIt(team);
        System.out.println(result);

    }
}








interface Cricketer {
    final int Id = 10;   
    void bowl();
}

class Player implements Cricketer {
  
    public void bowl() {
        System.out.println("The cricketer with ID " + Id + " is bowling.");
    }
}

public class CricketTest {
    public static void main(String[] args) {
        
        Player player = new Player();
        player.bowl();
    }
}


public class Play {
    public static void main(String[] args) {

        Player player1 = new Player("LbBoss", 300.00, 42.0);
        System.out.println(player1.getName().toUpperCase());
        System.out.println("Vie du Boss : " + player1.getHealth());
        player1.damage(5);
        System.out.println("Vie du Boss : " + player1.getHealth());

        System.out.println("\n");

        Player player2 = new Player("Byby", 120.0, 25.05);
        player2.setName("Link");
        System.out.println(player2.getName());
        System.out.println("Vie du joueur : " + player2.getHealth());
        player2.damage(player1.getAttack());
        System.out.println("Vie du joueur : " + player2.getHealth());
    }
}

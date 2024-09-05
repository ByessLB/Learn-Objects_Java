
public class Player {

    private String name;
    private double health;
    private double attack;

    // Constructor
    public Player(String name, double health, double attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    // Méthodes
    public void damage(double damage) {
        this.health -= damage;
        System.out.println(name + " viens de subir des dégats de : " + damage + " d'attaque." );
    }

    public void heal(double heal) {
        this.health += heal;
        System.out.println(name + " a été soigné de : " + heal + " grâce à une potion de soin.");
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    public double getAttack() {
        return attack;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
}

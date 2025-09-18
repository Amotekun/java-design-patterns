package creationdesignpattern.prototype.game_character;

public class GameCharacter implements Cloneable {
    private String name;
    private String type;
    private int health;
    private int attack;
    private int defense;

    public GameCharacter(String name, String type, int health, int attack, int defense) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public GameCharacter clone() {
        try {
            return (GameCharacter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to clone GameCharacter: " + name, e);
        }
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }
}

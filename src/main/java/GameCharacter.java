public class GameCharacter {

    private int power;
    private String type;
    private String weapons;

    public GameCharacter(int p, String t, String w) {
        power = p;
        type = t;
        weapons = w;

    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {
        return weapons;
    }
}

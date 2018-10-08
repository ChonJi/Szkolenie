package dziedziczenie;

public class Character {

    protected int hitpoints, mana;
    protected int armor = 10;

    Character() {
        hitpoints = new Integer(10);
        mana = 20;
        System.out.println("Konstruktor Character");
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getMana() {
        return mana;
    }

    public int armorBoost () {
        return armor * 2;
    }
}

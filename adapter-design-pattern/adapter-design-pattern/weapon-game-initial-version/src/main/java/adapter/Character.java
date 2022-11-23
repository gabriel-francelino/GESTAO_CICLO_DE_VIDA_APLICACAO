package adapter;

/**
 * @author Rodrigo Martins Pagliares
 */

public class Character {
    private String name;
    private Weapon weapon;

    public Character(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void useWeapon() {
        System.out.print(this.getName() + "says : ");
        getWeapon().shoot();
    }

    public void load() {
        System.out.print(this.getName() + " is ");
        getWeapon().load();
    }

    public void zoom() {
        System.out.print(this.getName() + " says ");
        getWeapon().aim();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weapon
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * @param weapon the weapon to set
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

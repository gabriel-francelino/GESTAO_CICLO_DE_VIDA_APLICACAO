package adapter;

/**
 * @author Rodrigo Martins Pagliares
 */

public class WeaponGameTest {
    public static void main(String[] args) {
        Weapon handgun = new HandGun();
        Character leon = new Character("Leon", handgun);

        System.out.println(leon.getName() +  " playing with the handgun");
        leon.load();
        leon.zoom();
        leon.useWeapon();

        Weapon pistol = new Pistol();
        leon.setWeapon(pistol);

        System.out.println("\n" + leon.getName() +  " playing with the Pistol");
        leon.load();
        leon.zoom();
        leon.useWeapon();

        Weapon rifle = new Rifle();
        leon.setWeapon(rifle);

        System.out.println("\n" + leon.getName() +  " playing with the Rifle");
        leon.load();
        leon.zoom();
        leon.useWeapon();

        System.out.println("\n" + leon.getName() +  " playing with the ShotGun");
        Weapon shotgun = new ShotGunAdapter();
        leon.setWeapon(shotgun);
        leon.load();
        leon.zoom();
        leon.useWeapon();

        System.out.println("\n" + leon.getName() +  " playing with the Blunderbuss");
        Weapon blunderbuss = new BlunderbussAdapter();
        leon.setWeapon(blunderbuss);
        leon.load();
        leon.zoom();
        leon.useWeapon();
    }

}

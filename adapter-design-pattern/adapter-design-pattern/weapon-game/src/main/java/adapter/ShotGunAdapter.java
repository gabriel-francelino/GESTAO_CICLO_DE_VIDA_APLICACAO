package adapter;

import com.artilhariapesada.armas.ShotGun;

/**
 * @author Rodrigo Martins Pagliares
 */
public class ShotGunAdapter extends ShotGun implements Weapon {

    public void load() {
        this.loadGun();
    }

    public void shoot() {
        this.shootToKill();
    }

    public void aim() {
        this.targetEnemy();
    }

}

package adapter;

import xyz.Blunderbuss;

public class BlunderbussAdapter extends Blunderbuss implements Weapon {
    @Override
    public void load() {
        this.loadGun();
    }

    @Override
    public void shoot() {
        this.shootToKill();
    }

    @Override
    public void aim() {
        this.targetEnemy();
    }
}

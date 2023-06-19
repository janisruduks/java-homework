package io.codelex.additional_exercises.weapon_magazine;

public class WeaponMagazine {
    private String magazine;

    public WeaponMagazine(String magazine) {
        this.magazine = magazine;
    }

    public void loadBullet(String bullet) {
        if (bullet.length() > 30) {
            System.out.println("This isn't a machine gun..");
            System.out.println("You cannot load " + bullet.length() + " bullet when magazine is " + magazine.length());
        } else if (magazine.length() < 30) {
            magazine += bullet;
        } else {
            System.out.println("Magazine is full. Cannot load more bullets.");
        }
    }

    public void isLoaded() {
        if (magazine.length() > 0) {
            System.out.println("Magazine is loaded");
            System.out.println("Bullet count in magazine is " + magazine.length());
            System.out.println(magazine);
        } else {
            System.out.println("Magazine is empty");
        }
    }

    public void shoot() {
        if (magazine.length() == 0) {
            System.out.println("Cannot shoot, empty magazine...");
        } else {
            magazine = magazine.substring(0, magazine.length() - 1);
        }
    }


}

package io.codelex.additional_exercises.weapon_magazine;

public class WeaponTest {
    public static void main(String[] args) {
        WeaponMagazine mag = new WeaponMagazine("|||||");
        mag.shoot();
        mag.isLoaded();
        mag.shoot();
        mag.loadBullet("|");
        mag.isLoaded();
        mag.shoot();
        mag.isLoaded();
        mag.shoot();
        mag.shoot();
        mag.isLoaded();
        mag.shoot(); // not able to shoot empty magazine
        mag.loadBullet("|".repeat(30));
        mag.isLoaded();
        mag.loadBullet("|");
        mag.shoot();
        mag.loadBullet("|");
        mag.isLoaded();
        mag.shoot();
        mag.isLoaded(); // should be 29
    }
}

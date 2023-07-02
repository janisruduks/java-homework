package io.codelex.oop.parcels;

public class ParcelTest {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(40, 50, 60, 20, false);
        Parcel parcel2 = new Parcel(20, 40, 50, 12, true); // false xLength < 30
        Parcel parcel3 = new Parcel(30, 30, 30, 25, false);
        Parcel parcel4 = new Parcel(100, 100, 100, 10, true);
        Parcel parcel5 = new Parcel(100, 100, 105, 10, false); // false zLength 105
        Parcel parcel6 = new Parcel(40, 40, 40, 20, true); // false weight > 15
        Parcel parcel7 = new Parcel(40, 50, 60, 35, false); // false weight > 30

        System.out.println(parcel1.validate());
        System.out.println(parcel2.validate());
        System.out.println(parcel3.validate());
        System.out.println(parcel4.validate());
        System.out.println(parcel5.validate());
        System.out.println(parcel6.validate());
        System.out.println(parcel7.validate());
    }
}

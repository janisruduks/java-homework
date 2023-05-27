package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private final int xLength;
    private final int yLength;
    private final int zLength;
    private final float weight;
    private final boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        int sum = xLength + yLength + zLength;
        if (sum > 300) {
            System.out.println("Parcel is too large.");
            return false;
        } else if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Parcel is too small");
            return false;
        } else if (weight > 30.0 && !isExpress || weight > 15.0 && isExpress) {
            System.out.println("Weight exceeds maximum allowance");
            return false;
        }
        System.out.println("Parcel is valid.");
        return true;
    }
}

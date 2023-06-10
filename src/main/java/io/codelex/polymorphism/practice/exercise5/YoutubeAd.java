package io.codelex.polymorphism.practice.exercise5;

public class YoutubeAd extends Advert {

    private int sec;
    private int rate;
    private boolean specificDemographic;
    private final int specificDemographicCost = 2000;
    private boolean peakTimeOfYear;
    private final int cost;

    public YoutubeAd(int fee, int rate, int length, boolean specificDemographic, boolean peakTimeOfYear) {
        super(fee);
        this.rate = rate;
        this.sec = length;
        this.specificDemographic = specificDemographic;
        this.peakTimeOfYear = peakTimeOfYear;
        this.cost = rate * (peakTimeOfYear ? 2 : 1) + (specificDemographic ? specificDemographicCost : 0);
    }

    @Override
    public int cost() {
        return super.cost() + cost;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Youtube ad: length=" + sec + " secs."
                + " Rate=" + cost;
    }
}

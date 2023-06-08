package io.codelex.polymorphism.practice.exercise5;

public class YoutubeAd extends Advert {

    private int sec;
    private int rate;
    private boolean specificDemographic;
    private boolean peakTimeOfYear;

    public YoutubeAd(int fee, int rate, int length, boolean specificDemographic, boolean peakTimeOfYear) {
        super(fee);
        this.rate = rate;
        this.sec = length;
        this.specificDemographic = specificDemographic;
        this.peakTimeOfYear = peakTimeOfYear;
    }

    @Override
    public int cost() {
        int cost = sec * rate * (specificDemographic ? 2 : 1) * (peakTimeOfYear ? 2 : 1);
        return super.cost() + cost;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Youtube ad: length=" + sec + " secs."
                + " Rate=" + (rate * (specificDemographic ? 2 : 1) * (peakTimeOfYear ? 2 : 1));
    }
}

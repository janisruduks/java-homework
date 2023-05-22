package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private final String title;
    private boolean isVideoAvailable = true;
    private double videoRating;

    public Video(String title, int videoRating) {
        this.title = title;
        this.videoRating = videoRating;
    }

    public void addVideoRating(double rating) {
        this.videoRating = (this.videoRating + rating) / 2;
    }

    public void setCheckOut() {
        isVideoAvailable = true;
    }

    public void setCheckIn() {
        isVideoAvailable = false;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + title + " | rating: " + videoRating + " | is available: " + isVideoAvailable;
    }
}

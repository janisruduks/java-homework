package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    private final List<Video> inventory;

    public VideoStore() {
        inventory = new ArrayList<>();
    }

    public void rentVideo(String title) {
        Video movie = findVideo(title);

        movie.setCheckIn();
    }

    public void returnVideo(String title) {
        Video movie = findVideo(title);

        movie.setCheckOut();
    }

    public void rateVideo(String title, int rating) {
        Video movie = findVideo(title);

        movie.addVideoRating(rating);
    }

    public void addVideoToInventory(String title, int rating) {
        Video newVideo = new Video(title, rating);
        inventory.add(newVideo);
    }

    public void getInventory() {
        for (Video video : inventory) {
            System.out.println(video);
        }
    }

    public Video findVideo(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                return video;
            }
        }
        return null;
    }
}

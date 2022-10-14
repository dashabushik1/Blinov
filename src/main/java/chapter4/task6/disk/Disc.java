package chapter4.task6.disk;

import chapter4.task6.music.Track;

import java.util.ArrayList;
import java.util.List;

import static chapter4.task6.music.MusicStyles.*;

public class Disc {

    private List<Track> trackList = new ArrayList<>();

    public Disc() {
        trackList.add(new Track("16BL - Deep In My Soul", 4.34, DEEP_HOUSE));
        trackList.add(new Track("Eli & Fur - Something Was Real", 5.60, HOUSE));
        trackList.add(new Track("Croquet Club - Cardigan", 5.00, PROGRESSIVE));
        trackList.add(new Track("16BL - Nobody Seems To Care", 8.03, TRANCE));
        trackList.add(new Track("Yotto - Love Machine", 3.36, PROGRESSIVE));
        trackList.add(new Track("Tinlicker - Perfect Mistakes", 6.45, TRANCE));
        trackList.add(new Track("Braxton  - The River", 5.35, HOUSE));
        trackList.add(new Track("Above & Beyond - Homecoming", 8.03, TRANCE));
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public double getTotalDuration() {
        double totalDuration = 0.0;
        for (int i = 0; i < trackList.size(); i++) {
            totalDuration += trackList.get(i).getDuration();
        }
        return (Math.round(totalDuration));
    }

    public void getTrackInRange(double from, double to) {
        System.out.println("Tracks in the range from 4.00 to 6.00 minutes: ");
        for (int i = 0; i < trackList.size(); i++) {
            if (trackList.get(i).getDuration() >= from &&
                    trackList.get(i).getDuration() <= to) {
                System.out.println(trackList.get(i).getName() + ", " + trackList.get(i).getDuration() + " minutes.");
            }
        }
    }

    @Override
    public String toString() {
        return "Disc" + "trackList " + trackList;
    }
}


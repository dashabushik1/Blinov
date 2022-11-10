package chapter4.task6;

import java.util.ArrayList;
import java.util.List;

import static chapter4.task6.MusicStyles.*;

public class Disc {

    private List<Track> trackList = new ArrayList<>();

    public void addTrack(Track track) {
        trackList.add(track);
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


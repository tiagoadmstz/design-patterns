package io.github.tiagoadmstz.designpatterns.iterator;

import lombok.Getter;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {

    @Getter
    private Hashtable<Integer, SongInfo> bestSongs = new Hashtable();
    private int hashKey = 0;

    public SongsOfThe90s() {
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad the Wet Sprocket", 1991);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey++, songInfo);
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}

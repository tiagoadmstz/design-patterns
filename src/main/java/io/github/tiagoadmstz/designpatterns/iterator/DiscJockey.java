package io.github.tiagoadmstz.designpatterns.iterator;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.stream.IntStream;

public class DiscJockey {

    private SongsOfThe70s songsOfThe70s;
    private SongsOfThe80s songsOfThe80s;
    private SongsOfThe90s songsOfThe90s;

    private SongIterator iter70sSongs;
    private SongIterator iter80sSongs;
    private SongIterator iter90sSongs;

    public DiscJockey(SongIterator iter70sSongs, SongIterator iter80sSongs, SongIterator iter90sSongs) {
        this.iter70sSongs = iter70sSongs;
        this.iter80sSongs = iter80sSongs;
        this.iter90sSongs = iter90sSongs;
    }

    public void showTheSongs() {
        System.out.println("Songs of the 70s\n");
        IntStream.range(0, songsOfThe70s.getBestSongs().size()).forEach(i -> printBestSongs(songsOfThe70s.getBestSongs().get(i)));
        System.out.println("Songs of the 80s\n");
        IntStream.range(0, songsOfThe80s.getBestSongs().length).forEach(i -> printBestSongs(songsOfThe80s.getBestSongs()[i]));
        System.out.println("Songs of the 90s\n");
        for (Enumeration<Integer> e = songsOfThe90s.getBestSongs().keys(); e.hasMoreElements(); ) {
            printBestSongs(songsOfThe90s.getBestSongs().get(e.nextElement()));
        }
    }

    public void showTheSongs2() {
        Arrays.asList(iter70sSongs.createIterator(), iter80sSongs.createIterator(), iter90sSongs.createIterator())
                .forEach(iterator -> {
                    while (iterator.hasNext()) printBestSongs((SongInfo) iterator.next());
                });
    }

    private void printBestSongs(SongInfo songInfo) {
        System.out.println(songInfo.getSongName());
        System.out.println(songInfo.getBandName());
        System.out.println(songInfo.getYearReleased());
    }

}

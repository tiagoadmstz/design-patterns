package io.github.tiagoadmstz.designpatterns.singleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

    @Override
    public void run() {
        Singleton newInstance = Singleton.getInstance();
        System.out.println(String.format("1st Instance ID: %s", System.identityHashCode(newInstance)));
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerOneTiles = newInstance.getTiles(7);
        System.out.println(String.format("Player 1: %s", playerOneTiles));
        System.out.println("Got Tiles");
    }
}

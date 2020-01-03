package io.github.tiagoadmstz.designpatterns.singleton;

import java.util.LinkedList;

public class ScrabbleTest {

    public static void main(String[] args) {
        Singleton newInstance = Singleton.getInstance();
        System.out.println(String.format("Instance ID: %s", System.identityHashCode(newInstance)));
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerOneTiles = newInstance.getTiles(7);
        System.out.println(String.format("Player 1: %s", playerOneTiles));
        System.out.println(newInstance.getLetterList());
        Singleton instanceTwo = Singleton.getInstance();
        System.out.println(String.format("Instance 2 ID: %s", System.identityHashCode(newInstance)));
        LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
        System.out.println(String.format("Player 2: %s", playerTwoTiles));
    }

}

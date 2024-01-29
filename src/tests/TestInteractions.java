package tests;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Player;
import levelPieces.*;
import org.junit.Test;
import org.junit.Assert.*;

import static junit.framework.Assert.assertEquals;

public class TestInteractions {

    @Test
    public void rewardInteraction() {
        Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        Reward reward = new Reward(0);
        Player player = new Player(0);
        InteractionResult result = reward.interact(gameBoard, player.getLocation());
        assertEquals(result, InteractionResult.GET_POINT);
    }

    @Test
    public void trapdoorInteraction() {
        Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        Trapdoor trap = new Trapdoor(0);
        Player player = new Player(0);
        InteractionResult result = trap.interact(gameBoard, player.getLocation());
        assertEquals(result, InteractionResult.KILL);
    }

    @Test
    public void assassinInteraction() {
        Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        Assassin assassin = new Assassin(1);
        Player player = new Player(0);
        InteractionResult result = assassin.interact(gameBoard, player.getLocation()); // Test in range
        assertEquals(result, InteractionResult.KILL);
        assassin.setLocation(2);
        assertEquals(assassin.interact(gameBoard, player.getLocation()), InteractionResult.NONE);
    }

    @Test
    public void soilderInteraction() {
        Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        Solider soilder = new Solider(2);
        Player player = new Player(0);
        InteractionResult result = soilder.interact(gameBoard, player.getLocation()); // Test in range
        assertEquals(result, InteractionResult.HIT);
    }

    @Test
    public void dragonflyInteraction() {
        Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        Dragonfly dragonfly = new Dragonfly(0);
        Player player = new Player(0);
        InteractionResult result = dragonfly.interact(gameBoard, player.getLocation()); // Test in range
        assertEquals(result, InteractionResult.NONE);
    }
}

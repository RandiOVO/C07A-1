package tests;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Player;
import levelPieces.Reward;
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


}

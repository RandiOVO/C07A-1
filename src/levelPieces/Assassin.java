package levelPieces;
import java.util.Random;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Assassin extends GamePiece implements Moveable {
    private InteractionResult action;
    private static final Random rand = new Random();
    /**
     * Constructor for the game piece
     * @param location initial location
     */
    public Assassin(int location) {
        super('A', "Assassin", location);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        // The assassin moves to any random position on the board
        this.setLocation(rand.nextInt(GameEngine.BOARD_SIZE));
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        int distance = Math.abs(playerLocation - this.getLocation());
        if (distance < 2) // If next two or one the same square the assassin will kill the player
        return InteractionResult.KILL;
        else return InteractionResult.NONE;
    }
}

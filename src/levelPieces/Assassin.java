package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

import java.util.Random;

public class Assassin extends GamePiece implements Moveable {
    private static final Random rand = new Random();

    /**
     * Constructor for the game piece
     *
     * @param location initial location
     */
    public Assassin(int location) {
        super('A', "Assassin", location);
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        // The assassin moves to any random position on the board
        int currentPos = this.getLocation();
        int newPos = rand.nextInt(GameEngine.BOARD_SIZE);
        gameBoard[currentPos] = null;
        this.setLocation(newPos);
        gameBoard[newPos] = this;
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        int distance = Math.abs(playerLocation - this.getLocation());
        if (distance < 2) // If next two or one the same square the assassin will kill the player
        {
            System.out.println("You have been killed by an assassin!");
            return InteractionResult.KILL;
        } else return InteractionResult.NONE;
    }
}

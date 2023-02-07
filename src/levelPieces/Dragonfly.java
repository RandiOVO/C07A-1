package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

import java.util.Random;

public class Dragonfly extends GamePiece implements Moveable {
    private boolean moveRight;

    /**
     * Constructor for the game piece
     *
     * @param location initial location
     */
    public Dragonfly(int location) {
        super('D', "Dragonfly", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return InteractionResult.NONE;
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        Random rand = new Random();
        int currentPos = this.getLocation();
        int distance = rand.nextInt(4);
        int newPos;
        boolean direction = rand.nextBoolean();
        if (direction) {
            newPos = (currentPos - distance) < 0 ? 0 : currentPos - distance;
        } else {
            newPos = (currentPos + distance) < GameEngine.BOARD_SIZE ? currentPos + distance : GameEngine.BOARD_SIZE - 1;
        }
        this.setLocation(newPos);
        gameBoard[newPos] = this;
    }
}

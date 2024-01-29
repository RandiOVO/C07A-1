package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Solider extends GamePiece implements Drawable, Moveable {
    private boolean direction = false;

    public Solider(int location) {
        super('S', "Solider", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        int distance = Math.abs(playerLocation - this.getLocation());
        if (distance < 3) {
            System.out.println("You were shot by a soilder.");
            return InteractionResult.HIT;
        } else return InteractionResult.NONE;
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        int currentPos = this.getLocation();
        int newPos = currentPos;
        if (direction) {
            if (currentPos + 1 < GameEngine.BOARD_SIZE) newPos = currentPos + 1;
            else direction = false;
        } else {
            if (currentPos - 1 >= 0) newPos = currentPos - 1;
            else direction = true;

        }
        this.setLocation(newPos);
        gameBoard[currentPos] = null;
        gameBoard[newPos] = this;
    }
}

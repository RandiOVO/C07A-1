package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Solider extends GamePiece implements Drawable, Moveable {

    public Solider(int location) {
        super('S', "Solider", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        int distance = Math.abs(playerLocation - this.getLocation());
        if (distance < 2) {
            System.out.println("You were shot by a soilder.");
            return InteractionResult.HIT;
        } else return InteractionResult.NONE;
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        int currentPos = this.getLocation();
        if (currentPos > 1) {
            this.setLocation(currentPos - 1);
            gameBoard[currentPos] = null;
            gameBoard[currentPos - 1] = this;
        } else {
            this.setLocation(currentPos + 1);
            gameBoard[currentPos] = null;
            gameBoard[currentPos + 1] = this;
        }
    }
}

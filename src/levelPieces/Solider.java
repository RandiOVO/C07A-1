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
        if (distance < 2) return InteractionResult.HIT;
        else return InteractionResult.NONE;
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        int currentPos = this.getLocation();
        if (currentPos > 1) this.setLocation(currentPos - 1);
        else this.setLocation(currentPos + 1);
    }
}

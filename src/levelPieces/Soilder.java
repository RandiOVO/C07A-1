package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Soilder extends GamePiece implements Drawable, Moveable {

    public Soilder(char symbol, String label, int location) {
        super(symbol, label, location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return null;
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {

    }
}

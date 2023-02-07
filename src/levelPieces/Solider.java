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
        return InteractionResult.HIT;
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
    }
}

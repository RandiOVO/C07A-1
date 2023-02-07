package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Trapdoor extends GamePiece {
    /**
     * Constructor for the game piece
     *
     * @param location initial location
     */
    public Trapdoor(int location) {
        super('T', "Trapdoor", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return InteractionResult.HIT;
    }
}

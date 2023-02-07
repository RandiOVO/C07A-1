package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Dragonfly extends GamePiece {
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
}

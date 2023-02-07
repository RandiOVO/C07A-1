package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Reward extends GamePiece {
    /**
     * Constructor for the game piece
     *
     * @param location initial location
     */
    public Reward(int location) {
        super('?', "Reward", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        if (this.getLocation() == playerLocation) {
            System.out.println("You just found a reward!");
            return InteractionResult.GET_POINT;
        } else return InteractionResult.NONE;
    }
}

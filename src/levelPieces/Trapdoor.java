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
        if (this.getLocation() == playerLocation) {
            System.out.println("Your player fell through a trap door!");
            return InteractionResult.KILL;
        } else return InteractionResult.NONE;
    }
}

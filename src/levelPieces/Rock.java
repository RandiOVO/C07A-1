package levelPieces;

import gameEngine.Drawable;

public class Rock implements Drawable {
    private final char symbol;
    private final String name;
    private final int location;

    public Rock(int location) {
        this.symbol = 'R';
        this.name = "Rock";
        this.location = location;
    }

    public void draw() {
        System.out.print(symbol);
    }

}

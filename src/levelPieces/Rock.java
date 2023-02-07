package levelPieces;

import gameEngine.Drawable;

public class Rock implements Drawable {
    private char symbol;
    private String name;
    public Rock() {
        this.symbol = 'R';
        this.name = "Rock";
;
    }
    public void draw() {
        System.out.print(symbol);
    }

}

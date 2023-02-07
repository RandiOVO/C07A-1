package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

import java.util.ArrayList;

public class LevelSetup {
    private Drawable[] gameBoard;
    private ArrayList<GamePiece> gamePieces;
    private ArrayList<Moveable> movingPieces;

    public void createLevel(int levelNum) {
        switch (levelNum) {
            case 1:
                createLevel1();
                break;
            case 2:
                createLevel2();
                break;
            default:
                System.out.println("Invalid level number");
                System.exit(0);
        }
    }

    public ArrayList<GamePiece> getInteractingPieces() {
        return gamePieces;
    }

    public ArrayList<Moveable> getMovingPieces() {
        return movingPieces;
    }

    public Drawable[] getBoard() {
        return gameBoard;
    }

    public int getPlayerStartLoc() {
        return 1;
    }

    private void createLevel1() {
        gameBoard = new Drawable[GameEngine.BOARD_SIZE];

        Rock rock1 = new Rock();
        gameBoard[3] = rock1;

        Solider soilder1 = new Solider(3);
        gamePieces.add(soilder1);
        movingPieces.add(soilder1);

        Reward reward = new Reward(6);
        gamePieces.add(reward);


    }

    private void createLevel2() {
        
    }
}

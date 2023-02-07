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
        return 0;
    }

    private void createLevel1() {
        gameBoard = new Drawable[GameEngine.BOARD_SIZE];

        Rock rock1 = new Rock();
        gameBoard[3] = rock1;

        Solider soilder1 = new Solider(3);
        gamePieces.add(soilder1);
        movingPieces.add(soilder1);
        gameBoard[3] = soilder1;

        Reward reward = new Reward(6);
        gamePieces.add(reward);
        gameBoard[6] = reward;

        Trapdoor trap = new Trapdoor(5);
        gamePieces.add(trap);
        gameBoard[5] = trap;

    }

    private void createLevel2() {
        Rock rock1 = new Rock();
        gameBoard[3] = rock1;
        Rock rock2 = new Rock();
        gameBoard[5] = rock2;

        Assassin assassin = new Assassin(7);
        gameBoard[7] = assassin;
        movingPieces.add(assassin);
        gamePieces.add(assassin);

        Reward reward = new Reward(GameEngine.BOARD_SIZE - 1);
        gameBoard[GameEngine.BOARD_SIZE - 1] = reward;
        gamePieces.add(reward);

        Trapdoor trap = new Trapdoor(5);
        gameBoard[5] = trap;
        gamePieces.add(trap);

        Solider solider = new Solider(3);
        gameBoard[3] = solider;
        gamePieces.add(solider);
        movingPieces.add(solider);

        Dragonfly dragonfly = new Dragonfly(1);
        gameBoard[1] = dragonfly;
        gamePieces.add(dragonfly);
        movingPieces.add(dragonfly);


    }
}

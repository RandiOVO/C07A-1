package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

import java.util.ArrayList;
import java.util.Random;

public class LevelSetup {
    private final ArrayList<GamePiece> gamePieces = new ArrayList<GamePiece>();
    private final ArrayList<Moveable> movingPieces = new ArrayList<Moveable>();
    private Drawable[] gameBoard;

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
        Rock rock1 = new Rock(3);
        gameBoard[3] = rock1;

        Solider soilder1 = new Solider(6);
        gamePieces.add(soilder1);
        movingPieces.add(soilder1);
        gameBoard[3] = soilder1;
        int rewardIndex = GameEngine.BOARD_SIZE / 4 * 3;
        Reward reward = new Reward(rewardIndex);
        gamePieces.add(reward);
        gameBoard[rewardIndex] = reward;

        Trapdoor trap = new Trapdoor(GameEngine.BOARD_SIZE / 2);
        gamePieces.add(trap);
        gameBoard[GameEngine.BOARD_SIZE / 2] = trap;

        Assassin assassin = new Assassin(GameEngine.BOARD_SIZE - 1);
        gamePieces.add(assassin);
        movingPieces.add(assassin);
        gameBoard[GameEngine.BOARD_SIZE - 1] = assassin;

        Random rand = new Random(); // Randomly place a rock on an empty space
        int randIndex = rand.nextInt(GameEngine.BOARD_SIZE);
        while (gameBoard[randIndex] != null && randIndex != 0)
            randIndex = rand.nextInt(GameEngine.BOARD_SIZE);
        Rock rock2 = new Rock(randIndex);
        gameBoard[randIndex] = rock2;

    }

    private void createLevel2() {
        gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        Rock rock1 = new Rock(3);
        gameBoard[3] = rock1;
        Rock rock2 = new Rock(5);
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

        Random rand = new Random();
        int randIndex = rand.nextInt(GameEngine.BOARD_SIZE);
        // Generate a random index for a second trap door on an empty space
        while (gameBoard[randIndex] != null && randIndex != 0) // And not on the player's starting pos
            randIndex = rand.nextInt(GameEngine.BOARD_SIZE);
        Trapdoor trap2 = new Trapdoor(randIndex);
        gamePieces.add(trap2);
        gameBoard[randIndex] = trap2;

        // Randomly place an assassin
        while (gameBoard[randIndex] != null && randIndex != 0)
            randIndex = rand.nextInt(GameEngine.BOARD_SIZE);
        Assassin assassin2 = new Assassin(randIndex);
        gamePieces.add(assassin2);
        movingPieces.add(assassin2);
        gameBoard[randIndex] = assassin2;
    }
}

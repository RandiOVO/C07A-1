package tests;

import static org.junit.Assert.*;

import gameEngine.Player;
import levelPieces.Solider;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import org.junit.Test;

public class TestMovingPieces {

    @Test
    public void testSoliderMoving() {
        Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        Solider solider = new Solider(0);
        Player player = new Player(GameEngine.BOARD_SIZE - 1);
        solider.move(gameBoard, player.getLocation());
        assertEquals(solider.getLocation(), 0);
        solider.move(gameBoard, player.getLocation()); // Ensure the solider changes direction
        assertEquals(solider.getLocation(), 1);

        while (solider.getLocation() != GameEngine.BOARD_SIZE - 1)
            solider.move(gameBoard, player.getLocation());
        assertEquals(solider.getLocation(), GameEngine.BOARD_SIZE - 1);
        solider.move(gameBoard, player.getLocation());
        solider.move(gameBoard, player.getLocation()); // Ensure they turn around on the other side
        assertEquals(solider.getLocation(), GameEngine.BOARD_SIZE - 2);

    }
    
    @Test
    public void testAssassinMoving() {
    	
    	Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
        Assassin assassin = new Assassin(0);
        Player player = new Player(GameEngine.BOARD_SIZE - 1);
               
        int initialLocation = assassin.getLocation();
        assassin.move(gameBoard, initialLocation);
        int newLocation = assassin.getLocation();
        assertNotEquals(initialLocation, newLocation);
        assertEquals(assassin, gameBoard[newLocation]);
        
    }

}

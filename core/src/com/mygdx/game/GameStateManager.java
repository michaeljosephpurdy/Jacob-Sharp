package com.mygdx.game;

public class GameStateManager {
	private static GameState gameState;
	
	public static GameState getState() {
		return gameState;
	}
	
	public static void mainMenu() {
		gameState = GameState.MAINMENU;
	}
}

enum GameState {
	MAINMENU,
	PAUSE,
	PLAY,
	STOP
}
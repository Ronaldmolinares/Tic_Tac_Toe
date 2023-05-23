package model;

import Interface.GameFrame;

public class GameMode {

	private int size = 3;
	private int board [][] = new int [size][size];
	private int win = -1;
	private int count = 0;
	
	
	public GameMode() {
		startGame();
		count = 0;
	}
	
	public GameMode(GameFrame gameF) {
		
	}
	
	
	public int[][] getBoard(){
		return board;
	}
	
	// -1 -> Gana el PC
	//  0 -> Nadie Gana 
	//  1 -> Gana el Jugador

	
	private void startGame() {
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				board[row][column] = -1;		
			}	
		}
		win = -1;
	}
	
	
	public void clickButton(int row, int column){
		if (row >= 0 && row < size && column < size && board[row][column] == -1) {
			if (win == -1) {
				board[row][column] = 0;
				win = winGame();
				putTokenPC();
			}
		}
	}

	//	{0}{0} {0}{1} {0}{2} 
	//	{1}{0} {1}{1} {1}{2} 
	//	{2}{0} {2}{1} {2}{2} 

	//Metodo que establece las posibles maneras en que el jugador podría ganarle al PC
	private int winGame() {
		//validamos la primera diagonal
		if(board[0][0] != -1 && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
			return board[0][0];
		}
		//validamos la segunda diagonal
		if (board[0][2] != -1 && board[0][2] == board[1][1] && board[0][2] == board[2][0]){
			return board [0][0];
		}
		
		for (int i = 0; i < size; i++) {
			//validamos filas
			if (board[i][0] != -1 && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
				return board [i][0];
			}
			//validamos columnas
			if (board[0][i] != -1 && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
				return board [0][i];
			}
		}
		
		return -1;
	}
	
	
	public int getWin() {
		return win;
	}
	
	
	//Algoritmo PC (minimax)
	private boolean completeBoard() {
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < board.length; column++) {
				if (board[row][column] == -1) {
					return false;
				}
			}
		}
		return true;
	}
	
	//Si el tablero esta completo o si hay un ganador se finaliza el juego
	private boolean endGame() {
		return completeBoard() || winGame() != -1;
	}
	
	
	private void putTokenPC() {
		if (!endGame()) {
			int f = 0; 
			int c = 0;
			int v = Integer.MIN_VALUE;
			int aux;
			for (int row = 0; row < size; row++) {
				for (int column = 0; column < size; column++) {
					if (board[row][column] == -1) {
						board[row][column] = 1;
						aux = min();
						if (aux > v) {
							v = aux;
							f = row;
							c = column;
						}
						board[row][column] = -1;
					}
				}
			}
			board[f][c] = 1;
		}
		win = winGame();
		
	}

	
	//Cuando se va amaximar los valores será al momento de que el PC juegue
	//Al hacer esto va a intentar minimizar el valor valor para el jugador pueda ganar
	private int max() {
		if (endGame()) {
			if (winGame() != 1) {
				return -1;
			} else {
				return 0;
			}
		}
		int v = Integer.MIN_VALUE;
		int aux;
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				if (board[row][column] == -1) {
					board[row][column] = 1;
					aux = min();
					if (aux > v) {
						v = aux;
					}
					board[row][column] = -1;
				}
			}
		}
		return v;
	}
	
	
	//Cuando tire el jugador la PC va a intentar minimizar ese
	//valor para buscar un valor maximo con el cual poder ganar 
	private int min() {
		if (endGame()) {
			if (winGame() != 1) {
				return 1;
			} else {
				return 0;
			}
		}
		int v = Integer.MAX_VALUE;
		int aux;
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				if (board[row][column] == -1) {
					board[row][column] = 0;
					aux = max();
					if (aux < v) {
						v = aux;
					}
					board[row][column] = -1;
				}
			}
		}
		return v;
	}

}

import java.util.*;
class TicTacToe {
	TicTacToe() {
	}
	public static void main(String[] args) {
		Board br = new Board();
		GameLogic gl = new GameLogic();
		Scanner scn = new Scanner(System.in);
		br.Init();
		String Player_1,Player_2 = "Null";
		System.out.println("Select Player : \n1) X \n2) O");
		int ply = scn.nextInt();
		if (ply == 1) {
			Player_2 = "O";
			Player_1 = "X";
		} 
		else {
			Player_1 = "O";
			Player_2 = "X";
		}
		System.out.println("Game Starts :");
		br.printBoard();
		String[][] tempBoard = new String[3][3];
		int inp = 0, move = 0;
		boolean gameRunning = true , PLAYER_1_PLAYS = true;
		while (gameRunning) {
			tempBoard = br.getBoard();
			if (!gl.checkWin(tempBoard) && move < 9) {
				if (PLAYER_1_PLAYS) {
					inp = scn.nextInt();
					br.setBoard(gl.getX(inp), gl.getY(inp), Player_1);
					br.printBoard();
					PLAYER_1_PLAYS = false;
					move = move + 1;
				} 
				else {
					inp = scn.nextInt();
					br.setBoard(gl.getX(inp), gl.getY(inp), Player_2);
					br.printBoard();
					PLAYER_1_PLAYS = true;
					move = move + 1;
				}
			} 
			else {
				if (move == 9) {
					System.out.println("Draw");
					gameRunning = false;

				} 
				else {
					if (!PLAYER_1_PLAYS) {
						System.out.println(Player_1 + " wins");
					} else {
						System.out.println(Player_2 + " wins");
					}
					gameRunning = false;
				}
			}
		}
		scn.close();
	}
}
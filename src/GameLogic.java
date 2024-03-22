class GameLogic extends TicTacToe {
	 boolean checkWin(String[][] brd){
		return checkHorizon(brd) ? true : checkVertic(brd) ? true : checkDiag(brd) ? true : false;
	 }
	boolean checkHorizon(String[][] brd) {
		for(int k = 0;k<3;k++){
			if(brd[0][k].equals(brd[1][k]) && brd[0][k].equals(brd[2][k])&& brd[0][k] != "."){
				return true;
			}
		}
		return false;
	}
	boolean checkVertic(String[][] brd) {		
		for(int k = 0;k<3;k++){
			if(brd[k][0].equals(brd[k][1]) && brd[k][0].equals(brd[k][2]) && brd[k][0] != "." ){
				return true;
			}
		}
		return false;
	}
	 boolean checkDiag(String[][] brd){
		return (brd[0][0] == brd[1][1] && brd[0][0] == brd[2][2] && brd[0][0] != ".") ? true : (brd[0][2] == brd[1][1] && brd[0][2] == brd[2][0] && brd[0][2] != ".") ? true :false;
	 }
	 int getX(int x) {
		return (x >= 1 && x <= 3) ? 0 : (x >= 4 && x <= 6) ? 1 : (x >= 7 && x <= 9) ? 2 : 9999;
	}
	int getY(int x) {
		return (x == 1 || x == 4 || x == 7) ? 0 : (x == 2 || x == 5 || x == 8) ? 1 : (x == 3 || x == 6 || x == 9) ? 2 : 9999;
	}
}
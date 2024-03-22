class Board extends TicTacToe {
	private String[][] br = new String[3][3];

	void Init(){
		for(int i = 0; i < 3 ; i++)
		{
			for(int j = 0; j < 3 ; j++)
			{
				br[i][j] = ".";
			}
		}
	}
	void printBoard(){
		System.out.println("+---++---++---+");
		for(int i = 0; i < 3 ; i++)
		{
			for(int j = 0; j < 3 ; j++)
			{
				System.out.print("| " + br[i][j]+  " |");
			}
			System.out.println("");
			System.out.println("+---++---++---+");
		}
	}
	String[][] getBoard(){
		return br;
	}
	void setBoard(int x, int y , String setString){
		br[x][y] = setString;
	}
}
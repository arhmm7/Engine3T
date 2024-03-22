class GameLogic extends TicTacToe {
	GameLogic(){
	}
	 boolean checkWin(String[][] brd){
	 	for(int i = 0 ; i < 3 ; i++){
	 		for(int j = 0 ; j < 3 ; j++){
		 		if(brd[i][j] != "."){
		 			if(checkHorizon(i,j,brd)){
			 			return true;
			 		}
			 		else if(checkVertic(i,j,brd)){
			 			return true;
			 		}
			 		else if(checkDiag(i,j,brd)){
			 			return true;
			 		}
			 		else{
			 			return false;
			 		}
		 		}
		 	}
	 	}
	 	return false;
	 }
	 boolean checkHorizon(int i , int j , String[][] brd ){
	 	if(i == 0){
	 		if(brd[i][j] == brd[i+1][j] && brd[i][j] == brd[i+2][j])
	 		{
	 			return true;
	 		}
	 	}
	 	if(i == 2){
	 		if(brd[i][j] == brd[i+1][j] && brd[i][j] == brd[i-1][j])
	 		{
	 			return true;
	 		}
	 	}
	 	if(i == 3){
	 		if(brd[i][j] == brd[i-1][j] && brd[i][j] == brd[i-2][j])
	 		{
	 			return true;
	 		}
	 	}
	 	return false;
	 }
	 boolean checkVertic(int i , int j , String[][] brd){
	 	if(j == 0){
	 		if(brd[i][j] == brd[i][j+1] && brd[i][j] == brd[i][j+2])
	 		{
	 			return true;
	 		}
	 	}
	 	if(j == 2){
	 		if(brd[i][j] == brd[i][j+1] && brd[i][j] == brd[i][j-1])
	 		{
	 			return true;
	 		}
	 	}
	 	if(j == 3){
	 		if(brd[i][j] == brd[i][j-1] && brd[i][j] == brd[i][j-2])
	 		{
	 			return true;
	 		}
	 	}
	 	return false;
	 }
	 boolean checkDiag(int i, int j ,String[][] brd){
	 	if(i==0 && j==0){
	 		if(brd[i][j] == brd[i+1][j+1] && brd[i][j] == brd[i+2][j+2])
	 		{
	 			return true;
	 		}
	 	}
	 	if(i==0 && j==2){
	 		if(brd[i][j] == brd[i-1][j+1] && brd[i][j] == brd[i-2][j+2])
	 		{
	 			return true;
	 		}
	 	}
	 	return false;
	 }
	 int getX(int x){
	 	if(x==1 || x==2 || x==3){
	 		return 0;
	 	}
	 	if(x==4 || x==5 || x==6){
	 		return 1;
	 	}
	 	if(x==7 || x==8 || x==9){
	 		return 2;
	 	}
	 	return 9999;
	 }
	 int getY(int x){
	 	if(x==1 || x==4 || x==7){
	 		return 0;
	 	}
	 	if(x==2 || x==5 || x==8){
	 		return 1;
	 	}
	 	if(x==3 || x==6 || x==9){
	 		return 2;
	 	}
	 	return 9999;
	 }
}
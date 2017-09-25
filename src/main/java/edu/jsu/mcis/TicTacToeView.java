package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
		int rowcount = 0;
		System.out.println("  012\n");
		for(int row = 0; row < model.getWidth(); row++){
			System.out.print(rowcount + " ");
			rowcount++;
			for(int col = 0; col < model.getWidth(); col++){
				if(model.getMark(row,col) == TicTacToeModel.Mark.EMPTY){
					System.out.print("-");
				}
				if(model.getMark(row,col) == TicTacToeModel.Mark.X){
					System.out.print("X");
				}
				if(model.getMark(row,col) == TicTacToeModel.Mark.O){
					System.out.print("O");
				}
			}
			System.out.println("");
		}
		rowcount = 0;
	}

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

		if(model.isXTurn()){
			System.out.println("Player X, enter your move");
		}
		else{
			System.out.println("Player O, enter your move");
		}

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

		System.out.println("Invalid Location");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + " is the winner!");

    }
	
}
package se.iths.gameOfLife;
import se.iths.gameOfLife.Cell.cellState;

public class Universe {

    private Cell [][] state;



    public Universe(cellState [][] cellStates){
        state = new Cell[cellStates.length][];

        for (int row = 0; row < cellStates.length; row++) {
            state[row] = new Cell[cellStates[row].length];
            for (int col = 0; col < cellStates[row].length; col++) {
                state[row][col] = new Cell(cellStates[row][col]);
            }
        }
    }



    public cellState[][] getState() {
        Cell.cellState[][] cellStates = new Cell.cellState[state.length][];

        for (int row = 0; row < state.length; row++) {
            cellStates[row] = new Cell.cellState[state[row].length];
            for (int col = 0; col < state[row].length; col++) {
                cellStates[row][col] = state[row][col].getState();
            }
        }
        return cellStates;
    }
}

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

    public void update() {
        for (int row = 0; row < state.length; row++){
            for (int col = 0; col < state[row].length; col++){
                int numberOfAliveNeighbours = getNumberOfAliveNeighbours(row,col);
                state[row][col].update(0);
            }
        }
    }

    private int getNumberOfAliveNeighbours(int row,int col) {
        int numberOfAliveNeighbours = 0;
        if(row > 0){
            int rowAbove = row -1;
            if(col > 0){
                if (state[rowAbove][col -1].getState() == cellState.ALIVE) numberOfAliveNeighbours ++;
            }
            if (state[rowAbove][col].getState() == cellState.ALIVE) numberOfAliveNeighbours ++;
            if (col < state[row].length -1){
                if (state[rowAbove][col + 1].getState() == cellState.ALIVE) numberOfAliveNeighbours ++;
            }
        }

        if(col > 0){
            if (state[row][col -1].getState() == cellState.ALIVE) numberOfAliveNeighbours ++;
        }
        if (col < state[row].length -1){
            if (state[row][col + 1].getState() == cellState.ALIVE) numberOfAliveNeighbours ++;
        }

            if(row < state.length -1){
                int rowBelow = row +1;
                if(col > 0){
                    if (state[rowBelow][col -1].getState() == cellState.ALIVE) numberOfAliveNeighbours ++;
                }
                if (state[rowBelow][col].getState() == cellState.ALIVE) numberOfAliveNeighbours ++;
                if (col < state[row].length -1){
                    if (state[rowBelow][col + 1].getState() == cellState.ALIVE) numberOfAliveNeighbours ++;
                }
            }
         return numberOfAliveNeighbours;
    }
}

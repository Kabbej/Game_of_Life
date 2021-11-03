package se.iths.gameOfLife;

public class Cell {

    private CellState state;

    public Cell(CellState state){
        this.state = state;
    }

    public CellState getState() {
        return state;
    }


    public enum CellState {
        DEAD,ALIVE
    }

    public void update (int i) {
        if (state == CellState.ALIVE) {
            state = i > 1 && i < 4 ? CellState.ALIVE : CellState.DEAD;
        } else {
            state = i == 3 ? CellState.ALIVE : CellState.DEAD;
        }
    }


}

package se.iths.gameOfLife;

public class Cell {

    private cellState state;

    public Cell(cellState state){
        this.state = state;
    }

    public cellState getState() {
        return state;
    }


    public enum cellState {
        DEAD,ALIVE
    }

    public void update (int i) {
        if (state == cellState.ALIVE) {
            state = i > 1 && i < 4 ? cellState.ALIVE : cellState.DEAD;
        } else {
            state = i == 3 ? cellState.ALIVE : cellState.DEAD;
        }
    }


}

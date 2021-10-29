public class Cell {

    private CellState state;

    public Cell(CellState state){
        this.state = state;
    }

    public enum CellState {
        DEAD,ALIVE
    }

    public CellState getNextGeneration(int i) {
        if (state == CellState.ALIVE) {
            return i > 1 && i < 4 ? CellState.ALIVE : CellState.DEAD;
        }
        else {
            return i == 3 ? CellState.ALIVE : CellState.DEAD;
        }
    }


}

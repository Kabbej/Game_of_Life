public class Cell {

    private CellState state;

    public Cell(CellState state){
        this.state = state;
    }

    public enum CellState {
        DEAD,ALIVE
    }

    public CellState getNextState(int i) {
        return CellState.DEAD;
    }


}

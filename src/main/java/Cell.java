public class Cell {

    private CellState state;

    public Cell(CellState state){
        this.state = state;
    }

    public enum CellState {
        DEAD,ALIVE
    }

    public CellState getNextGeneration(int i) {
        return i > 1 && i <4 ?  CellState.ALIVE : CellState.DEAD;
    }


}

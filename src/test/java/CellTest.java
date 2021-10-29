
/*
1.  Any live cell with fewer than two live neighbors dies, as if caused by under population.
2.  Any live cell with two or three live neighbors lives on to the next generation.
3.  Any live cell with more than three live neighbors dies, as if by overpopulation.
4.  Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
   */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CellTest {

    @Test
    public void aliveCellWithOnlyOneNeighbourShouldDie(){
        Cell changingCell = new Cell(Cell.CellState.ALIVE);

        Cell.CellState actual = changingCell.getNextGeneration(1);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void aliveCellWithZeroNeighboursShouldDie(){
        Cell changingCell = new Cell(Cell.CellState.ALIVE);

        Cell.CellState actual = changingCell.getNextGeneration(0);
        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void aliveCellWithTwoNeighboursShouldLive(){
        Cell changingCell = new Cell(Cell.CellState.ALIVE);

        Cell.CellState actual = changingCell.getNextGeneration(2);

        assertEquals(Cell.CellState.ALIVE, actual);
    }

    @Test
    public void aliveCellWithThreeNeighboursShouldLive(){
        Cell changingCell = new Cell(Cell.CellState.ALIVE);

        Cell.CellState actual = changingCell.getNextGeneration(3);

        assertEquals(Cell.CellState.ALIVE, actual);
    }

    @Test
    public void aliveCellWithFourNeighboursShouldDie(){
        Cell changingCell = new Cell(Cell.CellState.ALIVE);

        Cell.CellState actual = changingCell.getNextGeneration(4);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void aliveCellWithFiveNeighboursShouldDie(){
        Cell changingCell = new Cell(Cell.CellState.ALIVE);

        Cell.CellState actual = changingCell.getNextGeneration(5);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void aliveCellWithSixNeighboursShouldDie(){
        Cell changingCell = new Cell(Cell.CellState.ALIVE);

        Cell.CellState actual = changingCell.getNextGeneration(6);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void aliveCellWithSevenNeighboursShouldDie(){
        Cell changingCell = new Cell(Cell.CellState.ALIVE);

        Cell.CellState actual = changingCell.getNextGeneration(7);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void aliveCellWithEightNeighboursShouldDie(){
        Cell changingCell = new Cell(Cell.CellState.ALIVE);

        Cell.CellState actual = changingCell.getNextGeneration(8);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void deadCellWithThreeNeighboursShouldBecomeAlive(){
        Cell changingCell = new Cell(Cell.CellState.DEAD);

        Cell.CellState actual = changingCell.getNextGeneration(3);

        assertEquals(Cell.CellState.ALIVE, actual);
    }

    @Test
    public void deadCellWithZeroNeighboursShouldStayDead(){
        Cell cell = new Cell(Cell.CellState.DEAD);

        Cell.CellState actual = cell.getNextGeneration(0);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void deadCellWithOneNeighbourShouldStayDead(){
        Cell cell = new Cell(Cell.CellState.DEAD);

        Cell.CellState actual = cell.getNextGeneration(1);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void deadCellWithTwoNeighbourShouldStayDead(){
        Cell cell = new Cell(Cell.CellState.DEAD);

        Cell.CellState actual = cell.getNextGeneration(2);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void deadCellWithFourNeighbourShouldStayDead(){
        Cell cell = new Cell(Cell.CellState.DEAD);

        Cell.CellState actual = cell.getNextGeneration(4);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void deadCellWithFiveNeighbourShouldStayDead(){
        Cell cell = new Cell(Cell.CellState.DEAD);

        Cell.CellState actual = cell.getNextGeneration(5);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void deadCellWithSixNeighbourShouldStayDead(){
        Cell cell = new Cell(Cell.CellState.DEAD);

        Cell.CellState actual = cell.getNextGeneration(6);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void deadCellWithSevenNeighbourShouldStayDead(){
        Cell cell = new Cell(Cell.CellState.DEAD);

        Cell.CellState actual = cell.getNextGeneration(7);

        assertEquals(Cell.CellState.DEAD, actual);
    }

    @Test
    public void deadCellWithEightNeighbourShouldStayDead(){
        Cell cell = new Cell(Cell.CellState.DEAD);

        Cell.CellState actual = cell.getNextGeneration(8);

        assertEquals(Cell.CellState.DEAD, actual);
    }

}

package ru.job4j.chess.firuges.black;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bs = new BishopBlack(Cell.B1);
        Cell expected = bs.position();
        assertThat(expected, is(Cell.B1));
    }

    @Test
    public void copy() {
        BishopBlack bs = new BishopBlack(Cell.B1);
        Cell expected = bs.copy(Cell.G4).position();
        assertThat(expected, is(Cell.G4));
    }

    @Test
    public void way() {
        BishopBlack bs = new BishopBlack(Cell.C1);
        Cell[] expected = bs.way(Cell.G5);
        Cell[] rsl = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, rsl);
    }

    @Test
    public void noWay() throws ImpossibleMoveException {
        BishopBlack bs = new BishopBlack(Cell.C1);
        try {
            bs.way(Cell.G4);
        } catch (ImpossibleMoveException thrown) {
        assertThat(thrown.getMessage(), is("Could not way by diagonal from C1 to G4"));
        }
    }

    @Test
    public void isDiagonal() {
        BishopBlack bs1 = new BishopBlack(Cell.B1);
        assertTrue(bs1.isDiagonal(Cell.B1, Cell.F5));
    }
}
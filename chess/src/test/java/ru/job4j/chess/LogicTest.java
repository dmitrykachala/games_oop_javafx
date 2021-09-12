package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void moveFNFE() throws FigureNotFoundException, OccupiedCellException,
            ImpossibleMoveException {
        Logic logic = new Logic();
        BishopBlack bsb = new BishopBlack(Cell.C2);
        logic.add(new BishopBlack(Cell.C2));
        logic.move(Cell.C1, Cell.G6);
        bsb.position();
    }

    @Test(expected = OccupiedCellException.class)
    public void moveOCE()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C2));
        logic.add(new BishopBlack(Cell.F5));
        logic.move(Cell.C2, Cell.G6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void moveIME() throws FigureNotFoundException, OccupiedCellException,
            ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C2));
        logic.move(Cell.C2, Cell.D2);
    }
}
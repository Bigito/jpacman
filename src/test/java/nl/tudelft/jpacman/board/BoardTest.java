package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
/**
     * ?
     */
public class BoardTest {
    // this is a test
    @Test
    void  test() {
        BasicSquare basicSquare = new BasicSquare();
        BasicSquare[][] grid  = {{basicSquare}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
    }
    // this is a test
    @Test
    void  test2() {
        BasicSquare basicSquare = new BasicSquare();
        BasicSquare[][] grid  = {{basicSquare},{null}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isFalse();
        assertThat(board.squareAt(1,0)).isNull();
    }

}

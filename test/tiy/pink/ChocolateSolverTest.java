package tiy.pink;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fenji on 8/24/2016.
 */
public class ChocolateSolverTest {
    ChocolateSolver solver;
    @Before
    public void setUp() throws Exception {
        solver = new ChocolateSolver();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testEnoughSmallsNoBigs() throws Exception {
        int numSmalls = solver.makeChocolate(12, 0, 7);
        assertEquals(7, numSmalls);
    }

    @Test
    public void testEnoughBigsNoSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(0, 2, 10);
        assertEquals(0, numSmalls);
    }

    @Test
    public void testNoSmallsNoBigs() throws Exception {
        int numSmalls = solver.makeChocolate(0, 0, 10);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void testEnoughBigsEnoughSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(2, 2, 12);
        assertEquals(2, numSmalls);
    }

    @Test
    public void testNegativeBigs() throws Exception {
        int numSmalls = solver.makeChocolate(0, -2, 10);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void testNegativeSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(-2, 0, 2);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void testNegativeGoal() throws Exception {
        int numSmalls = solver.makeChocolate(0, 0, -2);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void testNegativeSmallsNegativeBigs() throws Exception {
        int numSmalls = solver.makeChocolate(-2, -2, 12);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void testNegativeAll() throws Exception {
        int numSmalls = solver.makeChocolate(-2, -2, -12);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void testExcessSmallsEnoughBigs() throws Exception {
        int numSmalls = solver.makeChocolate(20, 2, 12);
        assertEquals(2, numSmalls);
    }

    @Test
    public void test() throws Exception {
        int numSmalls = solver.makeChocolate(15, 5, 24);
        assertEquals(4, numSmalls);
    }

    @Test
    public void testExcessBigsEnoughSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(2, 20, 12);
        assertEquals(2, numSmalls);
    }
}
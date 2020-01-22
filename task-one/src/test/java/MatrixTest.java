import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;


@RunWith(JUnit4.class)
public class MatrixTest {
    @Test
    public void two() {

        double[][] two = {{22, 56}, {7, 78}};
        double[][] four = {{1, 2, 3, 4}, {1, 3, 5, 6}, {9, 8, 7, 6}, {0, 2, 6, 4}};

        double[][] twoReverted = {{22, 7}, {56, 78}};

        assertArrayEquals(twoReverted, Matrix.matrixRevert(two));

    }

    @Test
    public void three() {
        double[][] three = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] threeReverted = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assertArrayEquals(threeReverted, Matrix.matrixRevert(three));
    }


}
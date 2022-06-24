package ru.vsu.cs.kunakhova_a_y;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.kunakhova_a_y.bst.SimpleBSTree;

public class FindMinValueTest {

    SimpleBSTree<Double> tree = new SimpleBSTree<>(Double::parseDouble);

    @Test
    public void testFindMin1() throws Exception {
        tree.fromBracketNotation("74.71 (30.33 (0.95 (0.23, 15.79 (10.17 (1.0 (, 8.57 (4.01))), 18.01 (, 20.67)))," +
                " 69.13 (39.55 (31.41, 51.25 (42.8 (, 43.12), 52.35 (, 60.2 (, 66.15)))), 72.04)), 96.85 (77.89 (75.22, 90.96 " +
                "(83.49 (, 90.54 (90.19 (84.89))), 94.96))))");

        double factualResult = BinaryTreeAlgorithms.findMinValue(tree);

        double expectedResult = 0.23;

        Assert.assertEquals(expectedResult, factualResult, 0);
    }

    @Test
    public void testFindMin2() throws Exception {
        tree.fromBracketNotation("55.11 (20.66 (2.94 (, 6.28 (5.95 (4.06), 6.34 (, 17.09 (8.08)))), 48.51 (33.12" +
                " (20.72 (, 27.45), 36.61), 50.88 (49.31, 50.98))), 93.11 (60.22 (56.21, 74.32 (71.64, 85.78 (77.79 (76.14 " +
                "(75.47), 79.87), 86.26))), 97.86 (94.42)))");

        double factualResult = BinaryTreeAlgorithms.findMinValue(tree);

        double expectedResult = 2.94;

        Assert.assertEquals(expectedResult, factualResult, 0);
    }

    @Test
    public void testFindMin3() throws Exception {
        tree.fromBracketNotation("23.53 (10.0 (, 12.71 (, 13.84 (, 20.93 (17.69)))), 29.65 (26.1 (24.14, 28.3)," +
                " 60.94 (39.36 (36.69, 59.81 (58.92 (45.41 (41.03)))), 96.88 (72.67 (66.29, 96.31 (87.12 (77.58 (, 82.78 " +
                "(, 85.81)), 93.21 (92.22, 95.97 (95.93 (93.64))))))))))");

        double factualResult = BinaryTreeAlgorithms.findMinValue(tree);

        double expectedResult = 10;

        Assert.assertEquals(expectedResult, factualResult, 0);
    }
}
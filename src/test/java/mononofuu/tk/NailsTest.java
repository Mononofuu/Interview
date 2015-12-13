package mononofuu.tk;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * created by Alekseichenko Sergey <mononofuu@gmail.com>
 */
public class NailsTest extends TestCase {
    int[] A;

    public void setUp() throws Exception {
        A = new int[]{1, 1, 3, 3, 3, 4, 5, 5, 5, 5};
    }

    public void testSolution() throws Exception {
        Assert.assertEquals(Nails.solution(A,2),5);
    }
}
package mononofuu.tk;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * created by Alekseichenko Sergey <mononofuu@gmail.com>
 */
public class StackMachineTest extends TestCase {

    public void testSolution() throws Exception {
        StackMachine stackMachine = new StackMachine();
        Assert.assertEquals(stackMachine.solution("13+62*7+*"), 76);
    }
}
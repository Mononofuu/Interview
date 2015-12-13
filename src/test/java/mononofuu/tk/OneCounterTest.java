package mononofuu.tk;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * created by Alekseichenko Sergey <mononofuu@gmail.com>
 */
public class OneCounterTest extends TestCase {

    public void testCount() throws Exception {
        Assert.assertEquals(OneCounter.count(3),2);
    }
}
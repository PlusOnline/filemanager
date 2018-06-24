package test.java;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void shouldGet2WhenGiven1and1() {
        Assert.assertEquals(2,1+1);
    }
}

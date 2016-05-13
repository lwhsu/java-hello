package org.lwhsu.test.hello;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class helloTest {

    @Test
    public void testHello() {
        Assert.assertEquals(Hello.hello(), "Hello World!");
    }
}

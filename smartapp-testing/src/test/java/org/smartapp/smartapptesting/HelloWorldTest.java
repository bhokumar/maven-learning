package org.smartapp.smartapptesting;


import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testHello() {
        HelloWorld helloWorld = new HelloWorld();
        assert("Hello World".equals(helloWorld.getHello()));
    }
}

package org.smartapp.smartapptesting;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testHello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.getHello());
    }
}

package org.smartapp.smartapptesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Junit5HelloTest {

    @Test
    public void helloWord() {
        HelloWorld helloWorld = new HelloWorld();
        Assertions.assertEquals("Hello World", helloWorld.getHello());
    }
}

package org.smartapp.smartapptesting

import org.junit.Assert
import org.junit.Test

class HelloWorldTest {

    @Test
    void getHelloTest() {
        HelloWorld helloWorld = new HelloWorld()
        Assert.assertEquals("Hello World", helloWorld.getHello())
    }
}

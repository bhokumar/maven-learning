package org.smartapp;

import org.junit.Test;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {
        System.out.println("##############################");
        System.out.println(System.getenv("TEST_HOST"));
    }
}

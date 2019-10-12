package org.smartapp

import spock.lang.Specification

class HelloWorldSpockTest extends Specification{
    def getHello() {
        when:
        def foo = "123"

        then:
        true
    }
}

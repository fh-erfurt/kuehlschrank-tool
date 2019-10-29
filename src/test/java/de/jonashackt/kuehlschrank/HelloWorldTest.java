package de.jonashackt.kuehlschrank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void check_if_Hello_World_is_returned() {
        // Given
        HelloWorld helloWorld = new HelloWorld();

        // When
        String hello = helloWorld.returnHelloWorld();

        // Then
        assertEquals("Hello FH-Erfurt!", hello);
    }
}

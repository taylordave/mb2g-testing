package guru.springframework;

import static org.junit.Assert.assertEquals;

class JavaHelloWorld5Test {

    @org.junit.jupiter.api.Test
    void getHello() {
        JavaHelloWorld helloWorld = new JavaHelloWorld();

        assertEquals("Hello World", helloWorld.getHello());
    }
}

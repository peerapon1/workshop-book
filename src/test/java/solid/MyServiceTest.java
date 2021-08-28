package solid;

import org.junit.jupiter.api.Test;

import  java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MyServiceTest {

    @Test
    void generateUUID() {
        Random random = new Random();
        MyService myService = new MyService();
        assertEquals("DEMO7", myService.generateUUID());
    }
}
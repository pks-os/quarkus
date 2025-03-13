package com.example;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class Ano {
    @Inject
    MyBean bean;

    @Test
    public void test() {
        assertEquals("hello", bean.hello());
    }
}

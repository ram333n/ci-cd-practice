package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValueTest {

  @Test
  void testCtorAndGetter() {
    int expected = 42;
    Value value = new Value(42);

    assertEquals(expected, value.getValue());
  }
}
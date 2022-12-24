package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

  @Test
  void testUser() {
    String expectedName = "Name";
    int expectedAge = 42;
    User user = new User("Name", 42);

    assertEquals(expectedName, user.getName());
    assertEquals(expectedAge, user.getAge());
  }
}
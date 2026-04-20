//Verified JUnit 5 Tests
package com.chatapp.poe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test; 


public class LoginTest {
    
    Login login = new Login();

    @Test
    public void testCheckUserNameCorrect() {
        // Test with a correct username (contains _ and <= 5 chars)
        assertTrue(login.checkUserName("kyl_1"));
    }

    @Test
    public void testCheckUserNameIncorrect() {
        // Test with an incorrect username (no underscore or too long)
        assertFalse(login.checkUserName("kyle"));
    }

    @Test
    public void testPasswordComplexitySuccess() {
        // Test with complex password
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testPasswordComplexityFailure() {
        // Test with a weak password
        assertFalse(login.checkPasswordComplexity("password"));
    }
}
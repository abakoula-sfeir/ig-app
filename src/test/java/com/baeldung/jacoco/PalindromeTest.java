package com.baeldung.jacoco;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {

    @Test
    public void whenEmptyString_thenAccept() throws Exception {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome(""));
    }

    @Test
    public void whenPalindrom_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }

    @Test
    public void whenNearPalindrom_thanReject() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("neon"));
    }
}

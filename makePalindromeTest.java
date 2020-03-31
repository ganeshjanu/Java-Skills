package com.day1;

import org.ietf.jgss.ChannelBinding;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class makePalindromeTest {
    /* @Test
        void makePalind() {
        }
    */
   @Test
    public void testStr_WithFirst_Character() {
        String inputStr = "abccb";
       assertTrue(makePalindrome.makePalind(inputStr).equals("bccb"));
        //Assert.equals("bccb”,makePalindrome.makePalind(inputStr)));
    }
     @Test
   public void testStr_WithLast_Character() {
        String inputStr = "bccba";
         assertTrue(makePalindrome.makePalind(inputStr).equals("bccb"));
    }
    @Test
    public void testStr_WithFront_Character() {
        String inputStr = "baccb";
        assertTrue(makePalindrome.makePalind(inputStr).equals("bccb"));
    }

    @Test
    public void testStr_WithLastPart_Character() {
        String inputStr = "bccab";
        assertTrue(makePalindrome.makePalind(inputStr).equals("bccb"));
    }
    @Test
    public void testStr_WithMiddle_Character() {
        String inputStr = "bcaccb";
        assertTrue(makePalindrome.makePalind(inputStr).equals("bcccb"));
    }
    @Test
    public void testStr_With_ActualPalindrome() {
        String inputStr = "bcccb";
        assertTrue(makePalindrome.makePalind(inputStr).equals("bcccb"));
    }
    @Test
    public void testStr_With_CantMakePalindrome() {
        String inputStr = "bccsdgrertcb";
        assertTrue(makePalindrome.makePalind(inputStr).equals("bccsdgrertcb"));
    }
}
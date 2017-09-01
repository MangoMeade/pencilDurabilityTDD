package com.aim;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//To run class in the command line type: mvn clean test -Dtest=com.aim.PencilTest.java
//To run test method in the commandline type: mvn clean test -Dtest=com.aim.PencilTest.java#methodName

public class PencilTest {
    StringBuilder text = new StringBuilder();

    //Test checks how many characters were appended to a text.
    @Test
    public void writeTest(){
        String textBefore = "She sells sea shells";
        String textAfter = " down by the sea shore";
        text.append(textBefore);

        Pencil pencil = new Pencil();
        int expected = pencil.testWriteText(text, textAfter);

        assertEquals("Expected and actual values don't match", expected, 22);
        System.out.println("Write Test passed, appended text length is: \n" + expected);
        System.out.println("Full text is: \n" + text);
    }

    //Test counts how many letters were written(this method follows the convention that lowercase letters have a value of one
    //and uppercase letters have a value of two.
    @Test
    public void countLettersTest(){
        String textBefore = "Fly me ";
        String textAfter = " TO THE moon";
        text.append(textBefore);

        Pencil pencil = new Pencil();
        int countLetters = pencil.countLetters(textAfter);

        assertEquals("Expected and actual values don't match", countLetters, 14);
        System.out.println("Count Letters Test passed, number of letters written is " +
                "(lowercase letter value is one, uppercase letter value is two: \n" + countLetters);

    }
}

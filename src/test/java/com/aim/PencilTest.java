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
        String textBeforeWriting = "She sells sea shells";
        String textToBeWritten = " down by the sea shore";
        text.append(textBeforeWriting);

        Pencil pencil = new Pencil();
        int expected = pencil.testWriteText(text, textToBeWritten);

        assertEquals("Expected and actual values don't match", expected, 22);
        System.out.println("Write Test passed, appended text length is: \n" + expected);
        System.out.println("Full text is: \n" + text);
    }

    //Test counts how many letters were written(this method follows the convention that lowercase letters have a value of one
    //and uppercase letters have a value of two.
    @Test
    public void countLettersTest(){
        String textBeforeWriting = "Fly me ";
        String textToBeWritten = " TO THE moon";
        text.append(textBeforeWriting);

        Pencil pencil = new Pencil();
        int countLetters = pencil.countLetters(textToBeWritten);

        assertEquals("Expected and actual values don't match", countLetters, 14);
        System.out.println("Count Letters Test passed, number of letters written is " +
                "(lowercase letter value is one, uppercase letter value is two: \n" + countLetters);

    }

    //Test writes test and displays the point durability after writing
    @Test
    public void writeAndChangePointDurabilityTest(){
        String textBeforeWriting = "She sells sea shells";
        String textToBeWritten = " down BY THE sea";
        text.append(textBeforeWriting);

        Pencil pencil = new Pencil(30);
        pencil.writeText(text, textToBeWritten).toString();
        int pointDurability = pencil.getPointDurability();

        assertEquals("Expected and actual values don't match", pointDurability, 13);
        System.out.println("Change Point Durability Test passed, pencil wrote: \n" + text.substring(textBeforeWriting.length()));
        System.out.println("Point Durability after writing is: \n" + pointDurability);
    }
}

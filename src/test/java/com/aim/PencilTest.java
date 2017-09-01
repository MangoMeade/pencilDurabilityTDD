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
                "(assuming lowercase letter value is one, uppercase letter value is two: \n" + countLetters);

    }

    //Test writes text and displays the point durability after writing
    @Test
    public void writeTextAndChangePointDurabilityTest(){
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

    //Test writes text longer than pencil point durability.
    //Because point durability gets to zero before all letters are written,
    //the last characters are not written as letters but as whitespace.
    @Test
    public void writeTextAndExceedPointDurabilityTest(){
        String textBeforeWriting = "She sells sea shells";
        String textToBeWritten = " down BY THE sea";
        text.append(textBeforeWriting);

        Pencil pencil = new Pencil(15);
        String writtenText = pencil.writeText(text, textToBeWritten).toString();
        int pointDurability = pencil.getPointDurability();

        assertEquals("Expected and actual values don't match", writtenText, "She sells sea shells down BY THE s  ");
        System.out.println("Change Point Durability Test passed, pencil wrote: \n" + text.substring(textBeforeWriting.length()));
        System.out.println("Point Durability after writing is: \n" + pointDurability);
    }

    //Test checks that the sharpenPencil method restores point durability to its initial value
    @Test
    public void sharpenPencilTest(){
        String textBeforeWriting = "Fly me ";
        String textToBeWritten = "to the moon";
        text.append(textBeforeWriting);

        Pencil pencil = new Pencil(9, 1);
        pencil.writeText(text, textToBeWritten).toString();
        pencil.sharpenPencil();
        int pointDurability = pencil.getPointDurability();

        assertEquals("Expected and actual values don't match", pointDurability, 9);
        System.out.println("Full text is: \n" + text);
        System.out.println("Restore Point Durability Test passed, point durability is: \n" + pointDurability);
    }

    //Test checks that the sharpening limit decreases after sharpening the pencil
    @Test
    public void sharpeningLimitTest(){
        String textBeforeWriting = "Fly me ";
        String textToBeWritten = "to the moon";
        text.append(textBeforeWriting);

        Pencil pencil = new Pencil(9, 2);
        pencil.writeText(text, textToBeWritten).toString();
        pencil.sharpenPencil();
        int sharpeningLimit = pencil.getSharpeningLimit();

        assertEquals("Expected and actual values don't match", sharpeningLimit, 1);
        System.out.println("Full text is: \n" + text);
        System.out.println("New sharpening limit is: \n" + sharpeningLimit);
    }
}

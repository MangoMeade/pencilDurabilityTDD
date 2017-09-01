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
}

package com.aim;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EraserTest {
    StringBuilder text = new StringBuilder();

    @Before
    public void setUp(){
        String textBeforeWriting = "She sells ";
        String textToBeWritten = "Sea shells sells";
        text.append(textBeforeWriting);

        Pencil pencil = new Pencil(15);
        pencil.writeText(text, textToBeWritten).toString();
    }
    //Test checks that the eraseText method erases the desired word.
    @Test
    public void eraseTest(){
        Eraser eraser = new Eraser();
        String editedText = eraser.eraseText(text, "Sea").toString();

        assertEquals("Expected and actual values don't match", editedText, "She sells     shells sells");
        System.out.println("Edited text is: \n" + text);
    }
}

package com.aim;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EraserTest {
    StringBuilder text = new StringBuilder();

    @Before
    public void setUp() {
        String textBeforeWriting = "She sells ";
        String textToBeWritten = "Sea shells sells";
        text.append(textBeforeWriting);

        Pencil pencil = new Pencil(15);
        pencil.writeText(text, textToBeWritten).toString();
    }

    //Test checks that the eraseText method erases the desired word.
    @Test
    public void eraseTest() {
        Eraser eraser = new Eraser();
        String editedText = eraser.eraseText(text, "Sea").toString();

        assertEquals("Expected and actual values don't match", editedText, "She sells     shells sells");
        System.out.println("Edited text is: \n" + text);
    }

    //Test checks that eraserDurability decreases everytime a letter is erased.
    @Test
    public void eraserDurabilityTest() {
        Eraser eraser = new Eraser(20);
        eraser.eraseText(text, "shells").toString();
        int eraserDurability = eraser.getEraserDurability();

        assertEquals("Expected and actual values don't match", eraserDurability, 14);
        System.out.println("Eraser durability is: \n" + eraserDurability);
        System.out.println("Edited text is: \n" + text);
    }

    //Test checks if the eraseText method erases the desired word twice.
    //Test also checks that eraseText does not erase a letter if eraserDurability is zero.
    @Test
    public void eraseTwoTimesTest() {
        Eraser eraser = new Eraser(8);
        eraser.eraseText(text, "shells").toString();
        String editedText = eraser.eraseText(text, "She").toString();

        assertEquals("Expected and actual values don't match", editedText, "S   sells Sea        sells");
        System.out.println("Edited text is: \n" + text);
    }
}

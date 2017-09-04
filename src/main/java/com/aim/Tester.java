package com.aim;

public class Tester {
    public static void main(String[] args) {
        String text1 = "Fly me to the moon";
        String text2 = " Let me play";
        StringBuilder text = new StringBuilder();
        text.append(text1);
        System.out.println(text);

        Pencil pencil = new Pencil(10, 4);
        String writeText = pencil.writeText(text, text2).toString();
        System.out.println("Text after writing is: " + writeText);

        int pointDurability = pencil.getPointDurability();
        System.out.println("Point durability after writing is: " + pointDurability);

        int sharpeningLimit = pencil.getSharpeningLimit();
        System.out.println("Times this pencil can be sharpened is: " + sharpeningLimit);

        pencil.sharpenPencil();
        int sharpeningLimit2 = pencil.getSharpeningLimit();
        System.out.println("Times this pencil can be sharpened after sharpening once is: " + sharpeningLimit2);

        pencil.sharpenPencil();
        int sharpeningLimit3 = pencil.getSharpeningLimit();
        System.out.println("Times this pencil can be sharpened after sharpening twice is: " + sharpeningLimit3);

        int pointDurability2 = pencil.getPointDurability();
        System.out.println("Point durability after sharpening is: " + pointDurability2);

        Eraser eraser = new Eraser(4);
        int eraserDurability = eraser.getEraserDurability();
        System.out.println("Eraser durability is: " + eraserDurability);

        String erasedText = eraser.eraseText(text, "me").toString();
        System.out.println("Erased text is: " + erasedText);

        int eraserDurability2 = eraser.getEraserDurability();
        System.out.println("Eraser durability after erasing once is: " + eraserDurability2);

        String erasedText2 = eraser.eraseText(text, "me").toString();
        System.out.println("Erased text again is: " + erasedText2);

        int eraserDurability3 = eraser.getEraserDurability();
        System.out.println("Eraser durability after erasing twice is: " + eraserDurability3);

        String editedText = pencil.editText(text, "   ", "me").toString();
        System.out.println("Edited text is: " + editedText);

        String editedText2 = pencil.editText(text, "   ", "me").toString();
        System.out.println("Edited text is: " + editedText2);

        int pointDurability3 = pencil.getPointDurability();
        System.out.println("Point durability after writing is: " + pointDurability3);

        String newWord = " among the";
        String writeText2 = pencil.writeText(text, newWord).toString();
        System.out.println("Text after writing is: " + writeText2);

        int pointDurability4 = pencil.getPointDurability();
        System.out.println("Point durability after editing is: " + pointDurability4);

        pencil.sharpenPencil();
        int sharpeningLimit4 = pencil.getSharpeningLimit();
        System.out.println("Times this pencil can be sharpened after sharpening thrice is: " + sharpeningLimit4);

        int pointDurability5 = pencil.getPointDurability();
        System.out.println("Point durability after sharpening is: " + pointDurability5);

        String erasedText3 = eraser.eraseText(text, "me").toString();
        System.out.println("Erased text again is: " + erasedText3);

        int eraserDurability4 = eraser.getEraserDurability();
        System.out.println("Eraser durability after erasing thrice is: " + eraserDurability4);

    }
}

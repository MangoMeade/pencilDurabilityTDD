package com.aim;

public class Eraser {
    private int eraserDurability;

    public Eraser() {
        this.eraserDurability = 10;
    }

    //The eraseText method will erase a word starting from the last letter.
    //eraseText replaces letters with whitespace.
    public StringBuilder eraseText(StringBuilder text, String textToBeErased) {
        StringBuilder erasedText = new StringBuilder();
        for (int i = textToBeErased.length() - 1; i >= 0; i--) {
            erasedText.append(" ");
        }
        erasedText = erasedText.reverse();

        text.replace(text.lastIndexOf(textToBeErased), text.lastIndexOf(textToBeErased) + textToBeErased.length(), erasedText.toString());
        return text;
    }

    public int getEraserDurability() {
        return eraserDurability;
    }
}

package com.aim;

public class Eraser {
    private int eraserDurability;

    public Eraser(){
        this.eraserDurability = 10;
    }
    public Eraser(int eraserDurability) {
        this.eraserDurability = eraserDurability;
    }

    //The eraseText method will erase a word starting from the last letter.
    //eraseText replaces letters with whitespace.
    //If the eraser degrades before completely erasing a word the letters
    //that could not be erased will be left untouched.
    public StringBuilder eraseText(StringBuilder text, String textToBeErased) {
        int eraserDurability = getEraserDurability();
        StringBuilder erasedText = new StringBuilder();
        for (int i = textToBeErased.length() - 1; i >= 0; i--) {
            if (eraserDurability > 0) {
                erasedText.append(" ");
            }
            if (eraserDurability <= 0) {
                erasedText.append(textToBeErased.charAt(i));
            }
            eraserDurability -= 1;
        }
        erasedText = erasedText.reverse();

        text.replace(text.lastIndexOf(textToBeErased), text.lastIndexOf(textToBeErased) + textToBeErased.length(), erasedText.toString());
        this.eraserDurability -= textToBeErased.length();
        if (this.eraserDurability < 0){
            this.eraserDurability = 0;
        }
        return text;
    }

    public int getEraserDurability() {
        return eraserDurability;
    }
}


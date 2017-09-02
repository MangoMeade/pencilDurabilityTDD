package com.aim;

public class Eraser {
    private int eraserDurability;

    public Eraser(){
        this.eraserDurability = 10;
    }
    public Eraser(int eraserDurability) {
        this.eraserDurability = eraserDurability;
    }

    //The eraseText method will erase string starting from the last letter.
    //eraseText replaces letters with whitespace.
    //"erasing" whitespace does not degcrease eraser durability
    //If the eraser degrades before completely erasing a word the letters
    //that could not be erased will be left untouched.
    public StringBuilder eraseText(StringBuilder text, String textToBeErased) {
        int eraserDurability = getEraserDurability();
        StringBuilder erasedText = new StringBuilder();

        for (int i = textToBeErased.length() - 1; i >= 0; i--) {
            if (textToBeErased.charAt(i) != ' ') {
                if (eraserDurability > 0) {
                    erasedText.append(" ");
                }
                if (eraserDurability <= 0) {
                    erasedText.append(textToBeErased.charAt(i));
                }
                eraserDurability -= 1;
            }
            else if (textToBeErased.charAt(i) == ' ') {
                erasedText.append(textToBeErased.charAt(i));
            }
        }
        erasedText = erasedText.reverse();
        text.replace(text.lastIndexOf(textToBeErased), text.lastIndexOf(textToBeErased) + textToBeErased.length(), erasedText.toString());

        this.eraserDurability = eraserDurability;
        if (this.eraserDurability < 0){
            this.eraserDurability = 0;
        }
        return text;
    }

    public int getEraserDurability() {
        return eraserDurability;
    }
}


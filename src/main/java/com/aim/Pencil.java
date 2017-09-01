package com.aim;

public class Pencil {
    private int pointDurability;

    public Pencil() {

        this.pointDurability = 30;
    }

    public Pencil(int pointDurability) {
        this.pointDurability = pointDurability;
    }

    //The testWriteText method counts how many characters are appended to a StringBuilder.
    //This method was built for testing purposes.
    //It will not be used in the actual application.
    public int testWriteText(StringBuilder text, String textToBeWritten) {
        int lengthBefore = text.length();
        text.append(textToBeWritten);
        return text.length() - lengthBefore;
    }

    //The countLetters method counts how many letters are in the string to be appended.
    //This method was built for testing purposes. and as a base for the writeText method.
    //It will not be used in the actual application.
    public int countLetters(String textToBeWritten) {
        int counter = 0;
        for (int i = 0; i < textToBeWritten.length(); i++) {
            if (Character.isLowerCase(textToBeWritten.charAt(i))) {
                counter += 1;
            }
            if (Character.isUpperCase(textToBeWritten.charAt(i))) {
                counter += 2;
            }
        }
        return counter;
    }

    //The writeText method appends a string to a StringBuilder.
    //The method will append letters if point durability is higher than 0
    //and will append whitespace if point durability is lower or equal to 0.
    public StringBuilder writeText(StringBuilder text, String textToBeWritten) {
        int pointDurability = getPointDurability();
        for (int i = 0; i < textToBeWritten.length(); i++) {
            if (pointDurability > 0) {
                if (Character.isLowerCase(textToBeWritten.charAt(i))) {
                    pointDurability -= 1;

                } else if (Character.isUpperCase(textToBeWritten.charAt(i))) {
                    pointDurability -= 2;
                }
                text.append(textToBeWritten.charAt(i));
            } else if (pointDurability <= 0) {
                text.append(" ");
            }
        }
        this.pointDurability = pointDurability;
        return text;
    }

    public int getPointDurability() {
        return pointDurability;
    }
}

package com.aim;

public class Pencil {
    private int pointDurability;

    public Pencil() {

        this.pointDurability = 30;
    }

    public int testWriteText(StringBuilder text, String textAfter) {
        int lengthBefore = text.length();
        text.append(textAfter);
        return text.length() - lengthBefore;
    }

    public int countLetters(String textAfter) {
        int counter = 0;
        for (int i = 0; i < textAfter.length(); i++) {
            if (Character.isLowerCase(textAfter.charAt(i))) {
                counter += 1;
            }
            if (Character.isUpperCase(textAfter.charAt(i))) {
                counter += 2;
            }
        }
        return counter;
    }

    public int getPointDurability() {
        return pointDurability;
    }
}

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

    public int getPointDurability() {
        return pointDurability;
    }
}

package com.ijzerenhein.sharedelement;

/* loaded from: classes2.dex */
enum b {
    MOVE(0),
    FADE(1),
    FADE_IN(2),
    FADE_OUT(3);
    
    private final int value;

    b(int i11) {
        this.value = i11;
    }

    public int getValue() {
        return this.value;
    }
}
package com.ijzerenhein.sharedelement;

/* loaded from: classes2.dex */
enum a {
    AUTO(0),
    LEFT_TOP(1),
    LEFT_CENTER(2),
    LEFT_BOTTOM(3),
    RIGHT_TOP(4),
    RIGHT_CENTER(5),
    RIGHT_BOTTOM(6),
    CENTER_TOP(7),
    CENTER_CENTER(8),
    CENTER_BOTTOM(9);
    
    private final int value;

    a(int i11) {
        this.value = i11;
    }

    public int getValue() {
        return this.value;
    }
}
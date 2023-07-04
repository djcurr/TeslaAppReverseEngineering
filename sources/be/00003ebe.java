package com.ijzerenhein.sharedelement;

/* loaded from: classes2.dex */
enum i {
    AUTO(0),
    STRETCH(1),
    CLIP(2),
    NONE(3);
    
    private final int value;

    i(int i11) {
        this.value = i11;
    }

    public int getValue() {
        return this.value;
    }
}
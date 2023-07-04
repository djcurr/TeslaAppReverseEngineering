package com.tesla.widget;

import av.e;

/* loaded from: classes6.dex */
enum a {
    NORMAL(e.control_button_background),
    LEFT(e.control_button_background_left),
    RIGHT(e.control_button_background_right);
    
    private final int backgroundRes;

    a(int i11) {
        this.backgroundRes = i11;
    }

    public final int getBackgroundRes() {
        return this.backgroundRes;
    }
}
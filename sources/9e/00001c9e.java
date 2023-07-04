package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
final class h {
    public static float a(int i11, float f11, int i12, int i13) {
        float f12;
        if (f11 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i11 == 0) {
            f12 = i13;
        } else if (i11 != 1) {
            if (i11 != 2) {
                return -3.4028235E38f;
            }
            return f11;
        } else {
            f12 = i12;
        }
        return f11 * f12;
    }
}
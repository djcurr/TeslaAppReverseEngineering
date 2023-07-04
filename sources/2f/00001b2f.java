package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class ExoTimeoutException extends Exception {
    public ExoTimeoutException(int i11) {
        super(a(i11));
    }

    private static String a(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
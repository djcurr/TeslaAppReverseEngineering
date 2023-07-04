package com.google.android.libraries.places.internal;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes3.dex */
final class zzht extends zzhs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzht(char c11) {
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CharMatcher.is('");
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
        int i11 = 46;
        for (int i12 = 0; i12 < 4; i12++) {
            cArr[5 - i12] = "0123456789ABCDEF".charAt(i11 & 15);
            i11 >>= 4;
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
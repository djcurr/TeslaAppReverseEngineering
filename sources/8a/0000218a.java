package com.google.android.gms.internal.common;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes3.dex */
final class zzl extends zzk {
    private final char zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(char c11) {
        this.zza = c11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CharMatcher.is('");
        int i11 = this.zza;
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
        for (int i12 = 0; i12 < 4; i12++) {
            cArr[5 - i12] = "0123456789ABCDEF".charAt(i11 & 15);
            i11 >>= 4;
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c11) {
        return c11 == this.zza;
    }
}
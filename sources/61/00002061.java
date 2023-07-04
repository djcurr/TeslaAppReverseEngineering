package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzbd implements zzbf {
    private zzbd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbd(zzbc zzbcVar) {
        this();
    }

    @Override // com.google.android.gms.internal.clearcut.zzbf
    public final byte[] zzc(byte[] bArr, int i11, int i12) {
        return Arrays.copyOfRange(bArr, i11, i12 + i11);
    }
}
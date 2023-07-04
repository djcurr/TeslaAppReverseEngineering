package com.google.android.gms.internal.vision;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzjv {
    final int tag;
    final byte[] zzse;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjv(int i11, byte[] bArr) {
        this.tag = i11;
        this.zzse = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzjv) {
            zzjv zzjvVar = (zzjv) obj;
            return this.tag == zzjvVar.tag && Arrays.equals(this.zzse, zzjvVar.zzse);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.tag + 527) * 31) + Arrays.hashCode(this.zzse);
    }
}
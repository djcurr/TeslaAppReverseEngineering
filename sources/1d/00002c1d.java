package com.google.android.gms.internal.vision;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzev {
    private final byte[] buffer;
    private final zzfe zzsd;

    private zzev(int i11) {
        byte[] bArr = new byte[i11];
        this.buffer = bArr;
        this.zzsd = zzfe.zzg(bArr);
    }

    public final zzeo zzdo() {
        this.zzsd.zzea();
        return new zzex(this.buffer);
    }

    public final zzfe zzdp() {
        return this.zzsd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzev(int i11, zzep zzepVar) {
        this(i11);
    }
}
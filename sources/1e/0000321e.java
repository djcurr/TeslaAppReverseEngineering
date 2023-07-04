package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
final class zzaef extends zzaeh {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaef(byte[] bArr, int i11, int i12, boolean z11, zzaee zzaeeVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i11) {
        int i12 = this.zze;
        this.zze = 0;
        int i13 = this.zzc + this.zzd;
        this.zzc = i13;
        if (i13 > 0) {
            this.zzd = i13;
            this.zzc = i13 - i13;
        } else {
            this.zzd = 0;
        }
        return i12;
    }
}
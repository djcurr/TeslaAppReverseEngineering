package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzlq implements zzld {
    private final zzlg zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlq(zzlg zzlgVar, String str, Object[] objArr) {
        this.zza = zzlgVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char charAt2 = str.charAt(i13);
            if (charAt2 < 55296) {
                this.zzd = i11 | (charAt2 << i12);
                return;
            }
            i11 |= (charAt2 & 8191) << i12;
            i12 += 13;
            i13 = i14;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final zzlg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
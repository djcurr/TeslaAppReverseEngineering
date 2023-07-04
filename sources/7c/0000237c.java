package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzmp extends zzmr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmp(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
    public final double zza(Object obj, long j11) {
        return Double.longBitsToDouble(zzk(obj, j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
    public final float zzb(Object obj, long j11) {
        return Float.intBitsToFloat(zzj(obj, j11));
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
    public final void zzc(Object obj, long j11, boolean z11) {
        if (zzms.zzb) {
            zzms.zzD(obj, j11, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzms.zzE(obj, j11, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
    public final void zzd(Object obj, long j11, byte b11) {
        if (zzms.zzb) {
            zzms.zzD(obj, j11, b11);
        } else {
            zzms.zzE(obj, j11, b11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
    public final void zze(Object obj, long j11, double d11) {
        zzo(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
    public final void zzf(Object obj, long j11, float f11) {
        zzn(obj, j11, Float.floatToIntBits(f11));
    }

    @Override // com.google.android.gms.internal.measurement.zzmr
    public final boolean zzg(Object obj, long j11) {
        if (zzms.zzb) {
            return zzms.zzt(obj, j11);
        }
        return zzms.zzu(obj, j11);
    }
}
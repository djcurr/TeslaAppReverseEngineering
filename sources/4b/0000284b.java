package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class zzlk {
    public static void zza(zzkz zzkzVar, int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        zzkzVar.zzc(zzc(i11, i12, j11, i13, i14, i15, i16), zzht.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(zzkz zzkzVar, int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        zzkzVar.zzc(zzc(i11, i12, j11, i13, i14, i15, i16), zzht.ODML_IMAGE);
    }

    private static zzlj zzc(int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        return new zzlj(i11, i12, i15, i13, i14, SystemClock.elapsedRealtime() - j11, i16);
    }
}
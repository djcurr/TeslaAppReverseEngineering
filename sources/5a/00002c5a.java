package com.google.android.gms.internal.vision;

import java.util.List;

/* loaded from: classes3.dex */
abstract class zzgp {
    private static final zzgp zzyn = new zzgr();
    private static final zzgp zzyo = new zzgs();

    private zzgp() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgp zzfv() {
        return zzyn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgp zzfw() {
        return zzyo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j11);
}
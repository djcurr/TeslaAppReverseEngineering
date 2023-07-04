package com.google.android.gms.internal.clearcut;

/* loaded from: classes3.dex */
final class zzdb extends zzcy {
    private zzdb() {
        super();
    }

    private static <E> zzcn<E> zzc(Object obj, long j11) {
        return (zzcn) zzfd.zzo(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.clearcut.zzcy
    public final void zza(Object obj, long j11) {
        zzc(obj, j11).zzv();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.clearcut.zzcy
    public final <E> void zza(Object obj, Object obj2, long j11) {
        zzcn<E> zzc = zzc(obj, j11);
        zzcn<E> zzc2 = zzc(obj2, j11);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzcn<E> zzcnVar = zzc;
        zzcnVar = zzc;
        if (size > 0 && size2 > 0) {
            boolean zzu = zzc.zzu();
            zzcn<E> zzcnVar2 = zzc;
            if (!zzu) {
                zzcnVar2 = zzc.zzi(size2 + size);
            }
            zzcnVar2.addAll(zzc2);
            zzcnVar = zzcnVar2;
        }
        if (size > 0) {
            zzc2 = zzcnVar;
        }
        zzfd.zza(obj, j11, zzc2);
    }
}
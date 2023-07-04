package com.google.android.gms.internal.clearcut;

/* loaded from: classes3.dex */
public final class zzdg<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int zza(zzdh<K, V> zzdhVar, K k11, V v11) {
        return zzby.zza(zzdhVar.zzmb, 1, k11) + zzby.zza(zzdhVar.zzmd, 2, v11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void zza(zzbn zzbnVar, zzdh<K, V> zzdhVar, K k11, V v11) {
        zzby.zza(zzbnVar, zzdhVar.zzmb, 1, k11);
        zzby.zza(zzbnVar, zzdhVar.zzmd, 2, v11);
    }
}
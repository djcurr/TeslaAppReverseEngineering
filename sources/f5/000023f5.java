package com.google.android.gms.internal.mlkit_common;

import java.util.AbstractMap;

/* loaded from: classes3.dex */
final class zzav extends zzao {
    final /* synthetic */ zzaw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(zzaw zzawVar) {
        this.zza = zzawVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        int i12;
        Object[] objArr;
        Object[] objArr2;
        i12 = this.zza.zzc;
        zzac.zza(i11, i12, "index");
        zzaw zzawVar = this.zza;
        int i13 = i11 + i11;
        objArr = zzawVar.zzb;
        Object obj = objArr[i13];
        obj.getClass();
        objArr2 = zzawVar.zzb;
        Object obj2 = objArr2[i13 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i11;
        i11 = this.zza.zzc;
        return i11;
    }
}
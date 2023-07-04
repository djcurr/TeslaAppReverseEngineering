package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractMap;

/* loaded from: classes3.dex */
final class zzcd extends zzbn {
    final /* synthetic */ zzce zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcd(zzce zzceVar) {
        this.zza = zzceVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        int i12;
        Object[] objArr;
        Object[] objArr2;
        i12 = this.zza.zzc;
        zzab.zza(i11, i12, "index");
        zzce zzceVar = this.zza;
        int i13 = i11 + i11;
        objArr = zzceVar.zzb;
        Object obj = objArr[i13];
        obj.getClass();
        objArr2 = zzceVar.zzb;
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
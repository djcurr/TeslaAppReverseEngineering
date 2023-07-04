package com.google.android.libraries.places.internal;

import java.util.AbstractMap;

/* loaded from: classes3.dex */
final class zzjn extends zziy {
    final /* synthetic */ zzjo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjn(zzjo zzjoVar) {
        this.zza = zzjoVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        int i12;
        Object[] objArr;
        Object[] objArr2;
        i12 = this.zza.zzc;
        zzig.zza(i11, i12, "index");
        zzjo zzjoVar = this.zza;
        int i13 = i11 + i11;
        objArr = zzjoVar.zzb;
        Object obj = objArr[i13];
        obj.getClass();
        objArr2 = zzjoVar.zzb;
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

    @Override // com.google.android.libraries.places.internal.zziv
    public final boolean zzf() {
        return true;
    }
}
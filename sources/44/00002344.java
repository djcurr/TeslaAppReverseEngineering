package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzkn extends zzii implements RandomAccess, zzko {
    public static final zzko zza;
    private static final zzkn zzb;
    private final List zzc;

    static {
        zzkn zzknVar = new zzkn(10);
        zzb = zzknVar;
        zzknVar.zzb();
        zza = zzknVar;
    }

    public zzkn() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zziy) {
            return ((zziy) obj).zzn(zzkh.zzb);
        }
        return zzkh.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        zzbK();
        this.zzc.add(i11, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        zzbK();
        if (collection instanceof zzko) {
            collection = ((zzko) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbK();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zzbK();
        Object remove = this.zzc.remove(i11);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        zzbK();
        return zzj(this.zzc.set(i11, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final /* bridge */ /* synthetic */ zzkg zzd(int i11) {
        if (i11 >= size()) {
            ArrayList arrayList = new ArrayList(i11);
            arrayList.addAll(this.zzc);
            return new zzkn(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final zzko zze() {
        return zzc() ? new zzmn(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final Object zzf(int i11) {
        return this.zzc.get(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i11) {
        Object obj = this.zzc.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zziy) {
            zziy zziyVar = (zziy) obj;
            String zzn = zziyVar.zzn(zzkh.zzb);
            if (zziyVar.zzi()) {
                this.zzc.set(i11, zzn);
            }
            return zzn;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzkh.zzh(bArr);
        if (zzkh.zzi(bArr)) {
            this.zzc.set(i11, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final void zzi(zziy zziyVar) {
        zzbK();
        this.zzc.add(zziyVar);
        ((AbstractList) this).modCount++;
    }

    public zzkn(int i11) {
        this.zzc = new ArrayList(i11);
    }

    private zzkn(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
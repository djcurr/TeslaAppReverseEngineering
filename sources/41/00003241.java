package com.google.android.libraries.places.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzafn extends zzadr implements RandomAccess, zzafo {
    public static final zzafo zza;
    private static final zzafn zzb;
    private final List zzc;

    static {
        zzafn zzafnVar = new zzafn(10);
        zzb = zzafnVar;
        zzafnVar.zzb();
        zza = zzafnVar;
    }

    public zzafn() {
        this(10);
    }

    private static String zzi(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzaed) {
            return ((zzaed) obj).zzm(zzafh.zzb);
        }
        return zzafh.zzg((byte[]) obj);
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        zza();
        this.zzc.add(i11, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        zza();
        if (collection instanceof zzafo) {
            collection = ((zzafo) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        Object remove = this.zzc.remove(i11);
        ((AbstractList) this).modCount++;
        return zzi(remove);
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        zza();
        return zzi(this.zzc.set(i11, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.libraries.places.internal.zzafo
    public final zzafo zzd() {
        return zzc() ? new zzahn(this) : this;
    }

    @Override // com.google.android.libraries.places.internal.zzafo
    public final Object zze(int i11) {
        return this.zzc.get(i11);
    }

    @Override // com.google.android.libraries.places.internal.zzafg
    public final /* bridge */ /* synthetic */ zzafg zzf(int i11) {
        if (i11 >= size()) {
            ArrayList arrayList = new ArrayList(i11);
            arrayList.addAll(this.zzc);
            return new zzafn(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i11) {
        Object obj = this.zzc.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzaed) {
            zzaed zzaedVar = (zzaed) obj;
            String zzm = zzaedVar.zzm(zzafh.zzb);
            if (zzaedVar.zzi()) {
                this.zzc.set(i11, zzm);
            }
            return zzm;
        }
        byte[] bArr = (byte[]) obj;
        String zzg = zzafh.zzg(bArr);
        if (zzafh.zzh(bArr)) {
            this.zzc.set(i11, zzg);
        }
        return zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzafo
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public zzafn(int i11) {
        this.zzc = new ArrayList(i11);
    }

    private zzafn(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
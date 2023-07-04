package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzgn extends zzef<String> implements zzgo, RandomAccess {
    private static final zzgn zzyk;
    private static final zzgo zzyl;
    private final List<Object> zzym;

    static {
        zzgn zzgnVar = new zzgn();
        zzyk = zzgnVar;
        zzgnVar.zzci();
        zzyl = zzgnVar;
    }

    public zzgn() {
        this(10);
    }

    private static String zzh(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeo) {
            return ((zzeo) obj).zzdk();
        }
        return zzga.zzj((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        zzcj();
        this.zzym.add(i11, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzcj();
        this.zzym.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        Object obj = this.zzym.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeo) {
            zzeo zzeoVar = (zzeo) obj;
            String zzdk = zzeoVar.zzdk();
            if (zzeoVar.zzdl()) {
                this.zzym.set(i11, zzdk);
            }
            return zzdk;
        }
        byte[] bArr = (byte[]) obj;
        String zzj = zzga.zzj(bArr);
        if (zzga.zzi(bArr)) {
            this.zzym.set(i11, zzj);
        }
        return zzj;
    }

    @Override // com.google.android.gms.internal.vision.zzgo
    public final Object getRaw(int i11) {
        return this.zzym.get(i11);
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        zzcj();
        return zzh(this.zzym.set(i11, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzym.size();
    }

    @Override // com.google.android.gms.internal.vision.zzge
    public final /* synthetic */ zzge zzah(int i11) {
        if (i11 >= size()) {
            ArrayList arrayList = new ArrayList(i11);
            arrayList.addAll(this.zzym);
            return new zzgn(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.vision.zzgo
    public final void zzc(zzeo zzeoVar) {
        zzcj();
        this.zzym.add(zzeoVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzef, com.google.android.gms.internal.vision.zzge
    public final /* bridge */ /* synthetic */ boolean zzch() {
        return super.zzch();
    }

    @Override // com.google.android.gms.internal.vision.zzgo
    public final List<?> zzft() {
        return Collections.unmodifiableList(this.zzym);
    }

    @Override // com.google.android.gms.internal.vision.zzgo
    public final zzgo zzfu() {
        return zzch() ? new zzir(this) : this;
    }

    public zzgn(int i11) {
        this(new ArrayList(i11));
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection<? extends String> collection) {
        zzcj();
        if (collection instanceof zzgo) {
            collection = ((zzgo) collection).zzft();
        }
        boolean addAll = this.zzym.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zzcj();
        Object remove = this.zzym.remove(i11);
        ((AbstractList) this).modCount++;
        return zzh(remove);
    }

    private zzgn(ArrayList<Object> arrayList) {
        this.zzym = arrayList;
    }
}
package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzbd extends zzbb implements List {
    final /* synthetic */ zzbe zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(zzbe zzbeVar, Object obj, List list, zzbb zzbbVar) {
        super(zzbeVar, obj, list, zzbbVar);
        this.zzf = zzbeVar;
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i11, obj);
        zzbe.zzd(this.zzf);
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i11, collection);
        if (addAll) {
            zzbe.zzf(this.zzf, this.zzb.size() - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzb();
        return ((List) this.zzb).get(i11);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzbc(this);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        zzb();
        Object remove = ((List) this.zzb).remove(i11);
        zzbe.zze(this.zzf);
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        zzb();
        return ((List) this.zzb).set(i11, obj);
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        zzb();
        zzbe zzbeVar = this.zzf;
        Object obj = this.zza;
        List subList = ((List) this.zzb).subList(i11, i12);
        zzbb zzbbVar = this.zzc;
        if (zzbbVar == null) {
            zzbbVar = this;
        }
        return zzbeVar.zzi(obj, subList, zzbbVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        zzb();
        return new zzbc(this, i11);
    }
}
package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzao extends zzam implements List {
    final /* synthetic */ zzap zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzap zzapVar, Object obj, List list, zzam zzamVar) {
        super(zzapVar, obj, list, zzamVar);
        this.zzf = zzapVar;
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i11, obj);
        zzap.zzd(this.zzf);
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
            zzap.zzf(this.zzf, this.zzb.size() - size);
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
        return new zzan(this);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        zzb();
        Object remove = ((List) this.zzb).remove(i11);
        zzap.zze(this.zzf);
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
        zzap zzapVar = this.zzf;
        Object obj = this.zza;
        List subList = ((List) this.zzb).subList(i11, i12);
        zzam zzamVar = this.zzc;
        if (zzamVar == null) {
            zzamVar = this;
        }
        return zzapVar.zzi(obj, subList, zzamVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        zzb();
        return new zzan(this, i11);
    }
}
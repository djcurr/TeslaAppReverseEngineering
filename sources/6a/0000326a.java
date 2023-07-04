package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzaha implements Iterator {
    final /* synthetic */ zzahe zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaha(zzahe zzaheVar, zzagz zzagzVar) {
        this.zza = zzaheVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i11 = this.zzb + 1;
        list = this.zza.zzb;
        if (i11 >= list.size()) {
            map = this.zza.zzc;
            return !map.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzc = true;
        int i11 = this.zzb + 1;
        this.zzb = i11;
        list = this.zza.zzb;
        if (i11 < list.size()) {
            list2 = this.zza.zzb;
            return (Map.Entry) list2.get(this.zzb);
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzn();
            int i11 = this.zzb;
            list = this.zza.zzb;
            if (i11 < list.size()) {
                zzahe zzaheVar = this.zza;
                int i12 = this.zzb;
                this.zzb = i12 - 1;
                zzaheVar.zzl(i12);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
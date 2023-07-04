package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes3.dex */
final class zzih<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzaak;
    private final /* synthetic */ zzhz zzaal;
    private boolean zzaap;

    private zzih(zzhz zzhzVar) {
        this.zzaal = zzhzVar;
        this.pos = -1;
    }

    private final Iterator<Map.Entry<K, V>> zzgz() {
        Map map;
        if (this.zzaak == null) {
            map = this.zzaal.zzaag;
            this.zzaak = map.entrySet().iterator();
        }
        return this.zzaak;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i11 = this.pos + 1;
        list = this.zzaal.zzaaf;
        if (i11 >= list.size()) {
            map = this.zzaal.zzaag;
            if (map.isEmpty() || !zzgz().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzaap = true;
        int i11 = this.pos + 1;
        this.pos = i11;
        list = this.zzaal.zzaaf;
        if (i11 < list.size()) {
            list2 = this.zzaal.zzaaf;
            return (Map.Entry) list2.get(this.pos);
        }
        return zzgz().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.zzaap) {
            this.zzaap = false;
            this.zzaal.zzgx();
            int i11 = this.pos;
            list = this.zzaal.zzaaf;
            if (i11 < list.size()) {
                zzhz zzhzVar = this.zzaal;
                int i12 = this.pos;
                this.pos = i12 - 1;
                zzhzVar.zzbq(i12);
                return;
            }
            zzgz().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzih(zzhz zzhzVar, zzia zziaVar) {
        this(zzhzVar);
    }
}
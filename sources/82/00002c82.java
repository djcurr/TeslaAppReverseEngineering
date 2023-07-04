package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes3.dex */
final class zzib<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzaak;
    private final /* synthetic */ zzhz zzaal;

    private zzib(zzhz zzhzVar) {
        List list;
        this.zzaal = zzhzVar;
        list = zzhzVar.zzaaf;
        this.pos = list.size();
    }

    private final Iterator<Map.Entry<K, V>> zzgz() {
        Map map;
        if (this.zzaak == null) {
            map = this.zzaal.zzaai;
            this.zzaak = map.entrySet().iterator();
        }
        return this.zzaak;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i11 = this.pos;
        if (i11 > 0) {
            list = this.zzaal.zzaaf;
            if (i11 <= list.size()) {
                return true;
            }
        }
        return zzgz().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (!zzgz().hasNext()) {
            list = this.zzaal.zzaaf;
            int i11 = this.pos - 1;
            this.pos = i11;
            return (Map.Entry) list.get(i11);
        }
        return zzgz().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzib(zzhz zzhzVar, zzia zziaVar) {
        this(zzhzVar);
    }
}
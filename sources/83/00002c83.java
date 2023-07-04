package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzic extends zzii {
    private final /* synthetic */ zzhz zzaal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzic(zzhz zzhzVar) {
        super(zzhzVar, null);
        this.zzaal = zzhzVar;
    }

    @Override // com.google.android.gms.internal.vision.zzii, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzib(this.zzaal, null);
    }

    public /* synthetic */ zzic(zzhz zzhzVar, zzia zziaVar) {
        this(zzhzVar);
    }
}
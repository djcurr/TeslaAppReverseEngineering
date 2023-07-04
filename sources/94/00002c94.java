package com.google.android.gms.internal.vision;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzit implements Iterator<String> {
    private final /* synthetic */ zzir zzaax;
    private Iterator<String> zzaay;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzit(zzir zzirVar) {
        zzgo zzgoVar;
        this.zzaax = zzirVar;
        zzgoVar = zzirVar.zzaau;
        this.zzaay = zzgoVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzaay.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzaay.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
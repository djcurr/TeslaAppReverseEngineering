package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzep implements zzeu {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ zzeo zzsa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzep(zzeo zzeoVar) {
        this.zzsa = zzeoVar;
        this.limit = zzeoVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Byte next() {
        return Byte.valueOf(nextByte());
    }

    @Override // com.google.android.gms.internal.vision.zzeu
    public final byte nextByte() {
        try {
            zzeo zzeoVar = this.zzsa;
            int i11 = this.position;
            this.position = i11 + 1;
            return zzeoVar.zzai(i11);
        } catch (IndexOutOfBoundsException e11) {
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
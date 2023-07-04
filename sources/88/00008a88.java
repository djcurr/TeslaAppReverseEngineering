package net.time4j;

import java.lang.Comparable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class b<V extends Comparable<V>> extends net.time4j.format.d<V> implements c<V, h0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str) {
        super(str);
        new r0(this, 0);
        new r0(this, 1);
    }

    public p<h0> o(V v11) {
        return new r0(this, 6, v11);
    }
}
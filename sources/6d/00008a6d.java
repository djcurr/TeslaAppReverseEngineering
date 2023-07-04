package net.time4j;

import java.lang.Comparable;

/* loaded from: classes5.dex */
abstract class a<V extends Comparable<V>> extends net.time4j.format.d<V> implements c<V, g0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str) {
        super(str);
        new j(this, 0);
        new j(this, 1);
    }

    public p<g0> o(V v11) {
        return new j(this, 6, v11);
    }
}
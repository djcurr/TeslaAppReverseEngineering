package n00;

import n00.m;

/* loaded from: classes5.dex */
public interface n<V> extends m<V>, h00.a<V> {

    /* loaded from: classes5.dex */
    public interface a<V> extends m.b<V>, h00.a<V> {
    }

    V get();

    Object getDelegate();

    @Override // n00.m
    a<V> getGetter();
}
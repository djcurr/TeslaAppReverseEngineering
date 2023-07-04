package cz;

import hy.i;
import hy.k;

/* loaded from: classes5.dex */
public abstract class e<T> extends i<T> implements k<T> {
    public abstract boolean R();

    public abstract boolean S();

    public abstract boolean T();

    public final e<T> U() {
        return this instanceof d ? this : new d(this);
    }
}
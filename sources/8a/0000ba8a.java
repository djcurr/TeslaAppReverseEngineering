package vz;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class h<T> implements k<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final T f54763a;

    public h(T t11) {
        this.f54763a = t11;
    }

    @Override // vz.k
    public T getValue() {
        return this.f54763a;
    }

    @Override // vz.k
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
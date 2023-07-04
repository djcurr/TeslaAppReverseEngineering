package vz;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class c0<T> implements k<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private h00.a<? extends T> f54757a;

    /* renamed from: b  reason: collision with root package name */
    private Object f54758b;

    public c0(h00.a<? extends T> initializer) {
        kotlin.jvm.internal.s.g(initializer, "initializer");
        this.f54757a = initializer;
        this.f54758b = z.f54790a;
    }

    @Override // vz.k
    public T getValue() {
        if (this.f54758b == z.f54790a) {
            h00.a<? extends T> aVar = this.f54757a;
            kotlin.jvm.internal.s.e(aVar);
            this.f54758b = aVar.invoke();
            this.f54757a = null;
        }
        return (T) this.f54758b;
    }

    @Override // vz.k
    public boolean isInitialized() {
        return this.f54758b != z.f54790a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
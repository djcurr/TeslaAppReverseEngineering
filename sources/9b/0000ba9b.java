package vz;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
final class t<T> implements k<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private h00.a<? extends T> f54778a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f54779b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f54780c;

    public t(h00.a<? extends T> initializer, Object obj) {
        kotlin.jvm.internal.s.g(initializer, "initializer");
        this.f54778a = initializer;
        this.f54779b = z.f54790a;
        this.f54780c = obj == null ? this : obj;
    }

    @Override // vz.k
    public T getValue() {
        T t11;
        T t12 = (T) this.f54779b;
        z zVar = z.f54790a;
        if (t12 != zVar) {
            return t12;
        }
        synchronized (this.f54780c) {
            t11 = (T) this.f54779b;
            if (t11 == zVar) {
                h00.a<? extends T> aVar = this.f54778a;
                kotlin.jvm.internal.s.e(aVar);
                t11 = aVar.invoke();
                this.f54779b = t11;
                this.f54778a = null;
            }
        }
        return t11;
    }

    @Override // vz.k
    public boolean isInitialized() {
        return this.f54779b != z.f54790a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ t(h00.a aVar, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i11 & 2) != 0 ? null : obj);
    }
}
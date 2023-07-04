package vz;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
final class s<T> implements k<T>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<s<?>, Object> f54775c;

    /* renamed from: a  reason: collision with root package name */
    private volatile h00.a<? extends T> f54776a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f54777b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f54775c = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "b");
    }

    public s(h00.a<? extends T> initializer) {
        kotlin.jvm.internal.s.g(initializer, "initializer");
        this.f54776a = initializer;
        this.f54777b = z.f54790a;
    }

    @Override // vz.k
    public T getValue() {
        T t11 = (T) this.f54777b;
        z zVar = z.f54790a;
        if (t11 != zVar) {
            return t11;
        }
        h00.a<? extends T> aVar = this.f54776a;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (f54775c.compareAndSet(this, zVar, invoke)) {
                this.f54776a = null;
                return invoke;
            }
        }
        return (T) this.f54777b;
    }

    @Override // vz.k
    public boolean isInitialized() {
        return this.f54777b != z.f54790a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
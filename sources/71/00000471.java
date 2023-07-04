package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e2<T> {

    /* renamed from: a  reason: collision with root package name */
    private final d1.e<Reference<T>> f2914a = new d1.e<>(new Reference[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<T> f2915b = new ReferenceQueue<>();

    private final void a() {
        Reference<? extends T> poll;
        do {
            poll = this.f2915b.poll();
            if (poll != null) {
                this.f2914a.q(poll);
                continue;
            }
        } while (poll != null);
    }

    public final int b() {
        a();
        return this.f2914a.l();
    }

    public final T c() {
        a();
        while (this.f2914a.o()) {
            d1.e<Reference<T>> eVar = this.f2914a;
            T t11 = eVar.s(eVar.l() - 1).get();
            if (t11 != null) {
                return t11;
            }
        }
        return null;
    }

    public final void d(T t11) {
        a();
        this.f2914a.b(new WeakReference(t11, this.f2915b));
    }
}
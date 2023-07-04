package or;

import kotlin.jvm.internal.s;
import or.e.a;

/* loaded from: classes2.dex */
public final class e<T extends a<T>> {

    /* renamed from: a  reason: collision with root package name */
    private T f42953a;

    /* renamed from: b  reason: collision with root package name */
    private T f42954b;

    /* loaded from: classes2.dex */
    public interface a<T extends a<T>> {
        T a();

        void b(T t11);
    }

    public final void a() {
        this.f42953a = null;
        this.f42954b = null;
    }

    public final T b() {
        return this.f42953a;
    }

    public final T c() {
        return this.f42954b;
    }

    public final void d(T node) {
        s.g(node, "node");
        if (node.a() == null) {
            T t11 = this.f42954b;
            if (t11 == null) {
                if (this.f42953a == null) {
                    this.f42953a = node;
                    this.f42954b = node;
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            f(node);
            t11.b(node);
            return;
        }
        throw new IllegalArgumentException("Expected node to not be linked.".toString());
    }

    public final void e(T t11) {
        this.f42953a = t11;
    }

    public final void f(T t11) {
        this.f42954b = t11;
    }
}
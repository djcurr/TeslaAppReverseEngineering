package e10;

import java.util.Map;

/* loaded from: classes5.dex */
public final class c0<T> implements b0<T> {

    /* renamed from: b  reason: collision with root package name */
    private final Map<u10.c, T> f24436b;

    /* renamed from: c  reason: collision with root package name */
    private final j20.f f24437c;

    /* renamed from: d  reason: collision with root package name */
    private final j20.h<u10.c, T> f24438d;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<u10.c, T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0<T> f24439a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0<T> c0Var) {
            super(1);
            this.f24439a = c0Var;
        }

        @Override // h00.l
        /* renamed from: a */
        public final T invoke(u10.c it2) {
            kotlin.jvm.internal.s.f(it2, "it");
            return (T) u10.e.a(it2, this.f24439a.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(Map<u10.c, ? extends T> states) {
        kotlin.jvm.internal.s.g(states, "states");
        this.f24436b = states;
        j20.f fVar = new j20.f("Java nullability annotation states");
        this.f24437c = fVar;
        j20.h<u10.c, T> h11 = fVar.h(new a(this));
        kotlin.jvm.internal.s.f(h11, "storageManager.createMem…cificFqname(states)\n    }");
        this.f24438d = h11;
    }

    @Override // e10.b0
    public T a(u10.c fqName) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        return this.f24438d.invoke(fqName);
    }

    public final Map<u10.c, T> b() {
        return this.f24436b;
    }
}
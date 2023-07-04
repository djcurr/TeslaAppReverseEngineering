package ul;

import sm.a;

/* loaded from: classes3.dex */
public class y<T> implements sm.b<T>, sm.a<T> {

    /* renamed from: c */
    private static final a.InterfaceC1119a<Object> f53607c = new a.InterfaceC1119a() { // from class: ul.w
        @Override // sm.a.InterfaceC1119a
        public final void a(sm.b bVar) {
            y.c(bVar);
        }
    };

    /* renamed from: d */
    private static final sm.b<Object> f53608d = new sm.b() { // from class: ul.x
        @Override // sm.b
        public final Object get() {
            return y.b();
        }
    };

    /* renamed from: a */
    private a.InterfaceC1119a<T> f53609a;

    /* renamed from: b */
    private volatile sm.b<T> f53610b;

    private y(a.InterfaceC1119a<T> interfaceC1119a, sm.b<T> bVar) {
        this.f53609a = interfaceC1119a;
        this.f53610b = bVar;
    }

    public static /* synthetic */ Object b() {
        return g();
    }

    public static /* synthetic */ void c(sm.b bVar) {
        f(bVar);
    }

    public static /* synthetic */ void d(a.InterfaceC1119a interfaceC1119a, a.InterfaceC1119a interfaceC1119a2, sm.b bVar) {
        h(interfaceC1119a, interfaceC1119a2, bVar);
    }

    public static <T> y<T> e() {
        return new y<>(f53607c, f53608d);
    }

    public static /* synthetic */ void f(sm.b bVar) {
    }

    public static /* synthetic */ Object g() {
        return null;
    }

    public static /* synthetic */ void h(a.InterfaceC1119a interfaceC1119a, a.InterfaceC1119a interfaceC1119a2, sm.b bVar) {
        interfaceC1119a.a(bVar);
        interfaceC1119a2.a(bVar);
    }

    public static <T> y<T> i(sm.b<T> bVar) {
        return new y<>(null, bVar);
    }

    @Override // sm.a
    public void a(final a.InterfaceC1119a<T> interfaceC1119a) {
        sm.b<T> bVar;
        sm.b<T> bVar2 = this.f53610b;
        sm.b<Object> bVar3 = f53608d;
        if (bVar2 != bVar3) {
            interfaceC1119a.a(bVar2);
            return;
        }
        sm.b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.f53610b;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                final a.InterfaceC1119a<T> interfaceC1119a2 = this.f53609a;
                this.f53609a = new a.InterfaceC1119a() { // from class: ul.v
                    @Override // sm.a.InterfaceC1119a
                    public final void a(sm.b bVar5) {
                        y.d(a.InterfaceC1119a.this, interfaceC1119a, bVar5);
                    }
                };
            }
        }
        if (bVar4 != null) {
            interfaceC1119a.a(bVar);
        }
    }

    @Override // sm.b
    public T get() {
        return this.f53610b.get();
    }

    public void j(sm.b<T> bVar) {
        a.InterfaceC1119a<T> interfaceC1119a;
        if (this.f53610b == f53608d) {
            synchronized (this) {
                interfaceC1119a = this.f53609a;
                this.f53609a = null;
                this.f53610b = bVar;
            }
            interfaceC1119a.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
package c1;

import java.util.ArrayList;
import java.util.List;
import vz.q;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f8568a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private List<zz.d<vz.b0>> f8569b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<zz.d<vz.b0>> f8570c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f8571d = true;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<Throwable, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v20.o<vz.b0> f8573b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(v20.o<? super vz.b0> oVar) {
            super(1);
            this.f8573b = oVar;
        }

        public final void a(Throwable th2) {
            Object obj = j0.this.f8568a;
            j0 j0Var = j0.this;
            v20.o<vz.b0> oVar = this.f8573b;
            synchronized (obj) {
                j0Var.f8569b.remove(oVar);
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
            a(th2);
            return vz.b0.f54756a;
        }
    }

    public final Object c(zz.d<? super vz.b0> dVar) {
        zz.d c11;
        Object d11;
        Object d12;
        if (e()) {
            return vz.b0.f54756a;
        }
        c11 = a00.c.c(dVar);
        v20.p pVar = new v20.p(c11, 1);
        pVar.y();
        synchronized (this.f8568a) {
            this.f8569b.add(pVar);
        }
        pVar.T(new a(pVar));
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        d12 = a00.d.d();
        return s11 == d12 ? s11 : vz.b0.f54756a;
    }

    public final void d() {
        synchronized (this.f8568a) {
            this.f8571d = false;
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    public final boolean e() {
        boolean z11;
        synchronized (this.f8568a) {
            z11 = this.f8571d;
        }
        return z11;
    }

    public final void f() {
        synchronized (this.f8568a) {
            if (e()) {
                return;
            }
            List<zz.d<vz.b0>> list = this.f8569b;
            this.f8569b = this.f8570c;
            this.f8570c = list;
            this.f8571d = true;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                q.a aVar = vz.q.f54772b;
                list.get(i11).resumeWith(vz.q.b(vz.b0.f54756a));
            }
            list.clear();
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }
}
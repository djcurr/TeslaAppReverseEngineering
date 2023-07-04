package y00;

import d20.b;
import d20.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public class r extends j implements w00.f0 {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f58895h = {kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(r.class), "fragments", "getFragments()Ljava/util/List;")), kotlin.jvm.internal.m0.j(new kotlin.jvm.internal.f0(kotlin.jvm.internal.m0.b(r.class), "empty", "getEmpty()Z"))};

    /* renamed from: c  reason: collision with root package name */
    private final x f58896c;

    /* renamed from: d  reason: collision with root package name */
    private final u10.c f58897d;

    /* renamed from: e  reason: collision with root package name */
    private final j20.i f58898e;

    /* renamed from: f  reason: collision with root package name */
    private final j20.i f58899f;

    /* renamed from: g  reason: collision with root package name */
    private final d20.h f58900g;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<Boolean> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            return Boolean.valueOf(w00.d0.b(r.this.w0().M0(), r.this.e()));
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<List<? extends w00.a0>> {
        b() {
            super(0);
        }

        @Override // h00.a
        public final List<? extends w00.a0> invoke() {
            return w00.d0.c(r.this.w0().M0(), r.this.e());
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<d20.h> {
        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final d20.h invoke() {
            int t11;
            List z02;
            if (r.this.isEmpty()) {
                return h.b.f23482b;
            }
            List<w00.a0> e02 = r.this.e0();
            t11 = wz.x.t(e02, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (w00.a0 a0Var : e02) {
                arrayList.add(a0Var.m());
            }
            z02 = wz.e0.z0(arrayList, new h0(r.this.w0(), r.this.e()));
            b.a aVar = d20.b.f23440d;
            return aVar.a("package view scope for " + r.this.e() + " in " + r.this.w0().getName(), z02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x module, u10.c fqName, j20.n storageManager) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), fqName.h());
        kotlin.jvm.internal.s.g(module, "module");
        kotlin.jvm.internal.s.g(fqName, "fqName");
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        this.f58896c = module;
        this.f58897d = fqName;
        this.f58898e = storageManager.b(new b());
        this.f58899f = storageManager.b(new a());
        this.f58900g = new d20.g(storageManager, new c());
    }

    protected final boolean F0() {
        return ((Boolean) j20.m.a(this.f58899f, this, f58895h[1])).booleanValue();
    }

    @Override // w00.f0
    /* renamed from: G0 */
    public x w0() {
        return this.f58896c;
    }

    @Override // w00.i
    /* renamed from: d0 */
    public w00.f0 b() {
        if (e().d()) {
            return null;
        }
        x w02 = w0();
        u10.c e11 = e().e();
        kotlin.jvm.internal.s.f(e11, "fqName.parent()");
        return w02.R(e11);
    }

    @Override // w00.f0
    public u10.c e() {
        return this.f58897d;
    }

    @Override // w00.f0
    public List<w00.a0> e0() {
        return (List) j20.m.a(this.f58898e, this, f58895h[0]);
    }

    public boolean equals(Object obj) {
        w00.f0 f0Var = obj instanceof w00.f0 ? (w00.f0) obj : null;
        return f0Var != null && kotlin.jvm.internal.s.c(e(), f0Var.e()) && kotlin.jvm.internal.s.c(w0(), f0Var.w0());
    }

    public int hashCode() {
        return (w0().hashCode() * 31) + e().hashCode();
    }

    @Override // w00.f0
    public boolean isEmpty() {
        return F0();
    }

    @Override // w00.f0
    public d20.h m() {
        return this.f58900g;
    }

    @Override // w00.i
    public <R, D> R v0(w00.k<R, D> visitor, D d11) {
        kotlin.jvm.internal.s.g(visitor, "visitor");
        return visitor.h(this, d11);
    }
}
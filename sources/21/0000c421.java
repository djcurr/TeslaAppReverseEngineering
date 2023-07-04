package z2;

import android.os.Handler;
import android.os.Looper;
import c1.d1;
import java.util.ArrayList;
import java.util.List;
import z2.o;

/* loaded from: classes.dex */
public final class o implements n, d1 {

    /* renamed from: a */
    private final k f60118a;

    /* renamed from: b */
    private Handler f60119b;

    /* renamed from: c */
    private final m1.v f60120c;

    /* renamed from: d */
    private boolean f60121d;

    /* renamed from: e */
    private final h00.l<vz.b0, vz.b0> f60122e;

    /* renamed from: f */
    private final List<j> f60123f;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a */
        final /* synthetic */ List<f2.y> f60124a;

        /* renamed from: b */
        final /* synthetic */ y f60125b;

        /* renamed from: c */
        final /* synthetic */ o f60126c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends f2.y> list, y yVar, o oVar) {
            super(0);
            this.f60124a = list;
            this.f60125b = yVar;
            this.f60126c = oVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            List<f2.y> list = this.f60124a;
            y yVar = this.f60125b;
            o oVar = this.f60126c;
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                Object t11 = list.get(i11).t();
                j jVar = t11 instanceof j ? (j) t11 : null;
                if (jVar != null) {
                    d dVar = new d(jVar.c().c());
                    jVar.b().invoke(dVar);
                    dVar.a(yVar);
                }
                oVar.f60123f.add(jVar);
                if (i12 > size) {
                    return;
                }
                i11 = i12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<h00.a<? extends vz.b0>, vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(1);
            o.this = r1;
        }

        public static /* synthetic */ void a(h00.a aVar) {
            c(aVar);
        }

        public static final void c(h00.a tmp0) {
            kotlin.jvm.internal.s.g(tmp0, "$tmp0");
            tmp0.invoke();
        }

        public final void b(final h00.a<vz.b0> it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            if (!kotlin.jvm.internal.s.c(Looper.myLooper(), Looper.getMainLooper())) {
                Handler handler = o.this.f60119b;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    o.this.f60119b = handler;
                }
                handler.post(new Runnable() { // from class: z2.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.b.a(it2);
                    }
                });
                return;
            }
            it2.invoke();
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(h00.a<? extends vz.b0> aVar) {
            b(aVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<vz.b0, vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            o.this = r1;
        }

        public final void a(vz.b0 noName_0) {
            kotlin.jvm.internal.s.g(noName_0, "$noName_0");
            o.this.i(true);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(vz.b0 b0Var) {
            a(b0Var);
            return vz.b0.f54756a;
        }
    }

    public o(k scope) {
        kotlin.jvm.internal.s.g(scope, "scope");
        this.f60118a = scope;
        this.f60120c = new m1.v(new b());
        this.f60121d = true;
        this.f60122e = new c();
        this.f60123f = new ArrayList();
    }

    @Override // z2.n
    public boolean a(List<? extends f2.y> measurables) {
        kotlin.jvm.internal.s.g(measurables, "measurables");
        if (this.f60121d || measurables.size() != this.f60123f.size()) {
            return true;
        }
        int size = measurables.size() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                Object t11 = measurables.get(i11).t();
                if (!kotlin.jvm.internal.s.c(t11 instanceof j ? (j) t11 : null, this.f60123f.get(i11))) {
                    return true;
                }
                if (i12 > size) {
                    break;
                }
                i11 = i12;
            }
        }
        return false;
    }

    @Override // c1.d1
    public void b() {
        this.f60120c.k();
    }

    @Override // z2.n
    public void c(y state, List<? extends f2.y> measurables) {
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        this.f60118a.a(state);
        this.f60123f.clear();
        this.f60120c.j(vz.b0.f54756a, this.f60122e, new a(measurables, state, this));
        this.f60121d = false;
    }

    @Override // c1.d1
    public void d() {
    }

    @Override // c1.d1
    public void e() {
        this.f60120c.l();
        this.f60120c.g();
    }

    public final void i(boolean z11) {
        this.f60121d = z11;
    }
}
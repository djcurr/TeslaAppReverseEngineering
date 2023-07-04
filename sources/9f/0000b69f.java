package u00;

import d20.h;
import j20.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.a1;
import k20.d0;
import k20.k1;
import k20.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import m00.i;
import t00.k;
import u10.f;
import vz.b0;
import w00.a0;
import w00.p;
import w00.q;
import w00.q0;
import w00.s0;
import w00.t;
import w00.x;
import wz.e0;
import wz.n0;
import wz.v;
import wz.w;
import y00.k0;

/* loaded from: classes5.dex */
public final class b extends y00.a {

    /* renamed from: m  reason: collision with root package name */
    private static final u10.b f52873m;

    /* renamed from: n  reason: collision with root package name */
    private static final u10.b f52874n;

    /* renamed from: f  reason: collision with root package name */
    private final n f52875f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f52876g;

    /* renamed from: h  reason: collision with root package name */
    private final c f52877h;

    /* renamed from: i  reason: collision with root package name */
    private final int f52878i;

    /* renamed from: j  reason: collision with root package name */
    private final C1188b f52879j;

    /* renamed from: k  reason: collision with root package name */
    private final d f52880k;

    /* renamed from: l  reason: collision with root package name */
    private final List<s0> f52881l;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: u00.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private final class C1188b extends k20.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f52882d;

        /* renamed from: u00.b$b$a */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f52883a;

            static {
                int[] iArr = new int[c.values().length];
                iArr[c.Function.ordinal()] = 1;
                iArr[c.KFunction.ordinal()] = 2;
                iArr[c.SuspendFunction.ordinal()] = 3;
                iArr[c.KSuspendFunction.ordinal()] = 4;
                f52883a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1188b(b this$0) {
            super(this$0.f52875f);
            s.g(this$0, "this$0");
            this.f52882d = this$0;
        }

        @Override // k20.h
        protected Collection<d0> g() {
            List<u10.b> d11;
            int t11;
            List O0;
            List<s0> I0;
            int t12;
            int i11 = a.f52883a[this.f52882d.Q0().ordinal()];
            if (i11 == 1) {
                d11 = v.d(b.f52873m);
            } else if (i11 == 2) {
                d11 = w.l(b.f52874n, new u10.b(k.f51317l, c.Function.numberedClassName(this.f52882d.M0())));
            } else if (i11 == 3) {
                d11 = v.d(b.f52873m);
            } else if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            } else {
                d11 = w.l(b.f52874n, new u10.b(k.f51309d, c.SuspendFunction.numberedClassName(this.f52882d.M0())));
            }
            x b11 = this.f52882d.f52876g.b();
            t11 = wz.x.t(d11, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (u10.b bVar : d11) {
                w00.c a11 = w00.s.a(b11, bVar);
                if (a11 == null) {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
                I0 = e0.I0(getParameters(), a11.i().getParameters().size());
                t12 = wz.x.t(I0, 10);
                ArrayList arrayList2 = new ArrayList(t12);
                for (s0 s0Var : I0) {
                    arrayList2.add(new a1(s0Var.n()));
                }
                arrayList.add(k20.e0.g(g.f34943d1.b(), a11, arrayList2));
            }
            O0 = e0.O0(arrayList);
            return O0;
        }

        @Override // k20.w0
        public List<s0> getParameters() {
            return this.f52882d.f52881l;
        }

        @Override // k20.h
        protected q0 k() {
            return q0.a.f55322a;
        }

        @Override // k20.w0
        public boolean o() {
            return true;
        }

        public String toString() {
            return u().toString();
        }

        @Override // k20.b
        /* renamed from: v */
        public b u() {
            return this.f52882d;
        }
    }

    static {
        new a(null);
        f52873m = new u10.b(k.f51317l, f.f("Function"));
        f52874n = new u10.b(k.f51314i, f.f("KFunction"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n storageManager, a0 containingDeclaration, c functionKind, int i11) {
        super(storageManager, functionKind.numberedClassName(i11));
        int t11;
        List<s0> O0;
        s.g(storageManager, "storageManager");
        s.g(containingDeclaration, "containingDeclaration");
        s.g(functionKind, "functionKind");
        this.f52875f = storageManager;
        this.f52876g = containingDeclaration;
        this.f52877h = functionKind;
        this.f52878i = i11;
        this.f52879j = new C1188b(this);
        this.f52880k = new d(storageManager, this);
        ArrayList arrayList = new ArrayList();
        i iVar = new i(1, i11);
        t11 = wz.x.t(iVar, 10);
        ArrayList arrayList2 = new ArrayList(t11);
        Iterator<Integer> it2 = iVar.iterator();
        while (it2.hasNext()) {
            G0(arrayList, this, k1.IN_VARIANCE, s.p("P", Integer.valueOf(((n0) it2).a())));
            arrayList2.add(b0.f54756a);
        }
        G0(arrayList, this, k1.OUT_VARIANCE, "R");
        O0 = e0.O0(arrayList);
        this.f52881l = O0;
    }

    private static final void G0(ArrayList<s0> arrayList, b bVar, k1 k1Var, String str) {
        arrayList.add(k0.N0(bVar, g.f34943d1.b(), false, k1Var, f.f(str), arrayList.size(), bVar.f52875f));
    }

    @Override // w00.c
    public /* bridge */ /* synthetic */ w00.b B() {
        return (w00.b) U0();
    }

    @Override // w00.c
    public boolean C0() {
        return false;
    }

    public final int M0() {
        return this.f52878i;
    }

    public Void N0() {
        return null;
    }

    @Override // w00.c
    /* renamed from: O0 */
    public List<w00.b> g() {
        List<w00.b> i11;
        i11 = w.i();
        return i11;
    }

    @Override // w00.c, w00.j, w00.i
    /* renamed from: P0 */
    public a0 b() {
        return this.f52876g;
    }

    public final c Q0() {
        return this.f52877h;
    }

    @Override // w00.c
    /* renamed from: R0 */
    public List<w00.c> x() {
        List<w00.c> i11;
        i11 = w.i();
        return i11;
    }

    @Override // w00.c
    /* renamed from: S0 */
    public h.b h0() {
        return h.b.f23482b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y00.t
    /* renamed from: T0 */
    public d M(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f52880k;
    }

    public Void U0() {
        return null;
    }

    @Override // w00.u
    public boolean W() {
        return false;
    }

    @Override // w00.c
    public boolean X() {
        return false;
    }

    @Override // w00.c
    public boolean a0() {
        return false;
    }

    @Override // w00.l
    public w00.n0 f() {
        w00.n0 NO_SOURCE = w00.n0.f55303a;
        s.f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // w00.c
    public boolean f0() {
        return false;
    }

    @Override // w00.u
    public boolean g0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public g getAnnotations() {
        return g.f34943d1.b();
    }

    @Override // w00.c
    public kotlin.reflect.jvm.internal.impl.descriptors.c getKind() {
        return kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE;
    }

    @Override // w00.c, w00.m, w00.u
    public q getVisibility() {
        q PUBLIC = p.f55309e;
        s.f(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // w00.e
    public w0 i() {
        return this.f52879j;
    }

    @Override // w00.c
    public /* bridge */ /* synthetic */ w00.c i0() {
        return (w00.c) N0();
    }

    @Override // w00.u
    public boolean isExternal() {
        return false;
    }

    @Override // w00.c
    public boolean isInline() {
        return false;
    }

    @Override // w00.f
    public boolean j() {
        return false;
    }

    @Override // w00.c, w00.f
    public List<s0> o() {
        return this.f52881l;
    }

    @Override // w00.c, w00.u
    public kotlin.reflect.jvm.internal.impl.descriptors.f p() {
        return kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT;
    }

    @Override // w00.c
    public t<k20.k0> t() {
        return null;
    }

    public String toString() {
        String b11 = getName().b();
        s.f(b11, "name.asString()");
        return b11;
    }
}
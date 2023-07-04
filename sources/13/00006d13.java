package f2;

import androidx.compose.ui.platform.l2;
import f2.m0;
import f2.v0;
import h2.k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: n  reason: collision with root package name */
    public static final int f25621n = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int f25622a;

    /* renamed from: b  reason: collision with root package name */
    private c1.m f25623b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<h2.k, vz.b0> f25624c;

    /* renamed from: d  reason: collision with root package name */
    private final h00.p<h2.k, h00.p<? super v0, ? super x2.b, ? extends a0>, vz.b0> f25625d;

    /* renamed from: e  reason: collision with root package name */
    private h2.k f25626e;

    /* renamed from: f  reason: collision with root package name */
    private int f25627f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<h2.k, a> f25628g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Object, h2.k> f25629h;

    /* renamed from: i  reason: collision with root package name */
    private final c f25630i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<Object, h2.k> f25631j;

    /* renamed from: k  reason: collision with root package name */
    private int f25632k;

    /* renamed from: l  reason: collision with root package name */
    private int f25633l;

    /* renamed from: m  reason: collision with root package name */
    private final String f25634m;

    /* loaded from: classes.dex */
    public interface b {
        void dispose();
    }

    /* loaded from: classes.dex */
    private final class c implements v0 {

        /* renamed from: a  reason: collision with root package name */
        private x2.q f25639a;

        /* renamed from: b  reason: collision with root package name */
        private float f25640b;

        /* renamed from: c  reason: collision with root package name */
        private float f25641c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u0 f25642d;

        public c(u0 this$0) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            this.f25642d = this$0;
            this.f25639a = x2.q.Rtl;
        }

        @Override // f2.v0
        public List<y> F(Object obj, h00.p<? super c1.i, ? super Integer, vz.b0> content) {
            kotlin.jvm.internal.s.g(content, "content");
            return this.f25642d.H(obj, content);
        }

        @Override // x2.d
        public int G(float f11) {
            return v0.a.c(this, f11);
        }

        @Override // f2.b0
        public a0 I(int i11, int i12, Map<f2.a, Integer> map, h00.l<? super m0.a, vz.b0> lVar) {
            return v0.a.a(this, i11, i12, map, lVar);
        }

        @Override // x2.d
        public float M(long j11) {
            return v0.a.e(this, j11);
        }

        public void a(float f11) {
            this.f25640b = f11;
        }

        @Override // x2.d
        public float b0(int i11) {
            return v0.a.d(this, i11);
        }

        @Override // x2.d
        public float c0() {
            return this.f25641c;
        }

        @Override // x2.d
        public float getDensity() {
            return this.f25640b;
        }

        @Override // f2.k
        public x2.q getLayoutDirection() {
            return this.f25639a;
        }

        public void h(float f11) {
            this.f25641c = f11;
        }

        @Override // x2.d
        public float i0(float f11) {
            return v0.a.f(this, f11);
        }

        @Override // x2.d
        public int l0(long j11) {
            return v0.a.b(this, j11);
        }

        public void o(x2.q qVar) {
            kotlin.jvm.internal.s.g(qVar, "<set-?>");
            this.f25639a = qVar;
        }

        @Override // x2.d
        public long p0(long j11) {
            return v0.a.g(this, j11);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends k.f {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<v0, x2.b, a0> f25644c;

        /* loaded from: classes.dex */
        public static final class a implements a0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a0 f25645a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ u0 f25646b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f25647c;

            a(a0 a0Var, u0 u0Var, int i11) {
                this.f25645a = a0Var;
                this.f25646b = u0Var;
                this.f25647c = i11;
            }

            @Override // f2.a0
            public void b() {
                this.f25646b.f25627f = this.f25647c;
                this.f25645a.b();
                u0 u0Var = this.f25646b;
                u0Var.s(u0Var.f25627f);
            }

            @Override // f2.a0
            public Map<f2.a, Integer> c() {
                return this.f25645a.c();
            }

            @Override // f2.a0
            public int getHeight() {
                return this.f25645a.getHeight();
            }

            @Override // f2.a0
            public int getWidth() {
                return this.f25645a.getWidth();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(h00.p<? super v0, ? super x2.b, ? extends a0> pVar, String str) {
            super(str);
            this.f25644c = pVar;
        }

        @Override // f2.z
        public a0 b(b0 receiver, List<? extends y> measurables, long j11) {
            kotlin.jvm.internal.s.g(receiver, "$receiver");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            u0.this.f25630i.o(receiver.getLayoutDirection());
            u0.this.f25630i.a(receiver.getDensity());
            u0.this.f25630i.h(receiver.c0());
            u0.this.f25627f = 0;
            return new a(this.f25644c.invoke(u0.this.f25630i, x2.b.b(j11)), u0.this, u0.this.f25627f);
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f25649b;

        e(Object obj) {
            this.f25649b = obj;
        }

        @Override // f2.u0.b
        public void dispose() {
            h2.k kVar = (h2.k) u0.this.f25631j.remove(this.f25649b);
            if (kVar != null) {
                int indexOf = u0.this.x().M().indexOf(kVar);
                if (indexOf != -1) {
                    if (u0.this.f25632k < u0.this.f25622a) {
                        u0.this.B(indexOf, (u0.this.x().M().size() - u0.this.f25633l) - u0.this.f25632k, 1);
                        u0.this.f25632k++;
                    } else {
                        u0 u0Var = u0.this;
                        h2.k x11 = u0Var.x();
                        x11.f28701k = true;
                        u0Var.u(kVar);
                        u0Var.x().K0(indexOf, 1);
                        x11.f28701k = false;
                    }
                    if (u0.this.f25633l > 0) {
                        u0 u0Var2 = u0.this;
                        u0Var2.f25633l--;
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* loaded from: classes.dex */
    static final class f extends kotlin.jvm.internal.u implements h00.p<h2.k, h00.p<? super v0, ? super x2.b, ? extends a0>, vz.b0> {
        f() {
            super(2);
        }

        public final void a(h2.k kVar, h00.p<? super v0, ? super x2.b, ? extends a0> it2) {
            kotlin.jvm.internal.s.g(kVar, "$this$null");
            kotlin.jvm.internal.s.g(it2, "it");
            kVar.b(u0.this.q(it2));
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(h2.k kVar, h00.p<? super v0, ? super x2.b, ? extends a0> pVar) {
            a(kVar, pVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class g extends kotlin.jvm.internal.u implements h00.l<h2.k, vz.b0> {
        g() {
            super(1);
        }

        public final void a(h2.k kVar) {
            kotlin.jvm.internal.s.g(kVar, "$this$null");
            u0.this.f25626e = kVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(h2.k kVar) {
            a(kVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f25653b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h2.k f25654c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f25655a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar) {
                super(2);
                this.f25655a = pVar;
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return vz.b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                } else {
                    this.f25655a.invoke(iVar, 0);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a aVar, h2.k kVar) {
            super(0);
            this.f25653b = aVar;
            this.f25654c = kVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            u0 u0Var = u0.this;
            a aVar = this.f25653b;
            h2.k kVar = this.f25654c;
            h2.k x11 = u0Var.x();
            x11.f28701k = true;
            h00.p<c1.i, Integer, vz.b0> b11 = aVar.b();
            c1.l a11 = aVar.a();
            c1.m w11 = u0Var.w();
            if (w11 != null) {
                aVar.e(u0Var.I(a11, kVar, w11, j1.c.c(-985539783, true, new a(b11))));
                x11.f28701k = false;
                return;
            }
            throw new IllegalStateException("parent composition reference not set".toString());
        }
    }

    public u0(int i11) {
        this.f25622a = i11;
        this.f25624c = new g();
        this.f25625d = new f();
        this.f25628g = new LinkedHashMap();
        this.f25629h = new LinkedHashMap();
        this.f25630i = new c(this);
        this.f25631j = new LinkedHashMap();
        this.f25634m = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    private final void A() {
        if (this.f25628g.size() == x().M().size()) {
            return;
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f25628g.size() + ") and the children count on the SubcomposeLayout (" + x().M().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int i11, int i12, int i13) {
        h2.k x11 = x();
        x11.f28701k = true;
        x().z0(i11, i12, i13);
        x11.f28701k = false;
    }

    static /* synthetic */ void C(u0 u0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 1;
        }
        u0Var.B(i11, i12, i13);
    }

    private final void F(h2.k kVar, a aVar) {
        kVar.W0(new h(aVar, kVar));
    }

    private final void G(h2.k kVar, Object obj, h00.p<? super c1.i, ? super Integer, vz.b0> pVar) {
        Map<h2.k, a> map = this.f25628g;
        a aVar = map.get(kVar);
        if (aVar == null) {
            aVar = new a(obj, f2.c.f25562a.a(), null, 4, null);
            map.put(kVar, aVar);
        }
        a aVar2 = aVar;
        c1.l a11 = aVar2.a();
        boolean k11 = a11 == null ? true : a11.k();
        if (aVar2.b() != pVar || k11 || aVar2.c()) {
            aVar2.f(pVar);
            F(kVar, aVar2);
            aVar2.g(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c1.l I(c1.l lVar, h2.k kVar, c1.m mVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar) {
        if (lVar == null || lVar.isDisposed()) {
            lVar = l2.a(kVar, mVar);
        }
        lVar.d(pVar);
        return lVar;
    }

    private final h2.k J(Object obj) {
        if (this.f25632k > 0) {
            int size = x().M().size() - this.f25633l;
            int i11 = size - this.f25632k;
            int i12 = i11;
            while (true) {
                a aVar = (a) wz.p0.j(this.f25628g, x().M().get(i12));
                if (kotlin.jvm.internal.s.c(aVar.d(), obj)) {
                    break;
                } else if (i12 == size - 1) {
                    aVar.h(obj);
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 != i11) {
                B(i12, i11, 1);
            }
            this.f25632k--;
            return x().M().get(i11);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z q(h00.p<? super v0, ? super x2.b, ? extends a0> pVar) {
        return new d(pVar, this.f25634m);
    }

    private final h2.k r(int i11) {
        h2.k kVar = new h2.k(true);
        h2.k x11 = x();
        x11.f28701k = true;
        x().q0(i11, kVar);
        x11.f28701k = false;
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int i11) {
        int size = x().M().size() - this.f25633l;
        int max = Math.max(i11, size - this.f25622a);
        int i12 = size - max;
        this.f25632k = i12;
        int i13 = i12 + max;
        int i14 = max;
        while (i14 < i13) {
            int i15 = i14 + 1;
            a aVar = this.f25628g.get(x().M().get(i14));
            kotlin.jvm.internal.s.e(aVar);
            this.f25629h.remove(aVar.d());
            i14 = i15;
        }
        int i16 = max - i11;
        if (i16 > 0) {
            h2.k x11 = x();
            x11.f28701k = true;
            int i17 = i11 + i16;
            for (int i18 = i11; i18 < i17; i18++) {
                u(x().M().get(i18));
            }
            x().K0(i11, i16);
            x11.f28701k = false;
        }
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(h2.k kVar) {
        a remove = this.f25628g.remove(kVar);
        kotlin.jvm.internal.s.e(remove);
        a aVar = remove;
        c1.l a11 = aVar.a();
        kotlin.jvm.internal.s.e(a11);
        a11.dispose();
        this.f25629h.remove(aVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h2.k x() {
        h2.k kVar = this.f25626e;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final b D(Object obj, h00.p<? super c1.i, ? super Integer, vz.b0> content) {
        kotlin.jvm.internal.s.g(content, "content");
        A();
        if (!this.f25629h.containsKey(obj)) {
            Map<Object, h2.k> map = this.f25631j;
            h2.k kVar = map.get(obj);
            if (kVar == null) {
                if (this.f25632k > 0) {
                    kVar = J(obj);
                    B(x().M().indexOf(kVar), x().M().size(), 1);
                    this.f25633l++;
                } else {
                    kVar = r(x().M().size());
                    this.f25633l++;
                }
                map.put(obj, kVar);
            }
            G(kVar, obj, content);
        }
        return new e(obj);
    }

    public final void E(c1.m mVar) {
        this.f25623b = mVar;
    }

    public final List<y> H(Object obj, h00.p<? super c1.i, ? super Integer, vz.b0> content) {
        kotlin.jvm.internal.s.g(content, "content");
        A();
        k.e R = x().R();
        if (R == k.e.Measuring || R == k.e.LayingOut) {
            Map<Object, h2.k> map = this.f25629h;
            h2.k kVar = map.get(obj);
            if (kVar == null) {
                kVar = this.f25631j.remove(obj);
                if (kVar != null) {
                    int i11 = this.f25633l;
                    if (i11 > 0) {
                        this.f25633l = i11 - 1;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else if (this.f25632k > 0) {
                    kVar = J(obj);
                } else {
                    kVar = r(this.f25627f);
                }
                map.put(obj, kVar);
            }
            h2.k kVar2 = kVar;
            int indexOf = x().M().indexOf(kVar2);
            int i12 = this.f25627f;
            if (indexOf >= i12) {
                if (i12 != indexOf) {
                    C(this, indexOf, i12, 0, 4, null);
                }
                this.f25627f++;
                G(kVar2, obj, content);
                return kVar2.J();
            }
            throw new IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        }
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
    }

    public final void t() {
        for (a aVar : this.f25628g.values()) {
            c1.l a11 = aVar.a();
            if (a11 != null) {
                a11.dispose();
            }
        }
        this.f25628g.clear();
        this.f25629h.clear();
    }

    public final void v() {
        h2.k kVar = this.f25626e;
        if (kVar != null) {
            for (Map.Entry<h2.k, a> entry : this.f25628g.entrySet()) {
                entry.getValue().g(true);
            }
            if (kVar.R() != k.e.NeedsRemeasure) {
                kVar.N0();
            }
        }
    }

    public final c1.m w() {
        return this.f25623b;
    }

    public final h00.p<h2.k, h00.p<? super v0, ? super x2.b, ? extends a0>, vz.b0> y() {
        return this.f25625d;
    }

    public final h00.l<h2.k, vz.b0> z() {
        return this.f25624c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Object f25635a;

        /* renamed from: b  reason: collision with root package name */
        private h00.p<? super c1.i, ? super Integer, vz.b0> f25636b;

        /* renamed from: c  reason: collision with root package name */
        private c1.l f25637c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f25638d;

        public a(Object obj, h00.p<? super c1.i, ? super Integer, vz.b0> content, c1.l lVar) {
            kotlin.jvm.internal.s.g(content, "content");
            this.f25635a = obj;
            this.f25636b = content;
            this.f25637c = lVar;
        }

        public final c1.l a() {
            return this.f25637c;
        }

        public final h00.p<c1.i, Integer, vz.b0> b() {
            return this.f25636b;
        }

        public final boolean c() {
            return this.f25638d;
        }

        public final Object d() {
            return this.f25635a;
        }

        public final void e(c1.l lVar) {
            this.f25637c = lVar;
        }

        public final void f(h00.p<? super c1.i, ? super Integer, vz.b0> pVar) {
            kotlin.jvm.internal.s.g(pVar, "<set-?>");
            this.f25636b = pVar;
        }

        public final void g(boolean z11) {
            this.f25638d = z11;
        }

        public final void h(Object obj) {
            this.f25635a = obj;
        }

        public /* synthetic */ a(Object obj, h00.p pVar, c1.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, pVar, (i11 & 4) != 0 ? null : lVar);
        }
    }

    public u0() {
        this(0);
    }
}
package z2;

import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.m0;
import f3.e;
import g3.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t1.g0;
import t1.i1;

/* loaded from: classes.dex */
public class x implements b.InterfaceC0524b, r {

    /* renamed from: a  reason: collision with root package name */
    private String f60135a = "";

    /* renamed from: b  reason: collision with root package name */
    private w f60136b;

    /* renamed from: c  reason: collision with root package name */
    private final f3.f f60137c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<f2.y, m0> f60138d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<f2.y, Integer[]> f60139e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<f2.y, d3.f> f60140f;

    /* renamed from: g  reason: collision with root package name */
    protected x2.d f60141g;

    /* renamed from: h  reason: collision with root package name */
    protected f2.b0 f60142h;

    /* renamed from: i  reason: collision with root package name */
    private final vz.k f60143i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f60144j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f60145k;

    /* renamed from: l  reason: collision with root package name */
    private float f60146l;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60147a;

        static {
            int[] iArr = new int[e.b.values().length];
            iArr[e.b.FIXED.ordinal()] = 1;
            iArr[e.b.WRAP_CONTENT.ordinal()] = 2;
            iArr[e.b.MATCH_CONSTRAINT.ordinal()] = 3;
            iArr[e.b.MATCH_PARENT.ordinal()] = 4;
            f60147a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<g0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d3.f f60148a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d3.f fVar) {
            super(1);
            this.f60148a = fVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(g0 g0Var) {
            invoke2(g0Var);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(g0 g0Var) {
            kotlin.jvm.internal.s.g(g0Var, "$this$null");
            if (!Float.isNaN(this.f60148a.f23556f) || !Float.isNaN(this.f60148a.f23557g)) {
                g0Var.H(i1.a(Float.isNaN(this.f60148a.f23556f) ? 0.5f : this.f60148a.f23556f, Float.isNaN(this.f60148a.f23557g) ? 0.5f : this.f60148a.f23557g));
            }
            if (!Float.isNaN(this.f60148a.f23558h)) {
                g0Var.j(this.f60148a.f23558h);
            }
            if (!Float.isNaN(this.f60148a.f23559i)) {
                g0Var.k(this.f60148a.f23559i);
            }
            if (!Float.isNaN(this.f60148a.f23560j)) {
                g0Var.l(this.f60148a.f23560j);
            }
            if (!Float.isNaN(this.f60148a.f23561k)) {
                g0Var.n(this.f60148a.f23561k);
            }
            if (!Float.isNaN(this.f60148a.f23562l)) {
                g0Var.d(this.f60148a.f23562l);
            }
            if (!Float.isNaN(this.f60148a.f23563m)) {
                g0Var.Q(this.f60148a.f23563m);
            }
            if (!Float.isNaN(this.f60148a.f23564n) || !Float.isNaN(this.f60148a.f23565o)) {
                g0Var.f(Float.isNaN(this.f60148a.f23564n) ? 1.0f : this.f60148a.f23564n);
                g0Var.m(Float.isNaN(this.f60148a.f23565o) ? 1.0f : this.f60148a.f23565o);
            }
            if (Float.isNaN(this.f60148a.f23566p)) {
                return;
            }
            g0Var.b(this.f60148a.f23566p);
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<y> {
        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final y invoke() {
            return new y(x.this.f());
        }
    }

    public x() {
        vz.k b11;
        f3.f fVar = new f3.f(0, 0);
        fVar.U1(this);
        vz.b0 b0Var = vz.b0.f54756a;
        this.f60137c = fVar;
        this.f60138d = new LinkedHashMap();
        this.f60139e = new LinkedHashMap();
        this.f60140f = new LinkedHashMap();
        b11 = vz.m.b(kotlin.b.NONE, new c());
        this.f60143i = b11;
        this.f60144j = new int[2];
        this.f60145k = new int[2];
        this.f60146l = Float.NaN;
        new ArrayList();
    }

    private final void e(Integer[] numArr, b.a aVar) {
        numArr[0] = Integer.valueOf(aVar.f27494e);
        numArr[1] = Integer.valueOf(aVar.f27495f);
        numArr[2] = Integer.valueOf(aVar.f27496g);
    }

    private final boolean j(e.b bVar, int i11, int i12, int i13, boolean z11, boolean z12, int i14, int[] iArr) {
        boolean z13;
        boolean z14;
        int i15 = a.f60147a[bVar.ordinal()];
        if (i15 == 1) {
            iArr[0] = i11;
            iArr[1] = i11;
        } else if (i15 == 2) {
            iArr[0] = 0;
            iArr[1] = i14;
            return true;
        } else if (i15 == 3) {
            z13 = i.f60097a;
            if (z13) {
                Log.d("CCL", kotlin.jvm.internal.s.p("Measure strategy ", Integer.valueOf(i13)));
                Log.d("CCL", kotlin.jvm.internal.s.p("DW ", Integer.valueOf(i12)));
                Log.d("CCL", kotlin.jvm.internal.s.p("ODR ", Boolean.valueOf(z11)));
                Log.d("CCL", kotlin.jvm.internal.s.p("IRH ", Boolean.valueOf(z12)));
            }
            boolean z15 = z12 || ((i13 == b.a.f27488l || i13 == b.a.f27489m) && (i13 == b.a.f27489m || i12 != 1 || z11));
            z14 = i.f60097a;
            if (z14) {
                Log.d("CCL", kotlin.jvm.internal.s.p("UD ", Boolean.valueOf(z15)));
            }
            iArr[0] = z15 ? i11 : 0;
            if (!z15) {
                i11 = i14;
            }
            iArr[1] = i11;
            if (!z15) {
                return true;
            }
        } else if (i15 == 4) {
            iArr[0] = i14;
            iArr[1] = i14;
        } else {
            throw new IllegalStateException((bVar + " is not supported").toString());
        }
        return false;
    }

    @Override // g3.b.InterfaceC0524b
    public void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
        if (r20.f25744v == 0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object] */
    @Override // g3.b.InterfaceC0524b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(f3.e r20, g3.b.a r21) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.x.b(f3.e, g3.b$a):void");
    }

    protected final void c(long j11) {
        this.f60137c.j1(x2.b.n(j11));
        this.f60137c.K0(x2.b.m(j11));
        this.f60146l = Float.NaN;
        w wVar = this.f60136b;
        if (wVar != null) {
            Integer valueOf = wVar == null ? null : Integer.valueOf(wVar.d());
            if (valueOf == null || valueOf.intValue() != Integer.MIN_VALUE) {
                w wVar2 = this.f60136b;
                kotlin.jvm.internal.s.e(wVar2);
                int d11 = wVar2.d();
                if (d11 > this.f60137c.W()) {
                    this.f60146l = this.f60137c.W() / d11;
                } else {
                    this.f60146l = 1.0f;
                }
                this.f60137c.j1(d11);
            }
        }
        w wVar3 = this.f60136b;
        if (wVar3 != null) {
            Integer valueOf2 = wVar3 != null ? Integer.valueOf(wVar3.a()) : null;
            if (valueOf2 == null || valueOf2.intValue() != Integer.MIN_VALUE) {
                w wVar4 = this.f60136b;
                kotlin.jvm.internal.s.e(wVar4);
                int a11 = wVar4.a();
                if (Float.isNaN(this.f60146l)) {
                    this.f60146l = 1.0f;
                }
                float v11 = a11 > this.f60137c.v() ? this.f60137c.v() / a11 : 1.0f;
                if (v11 < this.f60146l) {
                    this.f60146l = v11;
                }
                this.f60137c.K0(a11);
            }
        }
        this.f60137c.W();
        this.f60137c.v();
    }

    public void d() {
        f3.e eVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{ ");
        sb2.append("  root: {");
        sb2.append("interpolated: { left:  0,");
        sb2.append("  top:  0,");
        sb2.append("  right:   " + this.f60137c.W() + " ,");
        sb2.append("  bottom:  " + this.f60137c.v() + " ,");
        sb2.append(" } }");
        Iterator<f3.e> it2 = this.f60137c.q1().iterator();
        while (it2.hasNext()) {
            f3.e next = it2.next();
            Object q11 = next.q();
            if (!(q11 instanceof f2.y)) {
                if (next instanceof f3.g) {
                    sb2.append(' ' + ((Object) next.f25726m) + ": {");
                    f3.g gVar = (f3.g) next;
                    if (gVar.r1() == 0) {
                        sb2.append(" type: 'hGuideline', ");
                    } else {
                        sb2.append(" type: 'vGuideline', ");
                    }
                    sb2.append(" interpolated: ");
                    sb2.append(" { left: " + gVar.X() + ", top: " + gVar.Y() + ", right: " + (gVar.X() + gVar.W()) + ", bottom: " + (gVar.Y() + gVar.v()) + " }");
                    sb2.append("}, ");
                }
            } else {
                d3.f fVar = null;
                if (next.f25726m == null) {
                    f2.y yVar = (f2.y) q11;
                    Object a11 = f2.r.a(yVar);
                    if (a11 == null) {
                        a11 = l.a(yVar);
                    }
                    next.f25726m = a11 == null ? null : a11.toString();
                }
                d3.f fVar2 = this.f60140f.get(q11);
                if (fVar2 != null && (eVar = fVar2.f23551a) != null) {
                    fVar = eVar.f25724l;
                }
                if (fVar != null) {
                    sb2.append(' ' + ((Object) next.f25726m) + ": {");
                    sb2.append(" interpolated : ");
                    fVar.d(sb2, true);
                    sb2.append("}, ");
                }
            }
        }
        sb2.append(" }");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "json.toString()");
        this.f60135a = sb3;
        w wVar = this.f60136b;
        if (wVar == null) {
            return;
        }
        wVar.b(sb3);
    }

    protected final x2.d f() {
        x2.d dVar = this.f60141g;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.s.x("density");
        throw null;
    }

    protected final Map<f2.y, d3.f> g() {
        return this.f60140f;
    }

    protected final Map<f2.y, m0> h() {
        return this.f60138d;
    }

    protected final y i() {
        return (y) this.f60143i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(m0.a aVar, List<? extends f2.y> measurables) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        if (this.f60140f.isEmpty()) {
            Iterator<f3.e> it2 = this.f60137c.q1().iterator();
            while (it2.hasNext()) {
                f3.e next = it2.next();
                Object q11 = next.q();
                if (q11 instanceof f2.y) {
                    this.f60140f.put(q11, new d3.f(next.f25724l.h()));
                }
            }
        }
        int i11 = 0;
        int size = measurables.size() - 1;
        if (size >= 0) {
            while (true) {
                int i12 = i11 + 1;
                f2.y yVar = measurables.get(i11);
                d3.f fVar = g().get(yVar);
                if (fVar == null) {
                    return;
                }
                if (fVar.c()) {
                    d3.f fVar2 = g().get(yVar);
                    kotlin.jvm.internal.s.e(fVar2);
                    int i13 = fVar2.f23552b;
                    d3.f fVar3 = g().get(yVar);
                    kotlin.jvm.internal.s.e(fVar3);
                    int i14 = fVar3.f23553c;
                    m0 m0Var = h().get(yVar);
                    if (m0Var != null) {
                        m0.a.l(aVar, m0Var, x2.l.a(i13, i14), BitmapDescriptorFactory.HUE_RED, 2, null);
                    }
                } else {
                    b bVar = new b(fVar);
                    d3.f fVar4 = g().get(yVar);
                    kotlin.jvm.internal.s.e(fVar4);
                    int i15 = fVar4.f23552b;
                    d3.f fVar5 = g().get(yVar);
                    kotlin.jvm.internal.s.e(fVar5);
                    int i16 = fVar5.f23553c;
                    float f11 = Float.isNaN(fVar.f23563m) ? BitmapDescriptorFactory.HUE_RED : fVar.f23563m;
                    m0 m0Var2 = h().get(yVar);
                    if (m0Var2 != null) {
                        aVar.u(m0Var2, i15, i16, f11, bVar);
                    }
                }
                if (i12 > size) {
                    break;
                }
                i11 = i12;
            }
        }
        w wVar = this.f60136b;
        if ((wVar == null ? null : wVar.c()) == v.BOUNDS) {
            d();
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    public final long l(long j11, x2.q layoutDirection, n constraintSet, List<? extends f2.y> measurables, int i11, f2.b0 measureScope) {
        d3.b h11;
        d3.b h12;
        boolean z11;
        boolean z12;
        boolean z13;
        String g11;
        String g12;
        String obj;
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.s.g(constraintSet, "constraintSet");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        kotlin.jvm.internal.s.g(measureScope, "measureScope");
        n(measureScope);
        o(measureScope);
        y i12 = i();
        if (x2.b.l(j11)) {
            h11 = d3.b.a(x2.b.n(j11));
        } else {
            h11 = d3.b.c().h(x2.b.p(j11));
        }
        i12.l(h11);
        y i13 = i();
        if (x2.b.k(j11)) {
            h12 = d3.b.a(x2.b.m(j11));
        } else {
            h12 = d3.b.c().h(x2.b.o(j11));
        }
        i13.e(h12);
        i().q(j11);
        i().p(layoutDirection);
        m();
        if (constraintSet.a(measurables)) {
            i().h();
            constraintSet.c(i(), measurables);
            i.d(i(), measurables);
            i().a(this.f60137c);
        } else {
            i.d(i(), measurables);
        }
        c(j11);
        this.f60137c.Z1();
        z11 = i.f60097a;
        if (z11) {
            this.f60137c.B0("ConstraintLayout");
            ArrayList<f3.e> q12 = this.f60137c.q1();
            kotlin.jvm.internal.s.f(q12, "root.children");
            for (f3.e eVar : q12) {
                Object q11 = eVar.q();
                f2.y yVar = q11 instanceof f2.y ? (f2.y) q11 : null;
                Object a11 = yVar == null ? null : f2.r.a(yVar);
                String str = "NOTAG";
                if (a11 != null && (obj = a11.toString()) != null) {
                    str = obj;
                }
                eVar.B0(str);
            }
            Log.d("CCL", kotlin.jvm.internal.s.p("ConstraintLayout is asked to measure with ", x2.b.r(j11)));
            g11 = i.g(this.f60137c);
            Log.d("CCL", g11);
            Iterator<f3.e> it2 = this.f60137c.q1().iterator();
            while (it2.hasNext()) {
                f3.e child = it2.next();
                kotlin.jvm.internal.s.f(child, "child");
                g12 = i.g(child);
                Log.d("CCL", g12);
            }
        }
        this.f60137c.V1(i11);
        f3.f fVar = this.f60137c;
        fVar.Q1(fVar.J1(), 0, 0, 0, 0, 0, 0, 0, 0);
        Iterator<f3.e> it3 = this.f60137c.q1().iterator();
        while (it3.hasNext()) {
            f3.e next = it3.next();
            ?? q13 = next.q();
            if (q13 instanceof f2.y) {
                m0 m0Var = this.f60138d.get(q13);
                Integer valueOf = m0Var == null ? null : Integer.valueOf(m0Var.B0());
                Integer valueOf2 = m0Var == null ? null : Integer.valueOf(m0Var.w0());
                int W = next.W();
                if (valueOf != null && W == valueOf.intValue()) {
                    int v11 = next.v();
                    if (valueOf2 != null && v11 == valueOf2.intValue()) {
                    }
                }
                z13 = i.f60097a;
                if (z13) {
                    Log.d("CCL", "Final measurement for " + f2.r.a((f2.y) q13) + " to confirm size " + next.W() + ' ' + next.v());
                }
                h().put(q13, ((f2.y) q13).X(x2.b.f56930b.c(next.W(), next.v())));
            }
        }
        z12 = i.f60097a;
        if (z12) {
            Log.d("CCL", "ConstraintLayout is at the end " + this.f60137c.W() + ' ' + this.f60137c.v());
        }
        return x2.p.a(this.f60137c.W(), this.f60137c.v());
    }

    public final void m() {
        this.f60138d.clear();
        this.f60139e.clear();
        this.f60140f.clear();
    }

    protected final void n(x2.d dVar) {
        kotlin.jvm.internal.s.g(dVar, "<set-?>");
        this.f60141g = dVar;
    }

    protected final void o(f2.b0 b0Var) {
        kotlin.jvm.internal.s.g(b0Var, "<set-?>");
        this.f60142h = b0Var;
    }
}
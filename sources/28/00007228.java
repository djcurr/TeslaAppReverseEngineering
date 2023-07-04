package h2;

import h2.f0;
import h2.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    private final k f28760a;

    /* renamed from: b */
    private final c f28761b;

    /* renamed from: c */
    private boolean f28762c;

    /* renamed from: d */
    private final c0 f28763d;

    /* renamed from: e */
    private long f28764e;

    /* renamed from: f */
    private final List<k> f28765f;

    /* renamed from: g */
    private x2.b f28766g;

    /* renamed from: h */
    private final p f28767h;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28768a;

        static {
            int[] iArr = new int[k.e.values().length];
            iArr[k.e.Measuring.ordinal()] = 1;
            iArr[k.e.NeedsRemeasure.ordinal()] = 2;
            iArr[k.e.LayingOut.ordinal()] = 3;
            iArr[k.e.NeedsRelayout.ordinal()] = 4;
            iArr[k.e.Ready.ordinal()] = 5;
            f28768a = iArr;
        }
    }

    public q(k root) {
        kotlin.jvm.internal.s.g(root, "root");
        this.f28760a = root;
        f0.a aVar = f0.Z0;
        c cVar = new c(aVar.a());
        this.f28761b = cVar;
        this.f28763d = new c0();
        this.f28764e = 1L;
        ArrayList arrayList = new ArrayList();
        this.f28765f = arrayList;
        this.f28767h = aVar.a() ? new p(root, cVar, arrayList) : null;
    }

    public static /* synthetic */ void d(q qVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        qVar.c(z11);
    }

    private final boolean e(k kVar) {
        boolean I0;
        if (kVar == this.f28760a) {
            x2.b bVar = this.f28766g;
            kotlin.jvm.internal.s.e(bVar);
            I0 = kVar.H0(bVar);
        } else {
            I0 = k.I0(kVar, null, 1, null);
        }
        k e02 = kVar.e0();
        if (I0 && e02 != null) {
            if (kVar.Y() == k.g.InMeasureBlock) {
                n(e02);
            } else {
                if (kVar.Y() == k.g.InLayoutBlock) {
                    m(e02);
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        }
        return I0;
    }

    private final boolean g(k kVar) {
        return kVar.R() == k.e.NeedsRemeasure && (kVar.Y() == k.g.InMeasureBlock || kVar.H().e());
    }

    public final boolean l(k kVar) {
        int i11 = 0;
        if (kVar.e() || g(kVar) || kVar.H().e()) {
            boolean e11 = kVar.R() == k.e.NeedsRemeasure ? e(kVar) : false;
            if (kVar.R() == k.e.NeedsRelayout && kVar.e()) {
                if (kVar == this.f28760a) {
                    kVar.F0(0, 0);
                } else {
                    kVar.L0();
                }
                this.f28763d.c(kVar);
                p pVar = this.f28767h;
                if (pVar != null) {
                    pVar.a();
                }
            }
            if (!this.f28765f.isEmpty()) {
                List<k> list = this.f28765f;
                int size = list.size();
                while (i11 < size) {
                    int i12 = i11 + 1;
                    k kVar2 = list.get(i11);
                    if (kVar2.u0()) {
                        n(kVar2);
                    }
                    i11 = i12;
                }
                this.f28765f.clear();
            }
            return e11;
        }
        return false;
    }

    public final void c(boolean z11) {
        if (z11) {
            this.f28763d.d(this.f28760a);
        }
        this.f28763d.a();
    }

    public final void f(k layoutNode) {
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        if (this.f28761b.d()) {
            return;
        }
        if (this.f28762c) {
            int i11 = 0;
            if (layoutNode.R() != k.e.NeedsRemeasure) {
                d1.e<k> j02 = layoutNode.j0();
                int l11 = j02.l();
                if (l11 > 0) {
                    k[] k11 = j02.k();
                    do {
                        k kVar = k11[i11];
                        k.e R = kVar.R();
                        k.e eVar = k.e.NeedsRemeasure;
                        if (R == eVar && this.f28761b.f(kVar)) {
                            l(kVar);
                        }
                        if (kVar.R() != eVar) {
                            f(kVar);
                        }
                        i11++;
                    } while (i11 < l11);
                    if (layoutNode.R() == k.e.NeedsRemeasure || !this.f28761b.f(layoutNode)) {
                        return;
                    }
                    l(layoutNode);
                    return;
                } else if (layoutNode.R() == k.e.NeedsRemeasure) {
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean h() {
        return !this.f28761b.d();
    }

    public final long i() {
        if (this.f28762c) {
            return this.f28764e;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public final boolean j(h00.a<vz.b0> aVar) {
        if (this.f28760a.u0()) {
            if (this.f28760a.e()) {
                if (!this.f28762c) {
                    if (this.f28766g != null && (!this.f28761b.d())) {
                        this.f28762c = true;
                        try {
                            c cVar = this.f28761b;
                            boolean z11 = false;
                            while (!cVar.d()) {
                                k e11 = cVar.e();
                                boolean l11 = l(e11);
                                if (e11 == this.f28760a && l11) {
                                    z11 = true;
                                }
                            }
                            this.f28762c = false;
                            p pVar = this.f28767h;
                            if (pVar != null) {
                                pVar.a();
                            }
                            if (aVar != null) {
                                aVar.invoke();
                            }
                            return z11;
                        } catch (Throwable th2) {
                            this.f28762c = false;
                            throw th2;
                        }
                    }
                    return false;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void k(k node) {
        kotlin.jvm.internal.s.g(node, "node");
        this.f28761b.f(node);
    }

    public final boolean m(k layoutNode) {
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        int i11 = a.f28768a[layoutNode.R().ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            p pVar = this.f28767h;
            if (pVar == null) {
                return false;
            }
            pVar.a();
            return false;
        } else if (i11 == 5) {
            k.e eVar = k.e.NeedsRelayout;
            layoutNode.S0(eVar);
            if (layoutNode.e()) {
                k e02 = layoutNode.e0();
                k.e R = e02 == null ? null : e02.R();
                if (R != k.e.NeedsRemeasure && R != eVar) {
                    this.f28761b.a(layoutNode);
                }
            }
            return !this.f28762c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean n(k layoutNode) {
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        int i11 = a.f28768a[layoutNode.R().ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                this.f28765f.add(layoutNode);
                p pVar = this.f28767h;
                if (pVar != null) {
                    pVar.a();
                }
            } else if (i11 != 4 && i11 != 5) {
                throw new NoWhenBranchMatchedException();
            } else {
                k.e eVar = k.e.NeedsRemeasure;
                layoutNode.S0(eVar);
                if (layoutNode.e() || g(layoutNode)) {
                    k e02 = layoutNode.e0();
                    if ((e02 == null ? null : e02.R()) != eVar) {
                        this.f28761b.a(layoutNode);
                    }
                }
                if (!this.f28762c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o(long j11) {
        x2.b bVar = this.f28766g;
        if (bVar == null ? false : x2.b.g(bVar.s(), j11)) {
            return;
        }
        if (!this.f28762c) {
            this.f28766g = x2.b.b(j11);
            this.f28760a.S0(k.e.NeedsRemeasure);
            this.f28761b.a(this.f28760a);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
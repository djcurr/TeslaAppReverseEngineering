package d2;

import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: b  reason: collision with root package name */
    private final a0 f23375b;

    /* renamed from: c  reason: collision with root package name */
    private final d1.e<t> f23376c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<t, u> f23377d;

    /* renamed from: e  reason: collision with root package name */
    private f2.o f23378e;

    /* renamed from: f  reason: collision with root package name */
    private m f23379f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f23380g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f23381h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f23382i;

    public j(a0 pointerInputFilter) {
        kotlin.jvm.internal.s.g(pointerInputFilter, "pointerInputFilter");
        this.f23375b = pointerInputFilter;
        this.f23376c = new d1.e<>(new t[16], 0);
        this.f23377d = new LinkedHashMap();
        this.f23381h = true;
        this.f23382i = true;
    }

    private final void i() {
        this.f23377d.clear();
        this.f23378e = null;
    }

    private final boolean l(m mVar, m mVar2) {
        if (mVar == null || mVar.b().size() != mVar2.b().size()) {
            return true;
        }
        int size = mVar2.b().size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            if (!s1.f.j(mVar.b().get(i11).h(), mVar2.b().get(i11).h())) {
                return true;
            }
            i11 = i12;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    @Override // d2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.util.Map<d2.t, d2.u> r30, f2.o r31, d2.g r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.j.a(java.util.Map, f2.o, d2.g, boolean):boolean");
    }

    @Override // d2.k
    public void b(g internalPointerEvent) {
        kotlin.jvm.internal.s.g(internalPointerEvent, "internalPointerEvent");
        super.b(internalPointerEvent);
        m mVar = this.f23379f;
        if (mVar == null) {
            return;
        }
        this.f23380g = this.f23381h;
        List<u> b11 = mVar.b();
        int size = b11.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            u uVar = b11.get(i11);
            if ((uVar.i() || (internalPointerEvent.d(uVar.g()) && this.f23381h)) ? false : true) {
                j().q(t.a(uVar.g()));
            }
            i11 = i12;
        }
        this.f23381h = false;
        this.f23382i = o.i(mVar.d(), o.f23387a.b());
    }

    @Override // d2.k
    public void d() {
        d1.e<j> g11 = g();
        int l11 = g11.l();
        if (l11 > 0) {
            int i11 = 0;
            j[] k11 = g11.k();
            do {
                k11[i11].d();
                i11++;
            } while (i11 < l11);
            this.f23375b.w0();
        }
        this.f23375b.w0();
    }

    @Override // d2.k
    public boolean e(g internalPointerEvent) {
        d1.e<j> g11;
        int l11;
        kotlin.jvm.internal.s.g(internalPointerEvent, "internalPointerEvent");
        boolean z11 = true;
        int i11 = 0;
        if (!this.f23377d.isEmpty() && k().v0()) {
            m mVar = this.f23379f;
            kotlin.jvm.internal.s.e(mVar);
            f2.o oVar = this.f23378e;
            kotlin.jvm.internal.s.e(oVar);
            k().x0(mVar, androidx.compose.ui.input.pointer.a.Final, oVar.e());
            if (k().v0() && (l11 = (g11 = g()).l()) > 0) {
                j[] k11 = g11.k();
                do {
                    k11[i11].e(internalPointerEvent);
                    i11++;
                } while (i11 < l11);
            }
        } else {
            z11 = false;
        }
        b(internalPointerEvent);
        i();
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // d2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(java.util.Map<d2.t, d2.u> r9, f2.o r10, d2.g r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "changes"
            kotlin.jvm.internal.s.g(r9, r0)
            java.lang.String r9 = "parentCoordinates"
            kotlin.jvm.internal.s.g(r10, r9)
            java.lang.String r9 = "internalPointerEvent"
            kotlin.jvm.internal.s.g(r11, r9)
            java.util.Map<d2.t, d2.u> r9 = r8.f23377d
            boolean r9 = r9.isEmpty()
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L1b
        L19:
            r10 = r0
            goto L79
        L1b:
            d2.a0 r9 = r8.k()
            boolean r9 = r9.v0()
            if (r9 != 0) goto L26
            goto L19
        L26:
            d2.m r9 = r8.f23379f
            kotlin.jvm.internal.s.e(r9)
            f2.o r1 = r8.f23378e
            kotlin.jvm.internal.s.e(r1)
            long r1 = r1.e()
            d2.a0 r3 = r8.k()
            androidx.compose.ui.input.pointer.a r4 = androidx.compose.ui.input.pointer.a.Initial
            r3.x0(r9, r4, r1)
            d2.a0 r3 = r8.k()
            boolean r3 = r3.v0()
            if (r3 == 0) goto L66
            d1.e r3 = r8.g()
            int r4 = r3.l()
            if (r4 <= 0) goto L66
            java.lang.Object[] r3 = r3.k()
        L55:
            r5 = r3[r0]
            d2.j r5 = (d2.j) r5
            java.util.Map<d2.t, d2.u> r6 = r8.f23377d
            f2.o r7 = r8.f23378e
            kotlin.jvm.internal.s.e(r7)
            r5.f(r6, r7, r11, r12)
            int r0 = r0 + r10
            if (r0 < r4) goto L55
        L66:
            d2.a0 r11 = r8.k()
            boolean r11 = r11.v0()
            if (r11 == 0) goto L79
            d2.a0 r11 = r8.k()
            androidx.compose.ui.input.pointer.a r12 = androidx.compose.ui.input.pointer.a.Main
            r11.x0(r9, r12, r1)
        L79:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.j.f(java.util.Map, f2.o, d2.g, boolean):boolean");
    }

    public final d1.e<t> j() {
        return this.f23376c;
    }

    public final a0 k() {
        return this.f23375b;
    }

    public final void m() {
        this.f23381h = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f23375b + ", children=" + g() + ", pointerIds=" + this.f23376c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
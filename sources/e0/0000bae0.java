package w0;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n2.a;
import r2.d;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: k  reason: collision with root package name */
    public static final a f54906k = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final n2.a f54907a;

    /* renamed from: b  reason: collision with root package name */
    private final n2.a0 f54908b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54909c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f54910d;

    /* renamed from: e  reason: collision with root package name */
    private final int f54911e;

    /* renamed from: f  reason: collision with root package name */
    private final x2.d f54912f;

    /* renamed from: g  reason: collision with root package name */
    private final d.a f54913g;

    /* renamed from: h  reason: collision with root package name */
    private final List<a.b<n2.p>> f54914h;

    /* renamed from: i  reason: collision with root package name */
    private n2.e f54915i;

    /* renamed from: j  reason: collision with root package name */
    private x2.q f54916j;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(t1.u canvas, n2.w textLayoutResult) {
            kotlin.jvm.internal.s.g(canvas, "canvas");
            kotlin.jvm.internal.s.g(textLayoutResult, "textLayoutResult");
            n2.x.f40416a.a(canvas, textLayoutResult);
        }
    }

    private d0(n2.a aVar, n2.a0 a0Var, int i11, boolean z11, int i12, x2.d dVar, d.a aVar2, List<a.b<n2.p>> list) {
        this.f54907a = aVar;
        this.f54908b = a0Var;
        this.f54909c = i11;
        this.f54910d = z11;
        this.f54911e = i12;
        this.f54912f = dVar;
        this.f54913g = aVar2;
        this.f54914h = list;
        if (!(i11 > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public /* synthetic */ d0(n2.a aVar, n2.a0 a0Var, int i11, boolean z11, int i12, x2.d dVar, d.a aVar2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, a0Var, i11, z11, i12, dVar, aVar2, list);
    }

    private final n2.e e() {
        n2.e eVar = this.f54915i;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("layoutForIntrinsics must be called first");
    }

    public static /* synthetic */ n2.w m(d0 d0Var, long j11, x2.q qVar, n2.w wVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            wVar = null;
        }
        return d0Var.l(j11, qVar, wVar);
    }

    private final n2.d o(long j11, x2.q qVar) {
        n(qVar);
        float p11 = x2.b.p(j11);
        float n11 = ((this.f54910d || w2.k.d(f(), w2.k.f55428a.b())) && x2.b.j(j11)) ? x2.b.n(j11) : Float.POSITIVE_INFINITY;
        int i11 = !this.f54910d && w2.k.d(f(), w2.k.f55428a.b()) ? 1 : this.f54909c;
        if (!(p11 == n11)) {
            n11 = m00.l.l(e().b(), p11, n11);
        }
        return new n2.d(e(), i11, w2.k.d(f(), w2.k.f55428a.b()), n11);
    }

    public final x2.d a() {
        return this.f54912f;
    }

    public final int b() {
        return (int) Math.ceil(e().b());
    }

    public final int c() {
        return this.f54909c;
    }

    public final int d() {
        return (int) Math.ceil(e().a());
    }

    public final int f() {
        return this.f54911e;
    }

    public final List<a.b<n2.p>> g() {
        return this.f54914h;
    }

    public final d.a h() {
        return this.f54913g;
    }

    public final boolean i() {
        return this.f54910d;
    }

    public final n2.a0 j() {
        return this.f54908b;
    }

    public final n2.a k() {
        return this.f54907a;
    }

    public final n2.w l(long j11, x2.q layoutDirection, n2.w wVar) {
        n2.v a11;
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        if (wVar != null && u0.a(wVar, this.f54907a, this.f54908b, this.f54914h, this.f54909c, this.f54910d, f(), this.f54912f, layoutDirection, this.f54913g, j11)) {
            a11 = r1.a((r25 & 1) != 0 ? r1.f40400a : null, (r25 & 2) != 0 ? r1.f40401b : j(), (r25 & 4) != 0 ? r1.f40402c : null, (r25 & 8) != 0 ? r1.f40403d : 0, (r25 & 16) != 0 ? r1.f40404e : false, (r25 & 32) != 0 ? r1.g() : 0, (r25 & 64) != 0 ? r1.f40406g : null, (r25 & 128) != 0 ? r1.f40407h : null, (r25 & 256) != 0 ? r1.f40408i : null, (r25 & 512) != 0 ? wVar.k().c() : j11);
            return wVar.a(a11, x2.c.d(j11, x2.p.a((int) Math.ceil(wVar.v().x()), (int) Math.ceil(wVar.v().g()))));
        }
        n2.d o11 = o(j11, layoutDirection);
        return new n2.w(new n2.v(this.f54907a, this.f54908b, this.f54914h, this.f54909c, this.f54910d, f(), this.f54912f, layoutDirection, this.f54913g, j11, null), o11, x2.c.d(j11, x2.p.a((int) Math.ceil(o11.x()), (int) Math.ceil(o11.g()))), null);
    }

    public final void n(x2.q layoutDirection) {
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        n2.e eVar = this.f54915i;
        if (eVar == null || layoutDirection != this.f54916j) {
            this.f54916j = layoutDirection;
            eVar = new n2.e(this.f54907a, n2.b0.b(this.f54908b, layoutDirection), this.f54914h, this.f54912f, this.f54913g);
        }
        this.f54915i = eVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ d0(n2.a r13, n2.a0 r14, int r15, boolean r16, int r17, x2.d r18, r2.d.a r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 4
            if (r1 == 0) goto Lb
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = r1
            goto Lc
        Lb:
            r5 = r15
        Lc:
            r1 = r0 & 8
            if (r1 == 0) goto L13
            r1 = 1
            r6 = r1
            goto L15
        L13:
            r6 = r16
        L15:
            r1 = r0 & 16
            if (r1 == 0) goto L21
            w2.k$a r1 = w2.k.f55428a
            int r1 = r1.a()
            r7 = r1
            goto L23
        L21:
            r7 = r17
        L23:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L2d
            java.util.List r0 = wz.u.i()
            r10 = r0
            goto L2f
        L2d:
            r10 = r20
        L2f:
            r11 = 0
            r2 = r12
            r3 = r13
            r4 = r14
            r8 = r18
            r9 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.d0.<init>(n2.a, n2.a0, int, boolean, int, x2.d, r2.d$a, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
package n0;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import c1.o0;
import c1.s1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements v {

    /* renamed from: a  reason: collision with root package name */
    private final t f39670a;

    /* renamed from: b  reason: collision with root package name */
    private final EdgeEffect f39671b;

    /* renamed from: c  reason: collision with root package name */
    private final EdgeEffect f39672c;

    /* renamed from: d  reason: collision with root package name */
    private final EdgeEffect f39673d;

    /* renamed from: e  reason: collision with root package name */
    private final EdgeEffect f39674e;

    /* renamed from: f  reason: collision with root package name */
    private final List<EdgeEffect> f39675f;

    /* renamed from: g  reason: collision with root package name */
    private final EdgeEffect f39676g;

    /* renamed from: h  reason: collision with root package name */
    private final EdgeEffect f39677h;

    /* renamed from: i  reason: collision with root package name */
    private final EdgeEffect f39678i;

    /* renamed from: j  reason: collision with root package name */
    private final EdgeEffect f39679j;

    /* renamed from: k  reason: collision with root package name */
    private final o0<Integer> f39680k;

    /* renamed from: l  reason: collision with root package name */
    private final o0 f39681l;

    /* renamed from: m  reason: collision with root package name */
    private final o0 f39682m;

    public a(Context context, t overScrollConfig) {
        List<EdgeEffect> l11;
        o0<Integer> d11;
        o0 d12;
        o0 d13;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(overScrollConfig, "overScrollConfig");
        this.f39670a = overScrollConfig;
        o oVar = o.f40103a;
        EdgeEffect a11 = oVar.a(context, null);
        this.f39671b = a11;
        EdgeEffect a12 = oVar.a(context, null);
        this.f39672c = a12;
        EdgeEffect a13 = oVar.a(context, null);
        this.f39673d = a13;
        EdgeEffect a14 = oVar.a(context, null);
        this.f39674e = a14;
        l11 = wz.w.l(a13, a11, a14, a12);
        this.f39675f = l11;
        this.f39676g = oVar.a(context, null);
        this.f39677h = oVar.a(context, null);
        this.f39678i = oVar.a(context, null);
        this.f39679j = oVar.a(context, null);
        int size = l11.size();
        for (int i11 = 0; i11 < size; i11++) {
            l11.get(i11).setColor(t1.c0.j(m().c()));
        }
        d11 = s1.d(0, null, 2, null);
        this.f39680k = d11;
        d12 = s1.d(s1.l.c(s1.l.f49969b.b()), null, 2, null);
        this.f39681l = d12;
        d13 = s1.d(Boolean.FALSE, null, 2, null);
        this.f39682m = d13;
    }

    private final boolean h(v1.e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-s1.l.i(l()), (-s1.l.g(l())) + eVar.i0(this.f39670a.a().a()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean i(v1.e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-s1.l.g(l()), eVar.i0(this.f39670a.a().c(eVar.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean j(v1.e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int c11;
        int save = canvas.save();
        c11 = j00.c.c(s1.l.i(l()));
        float b11 = this.f39670a.a().b(eVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, (-c11) + eVar.i0(b11));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean k(v1.e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(BitmapDescriptorFactory.HUE_RED, eVar.i0(this.f39670a.a().d()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final long l() {
        return ((s1.l) this.f39681l.getValue()).l();
    }

    private final boolean n() {
        return (this.f39670a.b() || p()) ? false : true;
    }

    private final void o() {
        o0<Integer> o0Var = this.f39680k;
        o0Var.setValue(Integer.valueOf(o0Var.getValue().intValue() + 1));
    }

    private final boolean p() {
        return ((Boolean) this.f39682m.getValue()).booleanValue();
    }

    private final float q(long j11, long j12) {
        float l11 = s1.f.l(j12) / s1.l.i(l());
        return (-o.f40103a.d(this.f39672c, -(s1.f.m(j11) / s1.l.g(l())), 1 - l11)) * s1.l.g(l());
    }

    private final float r(long j11, long j12) {
        float m11 = s1.f.m(j12) / s1.l.g(l());
        return o.f40103a.d(this.f39673d, s1.f.l(j11) / s1.l.i(l()), 1 - m11) * s1.l.i(l());
    }

    private final float s(long j11, long j12) {
        return (-o.f40103a.d(this.f39674e, -(s1.f.l(j11) / s1.l.i(l())), s1.f.m(j12) / s1.l.g(l()))) * s1.l.i(l());
    }

    private final float t(long j11, long j12) {
        float l11 = s1.f.l(j12) / s1.l.i(l());
        return o.f40103a.d(this.f39671b, s1.f.m(j11) / s1.l.g(l()), l11) * s1.l.g(l());
    }

    private final boolean u(long j11) {
        boolean z11;
        boolean z12 = false;
        if (this.f39673d.isFinished() || s1.f.l(j11) >= BitmapDescriptorFactory.HUE_RED) {
            z11 = false;
        } else {
            this.f39673d.onRelease();
            z11 = this.f39673d.isFinished();
        }
        if (!this.f39674e.isFinished() && s1.f.l(j11) > BitmapDescriptorFactory.HUE_RED) {
            this.f39674e.onRelease();
            z11 = z11 || this.f39674e.isFinished();
        }
        if (!this.f39671b.isFinished() && s1.f.m(j11) < BitmapDescriptorFactory.HUE_RED) {
            this.f39671b.onRelease();
            z11 = z11 || this.f39671b.isFinished();
        }
        if (this.f39672c.isFinished() || s1.f.m(j11) <= BitmapDescriptorFactory.HUE_RED) {
            return z11;
        }
        this.f39672c.onRelease();
        if (z11 || this.f39672c.isFinished()) {
            z12 = true;
        }
        return z12;
    }

    private final void v(long j11) {
        this.f39681l.setValue(s1.l.c(j11));
    }

    private final void w(boolean z11) {
        this.f39682m.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // n0.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r5, long r7, s1.f r9, int r10) {
        /*
            r4 = this;
            boolean r0 = r4.n()
            if (r0 == 0) goto L7
            return
        L7:
            c2.g$a r0 = c2.g.f8750a
            int r0 = r0.a()
            boolean r10 = c2.g.d(r10, r0)
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L62
            if (r9 != 0) goto L20
            long r9 = r4.l()
            long r9 = s1.m.b(r9)
            goto L24
        L20:
            long r9 = r9.t()
        L24:
            float r2 = s1.f.l(r7)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L31
            r4.r(r7, r9)
            goto L3c
        L31:
            float r2 = s1.f.l(r7)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L3c
            r4.s(r7, r9)
        L3c:
            float r2 = s1.f.m(r7)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L48
            r4.t(r7, r9)
            goto L53
        L48:
            float r2 = s1.f.m(r7)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L53
            r4.q(r7, r9)
        L53:
            s1.f$a r9 = s1.f.f49950b
            long r9 = r9.c()
            boolean r7 = s1.f.j(r7, r9)
            if (r7 == 0) goto L60
            goto L62
        L60:
            r7 = r0
            goto L63
        L62:
            r7 = r1
        L63:
            boolean r5 = r4.u(r5)
            if (r5 != 0) goto L6d
            if (r7 == 0) goto L6c
            goto L6d
        L6c:
            r0 = r1
        L6d:
            if (r0 == 0) goto L72
            r4.o()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.a(long, long, s1.f, int):void");
    }

    @Override // n0.v
    public void b(long j11) {
        int c11;
        int c12;
        int c13;
        int c14;
        if (n()) {
            return;
        }
        if (x2.u.h(j11) > BitmapDescriptorFactory.HUE_RED) {
            o oVar = o.f40103a;
            EdgeEffect edgeEffect = this.f39673d;
            c14 = j00.c.c(x2.u.h(j11));
            oVar.c(edgeEffect, c14);
        } else if (x2.u.h(j11) < BitmapDescriptorFactory.HUE_RED) {
            o oVar2 = o.f40103a;
            EdgeEffect edgeEffect2 = this.f39674e;
            c11 = j00.c.c(x2.u.h(j11));
            oVar2.c(edgeEffect2, -c11);
        }
        if (x2.u.i(j11) > BitmapDescriptorFactory.HUE_RED) {
            o oVar3 = o.f40103a;
            EdgeEffect edgeEffect3 = this.f39671b;
            c13 = j00.c.c(x2.u.i(j11));
            oVar3.c(edgeEffect3, c13);
        } else if (x2.u.i(j11) < BitmapDescriptorFactory.HUE_RED) {
            o oVar4 = o.f40103a;
            EdgeEffect edgeEffect4 = this.f39672c;
            c12 = j00.c.c(x2.u.i(j11));
            oVar4.c(edgeEffect4, -c12);
        }
        if (x2.u.g(j11, x2.u.f56966b.a())) {
            return;
        }
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    @Override // n0.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long c(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.n()
            if (r0 == 0) goto Ld
            x2.u$a r7 = x2.u.f56966b
            long r7 = r7.a()
            return r7
        Ld:
            float r0 = x2.u.h(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L3b
            n0.o r0 = n0.o.f40103a
            android.widget.EdgeEffect r4 = r6.f39673d
            float r4 = r0.b(r4)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L26
            r4 = r2
            goto L27
        L26:
            r4 = r3
        L27:
            if (r4 != 0) goto L3b
            android.widget.EdgeEffect r4 = r6.f39673d
            float r5 = x2.u.h(r7)
            int r5 = j00.a.c(r5)
            r0.c(r4, r5)
            float r0 = x2.u.h(r7)
            goto L68
        L3b:
            float r0 = x2.u.h(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L67
            n0.o r0 = n0.o.f40103a
            android.widget.EdgeEffect r4 = r6.f39674e
            float r4 = r0.b(r4)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r3
        L52:
            if (r4 != 0) goto L67
            android.widget.EdgeEffect r4 = r6.f39674e
            float r5 = x2.u.h(r7)
            int r5 = j00.a.c(r5)
            int r5 = -r5
            r0.c(r4, r5)
            float r0 = x2.u.h(r7)
            goto L68
        L67:
            r0 = r1
        L68:
            float r4 = x2.u.i(r7)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L93
            n0.o r4 = n0.o.f40103a
            android.widget.EdgeEffect r5 = r6.f39671b
            float r5 = r4.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L7e
            r5 = r2
            goto L7f
        L7e:
            r5 = r3
        L7f:
            if (r5 != 0) goto L93
            android.widget.EdgeEffect r1 = r6.f39671b
            float r2 = x2.u.i(r7)
            int r2 = j00.a.c(r2)
            r4.c(r1, r2)
            float r1 = x2.u.i(r7)
            goto Lbd
        L93:
            float r4 = x2.u.i(r7)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto Lbd
            n0.o r4 = n0.o.f40103a
            android.widget.EdgeEffect r5 = r6.f39672c
            float r5 = r4.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto La8
            goto La9
        La8:
            r2 = r3
        La9:
            if (r2 != 0) goto Lbd
            android.widget.EdgeEffect r1 = r6.f39672c
            float r2 = x2.u.i(r7)
            int r2 = j00.a.c(r2)
            int r2 = -r2
            r4.c(r1, r2)
            float r1 = x2.u.i(r7)
        Lbd:
            long r7 = x2.v.a(r0, r1)
            x2.u$a r0 = x2.u.f56966b
            long r0 = r0.a()
            boolean r0 = x2.u.g(r7, r0)
            if (r0 != 0) goto Ld0
            r6.o()
        Ld0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.c(long):long");
    }

    @Override // n0.v
    public void d(long j11, boolean z11) {
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        int c16;
        int c17;
        int c18;
        int c19;
        int c21;
        int c22;
        int c23;
        int c24;
        int c25;
        int c26;
        int c27;
        boolean z12 = !s1.l.f(j11, l());
        boolean z13 = p() != z11;
        v(j11);
        w(z11);
        if (z12) {
            EdgeEffect edgeEffect = this.f39671b;
            c11 = j00.c.c(s1.l.i(j11));
            c12 = j00.c.c(s1.l.g(j11));
            edgeEffect.setSize(c11, c12);
            EdgeEffect edgeEffect2 = this.f39672c;
            c13 = j00.c.c(s1.l.i(j11));
            c14 = j00.c.c(s1.l.g(j11));
            edgeEffect2.setSize(c13, c14);
            EdgeEffect edgeEffect3 = this.f39673d;
            c15 = j00.c.c(s1.l.g(j11));
            c16 = j00.c.c(s1.l.i(j11));
            edgeEffect3.setSize(c15, c16);
            EdgeEffect edgeEffect4 = this.f39674e;
            c17 = j00.c.c(s1.l.g(j11));
            c18 = j00.c.c(s1.l.i(j11));
            edgeEffect4.setSize(c17, c18);
            EdgeEffect edgeEffect5 = this.f39676g;
            c19 = j00.c.c(s1.l.i(j11));
            c21 = j00.c.c(s1.l.g(j11));
            edgeEffect5.setSize(c19, c21);
            EdgeEffect edgeEffect6 = this.f39677h;
            c22 = j00.c.c(s1.l.i(j11));
            c23 = j00.c.c(s1.l.g(j11));
            edgeEffect6.setSize(c22, c23);
            EdgeEffect edgeEffect7 = this.f39678i;
            c24 = j00.c.c(s1.l.g(j11));
            c25 = j00.c.c(s1.l.i(j11));
            edgeEffect7.setSize(c24, c25);
            EdgeEffect edgeEffect8 = this.f39679j;
            c26 = j00.c.c(s1.l.g(j11));
            c27 = j00.c.c(s1.l.i(j11));
            edgeEffect8.setSize(c26, c27);
        }
        if (z13 || z12) {
            release();
        }
    }

    @Override // n0.v
    public void e(v1.e eVar) {
        boolean z11;
        kotlin.jvm.internal.s.g(eVar, "<this>");
        t1.u b11 = eVar.j0().b();
        this.f39680k.getValue();
        if (n()) {
            return;
        }
        Canvas c11 = t1.c.c(b11);
        o oVar = o.f40103a;
        boolean z12 = true;
        if (!(oVar.b(this.f39678i) == BitmapDescriptorFactory.HUE_RED)) {
            j(eVar, this.f39678i, c11);
            this.f39678i.finish();
        }
        if (this.f39673d.isFinished()) {
            z11 = false;
        } else {
            z11 = i(eVar, this.f39673d, c11);
            oVar.d(this.f39678i, oVar.b(this.f39673d), BitmapDescriptorFactory.HUE_RED);
        }
        if (!(oVar.b(this.f39676g) == BitmapDescriptorFactory.HUE_RED)) {
            h(eVar, this.f39676g, c11);
            this.f39676g.finish();
        }
        if (!this.f39671b.isFinished()) {
            z11 = k(eVar, this.f39671b, c11) || z11;
            oVar.d(this.f39676g, oVar.b(this.f39671b), BitmapDescriptorFactory.HUE_RED);
        }
        if (!(oVar.b(this.f39679j) == BitmapDescriptorFactory.HUE_RED)) {
            i(eVar, this.f39679j, c11);
            this.f39679j.finish();
        }
        if (!this.f39674e.isFinished()) {
            z11 = j(eVar, this.f39674e, c11) || z11;
            oVar.d(this.f39679j, oVar.b(this.f39674e), BitmapDescriptorFactory.HUE_RED);
        }
        if (!(oVar.b(this.f39677h) == BitmapDescriptorFactory.HUE_RED)) {
            k(eVar, this.f39677h, c11);
            this.f39677h.finish();
        }
        if (!this.f39672c.isFinished()) {
            if (!h(eVar, this.f39672c, c11) && !z11) {
                z12 = false;
            }
            oVar.d(this.f39677h, oVar.b(this.f39672c), BitmapDescriptorFactory.HUE_RED);
            z11 = z12;
        }
        if (z11) {
            o();
        }
    }

    @Override // n0.v
    public boolean f() {
        boolean z11;
        long b11 = s1.m.b(l());
        o oVar = o.f40103a;
        if (oVar.b(this.f39673d) == BitmapDescriptorFactory.HUE_RED) {
            z11 = false;
        } else {
            r(s1.f.f49950b.c(), b11);
            z11 = true;
        }
        if (!(oVar.b(this.f39674e) == BitmapDescriptorFactory.HUE_RED)) {
            s(s1.f.f49950b.c(), b11);
            z11 = true;
        }
        if (!(oVar.b(this.f39671b) == BitmapDescriptorFactory.HUE_RED)) {
            t(s1.f.f49950b.c(), b11);
            z11 = true;
        }
        if (oVar.b(this.f39672c) == BitmapDescriptorFactory.HUE_RED) {
            return z11;
        }
        q(s1.f.f49950b.c(), b11);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f5  */
    @Override // n0.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long g(long r7, s1.f r9, int r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.g(long, s1.f, int):long");
    }

    public final t m() {
        return this.f39670a;
    }

    @Override // n0.v
    public void release() {
        if (n()) {
            return;
        }
        List<EdgeEffect> list = this.f39675f;
        int size = list.size();
        int i11 = 0;
        boolean z11 = false;
        while (i11 < size) {
            int i12 = i11 + 1;
            EdgeEffect edgeEffect = list.get(i11);
            edgeEffect.onRelease();
            z11 = edgeEffect.isFinished() || z11;
            i11 = i12;
        }
        if (z11) {
            o();
        }
    }
}
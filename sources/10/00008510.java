package m0;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import h2.j0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import t1.c1;
import t1.e1;
import t1.h0;
import t1.m0;
import t1.q0;
import t1.u0;
import v1.e;

/* loaded from: classes.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f37840a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1 f37841b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t1.s f37842c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m0.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0716a extends kotlin.jvm.internal.u implements h00.l<q1.c, q1.j> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ float f37843a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c1 f37844b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ j0<m0.c> f37845c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ t1.s f37846d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0716a(float f11, c1 c1Var, j0<m0.c> j0Var, t1.s sVar) {
                super(1);
                this.f37843a = f11;
                this.f37844b = c1Var;
                this.f37845c = j0Var;
                this.f37846d = sVar;
            }

            @Override // h00.l
            /* renamed from: a */
            public final q1.j mo12invoke(q1.c drawWithCache) {
                kotlin.jvm.internal.s.g(drawWithCache, "$this$drawWithCache");
                if (!(drawWithCache.i0(this.f37843a) >= BitmapDescriptorFactory.HUE_RED && s1.l.h(drawWithCache.c()) > BitmapDescriptorFactory.HUE_RED)) {
                    return d.k(drawWithCache);
                }
                float f11 = 2;
                float min = Math.min(x2.g.h(this.f37843a, x2.g.f56937b.a()) ? 1.0f : (float) Math.ceil(drawWithCache.i0(this.f37843a)), (float) Math.ceil(s1.l.h(drawWithCache.c()) / f11));
                float f12 = min / f11;
                long a11 = s1.g.a(f12, f12);
                long a12 = s1.m.a(s1.l.i(drawWithCache.c()) - min, s1.l.g(drawWithCache.c()) - min);
                boolean z11 = f11 * min > s1.l.h(drawWithCache.c());
                m0 a13 = this.f37844b.a(drawWithCache.c(), drawWithCache.getLayoutDirection(), drawWithCache);
                if (a13 instanceof m0.a) {
                    return d.l(drawWithCache, this.f37845c, this.f37846d, (m0.a) a13, z11, min);
                }
                if (a13 instanceof m0.c) {
                    return d.n(drawWithCache, this.f37845c, this.f37846d, (m0.c) a13, a11, a12, z11, min);
                }
                if (a13 instanceof m0.b) {
                    return d.m(drawWithCache, this.f37846d, a11, a12, z11, min);
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f11, c1 c1Var, t1.s sVar) {
            super(3);
            this.f37840a = f11;
            this.f37841b = c1Var;
            this.f37842c = sVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(1369505793);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = new j0();
                iVar.p(y11);
            }
            iVar.N();
            o1.f g02 = composed.g0(q1.i.b(o1.f.f42062f1, new C0716a(this.f37840a, this.f37841b, (j0) y11, this.f37842c)));
            iVar.N();
            return g02;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f37847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t1.s f37848b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c1 f37849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f11, t1.s sVar, c1 c1Var) {
            super(1);
            this.f37847a = f11;
            this.f37848b = sVar;
            this.f37849c = c1Var;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("border");
            y0Var.a().b(Snapshot.WIDTH, x2.g.c(this.f37847a));
            if (this.f37848b instanceof e1) {
                y0Var.a().b("color", t1.a0.h(((e1) this.f37848b).b()));
                y0Var.c(t1.a0.h(((e1) this.f37848b).b()));
            } else {
                y0Var.a().b("brush", this.f37848b);
            }
            y0Var.a().b("shape", this.f37849c);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<v1.c, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f37850a = new c();

        c() {
            super(1);
        }

        public final void a(v1.c onDrawWithContent) {
            kotlin.jvm.internal.s.g(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.s0();
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.c cVar) {
            a(cVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0717d extends kotlin.jvm.internal.u implements h00.l<v1.c, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0.a f37851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t1.s f37852b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0717d(m0.a aVar, t1.s sVar) {
            super(1);
            this.f37851a = aVar;
            this.f37852b = sVar;
        }

        public final void a(v1.c onDrawWithContent) {
            kotlin.jvm.internal.s.g(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.s0();
            e.b.g(onDrawWithContent, this.f37851a.a(), this.f37852b, BitmapDescriptorFactory.HUE_RED, null, null, 0, 60, null);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.c cVar) {
            a(cVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<v1.c, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s1.h f37853a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l0<h0> f37854b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f37855c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t1.b0 f37856d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(s1.h hVar, l0<h0> l0Var, long j11, t1.b0 b0Var) {
            super(1);
            this.f37853a = hVar;
            this.f37854b = l0Var;
            this.f37855c = j11;
            this.f37856d = b0Var;
        }

        public final void a(v1.c onDrawWithContent) {
            kotlin.jvm.internal.s.g(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.s0();
            float i11 = this.f37853a.i();
            float l11 = this.f37853a.l();
            l0<h0> l0Var = this.f37854b;
            long j11 = this.f37855c;
            t1.b0 b0Var = this.f37856d;
            onDrawWithContent.j0().a().b(i11, l11);
            e.b.c(onDrawWithContent, l0Var.f34916a, 0L, j11, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, b0Var, 0, 0, 890, null);
            onDrawWithContent.j0().a().b(-i11, -l11);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.c cVar) {
            a(cVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<v1.c, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t1.s f37857a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f37858b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f37859c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v1.f f37860d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(t1.s sVar, long j11, long j12, v1.f fVar) {
            super(1);
            this.f37857a = sVar;
            this.f37858b = j11;
            this.f37859c = j12;
            this.f37860d = fVar;
        }

        public final void a(v1.c onDrawWithContent) {
            kotlin.jvm.internal.s.g(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.s0();
            e.b.i(onDrawWithContent, this.f37857a, this.f37858b, this.f37859c, BitmapDescriptorFactory.HUE_RED, this.f37860d, null, 0, 104, null);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.c cVar) {
            a(cVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<v1.c, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f37861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t1.s f37862b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f37863c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f37864d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f37865e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f37866f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f37867g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ v1.j f37868h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z11, t1.s sVar, long j11, float f11, float f12, long j12, long j13, v1.j jVar) {
            super(1);
            this.f37861a = z11;
            this.f37862b = sVar;
            this.f37863c = j11;
            this.f37864d = f11;
            this.f37865e = f12;
            this.f37866f = j12;
            this.f37867g = j13;
            this.f37868h = jVar;
        }

        public final void a(v1.c onDrawWithContent) {
            kotlin.jvm.internal.s.g(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.s0();
            if (this.f37861a) {
                e.b.k(onDrawWithContent, this.f37862b, 0L, 0L, this.f37863c, BitmapDescriptorFactory.HUE_RED, null, null, 0, 246, null);
                return;
            }
            float d11 = s1.a.d(this.f37863c);
            float f11 = this.f37864d;
            if (d11 < f11) {
                float f12 = this.f37865e;
                float i11 = s1.l.i(onDrawWithContent.c()) - this.f37865e;
                float g11 = s1.l.g(onDrawWithContent.c()) - this.f37865e;
                int a11 = t1.z.f51535a.a();
                t1.s sVar = this.f37862b;
                long j11 = this.f37863c;
                v1.d j02 = onDrawWithContent.j0();
                long c11 = j02.c();
                j02.b().m();
                j02.a().a(f12, f12, i11, g11, a11);
                e.b.k(onDrawWithContent, sVar, 0L, 0L, j11, BitmapDescriptorFactory.HUE_RED, null, null, 0, 246, null);
                j02.b().h();
                j02.d(c11);
                return;
            }
            e.b.k(onDrawWithContent, this.f37862b, this.f37866f, this.f37867g, d.p(this.f37863c, f11), BitmapDescriptorFactory.HUE_RED, this.f37868h, null, 0, 208, null);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.c cVar) {
            a(cVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.l<v1.c, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q0 f37869a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t1.s f37870b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(q0 q0Var, t1.s sVar) {
            super(1);
            this.f37869a = q0Var;
            this.f37870b = sVar;
        }

        public final void a(v1.c onDrawWithContent) {
            kotlin.jvm.internal.s.g(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.s0();
            e.b.g(onDrawWithContent, this.f37869a, this.f37870b, BitmapDescriptorFactory.HUE_RED, null, null, 0, 60, null);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.c cVar) {
            a(cVar);
            return vz.b0.f54756a;
        }
    }

    public static final o1.f f(o1.f fVar, m0.e border, c1 shape) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(border, "border");
        kotlin.jvm.internal.s.g(shape, "shape");
        return h(fVar, border.b(), border.a(), shape);
    }

    public static final o1.f g(o1.f border, float f11, long j11, c1 shape) {
        kotlin.jvm.internal.s.g(border, "$this$border");
        kotlin.jvm.internal.s.g(shape, "shape");
        return h(border, f11, new e1(j11, null), shape);
    }

    public static final o1.f h(o1.f border, float f11, t1.s brush, c1 shape) {
        kotlin.jvm.internal.s.g(border, "$this$border");
        kotlin.jvm.internal.s.g(brush, "brush");
        kotlin.jvm.internal.s.g(shape, "shape");
        return o1.e.a(border, x0.c() ? new b(f11, brush, shape) : x0.a(), new a(f11, shape, brush));
    }

    private static final s1.j i(float f11, s1.j jVar) {
        return new s1.j(f11, f11, jVar.j() - f11, jVar.d() - f11, p(jVar.h(), f11), p(jVar.i(), f11), p(jVar.c(), f11), p(jVar.b(), f11), null);
    }

    private static final q0 j(q0 q0Var, s1.j jVar, float f11, boolean z11) {
        q0Var.reset();
        q0Var.j(jVar);
        if (!z11) {
            q0 a11 = t1.n.a();
            a11.j(i(f11, jVar));
            q0Var.k(q0Var, a11, u0.f51508a.a());
        }
        return q0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.j k(q1.c cVar) {
        return cVar.h(c.f37850a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
        if (t1.i0.h(r13, r4 != null ? t1.i0.f(r4.b()) : null) != false) goto L35;
     */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [t1.h0, T] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final q1.j l(q1.c r42, h2.j0<m0.c> r43, t1.s r44, t1.m0.a r45, boolean r46, float r47) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.d.l(q1.c, h2.j0, t1.s, t1.m0$a, boolean, float):q1.j");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.j m(q1.c cVar, t1.s sVar, long j11, long j12, boolean z11, float f11) {
        return cVar.h(new f(sVar, z11 ? s1.f.f49950b.c() : j11, z11 ? cVar.c() : j12, z11 ? v1.i.f53871a : new v1.j(f11, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1.j n(q1.c cVar, j0<m0.c> j0Var, t1.s sVar, m0.c cVar2, long j11, long j12, boolean z11, float f11) {
        if (s1.k.d(cVar2.a())) {
            return cVar.h(new g(z11, sVar, cVar2.a().h(), f11 / 2, f11, j11, j12, new v1.j(f11, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null)));
        }
        return cVar.h(new h(j(o(j0Var).g(), cVar2.a(), f11, z11), sVar));
    }

    private static final m0.c o(j0<m0.c> j0Var) {
        m0.c a11 = j0Var.a();
        if (a11 == null) {
            m0.c cVar = new m0.c(null, null, null, null, 15, null);
            j0Var.b(cVar);
            return cVar;
        }
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(long j11, float f11) {
        return s1.b.a(Math.max((float) BitmapDescriptorFactory.HUE_RED, s1.a.d(j11) - f11), Math.max((float) BitmapDescriptorFactory.HUE_RED, s1.a.e(j11) - f11));
    }
}
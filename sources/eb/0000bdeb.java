package x0;

import c1.e1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p0.e0;
import t1.b0;
import t1.c0;
import t1.h0;
import t1.i0;
import t1.j0;
import v1.a;
import v1.e;
import vz.b0;

/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1286a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f56505a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f56506b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w2.c f56507c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f56508d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f56509e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1286a(o1.f fVar, boolean z11, w2.c cVar, boolean z12, int i11) {
            super(2);
            this.f56505a = fVar;
            this.f56506b = z11;
            this.f56507c = cVar;
            this.f56508d = z12;
            this.f56509e = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            a.a(this.f56505a, this.f56506b, this.f56507c, this.f56508d, iVar, this.f56509e | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f56510a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f56511b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, b0> f56512c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f56513d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j11, f fVar, h00.p<? super c1.i, ? super Integer, b0> pVar, int i11) {
            super(2);
            this.f56510a = j11;
            this.f56511b = fVar;
            this.f56512c = pVar;
            this.f56513d = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            a.b(this.f56510a, this.f56511b, this.f56512c, iVar, this.f56513d | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, b0> f56514a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f56515b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f56516c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ w2.c f56517d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f56518e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f56519f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.p<? super c1.i, ? super Integer, b0> pVar, o1.f fVar, boolean z11, w2.c cVar, boolean z12, int i11) {
            super(2);
            this.f56514a = pVar;
            this.f56515b = fVar;
            this.f56516c = z11;
            this.f56517d = cVar;
            this.f56518e = z12;
            this.f56519f = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else if (this.f56514a == null) {
                iVar.x(386443455);
                o1.f fVar = this.f56515b;
                boolean z11 = this.f56516c;
                w2.c cVar = this.f56517d;
                boolean z12 = this.f56518e;
                int i12 = this.f56519f;
                a.a(fVar, z11, cVar, z12, iVar, ((i12 >> 12) & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168));
                iVar.N();
            } else {
                iVar.x(386443693);
                this.f56514a.mo160invoke(iVar, Integer.valueOf((this.f56519f >> 15) & 14));
                iVar.N();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f56520a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f56521b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w2.c f56522c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f56523d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o1.f f56524e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, b0> f56525f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f56526g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(long j11, boolean z11, w2.c cVar, boolean z12, o1.f fVar, h00.p<? super c1.i, ? super Integer, b0> pVar, int i11) {
            super(2);
            this.f56520a = j11;
            this.f56521b = z11;
            this.f56522c = cVar;
            this.f56523d = z12;
            this.f56524e = fVar;
            this.f56525f = pVar;
            this.f56526g = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            a.c(this.f56520a, this.f56521b, this.f56522c, this.f56523d, this.f56524e, this.f56525f, iVar, this.f56526g | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f56527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w2.c f56528b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f56529c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x0.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1287a extends kotlin.jvm.internal.u implements h00.l<q1.c, q1.j> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f56530a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f56531b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ w2.c f56532c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f56533d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: x0.a$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1288a extends kotlin.jvm.internal.u implements h00.l<v1.c, b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ boolean f56534a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ w2.c f56535b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ boolean f56536c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ h0 f56537d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ t1.b0 f56538e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1288a(boolean z11, w2.c cVar, boolean z12, h0 h0Var, t1.b0 b0Var) {
                    super(1);
                    this.f56534a = z11;
                    this.f56535b = cVar;
                    this.f56536c = z12;
                    this.f56537d = h0Var;
                    this.f56538e = b0Var;
                }

                public final void a(v1.c onDrawWithContent) {
                    kotlin.jvm.internal.s.g(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.s0();
                    if (a.h(this.f56534a, this.f56535b, this.f56536c)) {
                        h0 h0Var = this.f56537d;
                        t1.b0 b0Var = this.f56538e;
                        long o02 = onDrawWithContent.o0();
                        v1.d j02 = onDrawWithContent.j0();
                        long c11 = j02.c();
                        j02.b().m();
                        j02.a().e(-1.0f, 1.0f, o02);
                        e.b.d(onDrawWithContent, h0Var, 0L, BitmapDescriptorFactory.HUE_RED, null, b0Var, 0, 46, null);
                        j02.b().h();
                        j02.d(c11);
                        return;
                    }
                    e.b.d(onDrawWithContent, this.f56537d, 0L, BitmapDescriptorFactory.HUE_RED, null, this.f56538e, 0, 46, null);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ b0 mo12invoke(v1.c cVar) {
                    a(cVar);
                    return b0.f54756a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1287a(long j11, boolean z11, w2.c cVar, boolean z12) {
                super(1);
                this.f56530a = j11;
                this.f56531b = z11;
                this.f56532c = cVar;
                this.f56533d = z12;
            }

            @Override // h00.l
            /* renamed from: a */
            public final q1.j mo12invoke(q1.c drawWithCache) {
                kotlin.jvm.internal.s.g(drawWithCache, "$this$drawWithCache");
                return drawWithCache.h(new C1288a(this.f56531b, this.f56532c, this.f56533d, a.e(drawWithCache, s1.l.i(drawWithCache.c()) / 2.0f), b0.a.b(t1.b0.f51384b, this.f56530a, 0, 2, null)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z11, w2.c cVar, boolean z12) {
            super(3);
            this.f56527a = z11;
            this.f56528b = cVar;
            this.f56529c = z12;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(-1183154520);
            o1.f g02 = composed.g0(q1.i.b(o1.f.f42062f1, new C1287a(((x) iVar.A(y.b())).b(), this.f56527a, this.f56528b, this.f56529c)));
            iVar.N();
            return g02;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final void a(o1.f modifier, boolean z11, w2.c direction, boolean z12, c1.i iVar, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(modifier, "modifier");
        kotlin.jvm.internal.s.g(direction, "direction");
        c1.i h11 = iVar.h(-1892866350);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.a(z11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(direction) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= h11.a(z12) ? 2048 : 1024;
        }
        if (((i12 & 5851) ^ 1170) == 0 && h11.i()) {
            h11.G();
        } else {
            p0.h0.a(f(e0.w(modifier, m.c(), m.b()), z11, direction, z12), h11, 0);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new C1286a(modifier, z11, direction, z12, i11));
    }

    public static final void b(long j11, f handleReferencePoint, h00.p<? super c1.i, ? super Integer, vz.b0> content, c1.i iVar, int i11) {
        int i12;
        int c11;
        int c12;
        kotlin.jvm.internal.s.g(handleReferencePoint, "handleReferencePoint");
        kotlin.jvm.internal.s.g(content, "content");
        c1.i h11 = iVar.h(-1205361264);
        if ((i11 & 14) == 0) {
            i12 = (h11.e(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(handleReferencePoint) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(content) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) == 0 && h11.i()) {
            h11.G();
        } else {
            c11 = j00.c.c(s1.f.l(j11));
            c12 = j00.c.c(s1.f.m(j11));
            long a11 = x2.l.a(c11, c12);
            x2.k b11 = x2.k.b(a11);
            h11.x(-3686552);
            boolean O = h11.O(b11) | h11.O(handleReferencePoint);
            Object y11 = h11.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new x0.e(handleReferencePoint, a11, null);
                h11.p(y11);
            }
            h11.N();
            androidx.compose.ui.window.b.a((x0.e) y11, null, new androidx.compose.ui.window.n(false, false, false, null, true, false, 15, null), content, h11, (i12 << 3) & 7168, 2);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(j11, handleReferencePoint, content, i11));
    }

    public static final void c(long j11, boolean z11, w2.c direction, boolean z12, o1.f modifier, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, c1.i iVar, int i11) {
        int i12;
        f fVar;
        kotlin.jvm.internal.s.g(direction, "direction");
        kotlin.jvm.internal.s.g(modifier, "modifier");
        c1.i h11 = iVar.h(1221598133);
        if ((i11 & 14) == 0) {
            i12 = (h11.e(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.a(z11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(direction) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= h11.a(z12) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= h11.O(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((458752 & i11) == 0) {
            i12 |= h11.O(pVar) ? 131072 : 65536;
        }
        int i13 = i12;
        if (((i13 & 374491) ^ 74898) == 0 && h11.i()) {
            h11.G();
        } else {
            if (h(z11, direction, z12)) {
                fVar = f.TopRight;
            } else {
                fVar = f.TopLeft;
            }
            b(j11, fVar, j1.c.b(h11, -819892380, true, new c(pVar, modifier, z11, direction, z12, i13)), h11, (i13 & 14) | 384);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new d(j11, z11, direction, z12, modifier, pVar, i11));
    }

    public static final h0 e(q1.c cVar, float f11) {
        kotlin.jvm.internal.s.g(cVar, "<this>");
        int ceil = ((int) Math.ceil(f11)) * 2;
        x0.d dVar = x0.d.f56562a;
        h0 c11 = dVar.c();
        t1.u a11 = dVar.a();
        v1.a b11 = dVar.b();
        if (c11 == null || a11 == null || ceil > c11.getWidth() || ceil > c11.getHeight()) {
            c11 = j0.b(ceil, ceil, i0.f51451b.a(), false, null, 24, null);
            dVar.f(c11);
            a11 = t1.w.a(c11);
            dVar.d(a11);
        }
        h0 h0Var = c11;
        t1.u uVar = a11;
        if (b11 == null) {
            b11 = new v1.a();
            dVar.e(b11);
        }
        v1.a aVar = b11;
        x2.q layoutDirection = cVar.getLayoutDirection();
        long a12 = s1.m.a(h0Var.getWidth(), h0Var.getHeight());
        a.C1210a D = aVar.D();
        x2.d a13 = D.a();
        x2.q b12 = D.b();
        t1.u c12 = D.c();
        long d11 = D.d();
        a.C1210a D2 = aVar.D();
        D2.j(cVar);
        D2.k(layoutDirection);
        D2.i(uVar);
        D2.l(a12);
        uVar.m();
        e.b.j(aVar, t1.a0.f51365b.a(), 0L, aVar.c(), BitmapDescriptorFactory.HUE_RED, null, null, t1.p.f51470a.a(), 58, null);
        e.b.j(aVar, c0.c(4278190080L), s1.f.f49950b.c(), s1.m.a(f11, f11), BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
        e.b.b(aVar, c0.c(4278190080L), f11, s1.g.a(f11, f11), BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
        uVar.h();
        a.C1210a D3 = aVar.D();
        D3.j(a13);
        D3.k(b12);
        D3.i(c12);
        D3.l(d11);
        return h0Var;
    }

    public static final o1.f f(o1.f fVar, boolean z11, w2.c direction, boolean z12) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(direction, "direction");
        return o1.e.b(fVar, null, new e(z11, direction, z12), 1, null);
    }

    public static final boolean g(w2.c direction, boolean z11) {
        kotlin.jvm.internal.s.g(direction, "direction");
        return (direction == w2.c.Ltr && !z11) || (direction == w2.c.Rtl && z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(boolean z11, w2.c cVar, boolean z12) {
        if (z11) {
            return g(cVar, z12);
        }
        return !g(cVar, z12);
    }
}
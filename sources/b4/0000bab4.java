package w0;

import c1.e1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import t1.b0;
import v1.e;
import v1.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final float f54799a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f54800b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1237a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f54801a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f54802b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f54803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1237a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, o1.f fVar, int i11) {
            super(2);
            this.f54801a = pVar;
            this.f54802b = fVar;
            this.f54803c = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else if (this.f54801a == null) {
                iVar.x(1275643833);
                a.b(this.f54802b, iVar, (this.f54803c >> 3) & 14);
                iVar.N();
            } else {
                iVar.x(1275643903);
                this.f54801a.mo160invoke(iVar, Integer.valueOf((this.f54803c >> 6) & 14));
                iVar.N();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f54804a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f54805b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f54806c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f54807d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j11, o1.f fVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11) {
            super(2);
            this.f54804a = j11;
            this.f54805b = fVar;
            this.f54806c = pVar;
            this.f54807d = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            a.a(this.f54804a, this.f54805b, this.f54806c, iVar, this.f54807d | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f54808a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f54809b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o1.f fVar, int i11) {
            super(2);
            this.f54808a = fVar;
            this.f54809b = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            a.b(this.f54808a, iVar, this.f54809b | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f54810a = new d();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w0.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1238a extends kotlin.jvm.internal.u implements h00.l<q1.c, q1.j> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f54811a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: w0.a$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1239a extends kotlin.jvm.internal.u implements h00.l<v1.c, vz.b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ float f54812a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ t1.h0 f54813b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ t1.b0 f54814c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1239a(float f11, t1.h0 h0Var, t1.b0 b0Var) {
                    super(1);
                    this.f54812a = f11;
                    this.f54813b = h0Var;
                    this.f54814c = b0Var;
                }

                public final void a(v1.c onDrawWithContent) {
                    kotlin.jvm.internal.s.g(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.s0();
                    float f11 = this.f54812a;
                    t1.h0 h0Var = this.f54813b;
                    t1.b0 b0Var = this.f54814c;
                    v1.d j02 = onDrawWithContent.j0();
                    long c11 = j02.c();
                    j02.b().m();
                    v1.g a11 = j02.a();
                    g.a.b(a11, f11, BitmapDescriptorFactory.HUE_RED, 2, null);
                    a11.f(45.0f, s1.f.f49950b.c());
                    e.b.d(onDrawWithContent, h0Var, 0L, BitmapDescriptorFactory.HUE_RED, null, b0Var, 0, 46, null);
                    j02.b().h();
                    j02.d(c11);
                }

                @Override // h00.l
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ vz.b0 mo12invoke(v1.c cVar) {
                    a(cVar);
                    return vz.b0.f54756a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1238a(long j11) {
                super(1);
                this.f54811a = j11;
            }

            @Override // h00.l
            /* renamed from: a */
            public final q1.j mo12invoke(q1.c drawWithCache) {
                kotlin.jvm.internal.s.g(drawWithCache, "$this$drawWithCache");
                float i11 = s1.l.i(drawWithCache.c()) / 2.0f;
                return drawWithCache.h(new C1239a(i11, x0.a.e(drawWithCache, i11), b0.a.b(t1.b0.f51384b, this.f54811a, 0, 2, null)));
            }
        }

        d() {
            super(3);
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(-216257554);
            o1.f g02 = composed.g0(q1.i.b(o1.f.f42062f1, new C1238a(((x0.x) iVar.A(x0.y.b())).b())));
            iVar.N();
            return g02;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    static {
        float f11 = x2.g.f(25);
        f54799a = f11;
        f54800b = x2.g.f(x2.g.f(f11 * 2.0f) / 2.4142137f);
    }

    public static final void a(long j11, o1.f modifier, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, c1.i iVar, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(modifier, "modifier");
        c1.i h11 = iVar.h(-155753200);
        if ((i11 & 14) == 0) {
            i12 = (h11.e(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(modifier) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(pVar) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) == 0 && h11.i()) {
            h11.G();
        } else {
            x0.a.b(j11, x0.f.TopMiddle, j1.c.b(h11, -819896208, true, new C1237a(pVar, modifier, i12)), h11, (i12 & 14) | 432);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(j11, modifier, pVar, i11));
    }

    public static final void b(o1.f modifier, c1.i iVar, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(modifier, "modifier");
        c1.i h11 = iVar.h(-1094866142);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (((i12 & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
        } else {
            p0.h0.a(c(p0.e0.w(modifier, f54800b, f54799a)), h11, 0);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new c(modifier, i11));
    }

    public static final o1.f c(o1.f fVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return o1.e.b(fVar, null, d.f54810a, 1, null);
    }
}
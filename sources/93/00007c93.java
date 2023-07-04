package k0;

import c1.i;
import c1.o0;
import c1.s1;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import l0.a1;
import l0.b1;
import l0.c0;
import l0.d1;
import l0.f1;
import l0.v0;
import o1.a;
import t1.g0;
import t1.h1;
import t1.i1;
import vz.b0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    private static final d1<h1, l0.n> f34124a = f1.a(a.f34129a, b.f34130a);

    /* renamed from: b */
    private static final o0<Float> f34125b;

    /* renamed from: c */
    private static final v0<Float> f34126c;

    /* renamed from: d */
    private static final v0<x2.k> f34127d;

    /* renamed from: e */
    private static final v0<x2.o> f34128e;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<h1, l0.n> {

        /* renamed from: a */
        public static final a f34129a = new a();

        a() {
            super(1);
        }

        public final l0.n a(long j11) {
            return new l0.n(h1.f(j11), h1.g(j11));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ l0.n invoke(h1 h1Var) {
            return a(h1Var.j());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<l0.n, h1> {

        /* renamed from: a */
        public static final b f34130a = new b();

        b() {
            super(1);
        }

        public final long a(l0.n it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return i1.a(it2.f(), it2.g());
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ h1 invoke(l0.n nVar) {
            return h1.b(a(nVar));
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34131a;

        static {
            int[] iArr = new int[k0.i.values().length];
            iArr[k0.i.Visible.ordinal()] = 1;
            iArr[k0.i.PreEnter.ordinal()] = 2;
            iArr[k0.i.PostExit.ordinal()] = 3;
            f34131a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.q<a1.b<k0.i>, c1.i, Integer, v0<h1>> {

        /* renamed from: a */
        public static final d f34132a = new d();

        public d() {
            super(3);
        }

        public final v0<h1> a(a1.b<k0.i> bVar, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(bVar, "$this$null");
            iVar.x(-251233035);
            v0<h1> i12 = l0.j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
            iVar.N();
            return i12;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ v0<h1> invoke(a1.b<k0.i> bVar, c1.i iVar, Integer num) {
            return a(bVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<g0, b0> {

        /* renamed from: a */
        final /* synthetic */ v1<Float> f34133a;

        /* renamed from: b */
        final /* synthetic */ v1<Float> f34134b;

        /* renamed from: c */
        final /* synthetic */ v1<h1> f34135c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(v1<Float> v1Var, v1<Float> v1Var2, v1<h1> v1Var3) {
            super(1);
            this.f34133a = v1Var;
            this.f34134b = v1Var2;
            this.f34135c = v1Var3;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(g0 g0Var) {
            invoke2(g0Var);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(g0 graphicsLayer) {
            kotlin.jvm.internal.s.g(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.b(j.n(this.f34133a));
            graphicsLayer.f(j.i(this.f34134b));
            graphicsLayer.m(j.i(this.f34134b));
            graphicsLayer.H(j.j(this.f34135c));
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<g0, b0> {

        /* renamed from: a */
        final /* synthetic */ v1<Float> f34136a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(v1<Float> v1Var) {
            super(1);
            this.f34136a = v1Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(g0 g0Var) {
            invoke2(g0Var);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(g0 graphicsLayer) {
            kotlin.jvm.internal.s.g(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.b(j.n(this.f34136a));
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.q<a1.b<k0.i>, c1.i, Integer, c0<Float>> {

        /* renamed from: a */
        final /* synthetic */ k0.k f34137a;

        /* renamed from: b */
        final /* synthetic */ k0.m f34138b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k0.k kVar, k0.m mVar) {
            super(3);
            this.f34137a = kVar;
            this.f34138b = mVar;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ c0<Float> invoke(a1.b<k0.i> bVar, c1.i iVar, Integer num) {
            return invoke(bVar, iVar, num.intValue());
        }

        public final c0<Float> invoke(a1.b<k0.i> animateFloat, c1.i iVar, int i11) {
            c0<Float> c0Var;
            kotlin.jvm.internal.s.g(animateFloat, "$this$animateFloat");
            iVar.x(-9520302);
            k0.i iVar2 = k0.i.PreEnter;
            k0.i iVar3 = k0.i.Visible;
            if (animateFloat.c(iVar2, iVar3)) {
                k0.p b11 = this.f34137a.a().b();
                c0Var = b11 != null ? b11.b() : null;
                if (c0Var == null) {
                    c0Var = j.f34126c;
                }
            } else if (!animateFloat.c(iVar3, k0.i.PostExit)) {
                c0Var = j.f34126c;
            } else {
                k0.p b12 = this.f34138b.b().b();
                c0Var = b12 != null ? b12.b() : null;
                if (c0Var == null) {
                    c0Var = j.f34126c;
                }
            }
            iVar.N();
            return c0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.q<a1.b<k0.i>, c1.i, Integer, c0<Float>> {

        /* renamed from: a */
        final /* synthetic */ k0.k f34139a;

        /* renamed from: b */
        final /* synthetic */ k0.m f34140b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k0.k kVar, k0.m mVar) {
            super(3);
            this.f34139a = kVar;
            this.f34140b = mVar;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ c0<Float> invoke(a1.b<k0.i> bVar, c1.i iVar, Integer num) {
            return invoke(bVar, iVar, num.intValue());
        }

        public final c0<Float> invoke(a1.b<k0.i> animateFloat, c1.i iVar, int i11) {
            v0 v0Var;
            kotlin.jvm.internal.s.g(animateFloat, "$this$animateFloat");
            iVar.x(-9519413);
            k0.i iVar2 = k0.i.PreEnter;
            k0.i iVar3 = k0.i.Visible;
            if (animateFloat.c(iVar2, iVar3)) {
                this.f34139a.a().c();
                v0Var = j.f34126c;
            } else if (!animateFloat.c(iVar3, k0.i.PostExit)) {
                v0Var = j.f34126c;
            } else {
                this.f34140b.b().c();
                v0Var = j.f34126c;
            }
            iVar.N();
            return v0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.u implements h00.l<x2.o, x2.o> {

        /* renamed from: a */
        public static final i f34141a = new i();

        i() {
            super(1);
        }

        public final long a(long j11) {
            return x2.p.a(0, 0);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ x2.o invoke(x2.o oVar) {
            return x2.o.b(a(oVar.j()));
        }
    }

    /* renamed from: k0.j$j */
    /* loaded from: classes.dex */
    public static final class C0633j extends kotlin.jvm.internal.u implements h00.l<Integer, Integer> {

        /* renamed from: a */
        public static final C0633j f34142a = new C0633j();

        C0633j() {
            super(1);
        }

        public final Integer a(int i11) {
            return 0;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.u implements h00.l<x2.o, x2.o> {

        /* renamed from: a */
        final /* synthetic */ h00.l<Integer, Integer> f34143a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(h00.l<? super Integer, Integer> lVar) {
            super(1);
            this.f34143a = lVar;
        }

        public final long a(long j11) {
            return x2.p.a(x2.o.g(j11), this.f34143a.invoke(Integer.valueOf(x2.o.f(j11))).intValue());
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ x2.o invoke(x2.o oVar) {
            return x2.o.b(a(oVar.j()));
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a */
        final /* synthetic */ a1<k0.i> f34144a;

        /* renamed from: b */
        final /* synthetic */ v1<k0.f> f34145b;

        /* renamed from: c */
        final /* synthetic */ v1<k0.f> f34146c;

        /* renamed from: d */
        final /* synthetic */ String f34147d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(a1<k0.i> a1Var, v1<k0.f> v1Var, v1<k0.f> v1Var2, String str) {
            super(3);
            this.f34144a = a1Var;
            this.f34145b = v1Var;
            this.f34146c = v1Var2;
            this.f34147d = str;
        }

        /* renamed from: invoke$lambda-1 */
        private static final boolean m626invoke$lambda1(o0<Boolean> o0Var) {
            return o0Var.getValue().booleanValue();
        }

        /* renamed from: invoke$lambda-2 */
        private static final void m627invoke$lambda2(o0<Boolean> o0Var, boolean z11) {
            o0Var.setValue(Boolean.valueOf(z11));
        }

        /* JADX WARN: Removed duplicated region for block: B:127:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x01ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o1.f a(o1.f r21, c1.i r22, int r23) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k0.j.l.a(o1.f, c1.i, int):o1.f");
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.u implements h00.l<x2.o, x2.o> {

        /* renamed from: a */
        public static final m f34148a = new m();

        m() {
            super(1);
        }

        public final long a(long j11) {
            return x2.p.a(0, 0);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ x2.o invoke(x2.o oVar) {
            return x2.o.b(a(oVar.j()));
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends kotlin.jvm.internal.u implements h00.l<Integer, Integer> {

        /* renamed from: a */
        public static final n f34149a = new n();

        n() {
            super(1);
        }

        public final Integer a(int i11) {
            return 0;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends kotlin.jvm.internal.u implements h00.l<x2.o, x2.o> {

        /* renamed from: a */
        final /* synthetic */ h00.l<Integer, Integer> f34150a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(h00.l<? super Integer, Integer> lVar) {
            super(1);
            this.f34150a = lVar;
        }

        public final long a(long j11) {
            return x2.p.a(x2.o.g(j11), this.f34150a.invoke(Integer.valueOf(x2.o.f(j11))).intValue());
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ x2.o invoke(x2.o oVar) {
            return x2.o.b(a(oVar.j()));
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a */
        final /* synthetic */ a1<k0.i> f34151a;

        /* renamed from: b */
        final /* synthetic */ v1<v> f34152b;

        /* renamed from: c */
        final /* synthetic */ v1<v> f34153c;

        /* renamed from: d */
        final /* synthetic */ String f34154d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(a1<k0.i> a1Var, v1<v> v1Var, v1<v> v1Var2, String str) {
            super(3);
            this.f34151a = a1Var;
            this.f34152b = v1Var;
            this.f34153c = v1Var2;
            this.f34154d = str;
        }

        /* renamed from: invoke$lambda-1 */
        private static final boolean m628invoke$lambda1(o0<Boolean> o0Var) {
            return o0Var.getValue().booleanValue();
        }

        /* renamed from: invoke$lambda-2 */
        private static final void m629invoke$lambda2(o0<Boolean> o0Var, boolean z11) {
            o0Var.setValue(Boolean.valueOf(z11));
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(905898856);
            a1<k0.i> a1Var = this.f34151a;
            iVar.x(-3686930);
            boolean O = iVar.O(a1Var);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = s1.d(Boolean.FALSE, null, 2, null);
                iVar.p(y11);
            }
            iVar.N();
            o0 o0Var = (o0) y11;
            if (this.f34151a.g() == this.f34151a.m() && !this.f34151a.q()) {
                m629invoke$lambda2(o0Var, false);
            } else if (this.f34152b.getValue() != null || this.f34153c.getValue() != null) {
                m629invoke$lambda2(o0Var, true);
            }
            if (m628invoke$lambda1(o0Var)) {
                a1<k0.i> a1Var2 = this.f34151a;
                d1<x2.k, l0.n> i12 = f1.i(x2.k.f56947b);
                String str = this.f34154d;
                iVar.x(-3687241);
                Object y12 = iVar.y();
                i.a aVar = c1.i.f8486a;
                if (y12 == aVar.a()) {
                    y12 = kotlin.jvm.internal.s.p(str, " slide");
                    iVar.p(y12);
                }
                iVar.N();
                a1.a b11 = b1.b(a1Var2, i12, (String) y12, iVar, 448, 0);
                a1<k0.i> a1Var3 = this.f34151a;
                v1<v> v1Var = this.f34152b;
                v1<v> v1Var2 = this.f34153c;
                iVar.x(-3686930);
                boolean O2 = iVar.O(a1Var3);
                Object y13 = iVar.y();
                if (O2 || y13 == aVar.a()) {
                    y13 = new w(b11, v1Var, v1Var2);
                    iVar.p(y13);
                }
                iVar.N();
                composed = composed.g0((w) y13);
            }
            iVar.N();
            return composed;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    static {
        o0<Float> d11;
        d11 = s1.d(Float.valueOf(1.0f), null, 2, null);
        f34125b = d11;
        f34126c = l0.j.i(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
        f34127d = l0.j.i(BitmapDescriptorFactory.HUE_RED, 400.0f, x2.k.b(l0.s1.e(x2.k.f56947b)), 1, null);
        f34128e = l0.j.i(BitmapDescriptorFactory.HUE_RED, 400.0f, x2.o.b(l0.s1.f(x2.o.f56954b)), 1, null);
    }

    public static /* synthetic */ k0.m A(c0 c0Var, a.c cVar, boolean z11, h00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c0Var = l0.j.i(BitmapDescriptorFactory.HUE_RED, 400.0f, x2.o.b(l0.s1.f(x2.o.f56954b)), 1, null);
        }
        if ((i11 & 2) != 0) {
            cVar = o1.a.f42039a.a();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = n.f34149a;
        }
        return z(c0Var, cVar, z11, lVar);
    }

    private static final o1.f B(o1.f fVar, a1<k0.i> a1Var, v1<v> v1Var, v1<v> v1Var2, String str) {
        return o1.e.b(fVar, null, new p(a1Var, v1Var, v1Var2, str), 1, null);
    }

    private static final o1.a C(a.c cVar) {
        a.C0826a c0826a = o1.a.f42039a;
        return kotlin.jvm.internal.s.c(cVar, c0826a.i()) ? c0826a.j() : kotlin.jvm.internal.s.c(cVar, c0826a.a()) ? c0826a.b() : c0826a.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final o1.f g(l0.a1<k0.i> r23, k0.k r24, k0.m r25, java.lang.String r26, c1.i r27, int r28) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.j.g(l0.a1, k0.k, k0.m, java.lang.String, c1.i, int):o1.f");
    }

    private static final boolean h(o0<Boolean> o0Var) {
        return o0Var.getValue().booleanValue();
    }

    public static final float i(v1<Float> v1Var) {
        return v1Var.getValue().floatValue();
    }

    public static final long j(v1<h1> v1Var) {
        return v1Var.getValue().j();
    }

    private static final void k(o0<Boolean> o0Var, boolean z11) {
        o0Var.setValue(Boolean.valueOf(z11));
    }

    private static final boolean l(o0<Boolean> o0Var) {
        return o0Var.getValue().booleanValue();
    }

    private static final void m(o0<Boolean> o0Var, boolean z11) {
        o0Var.setValue(Boolean.valueOf(z11));
    }

    public static final float n(v1<Float> v1Var) {
        return v1Var.getValue().floatValue();
    }

    public static final k0.k o(c0<x2.o> animationSpec, o1.a expandFrom, boolean z11, h00.l<? super x2.o, x2.o> initialSize) {
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.s.g(expandFrom, "expandFrom");
        kotlin.jvm.internal.s.g(initialSize, "initialSize");
        return new k0.l(new a0(null, null, new k0.f(expandFrom, initialSize, animationSpec, z11), null, 11, null));
    }

    public static /* synthetic */ k0.k p(c0 c0Var, o1.a aVar, boolean z11, h00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c0Var = l0.j.i(BitmapDescriptorFactory.HUE_RED, 400.0f, x2.o.b(l0.s1.f(x2.o.f56954b)), 1, null);
        }
        if ((i11 & 2) != 0) {
            aVar = o1.a.f42039a.c();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = i.f34141a;
        }
        return o(c0Var, aVar, z11, lVar);
    }

    public static final k0.k q(c0<x2.o> animationSpec, a.c expandFrom, boolean z11, h00.l<? super Integer, Integer> initialHeight) {
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.s.g(expandFrom, "expandFrom");
        kotlin.jvm.internal.s.g(initialHeight, "initialHeight");
        return o(animationSpec, C(expandFrom), z11, new k(initialHeight));
    }

    public static /* synthetic */ k0.k r(c0 c0Var, a.c cVar, boolean z11, h00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c0Var = l0.j.i(BitmapDescriptorFactory.HUE_RED, 400.0f, x2.o.b(l0.s1.f(x2.o.f56954b)), 1, null);
        }
        if ((i11 & 2) != 0) {
            cVar = o1.a.f42039a.a();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = C0633j.f34142a;
        }
        return q(c0Var, cVar, z11, lVar);
    }

    public static final k0.k s(c0<Float> animationSpec, float f11) {
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        return new k0.l(new a0(new k0.p(f11, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ k0.k t(c0 c0Var, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c0Var = l0.j.i(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        return s(c0Var, f11);
    }

    public static final k0.m u(c0<Float> animationSpec, float f11) {
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        return new k0.n(new a0(new k0.p(f11, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ k0.m v(c0 c0Var, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c0Var = l0.j.i(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        return u(c0Var, f11);
    }

    private static final o1.f w(o1.f fVar, a1<k0.i> a1Var, v1<k0.f> v1Var, v1<k0.f> v1Var2, String str) {
        return o1.e.b(fVar, null, new l(a1Var, v1Var, v1Var2, str), 1, null);
    }

    public static final k0.m x(c0<x2.o> animationSpec, o1.a shrinkTowards, boolean z11, h00.l<? super x2.o, x2.o> targetSize) {
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.s.g(shrinkTowards, "shrinkTowards");
        kotlin.jvm.internal.s.g(targetSize, "targetSize");
        return new k0.n(new a0(null, null, new k0.f(shrinkTowards, targetSize, animationSpec, z11), null, 11, null));
    }

    public static /* synthetic */ k0.m y(c0 c0Var, o1.a aVar, boolean z11, h00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c0Var = l0.j.i(BitmapDescriptorFactory.HUE_RED, 400.0f, x2.o.b(l0.s1.f(x2.o.f56954b)), 1, null);
        }
        if ((i11 & 2) != 0) {
            aVar = o1.a.f42039a.c();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = m.f34148a;
        }
        return x(c0Var, aVar, z11, lVar);
    }

    public static final k0.m z(c0<x2.o> animationSpec, a.c shrinkTowards, boolean z11, h00.l<? super Integer, Integer> targetHeight) {
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.s.g(shrinkTowards, "shrinkTowards");
        kotlin.jvm.internal.s.g(targetHeight, "targetHeight");
        return x(animationSpec, C(shrinkTowards), z11, new o(targetHeight));
    }
}
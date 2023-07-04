package p0;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import o1.a;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    private static final p0.m f45287a = c(1.0f);

    /* renamed from: b */
    private static final p0.m f45288b = a(1.0f);

    /* renamed from: c */
    private static final p0.m f45289c = b(1.0f);

    /* renamed from: d */
    private static final k0 f45290d;

    /* renamed from: e */
    private static final k0 f45291e;

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45292a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f11) {
            super(1);
            this.f45292a = f11;
        }

        public final void a(y0 $receiver) {
            kotlin.jvm.internal.s.g($receiver, "$this$$receiver");
            $receiver.b("fillMaxHeight");
            $receiver.a().b("fraction", Float.valueOf(this.f45292a));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45293a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f11) {
            super(1);
            this.f45293a = f11;
        }

        public final void a(y0 $receiver) {
            kotlin.jvm.internal.s.g($receiver, "$this$$receiver");
            $receiver.b("fillMaxSize");
            $receiver.a().b("fraction", Float.valueOf(this.f45293a));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45294a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f11) {
            super(1);
            this.f45294a = f11;
        }

        public final void a(y0 $receiver) {
            kotlin.jvm.internal.s.g($receiver, "$this$$receiver");
            $receiver.b("fillMaxWidth");
            $receiver.a().b("fraction", Float.valueOf(this.f45294a));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.p<x2.o, x2.q, x2.k> {

        /* renamed from: a */
        final /* synthetic */ a.c f45295a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a.c cVar) {
            super(2);
            this.f45295a = cVar;
        }

        public final long a(long j11, x2.q noName_1) {
            kotlin.jvm.internal.s.g(noName_1, "$noName_1");
            return x2.l.a(0, this.f45295a.a(0, x2.o.f(j11)));
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ x2.k invoke(x2.o oVar, x2.q qVar) {
            return x2.k.b(a(oVar.j(), qVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ a.c f45296a;

        /* renamed from: b */
        final /* synthetic */ boolean f45297b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a.c cVar, boolean z11) {
            super(1);
            this.f45296a = cVar;
            this.f45297b = z11;
        }

        public final void a(y0 $receiver) {
            kotlin.jvm.internal.s.g($receiver, "$this$$receiver");
            $receiver.b("wrapContentHeight");
            $receiver.a().b("align", this.f45296a);
            $receiver.a().b("unbounded", Boolean.valueOf(this.f45297b));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.p<x2.o, x2.q, x2.k> {

        /* renamed from: a */
        final /* synthetic */ o1.a f45298a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(o1.a aVar) {
            super(2);
            this.f45298a = aVar;
        }

        public final long a(long j11, x2.q layoutDirection) {
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            return this.f45298a.a(x2.o.f56954b.a(), j11, layoutDirection);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ x2.k invoke(x2.o oVar, x2.q qVar) {
            return x2.k.b(a(oVar.j(), qVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ o1.a f45299a;

        /* renamed from: b */
        final /* synthetic */ boolean f45300b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(o1.a aVar, boolean z11) {
            super(1);
            this.f45299a = aVar;
            this.f45300b = z11;
        }

        public final void a(y0 $receiver) {
            kotlin.jvm.internal.s.g($receiver, "$this$$receiver");
            $receiver.b("wrapContentSize");
            $receiver.a().b("align", this.f45299a);
            $receiver.a().b("unbounded", Boolean.valueOf(this.f45300b));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.p<x2.o, x2.q, x2.k> {

        /* renamed from: a */
        final /* synthetic */ a.b f45301a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a.b bVar) {
            super(2);
            this.f45301a = bVar;
        }

        public final long a(long j11, x2.q layoutDirection) {
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            return x2.l.a(this.f45301a.a(0, x2.o.g(j11), layoutDirection), 0);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ x2.k invoke(x2.o oVar, x2.q qVar) {
            return x2.k.b(a(oVar.j(), qVar));
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ a.b f45302a;

        /* renamed from: b */
        final /* synthetic */ boolean f45303b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(a.b bVar, boolean z11) {
            super(1);
            this.f45302a = bVar;
            this.f45303b = z11;
        }

        public final void a(y0 $receiver) {
            kotlin.jvm.internal.s.g($receiver, "$this$$receiver");
            $receiver.b("wrapContentWidth");
            $receiver.a().b("align", this.f45302a);
            $receiver.a().b("unbounded", Boolean.valueOf(this.f45303b));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45304a;

        /* renamed from: b */
        final /* synthetic */ float f45305b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f11, float f12) {
            super(1);
            this.f45304a = f11;
            this.f45305b = f12;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("defaultMinSize");
            y0Var.a().b("minWidth", x2.g.c(this.f45304a));
            y0Var.a().b("minHeight", x2.g.c(this.f45305b));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45306a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f11) {
            super(1);
            this.f45306a = f11;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b(Snapshot.HEIGHT);
            y0Var.c(x2.g.c(this.f45306a));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45307a;

        /* renamed from: b */
        final /* synthetic */ float f45308b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(float f11, float f12) {
            super(1);
            this.f45307a = f11;
            this.f45308b = f12;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("heightIn");
            y0Var.a().b("min", x2.g.c(this.f45307a));
            y0Var.a().b("max", x2.g.c(this.f45308b));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45309a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(float f11) {
            super(1);
            this.f45309a = f11;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("requiredHeight");
            y0Var.c(x2.g.c(this.f45309a));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45310a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(float f11) {
            super(1);
            this.f45310a = f11;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("requiredSize");
            y0Var.c(x2.g.c(this.f45310a));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45311a;

        /* renamed from: b */
        final /* synthetic */ float f45312b;

        /* renamed from: c */
        final /* synthetic */ float f45313c;

        /* renamed from: d */
        final /* synthetic */ float f45314d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(float f11, float f12, float f13, float f14) {
            super(1);
            this.f45311a = f11;
            this.f45312b = f12;
            this.f45313c = f13;
            this.f45314d = f14;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("requiredSizeIn");
            y0Var.a().b("minWidth", x2.g.c(this.f45311a));
            y0Var.a().b("minHeight", x2.g.c(this.f45312b));
            y0Var.a().b("maxWidth", x2.g.c(this.f45313c));
            y0Var.a().b("maxHeight", x2.g.c(this.f45314d));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45315a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(float f11) {
            super(1);
            this.f45315a = f11;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("size");
            y0Var.c(x2.g.c(this.f45315a));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45316a;

        /* renamed from: b */
        final /* synthetic */ float f45317b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(float f11, float f12) {
            super(1);
            this.f45316a = f11;
            this.f45317b = f12;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("size");
            y0Var.a().b(Snapshot.WIDTH, x2.g.c(this.f45316a));
            y0Var.a().b(Snapshot.HEIGHT, x2.g.c(this.f45317b));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45318a;

        /* renamed from: b */
        final /* synthetic */ float f45319b;

        /* renamed from: c */
        final /* synthetic */ float f45320c;

        /* renamed from: d */
        final /* synthetic */ float f45321d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(float f11, float f12, float f13, float f14) {
            super(1);
            this.f45318a = f11;
            this.f45319b = f12;
            this.f45320c = f13;
            this.f45321d = f14;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("sizeIn");
            y0Var.a().b("minWidth", x2.g.c(this.f45318a));
            y0Var.a().b("minHeight", x2.g.c(this.f45319b));
            y0Var.a().b("maxWidth", x2.g.c(this.f45320c));
            y0Var.a().b("maxHeight", x2.g.c(this.f45321d));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ float f45322a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(float f11) {
            super(1);
            this.f45322a = f11;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b(Snapshot.WIDTH);
            y0Var.c(x2.g.c(this.f45322a));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    static {
        a.C0826a c0826a = o1.a.f42039a;
        f(c0826a.f(), false);
        f(c0826a.h(), false);
        d(c0826a.g(), false);
        d(c0826a.i(), false);
        f45290d = e(c0826a.d(), false);
        f45291e = e(c0826a.k(), false);
    }

    public static final o1.f A(o1.f fVar, o1.a align, boolean z11) {
        k0 e11;
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(align, "align");
        a.C0826a c0826a = o1.a.f42039a;
        if (kotlin.jvm.internal.s.c(align, c0826a.d()) && !z11) {
            e11 = f45290d;
        } else if (kotlin.jvm.internal.s.c(align, c0826a.k()) && !z11) {
            e11 = f45291e;
        } else {
            e11 = e(align, z11);
        }
        return fVar.g0(e11);
    }

    public static /* synthetic */ o1.f B(o1.f fVar, o1.a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = o1.a.f42039a.d();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return A(fVar, aVar, z11);
    }

    private static final p0.m a(float f11) {
        return new p0.m(p0.l.Vertical, f11, new a(f11));
    }

    private static final p0.m b(float f11) {
        return new p0.m(p0.l.Both, f11, new b(f11));
    }

    private static final p0.m c(float f11) {
        return new p0.m(p0.l.Horizontal, f11, new c(f11));
    }

    private static final k0 d(a.c cVar, boolean z11) {
        return new k0(p0.l.Vertical, z11, new d(cVar), cVar, new e(cVar, z11));
    }

    private static final k0 e(o1.a aVar, boolean z11) {
        return new k0(p0.l.Both, z11, new f(aVar), aVar, new g(aVar, z11));
    }

    private static final k0 f(a.b bVar, boolean z11) {
        return new k0(p0.l.Horizontal, z11, new h(bVar), bVar, new i(bVar, z11));
    }

    public static final o1.f g(o1.f defaultMinSize, float f11, float f12) {
        kotlin.jvm.internal.s.g(defaultMinSize, "$this$defaultMinSize");
        return defaultMinSize.g0(new i0(f11, f12, x0.c() ? new j(f11, f12) : x0.a(), null));
    }

    public static /* synthetic */ o1.f h(o1.f fVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = x2.g.f56937b.b();
        }
        if ((i11 & 2) != 0) {
            f12 = x2.g.f56937b.b();
        }
        return g(fVar, f11, f12);
    }

    public static final o1.f i(o1.f fVar, float f11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return fVar.g0((f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1)) == 0 ? f45288b : a(f11));
    }

    public static /* synthetic */ o1.f j(o1.f fVar, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return i(fVar, f11);
    }

    public static final o1.f k(o1.f fVar, float f11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return fVar.g0((f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1)) == 0 ? f45289c : b(f11));
    }

    public static /* synthetic */ o1.f l(o1.f fVar, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return k(fVar, f11);
    }

    public static final o1.f m(o1.f fVar, float f11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return fVar.g0((f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1)) == 0 ? f45287a : c(f11));
    }

    public static /* synthetic */ o1.f n(o1.f fVar, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return m(fVar, f11);
    }

    public static final o1.f o(o1.f height, float f11) {
        kotlin.jvm.internal.s.g(height, "$this$height");
        return height.g0(new g0(BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, f11, true, x0.c() ? new k(f11) : x0.a(), 5, null));
    }

    public static final o1.f p(o1.f heightIn, float f11, float f12) {
        kotlin.jvm.internal.s.g(heightIn, "$this$heightIn");
        return heightIn.g0(new g0(BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, f12, true, x0.c() ? new l(f11, f12) : x0.a(), 5, null));
    }

    public static /* synthetic */ o1.f q(o1.f fVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = x2.g.f56937b.b();
        }
        if ((i11 & 2) != 0) {
            f12 = x2.g.f56937b.b();
        }
        return p(fVar, f11, f12);
    }

    public static final o1.f r(o1.f requiredHeight, float f11) {
        kotlin.jvm.internal.s.g(requiredHeight, "$this$requiredHeight");
        return requiredHeight.g0(new g0(BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, f11, false, x0.c() ? new m(f11) : x0.a(), 5, null));
    }

    public static final o1.f s(o1.f requiredSize, float f11) {
        kotlin.jvm.internal.s.g(requiredSize, "$this$requiredSize");
        return requiredSize.g0(new g0(f11, f11, f11, f11, false, x0.c() ? new n(f11) : x0.a(), null));
    }

    public static final o1.f t(o1.f requiredSizeIn, float f11, float f12, float f13, float f14) {
        kotlin.jvm.internal.s.g(requiredSizeIn, "$this$requiredSizeIn");
        return requiredSizeIn.g0(new g0(f11, f12, f13, f14, false, x0.c() ? new o(f11, f12, f13, f14) : x0.a(), null));
    }

    public static /* synthetic */ o1.f u(o1.f fVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = x2.g.f56937b.b();
        }
        if ((i11 & 2) != 0) {
            f12 = x2.g.f56937b.b();
        }
        if ((i11 & 4) != 0) {
            f13 = x2.g.f56937b.b();
        }
        if ((i11 & 8) != 0) {
            f14 = x2.g.f56937b.b();
        }
        return t(fVar, f11, f12, f13, f14);
    }

    public static final o1.f v(o1.f size, float f11) {
        kotlin.jvm.internal.s.g(size, "$this$size");
        return size.g0(new g0(f11, f11, f11, f11, true, x0.c() ? new p(f11) : x0.a(), null));
    }

    public static final o1.f w(o1.f size, float f11, float f12) {
        kotlin.jvm.internal.s.g(size, "$this$size");
        return size.g0(new g0(f11, f12, f11, f12, true, x0.c() ? new q(f11, f12) : x0.a(), null));
    }

    public static final o1.f x(o1.f sizeIn, float f11, float f12, float f13, float f14) {
        kotlin.jvm.internal.s.g(sizeIn, "$this$sizeIn");
        return sizeIn.g0(new g0(f11, f12, f13, f14, true, x0.c() ? new r(f11, f12, f13, f14) : x0.a(), null));
    }

    public static /* synthetic */ o1.f y(o1.f fVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = x2.g.f56937b.b();
        }
        if ((i11 & 2) != 0) {
            f12 = x2.g.f56937b.b();
        }
        if ((i11 & 4) != 0) {
            f13 = x2.g.f56937b.b();
        }
        if ((i11 & 8) != 0) {
            f14 = x2.g.f56937b.b();
        }
        return x(fVar, f11, f12, f13, f14);
    }

    public static final o1.f z(o1.f width, float f11) {
        kotlin.jvm.internal.s.g(width, "$this$width");
        return width.g0(new g0(f11, BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, true, x0.c() ? new s(f11) : x0.a(), 10, null));
    }
}
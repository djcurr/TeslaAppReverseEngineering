package k0;

import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import kotlin.NoWhenBranchMatchedException;
import l0.a1;
import l0.c0;
import l0.v0;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o extends s {

    /* renamed from: a  reason: collision with root package name */
    private final a1<i>.a<x2.o, l0.n> f34159a;

    /* renamed from: b  reason: collision with root package name */
    private final a1<i>.a<x2.k, l0.n> f34160b;

    /* renamed from: c  reason: collision with root package name */
    private final v1<k0.f> f34161c;

    /* renamed from: d  reason: collision with root package name */
    private final v1<k0.f> f34162d;

    /* renamed from: e  reason: collision with root package name */
    private final v1<o1.a> f34163e;

    /* renamed from: f  reason: collision with root package name */
    private o1.a f34164f;

    /* renamed from: g  reason: collision with root package name */
    private final h00.l<a1.b<i>, c0<x2.o>> f34165g;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34166a;

        static {
            int[] iArr = new int[i.values().length];
            iArr[i.Visible.ordinal()] = 1;
            iArr[i.PreEnter.ordinal()] = 2;
            iArr[i.PostExit.ordinal()] = 3;
            f34166a = iArr;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<m0.a, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f34167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34168b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f34169c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m0 m0Var, long j11, long j12) {
            super(1);
            this.f34167a = m0Var;
            this.f34168b = j11;
            this.f34169c = j12;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            m0.a.j(layout, this.f34167a, x2.k.h(this.f34168b) + x2.k.h(this.f34169c), x2.k.i(this.f34168b) + x2.k.i(this.f34169c), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<i, x2.o> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34171b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11) {
            super(1);
            this.f34171b = j11;
        }

        public final long a(i it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return o.this.f(it2, this.f34171b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ x2.o invoke(i iVar) {
            return x2.o.b(a(iVar));
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<a1.b<i>, c0<x2.k>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f34172a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final c0<x2.k> invoke(a1.b<i> animate) {
            v0 v0Var;
            kotlin.jvm.internal.s.g(animate, "$this$animate");
            v0Var = j.f34127d;
            return v0Var;
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.l<i, x2.k> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34174b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j11) {
            super(1);
            this.f34174b = j11;
        }

        public final long a(i it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return o.this.g(it2, this.f34174b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ x2.k invoke(i iVar) {
            return x2.k.b(a(iVar));
        }
    }

    /* loaded from: classes.dex */
    static final class f extends kotlin.jvm.internal.u implements h00.l<a1.b<i>, c0<x2.o>> {
        f() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final c0<x2.o> invoke(a1.b<i> bVar) {
            v0 v0Var;
            kotlin.jvm.internal.s.g(bVar, "$this$null");
            i iVar = i.PreEnter;
            i iVar2 = i.Visible;
            c0<x2.o> c0Var = null;
            if (bVar.c(iVar, iVar2)) {
                k0.f value = o.this.c().getValue();
                if (value != null) {
                    c0Var = value.b();
                }
            } else if (!bVar.c(iVar2, i.PostExit)) {
                c0Var = j.f34128e;
            } else {
                k0.f value2 = o.this.d().getValue();
                if (value2 != null) {
                    c0Var = value2.b();
                }
            }
            if (c0Var == null) {
                v0Var = j.f34128e;
                return v0Var;
            }
            return c0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(a1<i>.a<x2.o, l0.n> sizeAnimation, a1<i>.a<x2.k, l0.n> offsetAnimation, v1<k0.f> expand, v1<k0.f> shrink, v1<? extends o1.a> alignment) {
        kotlin.jvm.internal.s.g(sizeAnimation, "sizeAnimation");
        kotlin.jvm.internal.s.g(offsetAnimation, "offsetAnimation");
        kotlin.jvm.internal.s.g(expand, "expand");
        kotlin.jvm.internal.s.g(shrink, "shrink");
        kotlin.jvm.internal.s.g(alignment, "alignment");
        this.f34159a = sizeAnimation;
        this.f34160b = offsetAnimation;
        this.f34161c = expand;
        this.f34162d = shrink;
        this.f34163e = alignment;
        this.f34165g = new f();
    }

    @Override // f2.v
    public f2.a0 Z(f2.b0 receiver, f2.y measurable, long j11) {
        long l11;
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        m0 X = measurable.X(j11);
        long a11 = x2.p.a(X.B0(), X.w0());
        long j12 = this.f34159a.a(this.f34165g, new c(a11)).getValue().j();
        long l12 = this.f34160b.a(d.f34172a, new e(a11)).getValue().l();
        o1.a aVar = this.f34164f;
        x2.k b11 = aVar == null ? null : x2.k.b(aVar.a(a11, j12, x2.q.Ltr));
        if (b11 == null) {
            l11 = x2.k.f56947b.a();
        } else {
            l11 = b11.l();
        }
        return b0.a.b(receiver, x2.o.g(j12), x2.o.f(j12), null, new b(X, l11, l12), 4, null);
    }

    public final v1<o1.a> a() {
        return this.f34163e;
    }

    public final o1.a b() {
        return this.f34164f;
    }

    public final v1<k0.f> c() {
        return this.f34161c;
    }

    public final v1<k0.f> d() {
        return this.f34162d;
    }

    public final void e(o1.a aVar) {
        this.f34164f = aVar;
    }

    public final long f(i targetState, long j11) {
        kotlin.jvm.internal.s.g(targetState, "targetState");
        k0.f value = this.f34161c.getValue();
        long j12 = value == null ? j11 : value.d().invoke(x2.o.b(j11)).j();
        k0.f value2 = this.f34162d.getValue();
        long j13 = value2 == null ? j11 : value2.d().invoke(x2.o.b(j11)).j();
        int i11 = a.f34166a[targetState.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return j13;
                }
                throw new NoWhenBranchMatchedException();
            }
            return j12;
        }
        return j11;
    }

    public final long g(i targetState, long j11) {
        x2.k b11;
        kotlin.jvm.internal.s.g(targetState, "targetState");
        if (this.f34164f != null && this.f34163e.getValue() != null && !kotlin.jvm.internal.s.c(this.f34164f, this.f34163e.getValue())) {
            int i11 = a.f34166a[targetState.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        k0.f value = this.f34162d.getValue();
                        if (value == null) {
                            b11 = null;
                        } else {
                            long j12 = value.d().invoke(x2.o.b(j11)).j();
                            o1.a value2 = a().getValue();
                            kotlin.jvm.internal.s.e(value2);
                            o1.a aVar = value2;
                            x2.q qVar = x2.q.Ltr;
                            long a11 = aVar.a(j11, j12, qVar);
                            o1.a b12 = b();
                            kotlin.jvm.internal.s.e(b12);
                            long a12 = b12.a(j11, j12, qVar);
                            b11 = x2.k.b(x2.l.a(x2.k.h(a11) - x2.k.h(a12), x2.k.i(a11) - x2.k.i(a12)));
                        }
                        if (b11 == null) {
                            return x2.k.f56947b.a();
                        }
                        return b11.l();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return x2.k.f56947b.a();
            }
            return x2.k.f56947b.a();
        }
        return x2.k.f56947b.a();
    }
}
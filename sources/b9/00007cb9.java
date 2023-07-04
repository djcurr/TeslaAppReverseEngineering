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
public final class w extends s {

    /* renamed from: a  reason: collision with root package name */
    private final a1<i>.a<x2.k, l0.n> f34188a;

    /* renamed from: b  reason: collision with root package name */
    private final v1<v> f34189b;

    /* renamed from: c  reason: collision with root package name */
    private final v1<v> f34190c;

    /* renamed from: d  reason: collision with root package name */
    private final h00.l<a1.b<i>, c0<x2.k>> f34191d;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34192a;

        static {
            int[] iArr = new int[i.values().length];
            iArr[i.Visible.ordinal()] = 1;
            iArr[i.PreEnter.ordinal()] = 2;
            iArr[i.PostExit.ordinal()] = 3;
            f34192a = iArr;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<m0.a, b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m0 f34194b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f34195c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<i, x2.k> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ w f34196a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f34197b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, long j11) {
                super(1);
                this.f34196a = wVar;
                this.f34197b = j11;
            }

            public final long a(i it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                return this.f34196a.e(it2, this.f34197b);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ x2.k invoke(i iVar) {
                return x2.k.b(a(iVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m0 m0Var, long j11) {
            super(1);
            this.f34194b = m0Var;
            this.f34195c = j11;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            m0.a.x(layout, this.f34194b, w.this.a().a(w.this.d(), new a(w.this, this.f34195c)).getValue().l(), BitmapDescriptorFactory.HUE_RED, null, 6, null);
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<a1.b<i>, c0<x2.k>> {
        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final c0<x2.k> invoke(a1.b<i> bVar) {
            v0 v0Var;
            c0<x2.k> a11;
            v0 v0Var2;
            v0 v0Var3;
            kotlin.jvm.internal.s.g(bVar, "$this$null");
            i iVar = i.PreEnter;
            i iVar2 = i.Visible;
            if (bVar.c(iVar, iVar2)) {
                v value = w.this.b().getValue();
                a11 = value != null ? value.a() : null;
                if (a11 == null) {
                    v0Var3 = j.f34127d;
                    return v0Var3;
                }
                return a11;
            } else if (!bVar.c(iVar2, i.PostExit)) {
                v0Var = j.f34127d;
                return v0Var;
            } else {
                v value2 = w.this.c().getValue();
                a11 = value2 != null ? value2.a() : null;
                if (a11 == null) {
                    v0Var2 = j.f34127d;
                    return v0Var2;
                }
                return a11;
            }
        }
    }

    public w(a1<i>.a<x2.k, l0.n> lazyAnimation, v1<v> slideIn, v1<v> slideOut) {
        kotlin.jvm.internal.s.g(lazyAnimation, "lazyAnimation");
        kotlin.jvm.internal.s.g(slideIn, "slideIn");
        kotlin.jvm.internal.s.g(slideOut, "slideOut");
        this.f34188a = lazyAnimation;
        this.f34189b = slideIn;
        this.f34190c = slideOut;
        this.f34191d = new c();
    }

    @Override // f2.v
    public f2.a0 Z(f2.b0 receiver, f2.y measurable, long j11) {
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        m0 X = measurable.X(j11);
        return b0.a.b(receiver, X.B0(), X.w0(), null, new b(X, x2.p.a(X.B0(), X.w0())), 4, null);
    }

    public final a1<i>.a<x2.k, l0.n> a() {
        return this.f34188a;
    }

    public final v1<v> b() {
        return this.f34189b;
    }

    public final v1<v> c() {
        return this.f34190c;
    }

    public final h00.l<a1.b<i>, c0<x2.k>> d() {
        return this.f34191d;
    }

    public final long e(i targetState, long j11) {
        h00.l<x2.o, x2.k> b11;
        h00.l<x2.o, x2.k> b12;
        kotlin.jvm.internal.s.g(targetState, "targetState");
        v value = this.f34189b.getValue();
        x2.k kVar = null;
        x2.k invoke = (value == null || (b11 = value.b()) == null) ? null : b11.invoke(x2.o.b(j11));
        long a11 = invoke == null ? x2.k.f56947b.a() : invoke.l();
        v value2 = this.f34190c.getValue();
        if (value2 != null && (b12 = value2.b()) != null) {
            kVar = b12.invoke(x2.o.b(j11));
        }
        long a12 = kVar == null ? x2.k.f56947b.a() : kVar.l();
        int i11 = a.f34192a[targetState.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return a12;
                }
                throw new NoWhenBranchMatchedException();
            }
            return a11;
        }
        return x2.k.f56947b.a();
    }
}
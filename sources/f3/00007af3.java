package j10;

import ch.qos.logback.core.CoreConstants;
import f10.k;
import h00.l;
import java.util.ArrayList;
import java.util.List;
import k20.a0;
import k20.a1;
import k20.b1;
import k20.d0;
import k20.e0;
import k20.f0;
import k20.k0;
import k20.k1;
import k20.w0;
import k20.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.types.checker.h;
import vz.p;
import vz.v;
import w00.s0;
import wz.x;

/* loaded from: classes5.dex */
public final class e extends b1 {

    /* renamed from: c  reason: collision with root package name */
    private static final j10.a f33094c;

    /* renamed from: d  reason: collision with root package name */
    private static final j10.a f33095d;

    /* renamed from: b  reason: collision with root package name */
    private final g f33096b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33097a;

        static {
            int[] iArr = new int[j10.b.values().length];
            iArr[j10.b.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            iArr[j10.b.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            iArr[j10.b.INFLEXIBLE.ordinal()] = 3;
            f33097a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends u implements l<h, k0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w00.c f33098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f33099b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k0 f33100c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j10.a f33101d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w00.c cVar, e eVar, k0 k0Var, j10.a aVar) {
            super(1);
            this.f33098a = cVar;
            this.f33099b = eVar;
            this.f33100c = k0Var;
            this.f33101d = aVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final k0 mo12invoke(h kotlinTypeRefiner) {
            w00.c a11;
            s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            w00.c cVar = this.f33098a;
            if (!(cVar instanceof w00.c)) {
                cVar = null;
            }
            u10.b h11 = cVar == null ? null : a20.a.h(cVar);
            if (h11 == null || (a11 = kotlinTypeRefiner.a(h11)) == null || s.c(a11, this.f33098a)) {
                return null;
            }
            return (k0) this.f33099b.l(this.f33100c, a11, this.f33101d).c();
        }
    }

    static {
        new a(null);
        k kVar = k.COMMON;
        f33094c = d.d(kVar, false, null, 3, null).i(j10.b.FLEXIBLE_LOWER_BOUND);
        f33095d = d.d(kVar, false, null, 3, null).i(j10.b.FLEXIBLE_UPPER_BOUND);
    }

    public e(g gVar) {
        this.f33096b = gVar == null ? new g(this) : gVar;
    }

    public static /* synthetic */ y0 k(e eVar, s0 s0Var, j10.a aVar, d0 d0Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            d0Var = eVar.f33096b.c(s0Var, true, aVar);
            s.f(d0Var, "fun computeProjection(\n …er, attr)\n        }\n    }");
        }
        return eVar.j(s0Var, aVar, d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p<k0, Boolean> l(k0 k0Var, w00.c cVar, j10.a aVar) {
        int t11;
        List d11;
        if (k0Var.H0().getParameters().isEmpty()) {
            return v.a(k0Var, Boolean.FALSE);
        }
        if (t00.h.c0(k0Var)) {
            y0 y0Var = k0Var.G0().get(0);
            k1 b11 = y0Var.b();
            d0 type = y0Var.getType();
            s.f(type, "componentTypeProjection.type");
            d11 = wz.v.d(new a1(b11, m(type, aVar)));
            return v.a(e0.i(k0Var.mo140getAnnotations(), k0Var.H0(), d11, k0Var.I0(), null, 16, null), Boolean.FALSE);
        } else if (f0.a(k0Var)) {
            k0 j11 = k20.v.j(s.p("Raw error type: ", k0Var.H0()));
            s.f(j11, "createErrorType(\"Raw err…pe: ${type.constructor}\")");
            return v.a(j11, Boolean.FALSE);
        } else {
            d20.h I = cVar.I(this);
            s.f(I, "declaration.getMemberScope(this)");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations = k0Var.mo140getAnnotations();
            w0 mo234i = cVar.mo234i();
            s.f(mo234i, "declaration.typeConstructor");
            List<s0> parameters = cVar.mo234i().getParameters();
            s.f(parameters, "declaration.typeConstructor.parameters");
            t11 = x.t(parameters, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (s0 parameter : parameters) {
                s.f(parameter, "parameter");
                arrayList.add(k(this, parameter, aVar, null, 4, null));
            }
            return v.a(e0.k(mo140getAnnotations, mo234i, arrayList, k0Var.I0(), I, new c(cVar, this, k0Var, aVar)), Boolean.TRUE);
        }
    }

    private final d0 m(d0 d0Var, j10.a aVar) {
        w00.e n11 = d0Var.H0().n();
        if (n11 instanceof s0) {
            d0 c11 = this.f33096b.c((s0) n11, true, aVar);
            s.f(c11, "typeParameterUpperBoundE…tion, isRaw = true, attr)");
            return m(c11, aVar);
        } else if (n11 instanceof w00.c) {
            w00.e n12 = a0.d(d0Var).H0().n();
            if (n12 instanceof w00.c) {
                p<k0, Boolean> l11 = l(a0.c(d0Var), (w00.c) n11, f33094c);
                k0 a11 = l11.a();
                boolean booleanValue = l11.b().booleanValue();
                p<k0, Boolean> l12 = l(a0.d(d0Var), (w00.c) n12, f33095d);
                k0 a12 = l12.a();
                boolean booleanValue2 = l12.b().booleanValue();
                if (!booleanValue && !booleanValue2) {
                    return e0.d(a11, a12);
                }
                return new f(a11, a12);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + n12 + "\" while for lower it's \"" + n11 + CoreConstants.DOUBLE_QUOTE_CHAR).toString());
        } else {
            throw new IllegalStateException(s.p("Unexpected declaration kind: ", n11).toString());
        }
    }

    static /* synthetic */ d0 n(e eVar, d0 d0Var, j10.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = new j10.a(k.COMMON, null, false, null, null, 30, null);
        }
        return eVar.m(d0Var, aVar);
    }

    @Override // k20.b1
    public boolean f() {
        return false;
    }

    public final y0 j(s0 parameter, j10.a attr, d0 erasedUpperBound) {
        s.g(parameter, "parameter");
        s.g(attr, "attr");
        s.g(erasedUpperBound, "erasedUpperBound");
        int i11 = b.f33097a[attr.d().ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (!parameter.k().getAllowsOutPosition()) {
                return new a1(k1.INVARIANT, a20.a.g(parameter).H());
            }
            List<s0> parameters = erasedUpperBound.H0().getParameters();
            s.f(parameters, "erasedUpperBound.constructor.parameters");
            if (!parameters.isEmpty()) {
                return new a1(k1.OUT_VARIANCE, erasedUpperBound);
            }
            return d.b(parameter, attr);
        }
        return new a1(k1.INVARIANT, erasedUpperBound);
    }

    @Override // k20.b1
    /* renamed from: o */
    public a1 e(d0 key) {
        s.g(key, "key");
        return new a1(n(this, key, null, 2, null));
    }

    public /* synthetic */ e(g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : gVar);
    }
}
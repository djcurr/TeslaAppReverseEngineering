package kotlin.reflect.jvm.internal.impl.renderer;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k20.c0;
import k20.d0;
import k20.f1;
import k20.i1;
import k20.j1;
import k20.k1;
import k20.l1;
import k20.n0;
import k20.v;
import k20.w0;
import k20.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.text.y;
import org.slf4j.Marker;
import t00.k;
import vz.b0;
import w00.a0;
import w00.f0;
import w00.h0;
import w00.i0;
import w00.j0;
import w00.k0;
import w00.l0;
import w00.p;
import w00.q;
import w00.r;
import w00.r0;
import w00.s0;
import w00.t0;
import w00.v0;
import w00.x;
import w00.z;
import wz.e0;
import wz.v;
import wz.w;
import y10.q;

/* loaded from: classes5.dex */
public final class d extends kotlin.reflect.jvm.internal.impl.renderer.c implements kotlin.reflect.jvm.internal.impl.renderer.f {

    /* renamed from: d  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.renderer.g f35094d;

    /* renamed from: e  reason: collision with root package name */
    private final vz.k f35095e;

    /* loaded from: classes5.dex */
    private final class a implements w00.k<b0, StringBuilder> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f35096a;

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public /* synthetic */ class C0657a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f35097a;

            static {
                int[] iArr = new int[l.values().length];
                iArr[l.PRETTY.ordinal()] = 1;
                iArr[l.DEBUG.ordinal()] = 2;
                iArr[l.NONE.ordinal()] = 3;
                f35097a = iArr;
            }
        }

        public a(d this$0) {
            s.g(this$0, "this$0");
            this.f35096a = this$0;
        }

        private final void t(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, StringBuilder sb2, String str) {
            int i11 = C0657a.f35097a[this.f35096a.m0().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    return;
                }
                p(gVar, sb2);
                return;
            }
            this.f35096a.S0(gVar, sb2);
            sb2.append(s.p(str, " for "));
            d dVar = this.f35096a;
            i0 U = gVar.U();
            s.f(U, "descriptor.correspondingProperty");
            dVar.z1(U, sb2);
        }

        public void A(v0 descriptor, StringBuilder builder) {
            s.g(descriptor, "descriptor");
            s.g(builder, "builder");
            this.f35096a.R1(descriptor, true, builder, true);
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 a(l0 l0Var, StringBuilder sb2) {
            x(l0Var, sb2);
            return b0.f54756a;
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 b(v0 v0Var, StringBuilder sb2) {
            A(v0Var, sb2);
            return b0.f54756a;
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 c(s0 s0Var, StringBuilder sb2) {
            z(s0Var, sb2);
            return b0.f54756a;
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 d(a0 a0Var, StringBuilder sb2) {
            r(a0Var, sb2);
            return b0.f54756a;
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 e(j0 j0Var, StringBuilder sb2) {
            v(j0Var, sb2);
            return b0.f54756a;
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 f(x xVar, StringBuilder sb2) {
            q(xVar, sb2);
            return b0.f54756a;
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 g(w00.c cVar, StringBuilder sb2) {
            n(cVar, sb2);
            return b0.f54756a;
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 h(f0 f0Var, StringBuilder sb2) {
            s(f0Var, sb2);
            return b0.f54756a;
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 i(i0 i0Var, StringBuilder sb2) {
            u(i0Var, sb2);
            return b0.f54756a;
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 j(k0 k0Var, StringBuilder sb2) {
            w(k0Var, sb2);
            return b0.f54756a;
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 k(r0 r0Var, StringBuilder sb2) {
            y(r0Var, sb2);
            return b0.f54756a;
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 l(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb2) {
            p(eVar, sb2);
            return b0.f54756a;
        }

        @Override // w00.k
        public /* bridge */ /* synthetic */ b0 m(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, StringBuilder sb2) {
            o(dVar, sb2);
            return b0.f54756a;
        }

        public void n(w00.c descriptor, StringBuilder builder) {
            s.g(descriptor, "descriptor");
            s.g(builder, "builder");
            this.f35096a.Y0(descriptor, builder);
        }

        public void o(kotlin.reflect.jvm.internal.impl.descriptors.d constructorDescriptor, StringBuilder builder) {
            s.g(constructorDescriptor, "constructorDescriptor");
            s.g(builder, "builder");
            this.f35096a.d1(constructorDescriptor, builder);
        }

        public void p(kotlin.reflect.jvm.internal.impl.descriptors.e descriptor, StringBuilder builder) {
            s.g(descriptor, "descriptor");
            s.g(builder, "builder");
            this.f35096a.h1(descriptor, builder);
        }

        public void q(x descriptor, StringBuilder builder) {
            s.g(descriptor, "descriptor");
            s.g(builder, "builder");
            this.f35096a.r1(descriptor, builder, true);
        }

        public void r(a0 descriptor, StringBuilder builder) {
            s.g(descriptor, "descriptor");
            s.g(builder, "builder");
            this.f35096a.v1(descriptor, builder);
        }

        public void s(f0 descriptor, StringBuilder builder) {
            s.g(descriptor, "descriptor");
            s.g(builder, "builder");
            this.f35096a.x1(descriptor, builder);
        }

        public void u(i0 descriptor, StringBuilder builder) {
            s.g(descriptor, "descriptor");
            s.g(builder, "builder");
            this.f35096a.z1(descriptor, builder);
        }

        public void v(j0 descriptor, StringBuilder builder) {
            s.g(descriptor, "descriptor");
            s.g(builder, "builder");
            t(descriptor, builder, "getter");
        }

        public void w(k0 descriptor, StringBuilder builder) {
            s.g(descriptor, "descriptor");
            s.g(builder, "builder");
            t(descriptor, builder, "setter");
        }

        public void x(l0 descriptor, StringBuilder builder) {
            s.g(descriptor, "descriptor");
            s.g(builder, "builder");
            builder.append(descriptor.getName());
        }

        public void y(r0 descriptor, StringBuilder builder) {
            s.g(descriptor, "descriptor");
            s.g(builder, "builder");
            this.f35096a.H1(descriptor, builder);
        }

        public void z(s0 descriptor, StringBuilder builder) {
            s.g(descriptor, "descriptor");
            s.g(builder, "builder");
            this.f35096a.M1(descriptor, builder, true);
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35098a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f35099b;

        static {
            int[] iArr = new int[m.values().length];
            iArr[m.PLAIN.ordinal()] = 1;
            iArr[m.HTML.ordinal()] = 2;
            f35098a = iArr;
            int[] iArr2 = new int[k.values().length];
            iArr2[k.ALL.ordinal()] = 1;
            iArr2[k.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            iArr2[k.NONE.ordinal()] = 3;
            f35099b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends u implements h00.l<y0, CharSequence> {
        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence mo12invoke(y0 it2) {
            s.g(it2, "it");
            if (it2.a()) {
                return Marker.ANY_MARKER;
            }
            d dVar = d.this;
            d0 type = it2.getType();
            s.f(type, "it.type");
            String w11 = dVar.w(type);
            if (it2.b() == k1.INVARIANT) {
                return w11;
            }
            return it2.b() + ' ' + w11;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$d  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0658d extends u implements h00.a<d> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.d$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends u implements h00.l<kotlin.reflect.jvm.internal.impl.renderer.f, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f35102a = new a();

            a() {
                super(1);
            }

            public final void a(kotlin.reflect.jvm.internal.impl.renderer.f withOptions) {
                List d11;
                Set<u10.c> m11;
                s.g(withOptions, "$this$withOptions");
                Set<u10.c> h11 = withOptions.h();
                d11 = v.d(k.a.f51347q);
                m11 = wz.y0.m(h11, d11);
                withOptions.k(m11);
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo12invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
                a(fVar);
                return b0.f54756a;
            }
        }

        C0658d() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final d mo11invoke() {
            return (d) d.this.y(a.f35102a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends u implements h00.l<y10.g<?>, CharSequence> {
        e() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence mo12invoke(y10.g<?> it2) {
            s.g(it2, "it");
            return d.this.c1(it2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends u implements h00.l<v0, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f35104a = new f();

        f() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence mo12invoke(v0 v0Var) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends u implements h00.l<d0, CharSequence> {
        g() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence mo12invoke(d0 it2) {
            d dVar = d.this;
            s.f(it2, "it");
            return dVar.w(it2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends u implements h00.l<d0, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f35106a = new h();

        h() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Object mo12invoke(d0 it2) {
            s.g(it2, "it");
            return it2 instanceof k20.r0 ? ((k20.r0) it2).Q0() : it2;
        }
    }

    public d(kotlin.reflect.jvm.internal.impl.renderer.g options) {
        vz.k a11;
        s.g(options, "options");
        this.f35094d = options;
        options.k0();
        a11 = vz.m.a(new C0658d());
        this.f35095e = a11;
    }

    private final void A1(i0 i0Var, StringBuilder sb2) {
        if (f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.ANNOTATIONS)) {
            W0(this, sb2, i0Var, null, 2, null);
            r r02 = i0Var.r0();
            if (r02 != null) {
                V0(sb2, r02, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.FIELD);
            }
            r O = i0Var.O();
            if (O != null) {
                V0(sb2, O, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_DELEGATE_FIELD);
            }
            if (m0() == l.NONE) {
                j0 mo239getGetter = i0Var.mo239getGetter();
                if (mo239getGetter != null) {
                    V0(sb2, mo239getGetter, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_GETTER);
                }
                k0 setter = i0Var.getSetter();
                if (setter == null) {
                    return;
                }
                V0(sb2, setter, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_SETTER);
                List<v0> h11 = setter.h();
                s.f(h11, "setter.valueParameters");
                v0 it2 = (v0) wz.u.C0(h11);
                s.f(it2, "it");
                V0(sb2, it2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.SETTER_PARAMETER);
            }
        }
    }

    private final void B1(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, StringBuilder sb2) {
        l0 N = aVar.N();
        if (N != null) {
            V0(sb2, N, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.RECEIVER);
            d0 type = N.getType();
            s.f(type, "receiver.type");
            String w11 = w(type);
            if (X1(type) && !f1.m(type)) {
                w11 = CoreConstants.LEFT_PARENTHESIS_CHAR + w11 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
            sb2.append(w11);
            sb2.append(".");
        }
    }

    private final void C1(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, StringBuilder sb2) {
        l0 N;
        if (n0() && (N = aVar.N()) != null) {
            sb2.append(" on ");
            d0 type = N.getType();
            s.f(type, "receiver.type");
            sb2.append(w(type));
        }
    }

    private final void D1(StringBuilder sb2, k20.k0 k0Var) {
        if (!s.c(k0Var, f1.f34258b) && !f1.l(k0Var)) {
            if (k20.v.t(k0Var)) {
                if (C0()) {
                    String fVar = ((v.f) k0Var.H0()).c().getName().toString();
                    s.f(fVar, "type.constructor as Unin…escriptor.name.toString()");
                    sb2.append(f1(fVar));
                    return;
                }
                sb2.append("???");
                return;
            } else if (k20.f0.a(k0Var)) {
                e1(sb2, k0Var);
                return;
            } else if (X1(k0Var)) {
                i1(sb2, k0Var);
                return;
            } else {
                e1(sb2, k0Var);
                return;
            }
        }
        sb2.append("???");
    }

    private final void E1(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final void F1(w00.c cVar, StringBuilder sb2) {
        if (J0() || t00.h.l0(cVar.n())) {
            return;
        }
        Collection<d0> a11 = cVar.mo234i().a();
        s.f(a11, "klass.typeConstructor.supertypes");
        if (a11.isEmpty()) {
            return;
        }
        if (a11.size() == 1 && t00.h.b0(a11.iterator().next())) {
            return;
        }
        E1(sb2);
        sb2.append(": ");
        e0.j0(a11, sb2, ", ", null, null, 0, null, new g(), 60, null);
    }

    private final void G1(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb2) {
        q1(sb2, eVar.isSuspend(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(r0 r0Var, StringBuilder sb2) {
        W0(this, sb2, r0Var, null, 2, null);
        q visibility = r0Var.getVisibility();
        s.f(visibility, "typeAlias.visibility");
        U1(visibility, sb2);
        m1(r0Var, sb2);
        sb2.append(k1("typealias"));
        sb2.append(" ");
        r1(r0Var, sb2, true);
        List<s0> o11 = r0Var.o();
        s.f(o11, "typeAlias.declaredTypeParameters");
        O1(o11, sb2, false);
        X0(r0Var, sb2);
        sb2.append(" = ");
        sb2.append(w(r0Var.o0()));
    }

    private final void K1(StringBuilder sb2, d0 d0Var, w0 w0Var) {
        h0 a11 = t0.a(d0Var);
        if (a11 == null) {
            sb2.append(J1(w0Var));
            sb2.append(I1(d0Var.G0()));
            return;
        }
        y1(sb2, a11);
    }

    private final void L(StringBuilder sb2, w00.i iVar) {
        w00.i mo223b;
        String name;
        if ((iVar instanceof a0) || (iVar instanceof f0) || (mo223b = iVar.mo223b()) == null || (mo223b instanceof x)) {
            return;
        }
        sb2.append(" ");
        sb2.append(n1("defined in"));
        sb2.append(" ");
        u10.d m11 = w10.d.m(mo223b);
        s.f(m11, "getFqName(containingDeclaration)");
        sb2.append(m11.e() ? "root package" : u(m11));
        if (H0() && (mo223b instanceof a0) && (iVar instanceof w00.l) && (name = ((w00.l) iVar).f().b().getName()) != null) {
            sb2.append(" ");
            sb2.append(n1("in file"));
            sb2.append(" ");
            sb2.append(name);
        }
    }

    private final String L0() {
        return P(">");
    }

    static /* synthetic */ void L1(d dVar, StringBuilder sb2, d0 d0Var, w0 w0Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            w0Var = d0Var.H0();
        }
        dVar.K1(sb2, d0Var, w0Var);
    }

    private final void M(StringBuilder sb2, List<? extends y0> list) {
        e0.j0(list, sb2, ", ", null, null, 0, null, new c(), 60, null);
    }

    private final boolean M0(d0 d0Var) {
        return t00.g.o(d0Var) || !d0Var.mo140getAnnotations().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(s0 s0Var, StringBuilder sb2, boolean z11) {
        if (z11) {
            sb2.append(P0());
        }
        if (F0()) {
            sb2.append("/*");
            sb2.append(s0Var.getIndex());
            sb2.append("*/ ");
        }
        q1(sb2, s0Var.v(), "reified");
        String label = s0Var.k().getLabel();
        boolean z12 = true;
        q1(sb2, label.length() > 0, label);
        W0(this, sb2, s0Var, null, 2, null);
        r1(s0Var, sb2, z11);
        int size = s0Var.getUpperBounds().size();
        if ((size > 1 && !z11) || size == 1) {
            d0 upperBound = s0Var.getUpperBounds().iterator().next();
            if (!t00.h.h0(upperBound)) {
                sb2.append(" : ");
                s.f(upperBound, "upperBound");
                sb2.append(w(upperBound));
            }
        } else if (z11) {
            for (d0 upperBound2 : s0Var.getUpperBounds()) {
                if (!t00.h.h0(upperBound2)) {
                    if (z12) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    s.f(upperBound2, "upperBound");
                    sb2.append(w(upperBound2));
                    z12 = false;
                }
            }
        }
        if (z11) {
            sb2.append(L0());
        }
    }

    private final String N() {
        int i11 = b.f35098a[A0().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return "&rarr;";
            }
            throw new NoWhenBranchMatchedException();
        }
        return P("->");
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.f N0(w00.u uVar) {
        if (uVar instanceof w00.c) {
            return ((w00.c) uVar).getKind() == kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE ? kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT : kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL;
        }
        w00.i mo223b = uVar.mo223b();
        w00.c cVar = mo223b instanceof w00.c ? (w00.c) mo223b : null;
        if (cVar != null && (uVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b)) {
            kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) uVar;
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> d11 = bVar.d();
            s.f(d11, "this.overriddenDescriptors");
            if (!(!d11.isEmpty()) || cVar.p() == kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL) {
                if (cVar.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE && !s.c(bVar.getVisibility(), p.f55305a)) {
                    kotlin.reflect.jvm.internal.impl.descriptors.f p11 = bVar.p();
                    kotlin.reflect.jvm.internal.impl.descriptors.f fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT;
                    return p11 == fVar ? fVar : kotlin.reflect.jvm.internal.impl.descriptors.f.OPEN;
                }
                return kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL;
            }
            return kotlin.reflect.jvm.internal.impl.descriptors.f.OPEN;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL;
    }

    private final void N1(StringBuilder sb2, List<? extends s0> list) {
        Iterator<? extends s0> it2 = list.iterator();
        while (it2.hasNext()) {
            M1(it2.next(), sb2, false);
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final boolean O(String str, String str2) {
        String D;
        boolean t11;
        D = kotlin.text.v.D(str2, CallerData.NA, "", false, 4, null);
        if (!s.c(str, D)) {
            t11 = kotlin.text.v.t(str2, CallerData.NA, false, 2, null);
            if (!t11 || !s.c(s.p(str, CallerData.NA), str2)) {
                if (!s.c(CoreConstants.LEFT_PARENTHESIS_CHAR + str + ")?", str2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean O0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        return s.c(cVar.e(), k.a.f51348r);
    }

    private final void O1(List<? extends s0> list, StringBuilder sb2, boolean z11) {
        if (!K0() && (!list.isEmpty())) {
            sb2.append(P0());
            N1(sb2, list);
            sb2.append(L0());
            if (z11) {
                sb2.append(" ");
            }
        }
    }

    private final String P(String str) {
        return A0().escape(str);
    }

    private final String P0() {
        return P("<");
    }

    private final void P1(w00.w0 w0Var, StringBuilder sb2, boolean z11) {
        if (z11 || !(w0Var instanceof v0)) {
            sb2.append(k1(w0Var.L() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    private final boolean Q0(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        return !bVar.d().isEmpty();
    }

    static /* synthetic */ void Q1(d dVar, w00.w0 w0Var, StringBuilder sb2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        dVar.P1(w0Var, sb2, z11);
    }

    private final void R0(StringBuilder sb2, k20.a aVar) {
        m A0 = A0();
        m mVar = m.HTML;
        if (A0 == mVar) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* = ");
        t1(sb2, aVar.E());
        sb2.append(" */");
        if (A0() == mVar) {
            sb2.append("</i></font>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        if ((i() ? r10.u0() : a20.a.a(r10)) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R1(w00.v0 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L10
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.k1(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L10:
            boolean r0 = r9.F0()
            if (r0 == 0) goto L27
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
        */
        //  java.lang.String r0 = "*/ "
        /*
            r12.append(r0)
        L27:
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            W0(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.m0()
            java.lang.String r1 = "crossinline"
            r9.q1(r12, r0, r1)
            boolean r0 = r10.k0()
            java.lang.String r1 = "noinline"
            r9.q1(r12, r0, r1)
            boolean r0 = r9.u0()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L65
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = r10.mo223b()
            boolean r3 = r0 instanceof w00.b
            if (r3 == 0) goto L55
            w00.b r0 = (w00.b) r0
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 != 0) goto L5a
        L58:
            r0 = r2
            goto L61
        L5a:
            boolean r0 = r0.Y()
            if (r0 != r1) goto L58
            r0 = r1
        L61:
            if (r0 == 0) goto L65
            r8 = r1
            goto L66
        L65:
            r8 = r2
        L66:
            if (r8 == 0) goto L71
            boolean r0 = r9.Q()
            java.lang.String r3 = "actual"
            r9.q1(r12, r0, r3)
        L71:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.T1(r4, r5, r6, r7, r8)
            h00.l r11 = r9.W()
            if (r11 == 0) goto L91
            boolean r11 = r9.i()
            if (r11 == 0) goto L8a
            boolean r11 = r10.u0()
            goto L8e
        L8a:
            boolean r11 = a20.a.a(r10)
        L8e:
            if (r11 == 0) goto L91
            goto L92
        L91:
            r1 = r2
        L92:
            if (r1 == 0) goto La8
            h00.l r11 = r9.W()
            kotlin.jvm.internal.s.e(r11)
            java.lang.Object r10 = r11.mo12invoke(r10)
            java.lang.String r11 = " = "
            java.lang.String r10 = kotlin.jvm.internal.s.p(r11, r10)
            r12.append(r10)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.R1(w00.v0, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, StringBuilder sb2) {
        m1(gVar, sb2);
    }

    private final void S1(Collection<? extends v0> collection, boolean z11, StringBuilder sb2) {
        boolean Y1 = Y1(z11);
        int size = collection.size();
        E0().b(size, sb2);
        int i11 = 0;
        for (v0 v0Var : collection) {
            E0().c(v0Var, i11, size, sb2);
            R1(v0Var, Y1, sb2, false);
            E0().a(v0Var, i11, size, sb2);
            i11++;
        }
        E0().d(size, sb2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void T0(kotlin.reflect.jvm.internal.impl.descriptors.e r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.isOperator()
            java.lang.String r1 = "functionDescriptor.overriddenDescriptors"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3a
            java.util.Collection r0 = r6.d()
            kotlin.jvm.internal.s.f(r0, r1)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L19
        L17:
            r0 = r3
            goto L30
        L19:
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L17
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r4 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r4
            boolean r4 = r4.isOperator()
            if (r4 == 0) goto L1d
            r0 = r2
        L30:
            if (r0 != 0) goto L38
            boolean r0 = r5.R()
            if (r0 == 0) goto L3a
        L38:
            r0 = r3
            goto L3b
        L3a:
            r0 = r2
        L3b:
            boolean r4 = r6.isInfix()
            if (r4 == 0) goto L70
            java.util.Collection r4 = r6.d()
            kotlin.jvm.internal.s.f(r4, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L50
        L4e:
            r1 = r3
            goto L67
        L50:
            java.util.Iterator r1 = r4.iterator()
        L54:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r4 = (kotlin.reflect.jvm.internal.impl.descriptors.e) r4
            boolean r4 = r4.isInfix()
            if (r4 == 0) goto L54
            r1 = r2
        L67:
            if (r1 != 0) goto L6f
            boolean r1 = r5.R()
            if (r1 == 0) goto L70
        L6f:
            r2 = r3
        L70:
            boolean r1 = r6.A()
            java.lang.String r3 = "tailrec"
            r5.q1(r7, r1, r3)
            r5.G1(r6, r7)
            boolean r6 = r6.isInline()
            java.lang.String r1 = "inline"
            r5.q1(r7, r6, r1)
            java.lang.String r6 = "infix"
            r5.q1(r7, r2, r6)
            java.lang.String r6 = "operator"
            r5.q1(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.T0(kotlin.reflect.jvm.internal.impl.descriptors.e, java.lang.StringBuilder):void");
    }

    private final void T1(w00.w0 w0Var, boolean z11, StringBuilder sb2, boolean z12, boolean z13) {
        d0 type = w0Var.getType();
        s.f(type, "variable.type");
        v0 v0Var = w0Var instanceof v0 ? (v0) w0Var : null;
        d0 q02 = v0Var != null ? v0Var.q0() : null;
        d0 d0Var = q02 == null ? type : q02;
        q1(sb2, q02 != null, "vararg");
        if (z13 || (z12 && !z0())) {
            P1(w0Var, sb2, z13);
        }
        if (z11) {
            r1(w0Var, sb2, z12);
            sb2.append(": ");
        }
        sb2.append(w(d0Var));
        j1(w0Var, sb2);
        if (!F0() || q02 == null) {
            return;
        }
        sb2.append(" /*");
        sb2.append(w(type));
        sb2.append("*/");
    }

    private final List<String> U0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        int t11;
        int t12;
        List y02;
        List<String> F0;
        w00.b B;
        List<v0> h11;
        int t13;
        Map<u10.f, y10.g<?>> g11 = cVar.g();
        List list = null;
        w00.c f11 = r0() ? a20.a.f(cVar) : null;
        if (f11 != null && (B = f11.B()) != null && (h11 = B.h()) != null) {
            ArrayList<v0> arrayList = new ArrayList();
            for (Object obj : h11) {
                if (((v0) obj).u0()) {
                    arrayList.add(obj);
                }
            }
            t13 = wz.x.t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(t13);
            for (v0 v0Var : arrayList) {
                arrayList2.add(v0Var.getName());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = w.i();
        }
        ArrayList<u10.f> arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            u10.f it2 = (u10.f) obj2;
            s.f(it2, "it");
            if (!g11.containsKey(it2)) {
                arrayList3.add(obj2);
            }
        }
        t11 = wz.x.t(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(t11);
        for (u10.f fVar : arrayList3) {
            arrayList4.add(s.p(fVar.b(), " = ..."));
        }
        Set<Map.Entry<u10.f, y10.g<?>>> entrySet = g11.entrySet();
        t12 = wz.x.t(entrySet, 10);
        ArrayList arrayList5 = new ArrayList(t12);
        Iterator<T> it3 = entrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            u10.f fVar2 = (u10.f) entry.getKey();
            y10.g<?> gVar = (y10.g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar2.b());
            sb2.append(" = ");
            sb2.append(!list.contains(fVar2) ? c1(gVar) : "...");
            arrayList5.add(sb2.toString());
        }
        y02 = e0.y0(arrayList4, arrayList5);
        F0 = e0.F0(y02);
        return F0;
    }

    private final boolean U1(q qVar, StringBuilder sb2) {
        if (f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.VISIBILITY)) {
            if (g0()) {
                qVar = qVar.f();
            }
            if (t0() || !s.c(qVar, p.f55316l)) {
                sb2.append(k1(qVar.c()));
                sb2.append(" ");
                return true;
            }
            return false;
        }
        return false;
    }

    private final void V0(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        boolean T;
        if (f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.ANNOTATIONS)) {
            Set<u10.c> h11 = aVar instanceof d0 ? h() : Y();
            h00.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> S = S();
            for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : aVar.mo140getAnnotations()) {
                T = e0.T(h11, cVar.e());
                if (!T && !O0(cVar) && (S == null || S.mo12invoke(cVar).booleanValue())) {
                    sb2.append(r(cVar, eVar));
                    if (X()) {
                        sb2.append('\n');
                        s.f(sb2, "append('\\n')");
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    private final void V1(List<? extends s0> list, StringBuilder sb2) {
        List<d0> V;
        if (K0()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (s0 s0Var : list) {
            List<d0> upperBounds = s0Var.getUpperBounds();
            s.f(upperBounds, "typeParameter.upperBounds");
            V = e0.V(upperBounds, 1);
            for (d0 it2 : V) {
                StringBuilder sb3 = new StringBuilder();
                u10.f name = s0Var.getName();
                s.f(name, "typeParameter.name");
                sb3.append(v(name, false));
                sb3.append(" : ");
                s.f(it2, "it");
                sb3.append(w(it2));
                arrayList.add(sb3.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb2.append(" ");
            sb2.append(k1("where"));
            sb2.append(" ");
            e0.j0(arrayList, sb2, ", ", null, null, 0, null, null, 124, null);
        }
    }

    static /* synthetic */ void W0(d dVar, StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        dVar.V0(sb2, aVar, eVar);
    }

    private final String W1(String str, String str2, String str3, String str4, String str5) {
        boolean H;
        boolean H2;
        H = kotlin.text.v.H(str, str2, false, 2, null);
        if (H) {
            H2 = kotlin.text.v.H(str3, str4, false, 2, null);
            if (H2) {
                int length = str2.length();
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring = str.substring(length);
                s.f(substring, "(this as java.lang.String).substring(startIndex)");
                int length2 = str4.length();
                Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                String substring2 = str3.substring(length2);
                s.f(substring2, "(this as java.lang.String).substring(startIndex)");
                String p11 = s.p(str5, substring);
                if (s.c(substring, substring2)) {
                    return p11;
                }
                if (O(substring, substring2)) {
                    return s.p(p11, "!");
                }
            }
        }
        return null;
    }

    private final void X0(w00.f fVar, StringBuilder sb2) {
        List<s0> o11 = fVar.o();
        s.f(o11, "classifier.declaredTypeParameters");
        List<s0> parameters = fVar.mo234i().getParameters();
        s.f(parameters, "classifier.typeConstructor.parameters");
        if (F0() && fVar.j() && parameters.size() > o11.size()) {
            sb2.append(" /*captured type parameters: ");
            N1(sb2, parameters.subList(o11.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    private final boolean X1(d0 d0Var) {
        boolean z11;
        if (t00.g.m(d0Var)) {
            List<y0> G0 = d0Var.G0();
            if (!(G0 instanceof Collection) || !G0.isEmpty()) {
                for (y0 y0Var : G0) {
                    if (y0Var.a()) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            return z11;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0(w00.c cVar, StringBuilder sb2) {
        w00.b B;
        boolean z11 = cVar.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_ENTRY;
        if (!z0()) {
            W0(this, sb2, cVar, null, 2, null);
            if (!z11) {
                q visibility = cVar.getVisibility();
                s.f(visibility, "klass.visibility");
                U1(visibility, sb2);
            }
            if ((cVar.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE || cVar.p() != kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT) && (!cVar.getKind().isSingleton() || cVar.p() != kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL)) {
                kotlin.reflect.jvm.internal.impl.descriptors.f p11 = cVar.p();
                s.f(p11, "klass.modality");
                o1(p11, sb2, N0(cVar));
            }
            m1(cVar, sb2);
            q1(sb2, f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.INNER) && cVar.j(), "inner");
            q1(sb2, f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.DATA) && cVar.C0(), MessageExtension.FIELD_DATA);
            q1(sb2, f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.INLINE) && cVar.isInline(), "inline");
            q1(sb2, f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.VALUE) && cVar.f0(), "value");
            q1(sb2, f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.FUN) && cVar.a0(), "fun");
            Z0(cVar, sb2);
        }
        if (!w10.d.x(cVar)) {
            if (!z0()) {
                E1(sb2);
            }
            r1(cVar, sb2, true);
        } else {
            b1(cVar, sb2);
        }
        if (z11) {
            return;
        }
        List<s0> o11 = cVar.o();
        s.f(o11, "klass.declaredTypeParameters");
        O1(o11, sb2, false);
        X0(cVar, sb2);
        if (!cVar.getKind().isSingleton() && U() && (B = cVar.B()) != null) {
            sb2.append(" ");
            W0(this, sb2, B, null, 2, null);
            q visibility2 = B.getVisibility();
            s.f(visibility2, "primaryConstructor.visibility");
            U1(visibility2, sb2);
            sb2.append(k1("constructor"));
            List<v0> h11 = B.h();
            s.f(h11, "primaryConstructor.valueParameters");
            S1(h11, B.c0(), sb2);
        }
        F1(cVar, sb2);
        V1(o11, sb2);
    }

    private final boolean Y1(boolean z11) {
        int i11 = b.f35099b[j0().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            } else if (z11) {
                return false;
            }
        }
        return true;
    }

    private final d Z() {
        return (d) this.f35095e.mo16getValue();
    }

    private final void Z0(w00.c cVar, StringBuilder sb2) {
        sb2.append(k1(kotlin.reflect.jvm.internal.impl.renderer.c.f35079a.a(cVar)));
    }

    private final void b1(w00.i iVar, StringBuilder sb2) {
        if (o0()) {
            if (z0()) {
                sb2.append("companion object");
            }
            E1(sb2);
            w00.i mo223b = iVar.mo223b();
            if (mo223b != null) {
                sb2.append("of ");
                u10.f name = mo223b.getName();
                s.f(name, "containingDeclaration.name");
                sb2.append(v(name, false));
            }
        }
        if (F0() || !s.c(iVar.getName(), u10.h.f53001b)) {
            if (!z0()) {
                E1(sb2);
            }
            u10.f name2 = iVar.getName();
            s.f(name2, "descriptor.name");
            sb2.append(v(name2, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c1(y10.g<?> gVar) {
        String t02;
        String l02;
        if (gVar instanceof y10.b) {
            l02 = e0.l0(((y10.b) gVar).b(), ", ", "{", "}", 0, null, new e(), 24, null);
            return l02;
        } else if (gVar instanceof y10.a) {
            t02 = kotlin.text.w.t0(kotlin.reflect.jvm.internal.impl.renderer.c.s(this, ((y10.a) gVar).b(), null, 2, null), "@");
            return t02;
        } else if (gVar instanceof y10.q) {
            q.b b11 = ((y10.q) gVar).b();
            if (b11 instanceof q.b.a) {
                return ((q.b.a) b11).a() + "::class";
            } else if (b11 instanceof q.b.C1339b) {
                q.b.C1339b c1339b = (q.b.C1339b) b11;
                String b12 = c1339b.b().b().b();
                s.f(b12, "classValue.classId.asSingleFqName().asString()");
                for (int i11 = 0; i11 < c1339b.a(); i11++) {
                    b12 = "kotlin.Array<" + b12 + '>';
                }
                return s.p(b12, "::class");
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            return gVar.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d1(kotlin.reflect.jvm.internal.impl.descriptors.d r18, java.lang.StringBuilder r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.d.d1(kotlin.reflect.jvm.internal.impl.descriptors.d, java.lang.StringBuilder):void");
    }

    private final void e1(StringBuilder sb2, d0 d0Var) {
        W0(this, sb2, d0Var, null, 2, null);
        k20.m mVar = d0Var instanceof k20.m ? (k20.m) d0Var : null;
        k20.k0 T0 = mVar != null ? mVar.T0() : null;
        if (k20.f0.a(d0Var)) {
            if ((d0Var instanceof i1) && l0()) {
                sb2.append(((i1) d0Var).Q0());
            } else if ((d0Var instanceof k20.u) && !e0()) {
                sb2.append(((k20.u) d0Var).Q0());
            } else {
                sb2.append(d0Var.H0().toString());
            }
            sb2.append(I1(d0Var.G0()));
        } else if (d0Var instanceof k20.r0) {
            sb2.append(((k20.r0) d0Var).Q0().toString());
        } else if (T0 instanceof k20.r0) {
            sb2.append(((k20.r0) T0).Q0().toString());
        } else {
            L1(this, sb2, d0Var, null, 2, null);
        }
        if (d0Var.I0()) {
            sb2.append(CallerData.NA);
        }
        if (n0.c(d0Var)) {
            sb2.append("!!");
        }
    }

    private final String f1(String str) {
        int i11 = b.f35098a[A0().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return "<font color=red><b>" + str + "</b></font>";
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    private final String g1(List<u10.f> list) {
        return P(n.c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, StringBuilder sb2) {
        if (!z0()) {
            if (!y0()) {
                W0(this, sb2, eVar, null, 2, null);
                w00.q visibility = eVar.getVisibility();
                s.f(visibility, "function.visibility");
                U1(visibility, sb2);
                p1(eVar, sb2);
                if (a0()) {
                    m1(eVar, sb2);
                }
                u1(eVar, sb2);
                if (a0()) {
                    T0(eVar, sb2);
                } else {
                    G1(eVar, sb2);
                }
                l1(eVar, sb2);
                if (F0()) {
                    if (eVar.x0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (eVar.A0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(k1("fun"));
            sb2.append(" ");
            List<s0> typeParameters = eVar.getTypeParameters();
            s.f(typeParameters, "function.typeParameters");
            O1(typeParameters, sb2, true);
            B1(eVar, sb2);
        }
        r1(eVar, sb2, true);
        List<v0> h11 = eVar.h();
        s.f(h11, "function.valueParameters");
        S1(h11, eVar.c0(), sb2);
        C1(eVar, sb2);
        d0 returnType = eVar.getReturnType();
        if (!I0() && (D0() || returnType == null || !t00.h.A0(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : w(returnType));
        }
        List<s0> typeParameters2 = eVar.getTypeParameters();
        s.f(typeParameters2, "function.typeParameters");
        V1(typeParameters2, sb2);
    }

    private final void i1(StringBuilder sb2, d0 d0Var) {
        u10.f fVar;
        char g12;
        int T;
        int T2;
        int length = sb2.length();
        W0(Z(), sb2, d0Var, null, 2, null);
        boolean z11 = true;
        boolean z12 = sb2.length() != length;
        boolean o11 = t00.g.o(d0Var);
        boolean I0 = d0Var.I0();
        d0 h11 = t00.g.h(d0Var);
        boolean z13 = I0 || (z12 && h11 != null);
        if (z13) {
            if (o11) {
                sb2.insert(length, CoreConstants.LEFT_PARENTHESIS_CHAR);
            } else {
                if (z12) {
                    g12 = y.g1(sb2);
                    kotlin.text.b.c(g12);
                    T = kotlin.text.w.T(sb2);
                    if (sb2.charAt(T - 1) != ')') {
                        T2 = kotlin.text.w.T(sb2);
                        sb2.insert(T2, "()");
                    }
                }
                sb2.append("(");
            }
        }
        q1(sb2, o11, "suspend");
        if (h11 != null) {
            if ((!X1(h11) || h11.I0()) && !M0(h11)) {
                z11 = false;
            }
            if (z11) {
                sb2.append("(");
            }
            s1(sb2, h11);
            if (z11) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        int i11 = 0;
        for (y0 y0Var : t00.g.j(d0Var)) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append(", ");
            }
            if (k0()) {
                d0 type = y0Var.getType();
                s.f(type, "typeProjection.type");
                fVar = t00.g.c(type);
            } else {
                fVar = null;
            }
            if (fVar != null) {
                sb2.append(v(fVar, false));
                sb2.append(": ");
            }
            sb2.append(x(y0Var));
            i11 = i12;
        }
        sb2.append(") ");
        sb2.append(N());
        sb2.append(" ");
        s1(sb2, t00.g.i(d0Var));
        if (z13) {
            sb2.append(")");
        }
        if (I0) {
            sb2.append(CallerData.NA);
        }
    }

    private final void j1(w00.w0 w0Var, StringBuilder sb2) {
        y10.g<?> j02;
        if (!d0() || (j02 = w0Var.j0()) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(P(c1(j02)));
    }

    private final String k1(String str) {
        int i11 = b.f35098a[A0().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                if (T()) {
                    return str;
                }
                return "<b>" + str + "</b>";
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    private final void l1(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, StringBuilder sb2) {
        if (f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.MEMBER_KIND) && F0() && bVar.getKind() != b.a.DECLARATION) {
            sb2.append("/*");
            sb2.append(q20.a.f(bVar.getKind().name()));
            sb2.append("*/ ");
        }
    }

    private final void m1(w00.u uVar, StringBuilder sb2) {
        q1(sb2, uVar.isExternal(), "external");
        boolean z11 = true;
        q1(sb2, f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.EXPECT) && uVar.g0(), "expect");
        if (!f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.ACTUAL) || !uVar.W()) {
            z11 = false;
        }
        q1(sb2, z11, "actual");
    }

    private final void o1(kotlin.reflect.jvm.internal.impl.descriptors.f fVar, StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.f fVar2) {
        if (s0() || fVar != fVar2) {
            q1(sb2, f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.MODALITY), q20.a.f(fVar.name()));
        }
    }

    private final void p1(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, StringBuilder sb2) {
        if (w10.d.J(bVar) && bVar.p() == kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL) {
            return;
        }
        if (i0() == j.RENDER_OVERRIDE && bVar.p() == kotlin.reflect.jvm.internal.impl.descriptors.f.OPEN && Q0(bVar)) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f p11 = bVar.p();
        s.f(p11, "callable.modality");
        o1(p11, sb2, N0(bVar));
    }

    private final void q1(StringBuilder sb2, boolean z11, String str) {
        if (z11) {
            sb2.append(k1(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1(w00.i iVar, StringBuilder sb2, boolean z11) {
        u10.f name = iVar.getName();
        s.f(name, "descriptor.name");
        sb2.append(v(name, z11));
    }

    private final void s1(StringBuilder sb2, d0 d0Var) {
        j1 K0 = d0Var.K0();
        k20.a aVar = K0 instanceof k20.a ? (k20.a) K0 : null;
        if (aVar != null) {
            if (v0()) {
                t1(sb2, aVar.E());
                return;
            }
            t1(sb2, aVar.T0());
            if (w0()) {
                R0(sb2, aVar);
                return;
            }
            return;
        }
        t1(sb2, d0Var);
    }

    private final void t1(StringBuilder sb2, d0 d0Var) {
        if ((d0Var instanceof l1) && i() && !((l1) d0Var).M0()) {
            sb2.append("<Not computed yet>");
            return;
        }
        j1 K0 = d0Var.K0();
        if (K0 instanceof k20.x) {
            sb2.append(((k20.x) K0).R0(this, this));
        } else if (K0 instanceof k20.k0) {
            D1(sb2, (k20.k0) K0);
        }
    }

    private final void u1(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, StringBuilder sb2) {
        if (f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.OVERRIDE) && Q0(bVar) && i0() != j.RENDER_OPEN) {
            q1(sb2, true, "override");
            if (F0()) {
                sb2.append("/*");
                sb2.append(bVar.d().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(a0 a0Var, StringBuilder sb2) {
        w1(a0Var.e(), "package-fragment", sb2);
        if (i()) {
            sb2.append(" in ");
            r1(a0Var.mo223b(), sb2, false);
        }
    }

    private final void w1(u10.c cVar, String str, StringBuilder sb2) {
        sb2.append(k1(str));
        u10.d j11 = cVar.j();
        s.f(j11, "fqName.toUnsafe()");
        String u11 = u(j11);
        if (u11.length() > 0) {
            sb2.append(" ");
            sb2.append(u11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(f0 f0Var, StringBuilder sb2) {
        w1(f0Var.e(), "package", sb2);
        if (i()) {
            sb2.append(" in context of ");
            r1(f0Var.mo259w0(), sb2, false);
        }
    }

    private final void y1(StringBuilder sb2, h0 h0Var) {
        StringBuilder sb3;
        h0 c11 = h0Var.c();
        if (c11 == null) {
            sb3 = null;
        } else {
            y1(sb2, c11);
            sb2.append(CoreConstants.DOT);
            u10.f name = h0Var.b().getName();
            s.f(name, "possiblyInnerType.classifierDescriptor.name");
            sb2.append(v(name, false));
            sb3 = sb2;
        }
        if (sb3 == null) {
            w0 mo234i = h0Var.b().mo234i();
            s.f(mo234i, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb2.append(J1(mo234i));
        }
        sb2.append(I1(h0Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1(i0 i0Var, StringBuilder sb2) {
        if (!z0()) {
            if (!y0()) {
                A1(i0Var, sb2);
                w00.q visibility = i0Var.getVisibility();
                s.f(visibility, "property.visibility");
                U1(visibility, sb2);
                boolean z11 = false;
                q1(sb2, f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.CONST) && i0Var.isConst(), "const");
                m1(i0Var, sb2);
                p1(i0Var, sb2);
                u1(i0Var, sb2);
                if (f0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.LATEINIT) && i0Var.s0()) {
                    z11 = true;
                }
                q1(sb2, z11, "lateinit");
                l1(i0Var, sb2);
            }
            Q1(this, i0Var, sb2, false, 4, null);
            List<s0> typeParameters = i0Var.getTypeParameters();
            s.f(typeParameters, "property.typeParameters");
            O1(typeParameters, sb2, true);
            B1(i0Var, sb2);
        }
        r1(i0Var, sb2, true);
        sb2.append(": ");
        d0 type = i0Var.getType();
        s.f(type, "property.type");
        sb2.append(w(type));
        C1(i0Var, sb2);
        j1(i0Var, sb2);
        List<s0> typeParameters2 = i0Var.getTypeParameters();
        s.f(typeParameters2, "property.typeParameters");
        V1(typeParameters2, sb2);
    }

    public m A0() {
        return this.f35094d.Z();
    }

    public h00.l<d0, d0> B0() {
        return this.f35094d.a0();
    }

    public boolean C0() {
        return this.f35094d.b0();
    }

    public boolean D0() {
        return this.f35094d.c0();
    }

    public c.l E0() {
        return this.f35094d.d0();
    }

    public boolean F0() {
        return this.f35094d.e0();
    }

    public boolean G0() {
        return this.f35094d.f0();
    }

    public boolean H0() {
        return this.f35094d.g0();
    }

    public boolean I0() {
        return this.f35094d.h0();
    }

    public String I1(List<? extends y0> typeArguments) {
        s.g(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(P0());
        M(sb2, typeArguments);
        sb2.append(L0());
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public boolean J0() {
        return this.f35094d.i0();
    }

    public String J1(w0 typeConstructor) {
        s.g(typeConstructor, "typeConstructor");
        w00.e n11 = typeConstructor.n();
        if (n11 instanceof s0 ? true : n11 instanceof w00.c ? true : n11 instanceof r0) {
            return a1(n11);
        }
        if (n11 == null) {
            if (typeConstructor instanceof c0) {
                return ((c0) typeConstructor).e(h.f35106a);
            }
            return typeConstructor.toString();
        }
        throw new IllegalStateException(s.p("Unexpected classifier: ", n11.getClass()).toString());
    }

    public boolean K0() {
        return this.f35094d.j0();
    }

    public boolean Q() {
        return this.f35094d.r();
    }

    public boolean R() {
        return this.f35094d.s();
    }

    public h00.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> S() {
        return this.f35094d.t();
    }

    public boolean T() {
        return this.f35094d.u();
    }

    public boolean U() {
        return this.f35094d.v();
    }

    public kotlin.reflect.jvm.internal.impl.renderer.b V() {
        return this.f35094d.w();
    }

    public h00.l<v0, String> W() {
        return this.f35094d.x();
    }

    public boolean X() {
        return this.f35094d.y();
    }

    public Set<u10.c> Y() {
        return this.f35094d.z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void a(boolean z11) {
        this.f35094d.a(z11);
    }

    public boolean a0() {
        return this.f35094d.A();
    }

    public String a1(w00.e klass) {
        s.g(klass, "klass");
        if (k20.v.r(klass)) {
            return klass.mo234i().toString();
        }
        return V().a(klass, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void b(k kVar) {
        s.g(kVar, "<set-?>");
        this.f35094d.b(kVar);
    }

    public boolean b0() {
        return this.f35094d.B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void c(boolean z11) {
        this.f35094d.c(z11);
    }

    public boolean c0() {
        return this.f35094d.C();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean d() {
        return this.f35094d.d();
    }

    public boolean d0() {
        return this.f35094d.D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void e(boolean z11) {
        this.f35094d.e(z11);
    }

    public boolean e0() {
        return this.f35094d.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void f(boolean z11) {
        this.f35094d.f(z11);
    }

    public Set<kotlin.reflect.jvm.internal.impl.renderer.e> f0() {
        return this.f35094d.F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void g(m mVar) {
        s.g(mVar, "<set-?>");
        this.f35094d.g(mVar);
    }

    public boolean g0() {
        return this.f35094d.G();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public Set<u10.c> h() {
        return this.f35094d.h();
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.g h0() {
        return this.f35094d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean i() {
        return this.f35094d.i();
    }

    public j i0() {
        return this.f35094d.H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public kotlin.reflect.jvm.internal.impl.renderer.a j() {
        return this.f35094d.j();
    }

    public k j0() {
        return this.f35094d.I();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void k(Set<u10.c> set) {
        s.g(set, "<set-?>");
        this.f35094d.k(set);
    }

    public boolean k0() {
        return this.f35094d.J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void l(Set<? extends kotlin.reflect.jvm.internal.impl.renderer.e> set) {
        s.g(set, "<set-?>");
        this.f35094d.l(set);
    }

    public boolean l0() {
        return this.f35094d.K();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void m(kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        s.g(bVar, "<set-?>");
        this.f35094d.m(bVar);
    }

    public l m0() {
        return this.f35094d.L();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void n(boolean z11) {
        this.f35094d.n(z11);
    }

    public boolean n0() {
        return this.f35094d.M();
    }

    public String n1(String message) {
        s.g(message, "message");
        int i11 = b.f35098a[A0().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return "<i>" + message + "</i>";
            }
            throw new NoWhenBranchMatchedException();
        }
        return message;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void o(boolean z11) {
        this.f35094d.o(z11);
    }

    public boolean o0() {
        return this.f35094d.N();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void p(boolean z11) {
        this.f35094d.p(z11);
    }

    public boolean p0() {
        return this.f35094d.O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String q(w00.i declarationDescriptor) {
        s.g(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.v0(new a(this), sb2);
        if (G0()) {
            L(sb2, declarationDescriptor);
        }
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public boolean q0() {
        return this.f35094d.P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String r(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotation, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        s.g(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(s.p(eVar.getRenderName(), ":"));
        }
        d0 mo131getType = annotation.mo131getType();
        sb2.append(w(mo131getType));
        if (b0()) {
            List<String> U0 = U0(annotation);
            if (c0() || (!U0.isEmpty())) {
                e0.j0(U0, sb2, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (F0() && (k20.f0.a(mo131getType) || (mo131getType.H0().n() instanceof z.b))) {
            sb2.append(" /* annotation class not found */");
        }
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public boolean r0() {
        return this.f35094d.Q();
    }

    public boolean s0() {
        return this.f35094d.R();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String t(String lowerRendered, String upperRendered, t00.h builtIns) {
        String X0;
        String X02;
        boolean H;
        s.g(lowerRendered, "lowerRendered");
        s.g(upperRendered, "upperRendered");
        s.g(builtIns, "builtIns");
        if (O(lowerRendered, upperRendered)) {
            H = kotlin.text.v.H(upperRendered, "(", false, 2, null);
            if (H) {
                return CoreConstants.LEFT_PARENTHESIS_CHAR + lowerRendered + ")!";
            }
            return s.p(lowerRendered, "!");
        }
        kotlin.reflect.jvm.internal.impl.renderer.b V = V();
        w00.c w11 = builtIns.w();
        s.f(w11, "builtIns.collection");
        X0 = kotlin.text.w.X0(V.a(w11, this), "Collection", null, 2, null);
        String p11 = s.p(X0, "Mutable");
        String W1 = W1(lowerRendered, p11, upperRendered, X0, X0 + CoreConstants.LEFT_PARENTHESIS_CHAR + "Mutable" + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        if (W1 != null) {
            return W1;
        }
        String W12 = W1(lowerRendered, s.p(X0, "MutableMap.MutableEntry"), upperRendered, s.p(X0, "Map.Entry"), s.p(X0, "(Mutable)Map.(Mutable)Entry"));
        if (W12 != null) {
            return W12;
        }
        kotlin.reflect.jvm.internal.impl.renderer.b V2 = V();
        w00.c j11 = builtIns.j();
        s.f(j11, "builtIns.array");
        X02 = kotlin.text.w.X0(V2.a(j11, this), "Array", null, 2, null);
        String W13 = W1(lowerRendered, s.p(X02, P("Array<")), upperRendered, s.p(X02, P("Array<out ")), s.p(X02, P("Array<(out) ")));
        if (W13 != null) {
            return W13;
        }
        return CoreConstants.LEFT_PARENTHESIS_CHAR + lowerRendered + CallerDataConverter.DEFAULT_RANGE_DELIMITER + upperRendered + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean t0() {
        return this.f35094d.S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String u(u10.d fqName) {
        s.g(fqName, "fqName");
        List<u10.f> h11 = fqName.h();
        s.f(h11, "fqName.pathSegments()");
        return g1(h11);
    }

    public boolean u0() {
        return this.f35094d.T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String v(u10.f name, boolean z11) {
        s.g(name, "name");
        String P = P(n.b(name));
        if (T() && A0() == m.HTML && z11) {
            return "<b>" + P + "</b>";
        }
        return P;
    }

    public boolean v0() {
        return this.f35094d.U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String w(d0 type) {
        s.g(type, "type");
        StringBuilder sb2 = new StringBuilder();
        s1(sb2, B0().mo12invoke(type));
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public boolean w0() {
        return this.f35094d.V();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.c
    public String x(y0 typeProjection) {
        List<? extends y0> d11;
        s.g(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        d11 = wz.v.d(typeProjection);
        M(sb2, d11);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public boolean x0() {
        return this.f35094d.W();
    }

    public boolean y0() {
        return this.f35094d.X();
    }

    public boolean z0() {
        return this.f35094d.Y();
    }
}
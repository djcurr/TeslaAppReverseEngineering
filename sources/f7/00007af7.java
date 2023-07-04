package j10;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import h00.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.d0;
import k20.j0;
import k20.k0;
import k20.x;
import k20.y0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.types.checker.h;
import kotlin.text.w;
import org.slf4j.Marker;
import vz.p;
import wz.e0;

/* loaded from: classes5.dex */
public final class f extends x implements j0 {

    /* loaded from: classes5.dex */
    static final class a extends u implements l<String, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33102a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence invoke(String it2) {
            s.g(it2, "it");
            return s.p("(raw) ", it2);
        }
    }

    private f(k0 k0Var, k0 k0Var2, boolean z11) {
        super(k0Var, k0Var2);
        if (z11) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.types.checker.f.f35149a.c(k0Var, k0Var2);
    }

    private static final boolean U0(String str, String str2) {
        String t02;
        t02 = w.t0(str2, "out ");
        return s.c(str, t02) || s.c(str2, Marker.ANY_MARKER);
    }

    private static final List<String> V0(kotlin.reflect.jvm.internal.impl.renderer.c cVar, d0 d0Var) {
        int t11;
        List<y0> G0 = d0Var.G0();
        t11 = wz.x.t(G0, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (y0 y0Var : G0) {
            arrayList.add(cVar.x(y0Var));
        }
        return arrayList;
    }

    private static final String W0(String str, String str2) {
        boolean L;
        String W0;
        String S0;
        L = w.L(str, '<', false, 2, null);
        if (L) {
            StringBuilder sb2 = new StringBuilder();
            W0 = w.W0(str, '<', null, 2, null);
            sb2.append(W0);
            sb2.append('<');
            sb2.append(str2);
            sb2.append('>');
            S0 = w.S0(str, '>', null, 2, null);
            sb2.append(S0);
            return sb2.toString();
        }
        return str;
    }

    @Override // k20.x
    public k0 O0() {
        return P0();
    }

    @Override // k20.x
    public String R0(kotlin.reflect.jvm.internal.impl.renderer.c renderer, kotlin.reflect.jvm.internal.impl.renderer.f options) {
        String l02;
        List V0;
        s.g(renderer, "renderer");
        s.g(options, "options");
        String w11 = renderer.w(P0());
        String w12 = renderer.w(Q0());
        if (options.i()) {
            return "raw (" + w11 + CallerDataConverter.DEFAULT_RANGE_DELIMITER + w12 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        } else if (Q0().G0().isEmpty()) {
            return renderer.t(w11, w12, n20.a.h(this));
        } else {
            List<String> V02 = V0(renderer, P0());
            List<String> V03 = V0(renderer, Q0());
            l02 = e0.l0(V02, ", ", null, null, 0, null, a.f33102a, 30, null);
            V0 = e0.V0(V02, V03);
            boolean z11 = true;
            if (!(V0 instanceof Collection) || !V0.isEmpty()) {
                Iterator it2 = V0.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    p pVar = (p) it2.next();
                    if (!U0((String) pVar.c(), (String) pVar.d())) {
                        z11 = false;
                        break;
                    }
                }
            }
            if (z11) {
                w12 = W0(w12, l02);
            }
            String W0 = W0(w11, l02);
            return s.c(W0, w12) ? W0 : renderer.t(W0, w12, n20.a.h(this));
        }
    }

    @Override // k20.j1
    /* renamed from: S0 */
    public f L0(boolean z11) {
        return new f(P0().O0(z11), Q0().O0(z11));
    }

    @Override // k20.j1
    /* renamed from: T0 */
    public x M0(h kotlinTypeRefiner) {
        s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f((k0) kotlinTypeRefiner.g(P0()), (k0) kotlinTypeRefiner.g(Q0()), true);
    }

    @Override // k20.j1
    /* renamed from: X0 */
    public f N0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        s.g(newAnnotations, "newAnnotations");
        return new f(P0().P0(newAnnotations), Q0().P0(newAnnotations));
    }

    @Override // k20.x, k20.d0
    public d20.h m() {
        w00.e n11 = H0().n();
        w00.c cVar = n11 instanceof w00.c ? (w00.c) n11 : null;
        if (cVar != null) {
            d20.h I = cVar.I(new e(null, 1, null));
            s.f(I, "classDescriptor.getMemberScope(RawSubstitution())");
            return I;
        }
        throw new IllegalStateException(s.p("Incorrect classifier: ", H0().n()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(k0 lowerBound, k0 upperBound) {
        this(lowerBound, upperBound, false);
        s.g(lowerBound, "lowerBound");
        s.g(upperBound, "upperBound");
    }
}
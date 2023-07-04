package o00;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import k20.a1;
import k20.d0;
import k20.e0;
import k20.k0;
import k20.k1;
import k20.p0;
import k20.w0;
import k20.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import n00.f;
import n00.p;
import n00.r;
import q00.b0;
import q00.j;
import w00.e;
import w00.s0;
import wz.w;
import wz.x;

/* loaded from: classes5.dex */
public final class d {
    private static final k0 a(g gVar, w0 w0Var, List<r> list, boolean z11) {
        int t11;
        y0 a1Var;
        List<s0> parameters = w0Var.getParameters();
        s.f(parameters, "typeConstructor.parameters");
        t11 = x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                w.s();
            }
            r rVar = (r) obj;
            q00.x xVar = (q00.x) rVar.c();
            d0 r11 = xVar != null ? xVar.r() : null;
            n00.s d11 = rVar.d();
            if (d11 == null) {
                s0 s0Var = parameters.get(i11);
                s.f(s0Var, "parameters[index]");
                a1Var = new p0(s0Var);
            } else {
                int i13 = c.f42038a[d11.ordinal()];
                if (i13 == 1) {
                    k1 k1Var = k1.INVARIANT;
                    s.e(r11);
                    a1Var = new a1(k1Var, r11);
                } else if (i13 == 2) {
                    k1 k1Var2 = k1.IN_VARIANCE;
                    s.e(r11);
                    a1Var = new a1(k1Var2, r11);
                } else if (i13 == 3) {
                    k1 k1Var3 = k1.OUT_VARIANCE;
                    s.e(r11);
                    a1Var = new a1(k1Var3, r11);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            arrayList.add(a1Var);
            i11 = i12;
        }
        return e0.i(gVar, w0Var, arrayList, z11, null, 16, null);
    }

    public static final p b(f createType, List<r> arguments, boolean z11, List<? extends Annotation> annotations) {
        e descriptor;
        s.g(createType, "$this$createType");
        s.g(arguments, "arguments");
        s.g(annotations, "annotations");
        j jVar = (j) (!(createType instanceof j) ? null : createType);
        if (jVar != null && (descriptor = jVar.getDescriptor()) != null) {
            w0 i11 = descriptor.i();
            s.f(i11, "descriptor.typeConstructor");
            List<s0> parameters = i11.getParameters();
            s.f(parameters, "typeConstructor.parameters");
            if (parameters.size() == arguments.size()) {
                return new q00.x(a(annotations.isEmpty() ? g.f34943d1.b() : g.f34943d1.b(), i11, arguments, z11), null, 2, null);
            }
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        throw new b0("Cannot create type for an unsupported classifier: " + createType + " (" + createType.getClass() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public static /* synthetic */ p c(f fVar, List list, boolean z11, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = w.i();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            list2 = w.i();
        }
        return b(fVar, list, z11, list2);
    }
}
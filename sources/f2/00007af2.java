package j10;

import f10.k;
import k20.a1;
import k20.p0;
import k20.q0;
import k20.y0;
import kotlin.jvm.internal.s;
import w00.s0;
import wz.w0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a */
    private static final u10.c f33093a = new u10.c("java.lang.Class");

    public static final /* synthetic */ u10.c a() {
        return f33093a;
    }

    public static final y0 b(s0 typeParameter, a attr) {
        s.g(typeParameter, "typeParameter");
        s.g(attr, "attr");
        if (attr.e() == k.SUPERTYPE) {
            return new a1(q0.b(typeParameter));
        }
        return new p0(typeParameter);
    }

    public static final a c(k kVar, boolean z11, s0 s0Var) {
        s.g(kVar, "<this>");
        return new a(kVar, null, z11, s0Var == null ? null : w0.c(s0Var), null, 18, null);
    }

    public static /* synthetic */ a d(k kVar, boolean z11, s0 s0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            s0Var = null;
        }
        return c(kVar, z11, s0Var);
    }
}
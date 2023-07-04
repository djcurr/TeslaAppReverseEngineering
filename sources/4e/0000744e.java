package i10;

import i10.j;
import java.util.Collection;
import java.util.List;
import k20.d0;
import kotlin.jvm.internal.s;
import l10.r;
import w00.i0;
import w00.l0;
import w00.s0;
import w00.v0;
import wz.w;

/* loaded from: classes5.dex */
public abstract class l extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h10.h c11) {
        super(c11, null, 2, null);
        s.g(c11, "c");
    }

    @Override // i10.j
    protected j.a H(r method, List<? extends s0> methodTypeParameters, d0 returnType, List<? extends v0> valueParameters) {
        List i11;
        s.g(method, "method");
        s.g(methodTypeParameters, "methodTypeParameters");
        s.g(returnType, "returnType");
        s.g(valueParameters, "valueParameters");
        i11 = w.i();
        return new j.a(returnType, null, valueParameters, methodTypeParameters, false, i11);
    }

    @Override // i10.j
    protected void s(u10.f name, Collection<i0> result) {
        s.g(name, "name");
        s.g(result, "result");
    }

    @Override // i10.j
    protected l0 z() {
        return null;
    }
}
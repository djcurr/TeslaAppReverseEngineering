package y10;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k20.d0;
import k20.w0;
import w00.s0;

/* loaded from: classes5.dex */
public final class p implements w0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f58985a;

    /* renamed from: b  reason: collision with root package name */
    private final w00.x f58986b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<d0> f58987c;

    @Override // k20.w0
    public Collection<d0> a() {
        return this.f58987c;
    }

    public Void b() {
        return null;
    }

    @Override // k20.w0
    public List<s0> getParameters() {
        List<s0> i11;
        i11 = wz.w.i();
        return i11;
    }

    @Override // k20.w0
    public t00.h l() {
        return this.f58986b.l();
    }

    @Override // k20.w0
    public w0 m(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // k20.w0
    public /* bridge */ /* synthetic */ w00.e n() {
        return (w00.e) b();
    }

    @Override // k20.w0
    public boolean o() {
        return false;
    }

    public String toString() {
        return "IntegerValueType(" + this.f58985a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
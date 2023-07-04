package x10;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.List;
import k20.d0;
import k20.k1;
import k20.y0;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.types.checker.h;
import kotlin.reflect.jvm.internal.impl.types.checker.k;
import w00.e;
import w00.s0;
import wz.v;
import wz.w;

/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final y0 f56926a;

    /* renamed from: b  reason: collision with root package name */
    private k f56927b;

    public c(y0 projection) {
        s.g(projection, "projection");
        this.f56926a = projection;
        getProjection().b();
        k1 k1Var = k1.INVARIANT;
    }

    @Override // k20.w0
    public Collection<d0> a() {
        d0 I;
        List d11;
        if (getProjection().b() == k1.OUT_VARIANCE) {
            I = getProjection().getType();
        } else {
            I = l().I();
        }
        s.f(I, "if (projection.projectio… builtIns.nullableAnyType");
        d11 = v.d(I);
        return d11;
    }

    public Void b() {
        return null;
    }

    public final k c() {
        return this.f56927b;
    }

    @Override // k20.w0
    /* renamed from: d */
    public c m(h kotlinTypeRefiner) {
        s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        y0 m11 = getProjection().m(kotlinTypeRefiner);
        s.f(m11, "projection.refine(kotlinTypeRefiner)");
        return new c(m11);
    }

    public final void e(k kVar) {
        this.f56927b = kVar;
    }

    @Override // k20.w0
    public List<s0> getParameters() {
        List<s0> i11;
        i11 = w.i();
        return i11;
    }

    @Override // x10.b
    public y0 getProjection() {
        return this.f56926a;
    }

    @Override // k20.w0
    public t00.h l() {
        t00.h l11 = getProjection().getType().H0().l();
        s.f(l11, "projection.type.constructor.builtIns");
        return l11;
    }

    @Override // k20.w0
    public /* bridge */ /* synthetic */ e n() {
        return (e) b();
    }

    @Override // k20.w0
    public boolean o() {
        return false;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + getProjection() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
package q1;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;
import o1.f;
import q1.f;

/* loaded from: classes.dex */
final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f47297a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<c, j> f47298b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(c cacheDrawScope, h00.l<? super c, j> onBuildDrawCache) {
        s.g(cacheDrawScope, "cacheDrawScope");
        s.g(onBuildDrawCache, "onBuildDrawCache");
        this.f47297a = cacheDrawScope;
        this.f47298b = onBuildDrawCache;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) f.a.b(this, r11, pVar);
    }

    @Override // q1.f
    public void U(b params) {
        s.g(params, "params");
        c cVar = this.f47297a;
        cVar.o(params);
        cVar.p(null);
        a().invoke(cVar);
        if (cVar.a() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
        }
    }

    @Override // q1.h
    public void X(v1.c cVar) {
        s.g(cVar, "<this>");
        j a11 = this.f47297a.a();
        s.e(a11);
        a11.a().invoke(cVar);
    }

    public final h00.l<c, j> a() {
        return this.f47298b;
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) f.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return s.c(this.f47297a, gVar.f47297a) && s.c(this.f47298b, gVar.f47298b);
        }
        return false;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return f.a.d(this, fVar);
    }

    public int hashCode() {
        return (this.f47297a.hashCode() * 31) + this.f47298b.hashCode();
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return f.a.a(this, lVar);
    }

    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f47297a + ", onBuildDrawCache=" + this.f47298b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
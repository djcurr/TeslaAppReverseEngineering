package z5;

import z5.o;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final t5.d f60260a;

    /* renamed from: b  reason: collision with root package name */
    private final s f60261b;

    /* renamed from: c  reason: collision with root package name */
    private final w f60262c;

    public m(t5.d referenceCounter, s strongMemoryCache, w weakMemoryCache) {
        kotlin.jvm.internal.s.g(referenceCounter, "referenceCounter");
        kotlin.jvm.internal.s.g(strongMemoryCache, "strongMemoryCache");
        kotlin.jvm.internal.s.g(weakMemoryCache, "weakMemoryCache");
        this.f60260a = referenceCounter;
        this.f60261b = strongMemoryCache;
        this.f60262c = weakMemoryCache;
    }

    public final o.a a(l lVar) {
        if (lVar != null) {
            o.a b11 = this.f60261b.b(lVar);
            if (b11 == null) {
                b11 = this.f60262c.b(lVar);
            }
            if (b11 != null) {
                this.f60260a.c(b11.b());
            }
            return b11;
        }
        return null;
    }
}
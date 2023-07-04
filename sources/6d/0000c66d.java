package zz;

import h00.l;
import kotlin.jvm.internal.s;
import zz.g;
import zz.g.b;

/* loaded from: classes5.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: a  reason: collision with root package name */
    private final l<g.b, E> f61272a;

    /* renamed from: b  reason: collision with root package name */
    private final g.c<?> f61273b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [h00.l<? super zz.g$b, ? extends E extends B>, h00.l<zz.g$b, E extends B>, java.lang.Object] */
    public b(g.c<B> baseKey, l<? super g.b, ? extends E> safeCast) {
        s.g(baseKey, "baseKey");
        s.g(safeCast, "safeCast");
        this.f61272a = safeCast;
        this.f61273b = baseKey instanceof b ? (g.c<B>) ((b) baseKey).f61273b : baseKey;
    }

    public final boolean a(g.c<?> key) {
        s.g(key, "key");
        return key == this || this.f61273b == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lzz/g$b;)TE; */
    public final g.b b(g.b element) {
        s.g(element, "element");
        return (g.b) this.f61272a.invoke(element);
    }
}
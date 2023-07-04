package h2;

/* loaded from: classes.dex */
public final class z<T> extends b<g2.d<T>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(o wrapped, g2.d<T> modifier) {
        super(wrapped, modifier);
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(modifier, "modifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [V, java.lang.Object] */
    @Override // h2.o
    public <V> V K1(g2.a<V> modifierLocal) {
        kotlin.jvm.internal.s.g(modifierLocal, "modifierLocal");
        if (kotlin.jvm.internal.s.c(a2().getKey(), modifierLocal)) {
            return a2().getValue();
        }
        return (V) super.K1(modifierLocal);
    }
}
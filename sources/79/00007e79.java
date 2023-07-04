package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class u<R> implements n<R>, Serializable {
    private final int arity;

    public u(int i11) {
        this.arity = i11;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String l11 = m0.l(this);
        s.f(l11, "renderLambdaToString(this)");
        return l11;
    }
}
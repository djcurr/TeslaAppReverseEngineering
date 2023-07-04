package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public abstract class l extends d implements n<Object> {
    private final int arity;

    public l(int i11, zz.d<Object> dVar) {
        super(dVar);
        this.arity = i11;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() == null) {
            String k11 = m0.k(this);
            s.f(k11, "renderLambdaToString(this)");
            return k11;
        }
        return super.toString();
    }

    public l(int i11) {
        this(i11, null);
    }
}
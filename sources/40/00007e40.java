package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public abstract class k extends j implements n<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final int f34894a;

    public k(int i11, zz.d<Object> dVar) {
        super(dVar);
        this.f34894a = i11;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.f34894a;
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
}
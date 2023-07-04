package kotlin.jvm.internal;

import n00.k;
import n00.o;

/* loaded from: classes5.dex */
public abstract class y extends a0 implements n00.k {
    public y(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }

    @Override // kotlin.jvm.internal.f
    protected n00.c computeReflected() {
        return m0.f(this);
    }

    @Override // h00.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // n00.o
    public Object p(Object obj) {
        return ((n00.k) getReflected()).p(obj);
    }

    @Override // n00.m
    public o.a getGetter() {
        return ((n00.k) getReflected()).getGetter();
    }

    @Override // n00.i
    public k.a getSetter() {
        return ((n00.k) getReflected()).getSetter();
    }
}
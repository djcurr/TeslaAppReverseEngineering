package kotlin.jvm.internal;

import n00.n;

/* loaded from: classes5.dex */
public abstract class c0 extends g0 implements n00.n {
    public c0(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }

    @Override // kotlin.jvm.internal.f
    protected n00.c computeReflected() {
        return m0.i(this);
    }

    @Override // h00.a
    public Object invoke() {
        return get();
    }

    @Override // n00.m
    public n.a getGetter() {
        return ((n00.n) getReflected()).getGetter();
    }
}
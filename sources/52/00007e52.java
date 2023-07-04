package kotlin.jvm.internal;

import n00.o;

/* loaded from: classes5.dex */
public abstract class e0 extends g0 implements n00.o {
    public e0() {
    }

    @Override // kotlin.jvm.internal.f
    protected n00.c computeReflected() {
        return m0.j(this);
    }

    @Override // h00.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // n00.o
    public Object p(Object obj) {
        return ((n00.o) getReflected()).p(obj);
    }

    public e0(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }

    @Override // n00.m
    public o.a getGetter() {
        return ((n00.o) getReflected()).getGetter();
    }
}
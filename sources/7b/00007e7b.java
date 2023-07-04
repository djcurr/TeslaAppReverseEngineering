package kotlin.jvm.internal;

import n00.j;
import n00.n;

/* loaded from: classes5.dex */
public abstract class w extends a0 implements n00.j {
    public w() {
    }

    @Override // kotlin.jvm.internal.f
    protected n00.c computeReflected() {
        return m0.e(this);
    }

    @Override // n00.n
    public Object getDelegate() {
        return ((n00.j) getReflected()).getDelegate();
    }

    @Override // h00.a
    public Object invoke() {
        return get();
    }

    public w(Object obj) {
        super(obj);
    }

    @Override // n00.m
    public n.a getGetter() {
        return ((n00.j) getReflected()).getGetter();
    }

    @Override // n00.i
    public j.a getSetter() {
        return ((n00.j) getReflected()).getSetter();
    }

    public w(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }
}
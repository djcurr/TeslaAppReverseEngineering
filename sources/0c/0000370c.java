package com.google.common.base;

/* loaded from: classes3.dex */
public abstract class i<A, B> implements l<A, B> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15923a;

    /* JADX INFO: Access modifiers changed from: protected */
    public i() {
        this(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private B d(A a11) {
        return (B) c(p.a(a11));
    }

    public final B a(A a11) {
        return b(a11);
    }

    @Override // com.google.common.base.l
    @Deprecated
    public final B apply(A a11) {
        return a(a11);
    }

    B b(A a11) {
        if (this.f15923a) {
            if (a11 == null) {
                return null;
            }
            return (B) u.o(c(a11));
        }
        return d(a11);
    }

    protected abstract B c(A a11);

    i(boolean z11) {
        this.f15923a = z11;
    }
}
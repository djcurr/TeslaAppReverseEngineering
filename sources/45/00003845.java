package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class l1<T, B> {
    abstract void a(B b11, int i11, int i12);

    abstract void b(B b11, int i11, long j11);

    abstract void c(B b11, int i11, T t11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(B b11, int i11, i iVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e(B b11, int i11, long j11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int h(T t11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int i(T t11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T k(T t11, T t12);

    final void l(B b11, e1 e1Var) {
        while (e1Var.getFieldNumber() != Integer.MAX_VALUE && m(b11, e1Var)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(B b11, e1 e1Var) {
        int tag = e1Var.getTag();
        int a11 = r1.a(tag);
        int b12 = r1.b(tag);
        if (b12 == 0) {
            e(b11, a11, e1Var.readInt64());
            return true;
        } else if (b12 == 1) {
            b(b11, a11, e1Var.readFixed64());
            return true;
        } else if (b12 == 2) {
            d(b11, a11, e1Var.readBytes());
            return true;
        } else if (b12 != 3) {
            if (b12 != 4) {
                if (b12 == 5) {
                    a(b11, a11, e1Var.readFixed32());
                    return true;
                }
                throw InvalidProtocolBufferException.d();
            }
            return false;
        } else {
            B n11 = n();
            int c11 = r1.c(a11, 4);
            l(n11, e1Var);
            if (c11 == e1Var.getTag()) {
                c(b11, a11, r(n11));
                return true;
            }
            throw InvalidProtocolBufferException.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void o(Object obj, B b11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void p(Object obj, T t11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean q(e1 e1Var);

    abstract T r(B b11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void s(T t11, s1 s1Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void t(T t11, s1 s1Var);
}
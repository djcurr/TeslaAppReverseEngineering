package qd;

import qd.a;

/* loaded from: classes.dex */
public class c<T> extends a<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(T t11, h<T> hVar, a.c cVar, Throwable th2) {
        super(t11, hVar, cVar, th2);
    }

    @Override // qd.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // qd.a
    public void finalize() {
        try {
            synchronized (this) {
                if (this.f48056a) {
                    return;
                }
                T f11 = this.f48057b.f();
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(System.identityHashCode(this));
                objArr[1] = Integer.valueOf(System.identityHashCode(this.f48057b));
                objArr[2] = f11 == null ? null : f11.getClass().getName();
                nd.a.I("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", objArr);
                this.f48057b.d();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // qd.a
    /* renamed from: g */
    public a<T> clone() {
        return this;
    }
}
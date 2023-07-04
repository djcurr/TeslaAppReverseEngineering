package qd;

import com.facebook.common.references.SharedReference;
import md.k;
import qd.a;

/* loaded from: classes.dex */
public class b<T> extends a<T> {
    private b(SharedReference<T> sharedReference, a.c cVar, Throwable th2) {
        super(sharedReference, cVar, th2);
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
                nd.a.I("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", objArr);
                this.f48058c.a(this.f48057b, this.f48059d);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // qd.a
    /* renamed from: g */
    public a<T> clone() {
        k.i(R());
        return new b(this.f48057b, this.f48058c, this.f48059d != null ? new Throwable(this.f48059d) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(T t11, h<T> hVar, a.c cVar, Throwable th2) {
        super(t11, hVar, cVar, th2);
    }
}
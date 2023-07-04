package qd;

import com.facebook.common.references.SharedReference;
import md.k;
import qd.a;

/* loaded from: classes.dex */
public class g<T> extends a<T> {
    private g(SharedReference<T> sharedReference, a.c cVar, Throwable th2) {
        super(sharedReference, cVar, th2);
    }

    @Override // qd.a
    /* renamed from: g */
    public a<T> clone() {
        k.i(R());
        return new g(this.f48057b, this.f48058c, this.f48059d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(T t11, h<T> hVar, a.c cVar, Throwable th2) {
        super(t11, hVar, cVar, th2);
    }
}
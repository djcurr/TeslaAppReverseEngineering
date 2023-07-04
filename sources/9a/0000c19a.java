package y20;

import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.internal.d0;

/* loaded from: classes5.dex */
final class k<T> extends d0<T> {
    public k(zz.g gVar, zz.d<? super T> dVar) {
        super(gVar, dVar);
    }

    @Override // v20.h2
    public boolean M(Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return F(th2);
    }
}
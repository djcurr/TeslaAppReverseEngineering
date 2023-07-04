package x20;

import kotlinx.coroutines.internal.e0;
import vz.b0;

/* loaded from: classes5.dex */
public interface x<E> {

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ boolean a(x xVar, Throwable th2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    th2 = null;
                }
                return xVar.q(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <E> boolean b(x<? super E> xVar, E e11) {
            Object d11 = xVar.d(e11);
            if (i.j(d11)) {
                return true;
            }
            Throwable e12 = i.e(d11);
            if (e12 == null) {
                return false;
            }
            throw e0.k(e12);
        }
    }

    Object b(E e11, zz.d<? super b0> dVar);

    Object d(E e11);

    boolean offer(E e11);

    boolean q(Throwable th2);

    boolean r();
}
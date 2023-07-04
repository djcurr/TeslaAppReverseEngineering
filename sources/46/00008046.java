package kotlinx.coroutines.sync;

import vz.b0;

/* loaded from: classes5.dex */
public interface b {

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ Object a(b bVar, Object obj, zz.d dVar, int i11, Object obj2) {
            if (obj2 == null) {
                if ((i11 & 1) != 0) {
                    obj = null;
                }
                return bVar.b(obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ boolean b(b bVar, Object obj, int i11, Object obj2) {
            if (obj2 == null) {
                if ((i11 & 1) != 0) {
                    obj = null;
                }
                return bVar.a(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        public static /* synthetic */ void c(b bVar, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i11 & 1) != 0) {
                obj = null;
            }
            bVar.c(obj);
        }
    }

    boolean a(Object obj);

    Object b(Object obj, zz.d<? super b0> dVar);

    void c(Object obj);
}
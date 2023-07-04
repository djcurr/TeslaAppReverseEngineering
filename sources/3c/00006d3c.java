package f30;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public interface c {

    /* loaded from: classes5.dex */
    public static final class a {
        public static int a(c cVar, e30.f descriptor) {
            s.g(descriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, e30.f fVar, int i11, c30.a aVar, Object obj, int i12, Object obj2) {
            if (obj2 == null) {
                if ((i12 & 8) != 0) {
                    obj = null;
                }
                return cVar.e(fVar, i11, aVar, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }

    <T> T A(e30.f fVar, int i11, c30.a<T> aVar, T t11);

    int C(e30.f fVar, int i11);

    float E(e30.f fVar, int i11);

    i30.c a();

    void d(e30.f fVar);

    <T> T e(e30.f fVar, int i11, c30.a<T> aVar, T t11);

    String i(e30.f fVar, int i11);

    int j(e30.f fVar);

    byte l(e30.f fVar, int i11);

    boolean n();

    boolean o(e30.f fVar, int i11);

    int p(e30.f fVar);

    double q(e30.f fVar, int i11);

    char r(e30.f fVar, int i11);

    short u(e30.f fVar, int i11);

    long x(e30.f fVar, int i11);
}
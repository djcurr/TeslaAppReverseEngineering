package v20;

/* loaded from: classes5.dex */
public interface o<T> extends zz.d<T> {

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ boolean a(o oVar, Throwable th2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    th2 = null;
                }
                return oVar.u(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ Object b(o oVar, Object obj, Object obj2, int i11, Object obj3) {
            if (obj3 == null) {
                if ((i11 & 2) != 0) {
                    obj2 = null;
                }
                return oVar.h(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    void S(T t11, h00.l<? super Throwable, vz.b0> lVar);

    void T(h00.l<? super Throwable, vz.b0> lVar);

    void U(Object obj);

    boolean a();

    Object h(T t11, Object obj);

    Object o(T t11, Object obj, h00.l<? super Throwable, vz.b0> lVar);

    Object t(Throwable th2);

    boolean u(Throwable th2);

    void v(j0 j0Var, T t11);
}
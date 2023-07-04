package v20;

/* loaded from: classes5.dex */
public final class a3 {

    /* renamed from: a  reason: collision with root package name */
    public static final a3 f53889a = new a3();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<k1> f53890b = new ThreadLocal<>();

    private a3() {
    }

    public final k1 a() {
        return f53890b.get();
    }

    public final k1 b() {
        ThreadLocal<k1> threadLocal = f53890b;
        k1 k1Var = threadLocal.get();
        if (k1Var == null) {
            k1 a11 = n1.a();
            threadLocal.set(a11);
            return a11;
        }
        return k1Var;
    }

    public final void c() {
        f53890b.set(null);
    }

    public final void d(k1 k1Var) {
        f53890b.set(k1Var);
    }
}
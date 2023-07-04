package yg;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static b f59496a;

    private a() {
    }

    public static synchronized void a(b bVar) {
        synchronized (a.class) {
            if (f59496a == null) {
                f59496a = bVar;
            } else {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
        }
    }

    public static synchronized void b(b bVar) {
        synchronized (a.class) {
            if (!c()) {
                a(bVar);
            }
        }
    }

    public static synchronized boolean c() {
        boolean z11;
        synchronized (a.class) {
            z11 = f59496a != null;
        }
        return z11;
    }

    public static boolean d(String str) {
        return e(str, 0);
    }

    public static boolean e(String str, int i11) {
        b bVar;
        synchronized (a.class) {
            bVar = f59496a;
            if (bVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.a(str, i11);
    }
}
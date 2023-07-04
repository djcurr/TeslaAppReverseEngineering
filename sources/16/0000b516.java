package tf;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f51927a;

    /* renamed from: tf.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C1153b {
        private C1153b() {
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(String str);

        boolean b();

        void c();
    }

    static {
        new C1153b();
        f51927a = null;
    }

    private b() {
    }

    public static void a(String str) {
        c().a(str);
    }

    public static void b() {
        c().c();
    }

    private static c c() {
        if (f51927a == null) {
            synchronized (b.class) {
                if (f51927a == null) {
                    f51927a = new tf.a();
                }
            }
        }
        return f51927a;
    }

    public static boolean d() {
        return c().b();
    }
}
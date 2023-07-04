package qf;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f48079a = b();

    /* renamed from: b  reason: collision with root package name */
    private static int f48080b = 384;

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f48081c;

    public static a a() {
        if (f48081c == null) {
            synchronized (b.class) {
                if (f48081c == null) {
                    f48081c = new a(f48080b, f48079a);
                }
            }
        }
        return f48081c;
    }

    private static int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
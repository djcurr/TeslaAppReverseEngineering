package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
final /* synthetic */ class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f35461a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f35461a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
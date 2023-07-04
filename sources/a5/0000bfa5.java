package xm;

/* loaded from: classes2.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static b f57600a;

    private b() {
    }

    public static b a() {
        if (f57600a == null) {
            f57600a = new b();
        }
        return f57600a;
    }

    @Override // xm.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
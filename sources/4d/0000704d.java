package gd;

import gd.a;

/* loaded from: classes.dex */
public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private static g f27904a;

    private g() {
    }

    public static synchronized g b() {
        g gVar;
        synchronized (g.class) {
            if (f27904a == null) {
                f27904a = new g();
            }
            gVar = f27904a;
        }
        return gVar;
    }

    @Override // gd.a
    public void a(a.EnumC0528a enumC0528a, Class<?> cls, String str, Throwable th2) {
    }
}
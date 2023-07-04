package jd;

/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private static c f33330a;

    private c() {
    }

    public static synchronized c b() {
        c cVar;
        synchronized (c.class) {
            if (f33330a == null) {
                f33330a = new c();
            }
            cVar = f33330a;
        }
        return cVar;
    }

    @Override // jd.b
    public void a(a aVar) {
    }
}
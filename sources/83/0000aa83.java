package pd;

/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private static d f46422a;

    public static synchronized d b() {
        d dVar;
        synchronized (d.class) {
            if (f46422a == null) {
                f46422a = new d();
            }
            dVar = f46422a;
        }
        return dVar;
    }

    @Override // pd.c
    public void a(b bVar) {
    }
}
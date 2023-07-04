package atd.d0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final b f6844a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final d f6845b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final e f6846c = new h();

    public static f a(String str) {
        b bVar = f6844a;
        if (bVar.a().equals(str)) {
            return bVar;
        }
        d dVar = f6845b;
        if (dVar.a().equals(str)) {
            return dVar;
        }
        e eVar = f6846c;
        if (eVar.a().equals(str)) {
            return eVar;
        }
        throw new IllegalArgumentException(atd.s0.a.a(-799747344230976L));
    }
}
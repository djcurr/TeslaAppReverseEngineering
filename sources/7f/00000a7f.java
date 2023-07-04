package atd.e0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f6848a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f6849b = new a();

    public static c a(String str) {
        c cVar = f6848a;
        if (cVar.a().equals(str)) {
            return cVar;
        }
        c cVar2 = f6849b;
        if (cVar2.a().equals(str)) {
            return cVar2;
        }
        throw atd.y.c.CRYPTO_FAILURE.a();
    }
}
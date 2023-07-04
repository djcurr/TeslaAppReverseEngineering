package bw;

/* loaded from: classes6.dex */
public final class b implements tw.e<String> {

    /* loaded from: classes6.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final b f8308a = new b();
    }

    public static b a() {
        return a.f8308a;
    }

    public static String c() {
        return (String) tw.h.e(bw.a.f8307a.e());
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public String get() {
        return c();
    }
}
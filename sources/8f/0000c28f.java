package yh;

/* loaded from: classes3.dex */
public final class j implements sh.b<e> {

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final j f59526a = new j();
    }

    public static j a() {
        return a.f59526a;
    }

    public static e c() {
        return (e) sh.d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public e get() {
        return c();
    }
}
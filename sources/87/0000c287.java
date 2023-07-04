package yh;

/* loaded from: classes3.dex */
public final class g implements sh.b<String> {

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final g f59520a = new g();
    }

    public static g a() {
        return a.f59520a;
    }

    public static String b() {
        return (String) sh.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public String get() {
        return b();
    }
}
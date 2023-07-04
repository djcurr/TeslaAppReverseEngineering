package ai;

/* loaded from: classes3.dex */
public final class c implements sh.b<ai.a> {

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final c f413a = new c();
    }

    public static c a() {
        return a.f413a;
    }

    public static ai.a b() {
        return (ai.a) sh.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public ai.a get() {
        return b();
    }
}
package ai;

/* loaded from: classes3.dex */
public final class d implements sh.b<ai.a> {

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final d f414a = new d();
    }

    public static d a() {
        return a.f414a;
    }

    public static ai.a c() {
        return (ai.a) sh.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public ai.a get() {
        return c();
    }
}
package ph;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class k implements sh.b<Executor> {

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final k f46515a = new k();
    }

    public static k a() {
        return a.f46515a;
    }

    public static Executor b() {
        return (Executor) sh.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
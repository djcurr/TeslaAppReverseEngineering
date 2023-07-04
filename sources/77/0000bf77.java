package xh;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class u implements sh.b<t> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Executor> f57445a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<yh.d> f57446b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<v> f57447c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<zh.a> f57448d;

    public u(Provider<Executor> provider, Provider<yh.d> provider2, Provider<v> provider3, Provider<zh.a> provider4) {
        this.f57445a = provider;
        this.f57446b = provider2;
        this.f57447c = provider3;
        this.f57448d = provider4;
    }

    public static u a(Provider<Executor> provider, Provider<yh.d> provider2, Provider<v> provider3, Provider<zh.a> provider4) {
        return new u(provider, provider2, provider3, provider4);
    }

    public static t c(Executor executor, yh.d dVar, v vVar, zh.a aVar) {
        return new t(executor, dVar, vVar, aVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public t get() {
        return c(this.f57445a.get(), this.f57446b.get(), this.f57447c.get(), this.f57448d.get());
    }
}
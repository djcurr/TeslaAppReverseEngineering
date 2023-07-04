package wh;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import xh.v;

/* loaded from: classes3.dex */
public final class d implements sh.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Executor> f55891a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<qh.d> f55892b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<v> f55893c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<yh.d> f55894d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<zh.a> f55895e;

    public d(Provider<Executor> provider, Provider<qh.d> provider2, Provider<v> provider3, Provider<yh.d> provider4, Provider<zh.a> provider5) {
        this.f55891a = provider;
        this.f55892b = provider2;
        this.f55893c = provider3;
        this.f55894d = provider4;
        this.f55895e = provider5;
    }

    public static d a(Provider<Executor> provider, Provider<qh.d> provider2, Provider<v> provider3, Provider<yh.d> provider4, Provider<zh.a> provider5) {
        return new d(provider, provider2, provider3, provider4, provider5);
    }

    public static c c(Executor executor, qh.d dVar, v vVar, yh.d dVar2, zh.a aVar) {
        return new c(executor, dVar, vVar, dVar2, aVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public c get() {
        return c(this.f55891a.get(), this.f55892b.get(), this.f55893c.get(), this.f55894d.get(), this.f55895e.get());
    }
}
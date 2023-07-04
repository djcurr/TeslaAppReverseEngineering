package xh;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class q implements sh.b<p> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f57430a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<qh.d> f57431b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<yh.d> f57432c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<v> f57433d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<Executor> f57434e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider<zh.a> f57435f;

    /* renamed from: g  reason: collision with root package name */
    private final Provider<ai.a> f57436g;

    /* renamed from: h  reason: collision with root package name */
    private final Provider<ai.a> f57437h;

    /* renamed from: i  reason: collision with root package name */
    private final Provider<yh.c> f57438i;

    public q(Provider<Context> provider, Provider<qh.d> provider2, Provider<yh.d> provider3, Provider<v> provider4, Provider<Executor> provider5, Provider<zh.a> provider6, Provider<ai.a> provider7, Provider<ai.a> provider8, Provider<yh.c> provider9) {
        this.f57430a = provider;
        this.f57431b = provider2;
        this.f57432c = provider3;
        this.f57433d = provider4;
        this.f57434e = provider5;
        this.f57435f = provider6;
        this.f57436g = provider7;
        this.f57437h = provider8;
        this.f57438i = provider9;
    }

    public static q a(Provider<Context> provider, Provider<qh.d> provider2, Provider<yh.d> provider3, Provider<v> provider4, Provider<Executor> provider5, Provider<zh.a> provider6, Provider<ai.a> provider7, Provider<ai.a> provider8, Provider<yh.c> provider9) {
        return new q(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static p c(Context context, qh.d dVar, yh.d dVar2, v vVar, Executor executor, zh.a aVar, ai.a aVar2, ai.a aVar3, yh.c cVar) {
        return new p(context, dVar, dVar2, vVar, executor, aVar, aVar2, aVar3, cVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public p get() {
        return c(this.f57430a.get(), this.f57431b.get(), this.f57432c.get(), this.f57433d.get(), this.f57434e.get(), this.f57435f.get(), this.f57436g.get(), this.f57437h.get(), this.f57438i.get());
    }
}
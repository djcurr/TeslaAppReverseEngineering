package gw;

import java.util.Set;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class a0 implements tw.e<Set<pr.u<?>>> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<p> f28221a;

    public a0(Provider<p> provider) {
        this.f28221a = provider;
    }

    public static a0 a(Provider<p> provider) {
        return new a0(provider);
    }

    public static Set<pr.u<?>> c(p pVar) {
        return (Set) tw.h.e(z.a(pVar));
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public Set<pr.u<?>> get() {
        return c(this.f28221a.get());
    }
}
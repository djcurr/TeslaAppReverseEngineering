package wv;

import java.util.Set;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class r implements tw.e<Set<pr.u<?>>> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<j> f56375a;

    public r(Provider<j> provider) {
        this.f56375a = provider;
    }

    public static r a(Provider<j> provider) {
        return new r(provider);
    }

    public static Set<pr.u<?>> c(j jVar) {
        return (Set) tw.h.e(q.a(jVar));
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public Set<pr.u<?>> get() {
        return c(this.f56375a.get());
    }
}
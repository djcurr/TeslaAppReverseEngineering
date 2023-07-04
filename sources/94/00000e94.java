package bw;

import java.util.Set;
import javax.inject.Provider;
import pr.u;
import pr.v;

/* loaded from: classes6.dex */
public final class m implements tw.e<v> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Set<u<?>>> f8325a;

    public m(Provider<Set<u<?>>> provider) {
        this.f8325a = provider;
    }

    public static m a(Provider<Set<u<?>>> provider) {
        return new m(provider);
    }

    public static v c(Set<u<?>> set) {
        return (v) tw.h.e(a.k(set));
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public v get() {
        return c(this.f8325a.get());
    }
}
package tw;

import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class c<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private Provider<T> f52633a;

    public static <T> void a(Provider<T> provider, Provider<T> provider2) {
        h.b(provider2);
        c cVar = (c) provider;
        if (cVar.f52633a == null) {
            cVar.f52633a = provider2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // javax.inject.Provider
    public T get() {
        Provider<T> provider = this.f52633a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }
}
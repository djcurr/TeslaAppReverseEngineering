package pv;

import javax.inject.Provider;
import pv.r;

/* loaded from: classes2.dex */
public final class w implements tw.e<v> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<x20.e<r.a>> f46994a;

    public w(Provider<x20.e<r.a>> provider) {
        this.f46994a = provider;
    }

    public static w a(Provider<x20.e<r.a>> provider) {
        return new w(provider);
    }

    public static v c(x20.e<r.a> eVar) {
        return new v(eVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public v get() {
        return c(this.f46994a.get());
    }
}
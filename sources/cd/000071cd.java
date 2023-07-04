package h10;

import e10.w;
import j20.n;
import kotlin.jvm.internal.s;
import w00.x;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final c f28582a;

    /* renamed from: b  reason: collision with root package name */
    private final l f28583b;

    /* renamed from: c  reason: collision with root package name */
    private final vz.k<w> f28584c;

    /* renamed from: d  reason: collision with root package name */
    private final vz.k f28585d;

    /* renamed from: e  reason: collision with root package name */
    private final j10.c f28586e;

    public h(c components, l typeParameterResolver, vz.k<w> delegateForDefaultTypeQualifiers) {
        s.g(components, "components");
        s.g(typeParameterResolver, "typeParameterResolver");
        s.g(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f28582a = components;
        this.f28583b = typeParameterResolver;
        this.f28584c = delegateForDefaultTypeQualifiers;
        this.f28585d = delegateForDefaultTypeQualifiers;
        this.f28586e = new j10.c(this, typeParameterResolver);
    }

    public final c a() {
        return this.f28582a;
    }

    public final w b() {
        return (w) this.f28585d.getValue();
    }

    public final vz.k<w> c() {
        return this.f28584c;
    }

    public final x d() {
        return this.f28582a.m();
    }

    public final n e() {
        return this.f28582a.u();
    }

    public final l f() {
        return this.f28583b;
    }

    public final j10.c g() {
        return this.f28586e;
    }
}
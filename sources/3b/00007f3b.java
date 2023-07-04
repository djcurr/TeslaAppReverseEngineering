package kotlin.reflect.jvm.internal.impl.types.checker;

import k20.d0;
import k20.j1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.checker.g;

/* loaded from: classes5.dex */
public final class n implements m {

    /* renamed from: c  reason: collision with root package name */
    private final h f35172c;

    /* renamed from: d  reason: collision with root package name */
    private final g f35173d;

    /* renamed from: e  reason: collision with root package name */
    private final w10.j f35174e;

    public n(h kotlinTypeRefiner, g kotlinTypePreparator) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlin.jvm.internal.s.g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f35172c = kotlinTypeRefiner;
        this.f35173d = kotlinTypePreparator;
        w10.j n11 = w10.j.n(d());
        kotlin.jvm.internal.s.f(n11, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.f35174e = n11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.m
    public w10.j a() {
        return this.f35174e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.f
    public boolean b(d0 a11, d0 b11) {
        kotlin.jvm.internal.s.g(a11, "a");
        kotlin.jvm.internal.s.g(b11, "b");
        return e(new a(false, false, false, d(), f(), null, 38, null), a11.K0(), b11.K0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.f
    public boolean c(d0 subtype, d0 supertype) {
        kotlin.jvm.internal.s.g(subtype, "subtype");
        kotlin.jvm.internal.s.g(supertype, "supertype");
        return g(new a(true, false, false, d(), f(), null, 38, null), subtype.K0(), supertype.K0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.m
    public h d() {
        return this.f35172c;
    }

    public final boolean e(a aVar, j1 a11, j1 b11) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        kotlin.jvm.internal.s.g(a11, "a");
        kotlin.jvm.internal.s.g(b11, "b");
        return k20.f.f34253a.i(aVar, a11, b11);
    }

    public g f() {
        return this.f35173d;
    }

    public final boolean g(a aVar, j1 subType, j1 superType) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        kotlin.jvm.internal.s.g(subType, "subType");
        kotlin.jvm.internal.s.g(superType, "superType");
        return k20.f.q(k20.f.f34253a, aVar, subType, superType, false, 8, null);
    }

    public /* synthetic */ n(h hVar, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i11 & 2) != 0 ? g.a.f35150a : gVar);
    }
}
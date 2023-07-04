package b10;

import b10.w;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;
import l10.c0;

/* loaded from: classes5.dex */
public final class z extends w implements c0 {

    /* renamed from: b  reason: collision with root package name */
    private final WildcardType f7330b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection<l10.a> f7331c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7332d;

    public z(WildcardType reflectType) {
        List i11;
        kotlin.jvm.internal.s.g(reflectType, "reflectType");
        this.f7330b = reflectType;
        i11 = wz.w.i();
        this.f7331c = i11;
    }

    @Override // l10.d
    public boolean C() {
        return this.f7332d;
    }

    @Override // l10.c0
    public boolean L() {
        Type[] upperBounds = P().getUpperBounds();
        kotlin.jvm.internal.s.f(upperBounds, "reflectType.upperBounds");
        return !kotlin.jvm.internal.s.c(wz.l.H(upperBounds), Object.class);
    }

    @Override // l10.c0
    /* renamed from: Q */
    public w x() {
        Type[] upperBounds = P().getUpperBounds();
        Type[] lowerBounds = P().getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            if (lowerBounds.length == 1) {
                w.a aVar = w.f7324a;
                kotlin.jvm.internal.s.f(lowerBounds, "lowerBounds");
                Object g02 = wz.l.g0(lowerBounds);
                kotlin.jvm.internal.s.f(g02, "lowerBounds.single()");
                return aVar.a((Type) g02);
            } else if (upperBounds.length == 1) {
                kotlin.jvm.internal.s.f(upperBounds, "upperBounds");
                Type ub2 = (Type) wz.l.g0(upperBounds);
                if (kotlin.jvm.internal.s.c(ub2, Object.class)) {
                    return null;
                }
                w.a aVar2 = w.f7324a;
                kotlin.jvm.internal.s.f(ub2, "ub");
                return aVar2.a(ub2);
            } else {
                return null;
            }
        }
        throw new UnsupportedOperationException(kotlin.jvm.internal.s.p("Wildcard types with many bounds are not yet supported: ", P()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b10.w
    /* renamed from: R */
    public WildcardType P() {
        return this.f7330b;
    }

    @Override // l10.d
    public Collection<l10.a> getAnnotations() {
        return this.f7331c;
    }
}
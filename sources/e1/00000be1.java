package b10;

import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class v extends w implements l10.v {

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f7321b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection<l10.a> f7322c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7323d;

    public v(Class<?> reflectType) {
        List i11;
        kotlin.jvm.internal.s.g(reflectType, "reflectType");
        this.f7321b = reflectType;
        i11 = wz.w.i();
        this.f7322c = i11;
    }

    @Override // l10.d
    public boolean C() {
        return this.f7323d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b10.w
    /* renamed from: Q */
    public Class<?> P() {
        return this.f7321b;
    }

    @Override // l10.d
    public Collection<l10.a> getAnnotations() {
        return this.f7322c;
    }

    @Override // l10.v
    public t00.i getType() {
        if (kotlin.jvm.internal.s.c(P(), Void.TYPE)) {
            return null;
        }
        return b20.e.get(P().getName()).getPrimitiveType();
    }
}
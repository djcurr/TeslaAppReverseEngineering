package b10;

import b10.w;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class i extends w implements l10.f {

    /* renamed from: b  reason: collision with root package name */
    private final Type f7299b;

    /* renamed from: c  reason: collision with root package name */
    private final w f7300c;

    /* renamed from: d  reason: collision with root package name */
    private final Collection<l10.a> f7301d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7302e;

    public i(Type reflectType) {
        w a11;
        List i11;
        kotlin.jvm.internal.s.g(reflectType, "reflectType");
        this.f7299b = reflectType;
        Type P = P();
        if (!(P instanceof GenericArrayType)) {
            if (P instanceof Class) {
                Class cls = (Class) P;
                if (cls.isArray()) {
                    w.a aVar = w.f7324a;
                    Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.s.f(componentType, "getComponentType()");
                    a11 = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + P().getClass() + "): " + P());
        }
        w.a aVar2 = w.f7324a;
        Type genericComponentType = ((GenericArrayType) P).getGenericComponentType();
        kotlin.jvm.internal.s.f(genericComponentType, "genericComponentType");
        a11 = aVar2.a(genericComponentType);
        this.f7300c = a11;
        i11 = wz.w.i();
        this.f7301d = i11;
    }

    @Override // l10.d
    public boolean C() {
        return this.f7302e;
    }

    @Override // b10.w
    protected Type P() {
        return this.f7299b;
    }

    @Override // l10.f
    /* renamed from: Q */
    public w o() {
        return this.f7300c;
    }

    @Override // l10.d
    public Collection<l10.a> getAnnotations() {
        return this.f7301d;
    }
}
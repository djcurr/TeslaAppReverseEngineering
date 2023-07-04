package b10;

import b10.w;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class l extends w implements l10.j {

    /* renamed from: b  reason: collision with root package name */
    private final Type f7313b;

    /* renamed from: c  reason: collision with root package name */
    private final l10.i f7314c;

    public l(Type reflectType) {
        l10.i jVar;
        kotlin.jvm.internal.s.g(reflectType, "reflectType");
        this.f7313b = reflectType;
        Type P = P();
        if (P instanceof Class) {
            jVar = new j((Class) P);
        } else if (P instanceof TypeVariable) {
            jVar = new x((TypeVariable) P);
        } else if (!(P instanceof ParameterizedType)) {
            throw new IllegalStateException("Not a classifier type (" + P.getClass() + "): " + P);
        } else {
            Type rawType = ((ParameterizedType) P).getRawType();
            Objects.requireNonNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            jVar = new j((Class) rawType);
        }
        this.f7314c = jVar;
    }

    @Override // l10.d
    public boolean C() {
        return false;
    }

    @Override // l10.j
    public String D() {
        return P().toString();
    }

    @Override // l10.j
    public String F() {
        throw new UnsupportedOperationException(kotlin.jvm.internal.s.p("Type not found: ", P()));
    }

    @Override // b10.w
    public Type P() {
        return this.f7313b;
    }

    @Override // l10.j
    public l10.i c() {
        return this.f7314c;
    }

    @Override // l10.d
    public Collection<l10.a> getAnnotations() {
        List i11;
        i11 = wz.w.i();
        return i11;
    }

    @Override // b10.w, l10.d
    public l10.a l(u10.c fqName) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        return null;
    }

    @Override // l10.j
    public boolean t() {
        Type P = P();
        if (P instanceof Class) {
            TypeVariable[] typeParameters = ((Class) P).getTypeParameters();
            kotlin.jvm.internal.s.f(typeParameters, "getTypeParameters()");
            return (typeParameters.length == 0) ^ true;
        }
        return false;
    }

    @Override // l10.j
    public List<l10.x> y() {
        int t11;
        List<Type> d11 = b.d(P());
        w.a aVar = w.f7324a;
        t11 = wz.x.t(d11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (Type type : d11) {
            arrayList.add(aVar.a(type));
        }
        return arrayList;
    }
}
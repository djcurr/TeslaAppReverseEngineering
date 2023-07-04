package b10;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import l10.b0;

/* loaded from: classes5.dex */
public final class m extends r implements l10.k {

    /* renamed from: a  reason: collision with root package name */
    private final Constructor<?> f7315a;

    public m(Constructor<?> member) {
        kotlin.jvm.internal.s.g(member, "member");
        this.f7315a = member;
    }

    @Override // b10.r
    /* renamed from: U */
    public Constructor<?> S() {
        return this.f7315a;
    }

    @Override // l10.z
    public List<x> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = S().getTypeParameters();
        kotlin.jvm.internal.s.f(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new x(typeVariable));
        }
        return arrayList;
    }

    @Override // l10.k
    public List<b0> h() {
        List<b0> i11;
        Type[] realTypes = S().getGenericParameterTypes();
        kotlin.jvm.internal.s.f(realTypes, "types");
        if (realTypes.length == 0) {
            i11 = wz.w.i();
            return i11;
        }
        Class<?> declaringClass = S().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            realTypes = (Type[]) wz.l.r(realTypes, 1, realTypes.length);
        }
        Annotation[][] realAnnotations = S().getParameterAnnotations();
        if (realAnnotations.length >= realTypes.length) {
            if (realAnnotations.length > realTypes.length) {
                kotlin.jvm.internal.s.f(realAnnotations, "annotations");
                realAnnotations = (Annotation[][]) wz.l.r(realAnnotations, realAnnotations.length - realTypes.length, realAnnotations.length);
            }
            kotlin.jvm.internal.s.f(realTypes, "realTypes");
            kotlin.jvm.internal.s.f(realAnnotations, "realAnnotations");
            return T(realTypes, realAnnotations, S().isVarArgs());
        }
        throw new IllegalStateException(kotlin.jvm.internal.s.p("Illegal generic signature: ", S()));
    }
}
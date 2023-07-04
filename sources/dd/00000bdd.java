package b10;

import b10.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import l10.b0;
import l10.r;

/* loaded from: classes5.dex */
public final class s extends r implements l10.r {

    /* renamed from: a  reason: collision with root package name */
    private final Method f7319a;

    public s(Method member) {
        kotlin.jvm.internal.s.g(member, "member");
        this.f7319a = member;
    }

    @Override // l10.r
    public boolean M() {
        return r.a.a(this);
    }

    @Override // b10.r
    /* renamed from: U */
    public Method S() {
        return this.f7319a;
    }

    @Override // l10.r
    /* renamed from: V */
    public w getReturnType() {
        w.a aVar = w.f7324a;
        Type genericReturnType = S().getGenericReturnType();
        kotlin.jvm.internal.s.f(genericReturnType, "member.genericReturnType");
        return aVar.a(genericReturnType);
    }

    @Override // l10.z
    public List<x> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = S().getTypeParameters();
        kotlin.jvm.internal.s.f(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new x(typeVariable));
        }
        return arrayList;
    }

    @Override // l10.r
    public List<b0> h() {
        Type[] genericParameterTypes = S().getGenericParameterTypes();
        kotlin.jvm.internal.s.f(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = S().getParameterAnnotations();
        kotlin.jvm.internal.s.f(parameterAnnotations, "member.parameterAnnotations");
        return T(genericParameterTypes, parameterAnnotations, S().isVarArgs());
    }

    @Override // l10.r
    public l10.b q() {
        Object defaultValue = S().getDefaultValue();
        if (defaultValue == null) {
            return null;
        }
        return d.f7295b.a(defaultValue, null);
    }
}
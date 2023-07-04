package q00;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import q00.d;
import q00.e;
import s10.a;
import t00.k;
import t10.d;
import w00.n0;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final u10.b f47173a;

    /* renamed from: b  reason: collision with root package name */
    public static final h0 f47174b = new h0();

    static {
        u10.b m11 = u10.b.m(new u10.c("java.lang.Void"));
        kotlin.jvm.internal.s.f(m11, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
        f47173a = m11;
    }

    private h0() {
    }

    private final t00.i a(Class<?> cls) {
        if (cls.isPrimitive()) {
            b20.e eVar = b20.e.get(cls.getSimpleName());
            kotlin.jvm.internal.s.f(eVar, "JvmPrimitiveType.get(simpleName)");
            return eVar.getPrimitiveType();
        }
        return null;
    }

    private final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (w10.c.m(eVar) || w10.c.n(eVar)) {
            return true;
        }
        return kotlin.jvm.internal.s.c(eVar.getName(), v00.a.f53783e.a()) && eVar.h().isEmpty();
    }

    private final d.e d(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return new d.e(new d.b(e(eVar), n10.t.c(eVar, false, false, 1, null)));
    }

    private final String e(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        String b11 = e10.f0.b(bVar);
        if (b11 != null) {
            return b11;
        }
        if (bVar instanceof w00.j0) {
            String b12 = a20.a.o(bVar).getName().b();
            kotlin.jvm.internal.s.f(b12, "descriptor.propertyIfAccessor.name.asString()");
            return e10.y.a(b12);
        } else if (bVar instanceof w00.k0) {
            String b13 = a20.a.o(bVar).getName().b();
            kotlin.jvm.internal.s.f(b13, "descriptor.propertyIfAccessor.name.asString()");
            return e10.y.d(b13);
        } else {
            String b14 = bVar.getName().b();
            kotlin.jvm.internal.s.f(b14, "descriptor.name.asString()");
            return b14;
        }
    }

    public final u10.b c(Class<?> klass) {
        kotlin.jvm.internal.s.g(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            kotlin.jvm.internal.s.f(componentType, "klass.componentType");
            t00.i a11 = a(componentType);
            if (a11 != null) {
                return new u10.b(t00.k.f51317l, a11.getArrayTypeName());
            }
            u10.b m11 = u10.b.m(k.a.f51336h.l());
            kotlin.jvm.internal.s.f(m11, "ClassId.topLevel(Standar…s.FqNames.array.toSafe())");
            return m11;
        } else if (kotlin.jvm.internal.s.c(klass, Void.TYPE)) {
            return f47173a;
        } else {
            t00.i a12 = a(klass);
            if (a12 != null) {
                return new u10.b(t00.k.f51317l, a12.getTypeName());
            }
            u10.b a13 = b10.b.a(klass);
            if (!a13.k()) {
                v00.c cVar = v00.c.f53787a;
                u10.c b11 = a13.b();
                kotlin.jvm.internal.s.f(b11, "classId.asSingleFqName()");
                u10.b n11 = cVar.n(b11);
                if (n11 != null) {
                    return n11;
                }
            }
            return a13;
        }
    }

    public final e f(w00.i0 possiblyOverriddenProperty) {
        kotlin.jvm.internal.s.g(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        kotlin.reflect.jvm.internal.impl.descriptors.b L = w10.d.L(possiblyOverriddenProperty);
        kotlin.jvm.internal.s.f(L, "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)");
        w00.i0 a11 = ((w00.i0) L).a();
        kotlin.jvm.internal.s.f(a11, "DescriptorUtils.unwrapFa…rriddenProperty).original");
        if (a11 instanceof i20.j) {
            i20.j jVar = (i20.j) a11;
            p10.n b02 = jVar.b0();
            h.f<p10.n, a.d> fVar = s10.a.f49976d;
            kotlin.jvm.internal.s.f(fVar, "JvmProtoBuf.propertySignature");
            a.d dVar = (a.d) r10.e.a(b02, fVar);
            if (dVar != null) {
                return new e.c(a11, b02, dVar, jVar.G(), jVar.C());
            }
        } else if (a11 instanceof g10.f) {
            n0 f11 = ((g10.f) a11).f();
            if (!(f11 instanceof k10.a)) {
                f11 = null;
            }
            k10.a aVar = (k10.a) f11;
            l10.l c11 = aVar != null ? aVar.c() : null;
            if (c11 instanceof b10.p) {
                return new e.a(((b10.p) c11).S());
            }
            if (c11 instanceof b10.s) {
                Method S = ((b10.s) c11).S();
                w00.k0 setter = a11.getSetter();
                n0 f12 = setter != null ? setter.f() : null;
                if (!(f12 instanceof k10.a)) {
                    f12 = null;
                }
                k10.a aVar2 = (k10.a) f12;
                l10.l c12 = aVar2 != null ? aVar2.c() : null;
                if (!(c12 instanceof b10.s)) {
                    c12 = null;
                }
                b10.s sVar = (b10.s) c12;
                return new e.b(S, sVar != null ? sVar.S() : null);
            }
            throw new b0("Incorrect resolution sequence for Java field " + a11 + " (source = " + c11 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        w00.j0 mo239getGetter = a11.mo239getGetter();
        kotlin.jvm.internal.s.e(mo239getGetter);
        d.e d11 = d(mo239getGetter);
        w00.k0 setter2 = a11.getSetter();
        return new e.d(d11, setter2 != null ? d(setter2) : null);
    }

    public final d g(kotlin.reflect.jvm.internal.impl.descriptors.e possiblySubstitutedFunction) {
        Method S;
        d.b b11;
        d.b e11;
        kotlin.jvm.internal.s.g(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        kotlin.reflect.jvm.internal.impl.descriptors.b L = w10.d.L(possiblySubstitutedFunction);
        kotlin.jvm.internal.s.f(L, "DescriptorUtils.unwrapFa…siblySubstitutedFunction)");
        kotlin.reflect.jvm.internal.impl.descriptors.e a11 = ((kotlin.reflect.jvm.internal.impl.descriptors.e) L).a();
        kotlin.jvm.internal.s.f(a11, "DescriptorUtils.unwrapFa…titutedFunction).original");
        if (a11 instanceof i20.b) {
            i20.b bVar = (i20.b) a11;
            kotlin.reflect.jvm.internal.impl.protobuf.o mo139b0 = bVar.mo139b0();
            if ((mo139b0 instanceof p10.i) && (e11 = t10.g.f51558a.e((p10.i) mo139b0, bVar.G(), bVar.C())) != null) {
                return new d.e(e11);
            }
            if ((mo139b0 instanceof p10.d) && (b11 = t10.g.f51558a.b((p10.d) mo139b0, bVar.G(), bVar.C())) != null) {
                w00.i mo223b = possiblySubstitutedFunction.mo223b();
                kotlin.jvm.internal.s.f(mo223b, "possiblySubstitutedFunction.containingDeclaration");
                if (w10.f.b(mo223b)) {
                    return new d.e(b11);
                }
                return new d.C1011d(b11);
            }
            return d(a11);
        }
        if (a11 instanceof g10.e) {
            n0 f11 = ((g10.e) a11).f();
            if (!(f11 instanceof k10.a)) {
                f11 = null;
            }
            k10.a aVar = (k10.a) f11;
            l10.l c11 = aVar != null ? aVar.c() : null;
            b10.s sVar = (b10.s) (c11 instanceof b10.s ? c11 : null);
            if (sVar != null && (S = sVar.S()) != null) {
                return new d.c(S);
            }
            throw new b0("Incorrect resolution sequence for Java method " + a11);
        } else if (a11 instanceof g10.b) {
            n0 f12 = ((g10.b) a11).f();
            if (!(f12 instanceof k10.a)) {
                f12 = null;
            }
            k10.a aVar2 = (k10.a) f12;
            l10.l c12 = aVar2 != null ? aVar2.c() : null;
            if (c12 instanceof b10.m) {
                return new d.b(((b10.m) c12).S());
            }
            if (c12 instanceof b10.j) {
                b10.j jVar = (b10.j) c12;
                if (jVar.p()) {
                    return new d.a(jVar.getElement());
                }
            }
            throw new b0("Incorrect resolution sequence for Java constructor " + a11 + " (" + c12 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        } else if (b(a11)) {
            return d(a11);
        } else {
            throw new b0("Unknown origin of " + a11 + " (" + a11.getClass() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }
}
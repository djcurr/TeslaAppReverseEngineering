package n10;

import ch.qos.logback.core.CoreConstants;
import k20.c0;
import k20.d0;
import k20.f1;
import k20.k1;
import k20.w0;
import k20.y0;
import vz.b0;
import w00.a0;
import w00.j0;
import w00.r0;
import w00.s0;

/* loaded from: classes5.dex */
public final class c {
    public static final String a(w00.c klass, w<?> typeMappingConfiguration) {
        String C;
        kotlin.jvm.internal.s.g(klass, "klass");
        kotlin.jvm.internal.s.g(typeMappingConfiguration, "typeMappingConfiguration");
        String e11 = typeMappingConfiguration.e(klass);
        if (e11 == null) {
            w00.i mo223b = klass.mo223b();
            kotlin.jvm.internal.s.f(mo223b, "klass.containingDeclaration");
            String d11 = u10.h.c(klass.getName()).d();
            kotlin.jvm.internal.s.f(d11, "safeIdentifier(klass.name).identifier");
            if (mo223b instanceof a0) {
                u10.c e12 = ((a0) mo223b).e();
                if (e12.d()) {
                    return d11;
                }
                StringBuilder sb2 = new StringBuilder();
                String b11 = e12.b();
                kotlin.jvm.internal.s.f(b11, "fqName.asString()");
                C = kotlin.text.v.C(b11, CoreConstants.DOT, '/', false, 4, null);
                sb2.append(C);
                sb2.append('/');
                sb2.append(d11);
                return sb2.toString();
            }
            w00.c cVar = mo223b instanceof w00.c ? (w00.c) mo223b : null;
            if (cVar != null) {
                String a11 = typeMappingConfiguration.a(cVar);
                if (a11 == null) {
                    a11 = a(cVar, typeMappingConfiguration);
                }
                return a11 + CoreConstants.DOLLAR + d11;
            }
            throw new IllegalArgumentException("Unexpected container: " + mo223b + " for " + klass);
        }
        return e11;
    }

    public static /* synthetic */ String b(w00.c cVar, w wVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            wVar = x.f40230a;
        }
        return a(cVar, wVar);
    }

    public static final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.a descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        if (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return true;
        }
        d0 returnType = descriptor.getReturnType();
        kotlin.jvm.internal.s.e(returnType);
        if (t00.h.A0(returnType)) {
            d0 returnType2 = descriptor.getReturnType();
            kotlin.jvm.internal.s.e(returnType2);
            if (!f1.m(returnType2) && !(descriptor instanceof j0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Object] */
    public static final <T> T d(d0 kotlinType, k<T> factory, y mode, w<? extends T> typeMappingConfiguration, h<T> hVar, h00.q<? super d0, ? super T, ? super y, b0> writeGenericType) {
        Object obj;
        d0 d0Var;
        Object d11;
        kotlin.jvm.internal.s.g(kotlinType, "kotlinType");
        kotlin.jvm.internal.s.g(factory, "factory");
        kotlin.jvm.internal.s.g(mode, "mode");
        kotlin.jvm.internal.s.g(typeMappingConfiguration, "typeMappingConfiguration");
        kotlin.jvm.internal.s.g(writeGenericType, "writeGenericType");
        d0 c11 = typeMappingConfiguration.c(kotlinType);
        if (c11 == null) {
            if (t00.g.o(kotlinType)) {
                return (T) d(t00.l.b(kotlinType, typeMappingConfiguration.b()), factory, mode, typeMappingConfiguration, hVar, writeGenericType);
            }
            kotlin.reflect.jvm.internal.impl.types.checker.r rVar = kotlin.reflect.jvm.internal.impl.types.checker.r.f35177a;
            Object b11 = z.b(rVar, kotlinType, factory, mode);
            if (b11 == null) {
                w0 H0 = kotlinType.H0();
                if (H0 instanceof c0) {
                    c0 c0Var = (c0) H0;
                    d0 d12 = c0Var.d();
                    if (d12 == null) {
                        d12 = typeMappingConfiguration.f(c0Var.a());
                    }
                    return (T) d(n20.a.t(d12), factory, mode, typeMappingConfiguration, hVar, writeGenericType);
                }
                w00.e n11 = H0.n();
                if (n11 != null) {
                    if (k20.v.r(n11)) {
                        T t11 = (T) factory.e("error/NonExistentClass");
                        typeMappingConfiguration.d(kotlinType, (w00.c) n11);
                        return t11;
                    }
                    boolean z11 = n11 instanceof w00.c;
                    if (z11 && t00.h.c0(kotlinType)) {
                        if (kotlinType.G0().size() == 1) {
                            y0 y0Var = kotlinType.G0().get(0);
                            d0 type = y0Var.getType();
                            kotlin.jvm.internal.s.f(type, "memberProjection.type");
                            if (y0Var.b() == k1.IN_VARIANCE) {
                                d11 = factory.e("java/lang/Object");
                            } else {
                                k1 b12 = y0Var.b();
                                kotlin.jvm.internal.s.f(b12, "memberProjection.projectionKind");
                                d11 = d(type, factory, mode.f(b12, true), typeMappingConfiguration, hVar, writeGenericType);
                            }
                            return (T) factory.a(kotlin.jvm.internal.s.p("[", factory.d(d11)));
                        }
                        throw new UnsupportedOperationException("arrays must have one type argument");
                    } else if (z11) {
                        if (w10.f.b(n11) && !mode.c() && (d0Var = (d0) k20.w.a(rVar, kotlinType)) != null) {
                            return (T) d(d0Var, factory, mode.g(), typeMappingConfiguration, hVar, writeGenericType);
                        }
                        if (mode.e() && t00.h.j0((w00.c) n11)) {
                            obj = (Object) factory.f();
                        } else {
                            w00.c cVar = (w00.c) n11;
                            w00.c a11 = cVar.a();
                            kotlin.jvm.internal.s.f(a11, "descriptor.original");
                            T g11 = typeMappingConfiguration.g(a11);
                            if (g11 == null) {
                                if (cVar.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_ENTRY) {
                                    cVar = (w00.c) cVar.mo223b();
                                }
                                w00.c a12 = cVar.a();
                                kotlin.jvm.internal.s.f(a12, "enumClassIfEnumEntry.original");
                                obj = (Object) factory.e(a(a12, typeMappingConfiguration));
                            } else {
                                obj = (Object) g11;
                            }
                        }
                        writeGenericType.invoke(kotlinType, obj, mode);
                        return (T) obj;
                    } else if (n11 instanceof s0) {
                        return (T) d(n20.a.i((s0) n11), factory, mode, typeMappingConfiguration, null, s20.d.b());
                    } else {
                        if ((n11 instanceof r0) && mode.b()) {
                            return (T) d(((r0) n11).E(), factory, mode, typeMappingConfiguration, hVar, writeGenericType);
                        }
                        throw new UnsupportedOperationException(kotlin.jvm.internal.s.p("Unknown type ", kotlinType));
                    }
                }
                throw new UnsupportedOperationException(kotlin.jvm.internal.s.p("no descriptor for type constructor of ", kotlinType));
            }
            ?? r92 = (Object) z.a(factory, b11, mode.d());
            writeGenericType.invoke(kotlinType, r92, mode);
            return r92;
        }
        return (T) d(c11, factory, mode, typeMappingConfiguration, hVar, writeGenericType);
    }

    public static /* synthetic */ Object e(d0 d0Var, k kVar, y yVar, w wVar, h hVar, h00.q qVar, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            qVar = s20.d.b();
        }
        return d(d0Var, kVar, yVar, wVar, hVar, qVar);
    }
}
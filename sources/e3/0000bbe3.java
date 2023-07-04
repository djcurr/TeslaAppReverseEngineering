package w10;

import ezvcard.property.Kind;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import k20.d0;
import k20.f0;
import k20.f1;
import k20.v;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.a0;
import w00.k0;
import w00.l0;
import w00.o0;
import w00.q;
import w00.w0;
import w00.x;

/* loaded from: classes5.dex */
public class d {
    static {
        new u10.c("kotlin.jvm.JvmName");
    }

    public static boolean A(w00.i iVar) {
        return D(iVar, kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_CLASS);
    }

    public static boolean B(w00.i iVar) {
        if (iVar == null) {
            a(36);
        }
        return D(iVar, kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_ENTRY);
    }

    public static boolean C(w00.i iVar) {
        return D(iVar, kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE);
    }

    private static boolean D(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.c cVar) {
        if (cVar == null) {
            a(37);
        }
        return (iVar instanceof w00.c) && ((w00.c) iVar).getKind() == cVar;
    }

    public static boolean E(w00.i iVar) {
        if (iVar == null) {
            a(1);
        }
        while (iVar != null) {
            if (u(iVar) || y(iVar)) {
                return true;
            }
            iVar = iVar.b();
        }
        return false;
    }

    private static boolean F(d0 d0Var, w00.i iVar) {
        if (d0Var == null) {
            a(30);
        }
        if (iVar == null) {
            a(31);
        }
        w00.e n11 = d0Var.H0().n();
        if (n11 != null) {
            w00.i a11 = n11.a();
            return (a11 instanceof w00.e) && (iVar instanceof w00.e) && ((w00.e) iVar).i().equals(((w00.e) a11).i());
        }
        return false;
    }

    public static boolean G(w00.i iVar) {
        return (D(iVar, kotlin.reflect.jvm.internal.impl.descriptors.c.CLASS) || D(iVar, kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE)) && ((w00.c) iVar).p() == kotlin.reflect.jvm.internal.impl.descriptors.f.SEALED;
    }

    public static boolean H(w00.c cVar, w00.c cVar2) {
        if (cVar == null) {
            a(28);
        }
        if (cVar2 == null) {
            a(29);
        }
        return I(cVar.n(), cVar2.a());
    }

    public static boolean I(d0 d0Var, w00.i iVar) {
        if (d0Var == null) {
            a(32);
        }
        if (iVar == null) {
            a(33);
        }
        if (F(d0Var, iVar)) {
            return true;
        }
        for (d0 d0Var2 : d0Var.H0().a()) {
            if (I(d0Var2, iVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(w00.i iVar) {
        return iVar != null && (iVar.b() instanceof a0);
    }

    public static boolean K(w0 w0Var, d0 d0Var) {
        if (w0Var == null) {
            a(63);
        }
        if (d0Var == null) {
            a(64);
        }
        if (w0Var.L() || f0.a(d0Var)) {
            return false;
        }
        if (f1.b(d0Var)) {
            return true;
        }
        t00.h g11 = a20.a.g(w0Var);
        if (!t00.h.q0(d0Var)) {
            kotlin.reflect.jvm.internal.impl.types.checker.f fVar = kotlin.reflect.jvm.internal.impl.types.checker.f.f35149a;
            if (!fVar.b(g11.W(), d0Var) && !fVar.b(g11.K().n(), d0Var) && !fVar.b(g11.i(), d0Var)) {
                t00.o oVar = t00.o.f51359a;
                if (!t00.o.d(d0Var)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> D L(D d11) {
        if (d11 == null) {
            a(59);
        }
        while (d11.getKind() == b.a.FAKE_OVERRIDE) {
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> d12 = d11.d();
            if (!d12.isEmpty()) {
                d11 = (D) d12.iterator().next();
            } else {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d11);
            }
        }
        return d11;
    }

    public static <D extends w00.m> D M(D d11) {
        if (d11 == null) {
            a(61);
        }
        if (d11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
            return L((kotlin.reflect.jvm.internal.impl.descriptors.b) d11);
        }
        if (d11 == null) {
            a(62);
        }
        return d11;
    }

    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = Kind.LOCATION;
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i11) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean b(w00.i iVar, w00.i iVar2) {
        if (iVar == null) {
            a(16);
        }
        if (iVar2 == null) {
            a(17);
        }
        return g(iVar).equals(g(iVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> void c(D d11, Set<D> set) {
        if (d11 == null) {
            a(70);
        }
        if (set == 0) {
            a(71);
        }
        if (set.contains(d11)) {
            return;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.a aVar : d11.a().d()) {
            kotlin.reflect.jvm.internal.impl.descriptors.a a11 = aVar.a();
            c(a11, set);
            set.add(a11);
        }
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> d(D d11) {
        if (d11 == null) {
            a(68);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(d11.a(), linkedHashSet);
        return linkedHashSet;
    }

    public static w00.c e(d0 d0Var) {
        if (d0Var == null) {
            a(45);
        }
        return f(d0Var.H0());
    }

    public static w00.c f(k20.w0 w0Var) {
        if (w0Var == null) {
            a(46);
        }
        w00.c cVar = (w00.c) w0Var.n();
        if (cVar == null) {
            a(47);
        }
        return cVar;
    }

    public static x g(w00.i iVar) {
        if (iVar == null) {
            a(21);
        }
        x i11 = i(iVar);
        if (i11 == null) {
            a(22);
        }
        return i11;
    }

    public static x h(d0 d0Var) {
        if (d0Var == null) {
            a(20);
        }
        w00.e n11 = d0Var.H0().n();
        if (n11 == null) {
            return null;
        }
        return i(n11);
    }

    public static x i(w00.i iVar) {
        if (iVar == null) {
            a(23);
        }
        while (iVar != null) {
            if (iVar instanceof x) {
                return (x) iVar;
            }
            if (iVar instanceof w00.f0) {
                return ((w00.f0) iVar).w0();
            }
            iVar = iVar.b();
        }
        return null;
    }

    public static o0 j(w00.i iVar) {
        if (iVar == null) {
            a(79);
        }
        if (iVar instanceof k0) {
            iVar = ((k0) iVar).U();
        }
        if (iVar instanceof w00.l) {
            o0 b11 = ((w00.l) iVar).f().b();
            if (b11 == null) {
                a(80);
            }
            return b11;
        }
        o0 o0Var = o0.f55304a;
        if (o0Var == null) {
            a(81);
        }
        return o0Var;
    }

    public static q k(w00.c cVar, boolean z11) {
        if (cVar == null) {
            a(48);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.c kind = cVar.getKind();
        if (kind != kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_CLASS && !kind.isSingleton()) {
            if (G(cVar)) {
                if (z11) {
                    q qVar = w00.p.f55307c;
                    if (qVar == null) {
                        a(50);
                    }
                    return qVar;
                }
                q qVar2 = w00.p.f55305a;
                if (qVar2 == null) {
                    a(51);
                }
                return qVar2;
            } else if (u(cVar)) {
                q qVar3 = w00.p.f55316l;
                if (qVar3 == null) {
                    a(52);
                }
                return qVar3;
            } else {
                q qVar4 = w00.p.f55309e;
                if (qVar4 == null) {
                    a(53);
                }
                return qVar4;
            }
        }
        q qVar5 = w00.p.f55305a;
        if (qVar5 == null) {
            a(49);
        }
        return qVar5;
    }

    public static l0 l(w00.i iVar) {
        if (iVar == null) {
            a(0);
        }
        if (iVar instanceof w00.c) {
            return ((w00.c) iVar).E0();
        }
        return null;
    }

    public static u10.d m(w00.i iVar) {
        if (iVar == null) {
            a(2);
        }
        u10.c o11 = o(iVar);
        return o11 != null ? o11.j() : p(iVar);
    }

    public static u10.c n(w00.i iVar) {
        if (iVar == null) {
            a(3);
        }
        u10.c o11 = o(iVar);
        if (o11 == null) {
            o11 = p(iVar).l();
        }
        if (o11 == null) {
            a(4);
        }
        return o11;
    }

    private static u10.c o(w00.i iVar) {
        if (iVar == null) {
            a(5);
        }
        if (!(iVar instanceof x) && !v.r(iVar)) {
            if (iVar instanceof w00.f0) {
                return ((w00.f0) iVar).e();
            }
            if (iVar instanceof a0) {
                return ((a0) iVar).e();
            }
            return null;
        }
        return u10.c.f52986c;
    }

    private static u10.d p(w00.i iVar) {
        if (iVar == null) {
            a(6);
        }
        u10.d c11 = m(iVar.b()).c(iVar.getName());
        if (c11 == null) {
            a(7);
        }
        return c11;
    }

    public static <D extends w00.i> D q(w00.i iVar, Class<D> cls) {
        if (cls == null) {
            a(18);
        }
        return (D) r(iVar, cls, true);
    }

    public static <D extends w00.i> D r(w00.i iVar, Class<D> cls, boolean z11) {
        if (cls == null) {
            a(19);
        }
        if (iVar == null) {
            return null;
        }
        if (z11) {
            iVar = (D) iVar.b();
        }
        while (iVar != null) {
            if (cls.isInstance(iVar)) {
                return (D) iVar;
            }
            iVar = (D) iVar.b();
        }
        return null;
    }

    public static w00.c s(w00.c cVar) {
        if (cVar == null) {
            a(44);
        }
        for (d0 d0Var : cVar.i().a()) {
            w00.c e11 = e(d0Var);
            if (e11.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE) {
                return e11;
            }
        }
        return null;
    }

    public static boolean t(w00.i iVar) {
        return D(iVar, kotlin.reflect.jvm.internal.impl.descriptors.c.ANNOTATION_CLASS);
    }

    public static boolean u(w00.i iVar) {
        if (iVar == null) {
            a(34);
        }
        return v(iVar) && iVar.getName().equals(u10.h.f53000a);
    }

    public static boolean v(w00.i iVar) {
        return D(iVar, kotlin.reflect.jvm.internal.impl.descriptors.c.CLASS);
    }

    public static boolean w(w00.i iVar) {
        return v(iVar) || A(iVar);
    }

    public static boolean x(w00.i iVar) {
        return D(iVar, kotlin.reflect.jvm.internal.impl.descriptors.c.OBJECT) && ((w00.c) iVar).X();
    }

    public static boolean y(w00.i iVar) {
        return (iVar instanceof w00.m) && ((w00.m) iVar).getVisibility() == w00.p.f55310f;
    }

    public static boolean z(w00.c cVar, w00.c cVar2) {
        if (cVar == null) {
            a(26);
        }
        if (cVar2 == null) {
            a(27);
        }
        for (d0 d0Var : cVar.i().a()) {
            if (F(d0Var, cVar2.a())) {
                return true;
            }
        }
        return false;
    }
}
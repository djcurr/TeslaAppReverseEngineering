package w10;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collections;
import k20.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.i0;
import w00.n0;
import w00.q;
import y00.d0;
import y00.e0;
import y00.f0;
import y00.g0;
import y00.l0;

/* loaded from: classes5.dex */
public class c {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a extends y00.f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w00.c cVar, n0 n0Var, boolean z11) {
            super(cVar, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), true, b.a.DECLARATION, n0Var);
            if (cVar == null) {
                w(0);
            }
            if (n0Var == null) {
                w(1);
            }
            l1(Collections.emptyList(), d.k(cVar, z11));
        }

        private static /* synthetic */ void w(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 12 || i11 == 23 || i11 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 12 || i11 == 23 || i11 == 25) ? 2 : 3];
        switch (i11) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
                objArr[0] = "owner";
                break;
        }
        if (i11 == 12) {
            objArr[1] = "createSetter";
        } else if (i11 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i11 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 12 && i11 != 23 && i11 != 25) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static d0 b(i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (i0Var == null) {
            a(13);
        }
        if (gVar == null) {
            a(14);
        }
        return g(i0Var, gVar, true, false, false);
    }

    public static e0 c(i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        if (i0Var == null) {
            a(0);
        }
        if (gVar == null) {
            a(1);
        }
        if (gVar2 == null) {
            a(2);
        }
        return k(i0Var, gVar, gVar2, true, false, false, i0Var.f());
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.h d(w00.c cVar) {
        if (cVar == null) {
            a(24);
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1;
        g0 h12 = g0.h1(cVar, aVar.b(), t00.k.f51308c, b.a.SYNTHESIZED, cVar.f());
        g0 N0 = h12.N0(null, null, Collections.emptyList(), Collections.singletonList(new l0(h12, null, 0, aVar.b(), u10.f.f("value"), a20.a.g(cVar).W(), false, false, false, null, cVar.f())), cVar.n(), kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL, w00.p.f55309e);
        if (N0 == null) {
            a(25);
        }
        return N0;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.h e(w00.c cVar) {
        if (cVar == null) {
            a(22);
        }
        g0 N0 = g0.h1(cVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), t00.k.f51307b, b.a.SYNTHESIZED, cVar.f()).N0(null, null, Collections.emptyList(), Collections.emptyList(), a20.a.g(cVar).l(k1.INVARIANT, cVar.n()), kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL, w00.p.f55309e);
        if (N0 == null) {
            a(23);
        }
        return N0;
    }

    public static w00.l0 f(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, k20.d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (aVar == null) {
            a(29);
        }
        if (gVar == null) {
            a(30);
        }
        if (d0Var == null) {
            return null;
        }
        return new f0(aVar, new e20.b(aVar, d0Var, null), gVar);
    }

    public static d0 g(i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, boolean z12, boolean z13) {
        if (i0Var == null) {
            a(15);
        }
        if (gVar == null) {
            a(16);
        }
        return h(i0Var, gVar, z11, z12, z13, i0Var.f());
    }

    public static d0 h(i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z11, boolean z12, boolean z13, n0 n0Var) {
        if (i0Var == null) {
            a(17);
        }
        if (gVar == null) {
            a(18);
        }
        if (n0Var == null) {
            a(19);
        }
        return new d0(i0Var, gVar, i0Var.p(), i0Var.getVisibility(), z11, z12, z13, b.a.DECLARATION, null, n0Var);
    }

    public static y00.f i(w00.c cVar, n0 n0Var) {
        if (cVar == null) {
            a(20);
        }
        if (n0Var == null) {
            a(21);
        }
        return new a(cVar, n0Var, false);
    }

    public static e0 j(i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2, boolean z11, boolean z12, boolean z13, q qVar, n0 n0Var) {
        if (i0Var == null) {
            a(7);
        }
        if (gVar == null) {
            a(8);
        }
        if (gVar2 == null) {
            a(9);
        }
        if (qVar == null) {
            a(10);
        }
        if (n0Var == null) {
            a(11);
        }
        e0 e0Var = new e0(i0Var, gVar, i0Var.p(), qVar, z11, z12, z13, b.a.DECLARATION, null, n0Var);
        e0Var.N0(e0.L0(e0Var, i0Var.getType(), gVar2));
        return e0Var;
    }

    public static e0 k(i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2, boolean z11, boolean z12, boolean z13, n0 n0Var) {
        if (i0Var == null) {
            a(3);
        }
        if (gVar == null) {
            a(4);
        }
        if (gVar2 == null) {
            a(5);
        }
        if (n0Var == null) {
            a(6);
        }
        return j(i0Var, gVar, gVar2, z11, z12, z13, i0Var.getVisibility(), n0Var);
    }

    private static boolean l(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(28);
        }
        return eVar.getKind() == b.a.SYNTHESIZED && d.A(eVar.b());
    }

    public static boolean m(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(27);
        }
        return eVar.getName().equals(t00.k.f51308c) && l(eVar);
    }

    public static boolean n(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(26);
        }
        return eVar.getName().equals(t00.k.f51307b) && l(eVar);
    }
}
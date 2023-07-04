package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import w00.s0;
import w00.v0;

/* loaded from: classes5.dex */
public class g0 extends p implements kotlin.reflect.jvm.internal.impl.descriptors.h {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar, b.a aVar, w00.n0 n0Var) {
        super(iVar, hVar, gVar, fVar, aVar, n0Var);
        if (iVar == null) {
            w(0);
        }
        if (gVar == null) {
            w(1);
        }
        if (fVar == null) {
            w(2);
        }
        if (aVar == null) {
            w(3);
        }
        if (n0Var == null) {
            w(4);
        }
    }

    public static g0 h1(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar, b.a aVar, w00.n0 n0Var) {
        if (iVar == null) {
            w(5);
        }
        if (gVar == null) {
            w(6);
        }
        if (fVar == null) {
            w(7);
        }
        if (aVar == null) {
            w(8);
        }
        if (n0Var == null) {
            w(9);
        }
        return new g0(iVar, null, gVar, fVar, aVar, n0Var);
    }

    private static /* synthetic */ void w(int i11) {
        String str = (i11 == 13 || i11 == 17 || i11 == 18 || i11 == 23 || i11 == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 13 || i11 == 17 || i11 == 18 || i11 == 23 || i11 == 24) ? 2 : 3];
        switch (i11) {
            case 1:
            case 6:
            case 21:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 20:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 22:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 15:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 16:
                objArr[0] = "visibility";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 19:
                objArr[0] = "newOwner";
                break;
        }
        if (i11 == 13 || i11 == 17) {
            objArr[1] = "initialize";
        } else if (i11 == 18) {
            objArr[1] = "getOriginal";
        } else if (i11 == 23) {
            objArr[1] = "copy";
        } else if (i11 != 24) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i11) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
                objArr[2] = "initialize";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 13 && i11 != 17 && i11 != 18 && i11 != 23 && i11 != 24) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // y00.p
    protected p H0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, b.a aVar, u10.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, w00.n0 n0Var) {
        if (iVar == null) {
            w(19);
        }
        if (aVar == null) {
            w(20);
        }
        if (gVar == null) {
            w(21);
        }
        if (n0Var == null) {
            w(22);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) eVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new g0(iVar, hVar, gVar, fVar, aVar, n0Var);
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    /* renamed from: g1 */
    public kotlin.reflect.jvm.internal.impl.descriptors.h z0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, b.a aVar, boolean z11) {
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) super.z0(iVar, fVar, qVar, aVar, z11);
        if (hVar == null) {
            w(23);
        }
        return hVar;
    }

    @Override // y00.p, y00.k
    /* renamed from: i1 */
    public kotlin.reflect.jvm.internal.impl.descriptors.h d0() {
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) super.d0();
        if (hVar == null) {
            w(18);
        }
        return hVar;
    }

    @Override // y00.p
    /* renamed from: j1 */
    public g0 N0(w00.l0 l0Var, w00.l0 l0Var2, List<? extends s0> list, List<v0> list2, k20.d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar) {
        if (list == null) {
            w(10);
        }
        if (list2 == null) {
            w(11);
        }
        if (qVar == null) {
            w(12);
        }
        g0 k12 = k1(l0Var, l0Var2, list, list2, d0Var, fVar, qVar, null);
        if (k12 == null) {
            w(13);
        }
        return k12;
    }

    public g0 k1(w00.l0 l0Var, w00.l0 l0Var2, List<? extends s0> list, List<v0> list2, k20.d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, Map<? extends a.InterfaceC0649a<?>, ?> map) {
        if (list == null) {
            w(14);
        }
        if (list2 == null) {
            w(15);
        }
        if (qVar == null) {
            w(16);
        }
        super.N0(l0Var, l0Var2, list, list2, d0Var, fVar, qVar);
        if (map != null && !map.isEmpty()) {
            this.H = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.e
    public e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> s() {
        e.a s11 = super.s();
        if (s11 == null) {
            w(24);
        }
        return s11;
    }
}
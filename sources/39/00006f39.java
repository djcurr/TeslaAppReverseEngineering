package g10;

import com.stripe.android.model.Stripe3ds2AuthParams;
import j20.j;
import java.util.List;
import k20.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import m10.t;
import vz.p;
import w00.i0;
import w00.k0;
import w00.n0;
import w00.q;
import y00.c0;
import y00.e0;

/* loaded from: classes5.dex */
public class f extends c0 implements a {
    private final boolean F;
    private final p<a.InterfaceC0649a<?>, ?> G;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, q qVar, boolean z11, u10.f fVar2, n0 n0Var, i0 i0Var, b.a aVar, boolean z12, p<a.InterfaceC0649a<?>, ?> pVar) {
        super(iVar, i0Var, gVar, fVar, qVar, z11, fVar2, aVar, n0Var, false, false, false, false, false, false);
        if (iVar == null) {
            w(0);
        }
        if (gVar == null) {
            w(1);
        }
        if (fVar == null) {
            w(2);
        }
        if (qVar == null) {
            w(3);
        }
        if (fVar2 == null) {
            w(4);
        }
        if (n0Var == null) {
            w(5);
        }
        if (aVar == null) {
            w(6);
        }
        this.F = z12;
        this.G = pVar;
    }

    public static f X0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, q qVar, boolean z11, u10.f fVar2, n0 n0Var, boolean z12) {
        if (iVar == null) {
            w(7);
        }
        if (gVar == null) {
            w(8);
        }
        if (fVar == null) {
            w(9);
        }
        if (qVar == null) {
            w(10);
        }
        if (fVar2 == null) {
            w(11);
        }
        if (n0Var == null) {
            w(12);
        }
        return new f(iVar, gVar, fVar, qVar, z11, fVar2, n0Var, null, b.a.DECLARATION, z12, null);
    }

    private static /* synthetic */ void w(int i11) {
        String str = i11 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 21 ? 3 : 2];
        switch (i11) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
        }
        if (i11 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 == 21) {
            throw new IllegalStateException(format);
        }
    }

    @Override // y00.c0
    protected c0 K0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, q qVar, i0 i0Var, b.a aVar, u10.f fVar2, n0 n0Var) {
        if (iVar == null) {
            w(13);
        }
        if (fVar == null) {
            w(14);
        }
        if (qVar == null) {
            w(15);
        }
        if (aVar == null) {
            w(16);
        }
        if (fVar2 == null) {
            w(17);
        }
        if (n0Var == null) {
            w(18);
        }
        return new f(iVar, getAnnotations(), fVar, qVar, L(), fVar2, n0Var, i0Var, aVar, this.F, this.G);
    }

    @Override // g10.a
    public a T(d0 d0Var, List<i> list, d0 d0Var2, p<a.InterfaceC0649a<?>, ?> pVar) {
        y00.d0 d0Var3;
        e0 e0Var;
        if (list == null) {
            w(19);
        }
        if (d0Var2 == null) {
            w(20);
        }
        i0 d02 = d0() == this ? null : d0();
        f fVar = new f(b(), getAnnotations(), p(), getVisibility(), L(), getName(), f(), d02, getKind(), this.F, pVar);
        y00.d0 getter = getGetter();
        if (getter != null) {
            d0Var3 = r15;
            y00.d0 d0Var4 = new y00.d0(fVar, getter.getAnnotations(), getter.p(), getter.getVisibility(), getter.D(), getter.isExternal(), getter.isInline(), getKind(), d02 == null ? null : d02.getGetter(), getter.f());
            d0Var3.J0(getter.n0());
            d0Var3.M0(d0Var2);
        } else {
            d0Var3 = null;
        }
        k0 setter = getSetter();
        if (setter != null) {
            e0 e0Var2 = new e0(fVar, setter.getAnnotations(), setter.p(), setter.getVisibility(), setter.D(), setter.isExternal(), setter.isInline(), getKind(), d02 == null ? null : d02.getSetter(), setter.f());
            e0Var2.J0(e0Var2.n0());
            e0Var2.N0(setter.h().get(0));
            e0Var = e0Var2;
        } else {
            e0Var = null;
        }
        fVar.Q0(d0Var3, e0Var, r0(), O());
        fVar.U0(R0());
        j<y10.g<?>> jVar = this.f58847g;
        if (jVar != null) {
            fVar.G0(jVar);
        }
        fVar.y0(d());
        fVar.V0(d0Var2, getTypeParameters(), J(), d0Var == null ? null : w10.c.f(this, d0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b()));
        return fVar;
    }

    @Override // y00.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean c0() {
        return false;
    }

    @Override // y00.c0, w00.w0
    public boolean isConst() {
        d0 type = getType();
        return this.F && w00.g.a(type) && (!t.i(type) || t00.h.t0(type));
    }
}
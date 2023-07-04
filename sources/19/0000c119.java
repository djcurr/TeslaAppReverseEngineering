package y00;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k20.d1;
import k20.k1;
import w00.s0;
import w00.v0;

/* loaded from: classes5.dex */
public abstract class c extends j implements w00.l0 {

    /* renamed from: c  reason: collision with root package name */
    private static final u10.f f58748c = u10.f.i("<this>");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        super(gVar, f58748c);
        if (gVar == null) {
            w(0);
        }
    }

    private static /* synthetic */ void w(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i11) {
            case 2:
                objArr[1] = "getTypeParameters";
                break;
            case 3:
                objArr[1] = "getType";
                break;
            case 4:
                objArr[1] = "getValueParameters";
                break;
            case 5:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 6:
                objArr[1] = "getVisibility";
                break;
            case 7:
                objArr[1] = "getOriginal";
                break;
            case 8:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i11) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public w00.l0 J() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public w00.l0 N() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean c0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> d() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            w(5);
        }
        return emptySet;
    }

    @Override // y00.j, w00.i
    /* renamed from: d0 */
    public w00.g0 a() {
        return this;
    }

    @Override // w00.l
    public w00.n0 f() {
        w00.n0 n0Var = w00.n0.f55303a;
        if (n0Var == null) {
            w(8);
        }
        return n0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public k20.d0 getReturnType() {
        return getType();
    }

    @Override // w00.u0
    public k20.d0 getType() {
        k20.d0 type = getValue().getType();
        if (type == null) {
            w(3);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public List<s0> getTypeParameters() {
        List<s0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            w(2);
        }
        return emptyList;
    }

    @Override // w00.m, w00.u
    public w00.q getVisibility() {
        w00.q qVar = w00.p.f55310f;
        if (qVar == null) {
            w(6);
        }
        return qVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public List<v0> h() {
        List<v0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            w(4);
        }
        return emptyList;
    }

    @Override // w00.i
    public <R, D> R v0(w00.k<R, D> kVar, D d11) {
        return kVar.a(this, d11);
    }

    @Override // w00.p0
    public kotlin.reflect.jvm.internal.impl.descriptors.a c(d1 d1Var) {
        k20.d0 p11;
        if (d1Var == null) {
            w(1);
        }
        if (d1Var.k()) {
            return this;
        }
        if (b() instanceof w00.c) {
            p11 = d1Var.p(getType(), k1.OUT_VARIANCE);
        } else {
            p11 = d1Var.p(getType(), k1.INVARIANT);
        }
        if (p11 == null) {
            return null;
        }
        return p11 == getType() ? this : new f0(b(), new e20.g(p11), getAnnotations());
    }
}
package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;
import d20.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k20.w0;
import w00.s0;

/* loaded from: classes5.dex */
public class y extends g {

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.c f58926i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f58927j;

    /* renamed from: k  reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.f f58928k;

    /* renamed from: l  reason: collision with root package name */
    private w00.q f58929l;

    /* renamed from: m  reason: collision with root package name */
    private w0 f58930m;

    /* renamed from: n  reason: collision with root package name */
    private List<s0> f58931n;

    /* renamed from: o  reason: collision with root package name */
    private final Collection<k20.d0> f58932o;

    /* renamed from: p  reason: collision with root package name */
    private final j20.n f58933p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.c cVar, boolean z11, boolean z12, u10.f fVar, w00.n0 n0Var, j20.n nVar) {
        super(nVar, iVar, fVar, n0Var, z12);
        if (iVar == null) {
            d0(0);
        }
        if (cVar == null) {
            d0(1);
        }
        if (fVar == null) {
            d0(2);
        }
        if (n0Var == null) {
            d0(3);
        }
        if (nVar == null) {
            d0(4);
        }
        this.f58932o = new ArrayList();
        this.f58933p = nVar;
        this.f58926i = cVar;
        this.f58927j = z11;
    }

    private static /* synthetic */ void d0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i12 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // w00.c
    public w00.b B() {
        return null;
    }

    @Override // w00.c
    public boolean C0() {
        return false;
    }

    public void G0() {
        this.f58930m = new k20.j(this, this.f58931n, this.f58932o, this.f58933p);
        Iterator<w00.b> it2 = mo224g().iterator();
        while (it2.hasNext()) {
            ((f) it2.next()).c1(n());
        }
    }

    @Override // w00.c
    /* renamed from: H0 */
    public Set<w00.b> mo224g() {
        Set<w00.b> emptySet = Collections.emptySet();
        if (emptySet == null) {
            d0(13);
        }
        return emptySet;
    }

    public void I0(kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
        if (fVar == null) {
            d0(6);
        }
        this.f58928k = fVar;
    }

    public void J0(List<s0> list) {
        if (list == null) {
            d0(14);
        }
        if (this.f58931n == null) {
            this.f58931n = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    public void K0(w00.q qVar) {
        if (qVar == null) {
            d0(9);
        }
        this.f58929l = qVar;
    }

    @Override // y00.t
    /* renamed from: M */
    public d20.h mo233M(kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        if (hVar == null) {
            d0(16);
        }
        h.b bVar = h.b.f23482b;
        if (bVar == null) {
            d0(17);
        }
        return bVar;
    }

    @Override // w00.u
    public boolean W() {
        return false;
    }

    @Override // w00.c
    public boolean X() {
        return false;
    }

    @Override // w00.c
    public boolean a0() {
        return false;
    }

    @Override // w00.c
    public boolean f0() {
        return false;
    }

    @Override // w00.u
    public boolean g0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    /* renamed from: getAnnotations */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b11 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
        if (b11 == null) {
            d0(5);
        }
        return b11;
    }

    @Override // w00.c
    public kotlin.reflect.jvm.internal.impl.descriptors.c getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.c cVar = this.f58926i;
        if (cVar == null) {
            d0(8);
        }
        return cVar;
    }

    @Override // w00.c, w00.m, w00.u
    public w00.q getVisibility() {
        w00.q qVar = this.f58929l;
        if (qVar == null) {
            d0(10);
        }
        return qVar;
    }

    @Override // w00.c
    /* renamed from: h0 */
    public d20.h mo138h0() {
        h.b bVar = h.b.f23482b;
        if (bVar == null) {
            d0(18);
        }
        return bVar;
    }

    @Override // w00.e
    /* renamed from: i */
    public w0 mo234i() {
        w0 w0Var = this.f58930m;
        if (w0Var == null) {
            d0(11);
        }
        return w0Var;
    }

    @Override // w00.c
    public w00.c i0() {
        return null;
    }

    @Override // w00.c
    public boolean isInline() {
        return false;
    }

    @Override // w00.f
    public boolean j() {
        return this.f58927j;
    }

    @Override // w00.c, w00.f
    public List<s0> o() {
        List<s0> list = this.f58931n;
        if (list == null) {
            d0(15);
        }
        return list;
    }

    @Override // w00.c, w00.u
    public kotlin.reflect.jvm.internal.impl.descriptors.f p() {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = this.f58928k;
        if (fVar == null) {
            d0(7);
        }
        return fVar;
    }

    @Override // w00.c
    public w00.t<k20.k0> t() {
        return null;
    }

    public String toString() {
        return j.M(this);
    }

    @Override // w00.c
    /* renamed from: x */
    public Collection<w00.c> mo225x() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            d0(19);
        }
        return emptyList;
    }
}
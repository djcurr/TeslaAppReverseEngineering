package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;
import d20.h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k20.w0;
import w00.s0;

/* loaded from: classes5.dex */
public class h extends g {

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.f f58806i;

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.c f58807j;

    /* renamed from: k  reason: collision with root package name */
    private final w0 f58808k;

    /* renamed from: l  reason: collision with root package name */
    private d20.h f58809l;

    /* renamed from: m  reason: collision with root package name */
    private Set<w00.b> f58810m;

    /* renamed from: n  reason: collision with root package name */
    private w00.b f58811n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w00.i iVar, u10.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar2, kotlin.reflect.jvm.internal.impl.descriptors.c cVar, Collection<k20.d0> collection, w00.n0 n0Var, boolean z11, j20.n nVar) {
        super(nVar, iVar, fVar, n0Var, z11);
        if (iVar == null) {
            d0(0);
        }
        if (fVar == null) {
            d0(1);
        }
        if (fVar2 == null) {
            d0(2);
        }
        if (cVar == null) {
            d0(3);
        }
        if (collection == null) {
            d0(4);
        }
        if (n0Var == null) {
            d0(5);
        }
        if (nVar == null) {
            d0(6);
        }
        this.f58806i = fVar2;
        this.f58807j = cVar;
        this.f58808k = new k20.j(this, Collections.emptyList(), collection, nVar);
    }

    private static /* synthetic */ void d0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i12 = 2;
                break;
            case 12:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i11) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // w00.c
    public w00.b B() {
        return this.f58811n;
    }

    @Override // w00.c
    public boolean C0() {
        return false;
    }

    public final void G0(d20.h hVar, Set<w00.b> set, w00.b bVar) {
        if (hVar == null) {
            d0(7);
        }
        if (set == null) {
            d0(8);
        }
        this.f58809l = hVar;
        this.f58810m = set;
        this.f58811n = bVar;
    }

    @Override // y00.t
    public d20.h M(kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        if (hVar == null) {
            d0(12);
        }
        d20.h hVar2 = this.f58809l;
        if (hVar2 == null) {
            d0(13);
        }
        return hVar2;
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

    @Override // w00.c
    public Collection<w00.b> g() {
        Set<w00.b> set = this.f58810m;
        if (set == null) {
            d0(11);
        }
        return set;
    }

    @Override // w00.u
    public boolean g0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b11 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
        if (b11 == null) {
            d0(9);
        }
        return b11;
    }

    @Override // w00.c
    public kotlin.reflect.jvm.internal.impl.descriptors.c getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.c cVar = this.f58807j;
        if (cVar == null) {
            d0(15);
        }
        return cVar;
    }

    @Override // w00.c, w00.m, w00.u
    public w00.q getVisibility() {
        w00.q qVar = w00.p.f55309e;
        if (qVar == null) {
            d0(17);
        }
        return qVar;
    }

    @Override // w00.c
    public d20.h h0() {
        h.b bVar = h.b.f23482b;
        if (bVar == null) {
            d0(14);
        }
        return bVar;
    }

    @Override // w00.e
    public w0 i() {
        w0 w0Var = this.f58808k;
        if (w0Var == null) {
            d0(10);
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
        return false;
    }

    @Override // w00.c, w00.f
    public List<s0> o() {
        List<s0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            d0(18);
        }
        return emptyList;
    }

    @Override // w00.c, w00.u
    public kotlin.reflect.jvm.internal.impl.descriptors.f p() {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = this.f58806i;
        if (fVar == null) {
            d0(16);
        }
        return fVar;
    }

    @Override // w00.c
    public w00.t<k20.k0> t() {
        return null;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // w00.c
    public Collection<w00.c> x() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            d0(19);
        }
        return emptyList;
    }
}
package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k20.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.s0;

/* loaded from: classes5.dex */
public abstract class b0 extends k implements kotlin.reflect.jvm.internal.impl.descriptors.g {

    /* renamed from: e  reason: collision with root package name */
    private boolean f58740e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f58741f;

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.f f58742g;

    /* renamed from: h  reason: collision with root package name */
    private final w00.i0 f58743h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f58744i;

    /* renamed from: j  reason: collision with root package name */
    private final b.a f58745j;

    /* renamed from: k  reason: collision with root package name */
    private w00.q f58746k;

    /* renamed from: l  reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.e f58747l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, w00.i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar2, boolean z11, boolean z12, boolean z13, b.a aVar, w00.n0 n0Var) {
        super(i0Var.b(), gVar, fVar2, n0Var);
        if (fVar == null) {
            w(0);
        }
        if (qVar == null) {
            w(1);
        }
        if (i0Var == null) {
            w(2);
        }
        if (gVar == null) {
            w(3);
        }
        if (fVar2 == null) {
            w(4);
        }
        if (n0Var == null) {
            w(5);
        }
        this.f58747l = null;
        this.f58742g = fVar;
        this.f58746k = qVar;
        this.f58743h = i0Var;
        this.f58740e = z11;
        this.f58741f = z12;
        this.f58744i = z13;
        this.f58745j = aVar;
    }

    private static /* synthetic */ void w(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                i12 = 2;
                break;
            case 7:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 14:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i11) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i11) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 14:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean A() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean A0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public boolean D() {
        return this.f58740e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    /* renamed from: F0 */
    public kotlin.reflect.jvm.internal.impl.descriptors.g z0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, b.a aVar, boolean z11) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // y00.k
    /* renamed from: G0 */
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.g d0();

    /* JADX INFO: Access modifiers changed from: protected */
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> H0(boolean z11) {
        ArrayList arrayList = new ArrayList(0);
        for (w00.i0 i0Var : U().d()) {
            w00.y getter = z11 ? i0Var.getGetter() : i0Var.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    public void I0(boolean z11) {
        this.f58740e = z11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public w00.l0 J() {
        return U().J();
    }

    public void J0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        this.f58747l = eVar;
    }

    public void K0(w00.q qVar) {
        this.f58746k = qVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public w00.l0 N() {
        return U().N();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public w00.i0 U() {
        w00.i0 i0Var = this.f58743h;
        if (i0Var == null) {
            w(12);
        }
        return i0Var;
    }

    @Override // w00.u
    public boolean W() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean c0() {
        return false;
    }

    @Override // w00.u
    public boolean g0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public b.a getKind() {
        b.a aVar = this.f58745j;
        if (aVar == null) {
            w(6);
        }
        return aVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public List<s0> getTypeParameters() {
        List<s0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            w(8);
        }
        return emptyList;
    }

    @Override // w00.m, w00.u
    public w00.q getVisibility() {
        w00.q qVar = this.f58746k;
        if (qVar == null) {
            w(10);
        }
        return qVar;
    }

    @Override // w00.u
    public boolean isExternal() {
        return this.f58741f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isInline() {
        return this.f58744i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e n0() {
        return this.f58747l;
    }

    @Override // w00.u
    public kotlin.reflect.jvm.internal.impl.descriptors.f p() {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = this.f58742g;
        if (fVar == null) {
            w(9);
        }
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public <V> V p0(a.InterfaceC0649a<V> interfaceC0649a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean x0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public void y0(Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == null) {
            w(14);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // w00.p0
    public kotlin.reflect.jvm.internal.impl.descriptors.e c(d1 d1Var) {
        if (d1Var == null) {
            w(7);
        }
        throw new UnsupportedOperationException();
    }
}
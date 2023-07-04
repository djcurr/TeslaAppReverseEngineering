package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k20.b1;
import k20.d1;
import k20.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import w00.s0;
import w00.v0;
import w00.w0;
import y00.l0;

/* loaded from: classes5.dex */
public abstract class p extends k implements kotlin.reflect.jvm.internal.impl.descriptors.e {
    private boolean A;
    private Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> B;
    private volatile h00.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>> C;
    private final kotlin.reflect.jvm.internal.impl.descriptors.e E;
    private final b.a F;
    private kotlin.reflect.jvm.internal.impl.descriptors.e G;
    protected Map<a.InterfaceC0649a<?>, Object> H;

    /* renamed from: e  reason: collision with root package name */
    private List<s0> f58849e;

    /* renamed from: f  reason: collision with root package name */
    private List<v0> f58850f;

    /* renamed from: g  reason: collision with root package name */
    private k20.d0 f58851g;

    /* renamed from: h  reason: collision with root package name */
    private w00.l0 f58852h;

    /* renamed from: i  reason: collision with root package name */
    private w00.l0 f58853i;

    /* renamed from: j  reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.f f58854j;

    /* renamed from: k  reason: collision with root package name */
    private w00.q f58855k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f58856l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f58857m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f58858n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f58859o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f58860p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f58861q;

    /* renamed from: t  reason: collision with root package name */
    private boolean f58862t;

    /* renamed from: w  reason: collision with root package name */
    private boolean f58863w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f58864x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f58865y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f58866z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements h00.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d1 f58867a;

        a(d1 d1Var) {
            this.f58867a = d1Var;
        }

        @Override // h00.a
        /* renamed from: a */
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> invoke() {
            s20.e eVar = new s20.e();
            for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 : p.this.d()) {
                eVar.add(eVar2.c(this.f58867a));
            }
            return eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b implements h00.a<List<w0>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f58869a;

        b(List list) {
            this.f58869a = list;
        }

        @Override // h00.a
        /* renamed from: a */
        public List<w0> invoke() {
            return this.f58869a;
        }
    }

    /* loaded from: classes5.dex */
    public class c implements e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> {

        /* renamed from: a  reason: collision with root package name */
        protected b1 f58870a;

        /* renamed from: b  reason: collision with root package name */
        protected w00.i f58871b;

        /* renamed from: c  reason: collision with root package name */
        protected kotlin.reflect.jvm.internal.impl.descriptors.f f58872c;

        /* renamed from: d  reason: collision with root package name */
        protected w00.q f58873d;

        /* renamed from: e  reason: collision with root package name */
        protected kotlin.reflect.jvm.internal.impl.descriptors.e f58874e;

        /* renamed from: f  reason: collision with root package name */
        protected b.a f58875f;

        /* renamed from: g  reason: collision with root package name */
        protected List<v0> f58876g;

        /* renamed from: h  reason: collision with root package name */
        protected w00.l0 f58877h;

        /* renamed from: i  reason: collision with root package name */
        protected w00.l0 f58878i;

        /* renamed from: j  reason: collision with root package name */
        protected k20.d0 f58879j;

        /* renamed from: k  reason: collision with root package name */
        protected u10.f f58880k;

        /* renamed from: l  reason: collision with root package name */
        protected boolean f58881l;

        /* renamed from: m  reason: collision with root package name */
        protected boolean f58882m;

        /* renamed from: n  reason: collision with root package name */
        protected boolean f58883n;

        /* renamed from: o  reason: collision with root package name */
        protected boolean f58884o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f58885p;

        /* renamed from: q  reason: collision with root package name */
        private List<s0> f58886q;

        /* renamed from: r  reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f58887r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f58888s;

        /* renamed from: t  reason: collision with root package name */
        private Map<a.InterfaceC0649a<?>, Object> f58889t;

        /* renamed from: u  reason: collision with root package name */
        private Boolean f58890u;

        /* renamed from: v  reason: collision with root package name */
        protected boolean f58891v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ p f58892w;

        public c(p pVar, b1 b1Var, w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, b.a aVar, List<v0> list, w00.l0 l0Var, k20.d0 d0Var, u10.f fVar2) {
            if (b1Var == null) {
                t(0);
            }
            if (iVar == null) {
                t(1);
            }
            if (fVar == null) {
                t(2);
            }
            if (qVar == null) {
                t(3);
            }
            if (aVar == null) {
                t(4);
            }
            if (list == null) {
                t(5);
            }
            if (d0Var == null) {
                t(6);
            }
            this.f58892w = pVar;
            this.f58874e = null;
            this.f58878i = pVar.f58853i;
            this.f58881l = true;
            this.f58882m = false;
            this.f58883n = false;
            this.f58884o = false;
            this.f58885p = pVar.x0();
            this.f58886q = null;
            this.f58887r = null;
            this.f58888s = pVar.A0();
            this.f58889t = new LinkedHashMap();
            this.f58890u = null;
            this.f58891v = false;
            this.f58870a = b1Var;
            this.f58871b = iVar;
            this.f58872c = fVar;
            this.f58873d = qVar;
            this.f58875f = aVar;
            this.f58876g = list;
            this.f58877h = l0Var;
            this.f58879j = d0Var;
            this.f58880k = fVar2;
        }

        private static /* synthetic */ void t(int i11) {
            String str;
            int i12;
            switch (i11) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 9:
                case 11:
                case 13:
                case 16:
                case 18:
                case 20:
                case 22:
                case 32:
                case 34:
                case 36:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i11) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    i12 = 2;
                    break;
                case 9:
                case 11:
                case 13:
                case 16:
                case 18:
                case 20:
                case 22:
                case 32:
                case 34:
                case 36:
                default:
                    i12 = 3;
                    break;
            }
            Object[] objArr = new Object[i12];
            switch (i11) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 13:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newReturnType";
                    break;
                case 7:
                    objArr[0] = "owner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 9:
                    objArr[0] = "modality";
                    break;
                case 11:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "name";
                    break;
                case 18:
                case 20:
                    objArr[0] = "parameters";
                    break;
                case 22:
                    objArr[0] = "type";
                    break;
                case 32:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 34:
                default:
                    objArr[0] = "substitution";
                    break;
                case 36:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i11) {
                case 8:
                    objArr[1] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 16:
                case 18:
                case 20:
                case 22:
                case 32:
                case 34:
                case 36:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[1] = "setModality";
                    break;
                case 12:
                    objArr[1] = "setVisibility";
                    break;
                case 14:
                    objArr[1] = "setKind";
                    break;
                case 15:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 17:
                    objArr[1] = "setName";
                    break;
                case 19:
                    objArr[1] = "setValueParameters";
                    break;
                case 21:
                    objArr[1] = "setTypeParameters";
                    break;
                case 23:
                    objArr[1] = "setReturnType";
                    break;
                case 24:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 25:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 26:
                    objArr[1] = "setOriginal";
                    break;
                case 27:
                    objArr[1] = "setSignatureChange";
                    break;
                case 28:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 29:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 30:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 31:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 33:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 35:
                    objArr[1] = "setSubstitution";
                    break;
                case 37:
                    objArr[1] = "putUserData";
                    break;
                case 38:
                    objArr[1] = "getSubstitution";
                    break;
                case 39:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i11) {
                case 7:
                    objArr[2] = "setOwner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    break;
                case 9:
                    objArr[2] = "setModality";
                    break;
                case 11:
                    objArr[2] = "setVisibility";
                    break;
                case 13:
                    objArr[2] = "setKind";
                    break;
                case 16:
                    objArr[2] = "setName";
                    break;
                case 18:
                    objArr[2] = "setValueParameters";
                    break;
                case 20:
                    objArr[2] = "setTypeParameters";
                    break;
                case 22:
                    objArr[2] = "setReturnType";
                    break;
                case 32:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 34:
                    objArr[2] = "setSubstitution";
                    break;
                case 36:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i11) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    throw new IllegalStateException(format);
                case 9:
                case 11:
                case 13:
                case 16:
                case 18:
                case 20:
                case 22:
                case 32:
                case 34:
                case 36:
                default:
                    throw new IllegalArgumentException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: A */
        public c r(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
            if (gVar == null) {
                t(32);
            }
            this.f58887r = gVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: B */
        public c k(boolean z11) {
            this.f58881l = z11;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: C */
        public c n(w00.l0 l0Var) {
            this.f58878i = l0Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: D */
        public c a() {
            this.f58884o = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: E */
        public c p(w00.l0 l0Var) {
            this.f58877h = l0Var;
            return this;
        }

        public c F(boolean z11) {
            this.f58890u = Boolean.valueOf(z11);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: G */
        public c d() {
            this.f58888s = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: H */
        public c e() {
            this.f58885p = true;
            return this;
        }

        public c I(boolean z11) {
            this.f58891v = z11;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: J */
        public c q(b.a aVar) {
            if (aVar == null) {
                t(13);
            }
            this.f58875f = aVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: K */
        public c h(kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
            if (fVar == null) {
                t(9);
            }
            this.f58872c = fVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: L */
        public c o(u10.f fVar) {
            if (fVar == null) {
                t(16);
            }
            this.f58880k = fVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: M */
        public c j(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f58874e = (kotlin.reflect.jvm.internal.impl.descriptors.e) bVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: N */
        public c f(w00.i iVar) {
            if (iVar == null) {
                t(7);
            }
            this.f58871b = iVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: O */
        public c i() {
            this.f58883n = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: P */
        public c g(k20.d0 d0Var) {
            if (d0Var == null) {
                t(22);
            }
            this.f58879j = d0Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: Q */
        public c s() {
            this.f58882m = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: R */
        public c l(b1 b1Var) {
            if (b1Var == null) {
                t(34);
            }
            this.f58870a = b1Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: S */
        public c m(List<s0> list) {
            if (list == null) {
                t(20);
            }
            this.f58886q = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: T */
        public c c(List<v0> list) {
            if (list == null) {
                t(18);
            }
            this.f58876g = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        /* renamed from: U */
        public c b(w00.q qVar) {
            if (qVar == null) {
                t(11);
            }
            this.f58873d = qVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public kotlin.reflect.jvm.internal.impl.descriptors.e build() {
            return this.f58892w.I0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, u10.f fVar, b.a aVar, w00.n0 n0Var) {
        super(iVar, gVar, fVar, n0Var);
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
        this.f58855k = w00.p.f55313i;
        this.f58856l = false;
        this.f58857m = false;
        this.f58858n = false;
        this.f58859o = false;
        this.f58860p = false;
        this.f58861q = false;
        this.f58862t = false;
        this.f58863w = false;
        this.f58864x = false;
        this.f58865y = false;
        this.f58866z = true;
        this.A = false;
        this.B = null;
        this.C = null;
        this.G = null;
        this.H = null;
        this.E = eVar == null ? this : eVar;
        this.F = aVar;
    }

    private w00.n0 J0(boolean z11, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        w00.n0 n0Var;
        if (z11) {
            if (eVar == null) {
                eVar = d0();
            }
            n0Var = eVar.f();
        } else {
            n0Var = w00.n0.f55303a;
        }
        if (n0Var == null) {
            w(25);
        }
        return n0Var;
    }

    public static List<v0> K0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, List<v0> list, d1 d1Var) {
        if (list == null) {
            w(26);
        }
        if (d1Var == null) {
            w(27);
        }
        return L0(eVar, list, d1Var, false, false, null);
    }

    public static List<v0> L0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, List<v0> list, d1 d1Var, boolean z11, boolean z12, boolean[] zArr) {
        if (list == null) {
            w(28);
        }
        if (d1Var == null) {
            w(29);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (v0 v0Var : list) {
            k20.d0 type = v0Var.getType();
            k1 k1Var = k1.IN_VARIANCE;
            k20.d0 p11 = d1Var.p(type, k1Var);
            k20.d0 q02 = v0Var.q0();
            k20.d0 p12 = q02 == null ? null : d1Var.p(q02, k1Var);
            if (p11 == null) {
                return null;
            }
            if ((p11 != v0Var.getType() || q02 != p12) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(l0.G0(eVar, z11 ? null : v0Var, v0Var.getIndex(), v0Var.getAnnotations(), v0Var.getName(), p11, v0Var.u0(), v0Var.m0(), v0Var.k0(), p12, z12 ? v0Var.f() : w00.n0.f55303a, v0Var instanceof l0.b ? new b(((l0.b) v0Var).J0()) : null));
        }
        return arrayList;
    }

    private void P0() {
        h00.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>> aVar = this.C;
        if (aVar != null) {
            this.B = aVar.invoke();
            this.C = null;
        }
    }

    private void W0(boolean z11) {
        this.f58864x = z11;
    }

    private void X0(boolean z11) {
        this.f58863w = z11;
    }

    private void Z0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        this.G = eVar;
    }

    private static /* synthetic */ void w(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 11:
            case 15:
            case 20:
            case 22:
            case 23:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                i12 = 2;
                break;
            case 9:
            case 10:
            case 11:
            case 15:
            case 20:
            case 22:
            case 23:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 5:
                objArr[0] = "typeParameters";
                break;
            case 6:
            case 26:
            case 28:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 7:
            case 9:
                objArr[0] = "visibility";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 10:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 11:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
            case 27:
            case 29:
                objArr[0] = "substitutor";
                break;
            case 23:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 8:
                objArr[1] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 15:
            case 20:
            case 22:
            case 23:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 12:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 13:
                objArr[1] = "getModality";
                break;
            case 14:
                objArr[1] = "getVisibility";
                break;
            case 16:
                objArr[1] = "getTypeParameters";
                break;
            case 17:
                objArr[1] = "getValueParameters";
                break;
            case 18:
                objArr[1] = "getOriginal";
                break;
            case 19:
                objArr[1] = "getKind";
                break;
            case 21:
                objArr[1] = "newCopyBuilder";
                break;
            case 24:
                objArr[1] = "copy";
                break;
            case 25:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i11) {
            case 5:
            case 6:
            case 7:
                objArr[2] = "initialize";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setReturnType";
                break;
            case 11:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "newCopyBuilder";
                break;
            case 23:
                objArr[2] = "doSubstitute";
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 11:
            case 15:
            case 20:
            case 22:
            case 23:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public boolean A() {
        return this.f58860p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean A0() {
        return this.f58864x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    /* renamed from: G0 */
    public kotlin.reflect.jvm.internal.impl.descriptors.e z0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, b.a aVar, boolean z11) {
        kotlin.reflect.jvm.internal.impl.descriptors.e build = s().f(iVar).h(fVar).b(qVar).q(aVar).k(z11).build();
        if (build == null) {
            w(24);
        }
        return build;
    }

    protected abstract p H0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, b.a aVar, u10.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, w00.n0 n0Var);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public kotlin.reflect.jvm.internal.impl.descriptors.e I0(c cVar) {
        f0 f0Var;
        w00.l0 l0Var;
        k20.d0 p11;
        if (cVar == null) {
            w(23);
        }
        boolean[] zArr = new boolean[1];
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a11 = cVar.f58887r != null ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.i.a(getAnnotations(), cVar.f58887r) : getAnnotations();
        w00.i iVar = cVar.f58871b;
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = cVar.f58874e;
        p H0 = H0(iVar, eVar, cVar.f58875f, cVar.f58880k, a11, J0(cVar.f58883n, eVar));
        List<s0> typeParameters = cVar.f58886q == null ? getTypeParameters() : cVar.f58886q;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        d1 c11 = k20.q.c(typeParameters, cVar.f58870a, H0, arrayList, zArr);
        if (c11 == null) {
            return null;
        }
        w00.l0 l0Var2 = cVar.f58877h;
        if (l0Var2 != null) {
            k20.d0 p12 = c11.p(l0Var2.getType(), k1.IN_VARIANCE);
            if (p12 == null) {
                return null;
            }
            f0 f0Var2 = new f0(H0, new e20.b(H0, p12, cVar.f58877h.getValue()), cVar.f58877h.getAnnotations());
            zArr[0] = (p12 != cVar.f58877h.getType()) | zArr[0];
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        w00.l0 l0Var3 = cVar.f58878i;
        if (l0Var3 != 0) {
            w00.l0 c12 = l0Var3.c(c11);
            if (c12 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (c12 != cVar.f58878i);
            l0Var = c12;
        } else {
            l0Var = null;
        }
        List<v0> L0 = L0(H0, cVar.f58876g, c11, cVar.f58884o, cVar.f58883n, zArr);
        if (L0 == null || (p11 = c11.p(cVar.f58879j, k1.OUT_VARIANCE)) == null) {
            return null;
        }
        zArr[0] = zArr[0] | (p11 != cVar.f58879j);
        if (zArr[0] || !cVar.f58891v) {
            H0.N0(f0Var, l0Var, arrayList, L0, p11, cVar.f58872c, cVar.f58873d);
            H0.b1(this.f58856l);
            H0.Y0(this.f58857m);
            H0.T0(this.f58858n);
            H0.a1(this.f58859o);
            H0.e1(this.f58860p);
            H0.d1(this.f58865y);
            H0.S0(this.f58861q);
            H0.R0(this.f58862t);
            H0.U0(this.f58866z);
            H0.X0(cVar.f58885p);
            H0.W0(cVar.f58888s);
            H0.V0(cVar.f58890u != null ? cVar.f58890u.booleanValue() : this.A);
            if (!cVar.f58889t.isEmpty() || this.H != null) {
                Map<a.InterfaceC0649a<?>, Object> map = cVar.f58889t;
                Map<a.InterfaceC0649a<?>, Object> map2 = this.H;
                if (map2 != null) {
                    for (Map.Entry<a.InterfaceC0649a<?>, Object> entry : map2.entrySet()) {
                        if (!map.containsKey(entry.getKey())) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (map.size() == 1) {
                    H0.H = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
                } else {
                    H0.H = map;
                }
            }
            if (cVar.f58882m || n0() != null) {
                H0.Z0((n0() != null ? n0() : this).c(c11));
            }
            if (cVar.f58881l && !d0().d().isEmpty()) {
                if (cVar.f58870a.f()) {
                    h00.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>> aVar = this.C;
                    if (aVar != null) {
                        H0.C = aVar;
                    } else {
                        H0.y0(d());
                    }
                } else {
                    H0.C = new a(c11);
                }
            }
            return H0;
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public w00.l0 J() {
        return this.f58853i;
    }

    public boolean M0() {
        return this.f58866z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public w00.l0 N() {
        return this.f58852h;
    }

    public p N0(w00.l0 l0Var, w00.l0 l0Var2, List<? extends s0> list, List<v0> list2, k20.d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar) {
        List<s0> O0;
        List<v0> O02;
        if (list == null) {
            w(5);
        }
        if (list2 == null) {
            w(6);
        }
        if (qVar == null) {
            w(7);
        }
        O0 = wz.e0.O0(list);
        this.f58849e = O0;
        O02 = wz.e0.O0(list2);
        this.f58850f = O02;
        this.f58851g = d0Var;
        this.f58854j = fVar;
        this.f58855k = qVar;
        this.f58852h = l0Var;
        this.f58853i = l0Var2;
        for (int i11 = 0; i11 < list.size(); i11++) {
            s0 s0Var = list.get(i11);
            if (s0Var.getIndex() != i11) {
                throw new IllegalStateException(s0Var + " index is " + s0Var.getIndex() + " but position is " + i11);
            }
        }
        for (int i12 = 0; i12 < list2.size(); i12++) {
            v0 v0Var = list2.get(i12);
            if (v0Var.getIndex() != i12 + 0) {
                throw new IllegalStateException(v0Var + "index is " + v0Var.getIndex() + " but position is " + i12);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c O0(d1 d1Var) {
        if (d1Var == null) {
            w(22);
        }
        return new c(this, d1Var.j(), b(), p(), getVisibility(), getKind(), h(), N(), getReturnType(), null);
    }

    public <V> void Q0(a.InterfaceC0649a<V> interfaceC0649a, Object obj) {
        if (this.H == null) {
            this.H = new LinkedHashMap();
        }
        this.H.put(interfaceC0649a, obj);
    }

    public void R0(boolean z11) {
        this.f58862t = z11;
    }

    public void S0(boolean z11) {
        this.f58861q = z11;
    }

    public void T0(boolean z11) {
        this.f58858n = z11;
    }

    public void U0(boolean z11) {
        this.f58866z = z11;
    }

    public void V0(boolean z11) {
        this.A = z11;
    }

    @Override // w00.u
    public boolean W() {
        return this.f58862t;
    }

    public void Y0(boolean z11) {
        this.f58857m = z11;
    }

    public void a1(boolean z11) {
        this.f58859o = z11;
    }

    public void b1(boolean z11) {
        this.f58856l = z11;
    }

    public boolean c0() {
        return this.A;
    }

    public void c1(k20.d0 d0Var) {
        if (d0Var == null) {
            w(10);
        }
        this.f58851g = d0Var;
    }

    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> d() {
        P0();
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> collection = this.B;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            w(12);
        }
        return collection;
    }

    public void d1(boolean z11) {
        this.f58865y = z11;
    }

    public void e1(boolean z11) {
        this.f58860p = z11;
    }

    public void f1(w00.q qVar) {
        if (qVar == null) {
            w(9);
        }
        this.f58855k = qVar;
    }

    @Override // w00.u
    public boolean g0() {
        return this.f58861q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public b.a getKind() {
        b.a aVar = this.F;
        if (aVar == null) {
            w(19);
        }
        return aVar;
    }

    public k20.d0 getReturnType() {
        return this.f58851g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public List<s0> getTypeParameters() {
        List<s0> list = this.f58849e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // w00.m, w00.u
    public w00.q getVisibility() {
        w00.q qVar = this.f58855k;
        if (qVar == null) {
            w(14);
        }
        return qVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public List<v0> h() {
        List<v0> list = this.f58850f;
        if (list == null) {
            w(17);
        }
        return list;
    }

    public boolean isExternal() {
        return this.f58858n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isInfix() {
        if (this.f58857m) {
            return true;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar : d0().d()) {
            if (eVar.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f58859o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isOperator() {
        if (this.f58856l) {
            return true;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar : d0().d()) {
            if (eVar.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f58865y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public kotlin.reflect.jvm.internal.impl.descriptors.e n0() {
        return this.G;
    }

    @Override // w00.u
    public kotlin.reflect.jvm.internal.impl.descriptors.f p() {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = this.f58854j;
        if (fVar == null) {
            w(13);
        }
        return fVar;
    }

    public <V> V p0(a.InterfaceC0649a<V> interfaceC0649a) {
        Map<a.InterfaceC0649a<?>, Object> map = this.H;
        if (map == null) {
            return null;
        }
        return (V) map.get(interfaceC0649a);
    }

    public e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> s() {
        c O0 = O0(d1.f34234b);
        if (O0 == null) {
            w(21);
        }
        return O0;
    }

    public <R, D> R v0(w00.k<R, D> kVar, D d11) {
        return kVar.l(this, d11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean x0() {
        return this.f58863w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y0(Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == 0) {
            w(15);
        }
        this.B = collection;
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (((kotlin.reflect.jvm.internal.impl.descriptors.e) it2.next()).A0()) {
                this.f58864x = true;
                return;
            }
        }
    }

    @Override // w00.p0
    public kotlin.reflect.jvm.internal.impl.descriptors.e c(d1 d1Var) {
        if (d1Var == null) {
            w(20);
        }
        return d1Var.k() ? this : O0(d1Var).j(d0()).i().I(true).build();
    }

    @Override // y00.k
    /* renamed from: a */
    public kotlin.reflect.jvm.internal.impl.descriptors.e d0() {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.E;
        kotlin.reflect.jvm.internal.impl.descriptors.e a11 = eVar == this ? this : eVar.a();
        if (a11 == null) {
            w(18);
        }
        return a11;
    }
}
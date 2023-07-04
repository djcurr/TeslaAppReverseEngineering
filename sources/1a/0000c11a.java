package y00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k20.b1;
import k20.d1;
import k20.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.s0;
import w00.v0;

/* loaded from: classes5.dex */
public class c0 extends n0 implements w00.i0 {
    private w00.k0 A;
    private boolean B;
    private w00.r C;
    private w00.r E;

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.f f58749h;

    /* renamed from: i  reason: collision with root package name */
    private w00.q f58750i;

    /* renamed from: j  reason: collision with root package name */
    private Collection<? extends w00.i0> f58751j;

    /* renamed from: k  reason: collision with root package name */
    private final w00.i0 f58752k;

    /* renamed from: l  reason: collision with root package name */
    private final b.a f58753l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f58754m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f58755n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f58756o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f58757p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f58758q;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f58759t;

    /* renamed from: w  reason: collision with root package name */
    private w00.l0 f58760w;

    /* renamed from: x  reason: collision with root package name */
    private w00.l0 f58761x;

    /* renamed from: y  reason: collision with root package name */
    private List<s0> f58762y;

    /* renamed from: z  reason: collision with root package name */
    private d0 f58763z;

    /* loaded from: classes5.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        private w00.i f58764a;

        /* renamed from: b  reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.f f58765b;

        /* renamed from: c  reason: collision with root package name */
        private w00.q f58766c;

        /* renamed from: f  reason: collision with root package name */
        private b.a f58769f;

        /* renamed from: i  reason: collision with root package name */
        private w00.l0 f58772i;

        /* renamed from: k  reason: collision with root package name */
        private u10.f f58774k;

        /* renamed from: l  reason: collision with root package name */
        private k20.d0 f58775l;

        /* renamed from: d  reason: collision with root package name */
        private w00.i0 f58767d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f58768e = false;

        /* renamed from: g  reason: collision with root package name */
        private b1 f58770g = b1.f34222a;

        /* renamed from: h  reason: collision with root package name */
        private boolean f58771h = true;

        /* renamed from: j  reason: collision with root package name */
        private List<s0> f58773j = null;

        public a() {
            this.f58764a = c0.this.b();
            this.f58765b = c0.this.p();
            this.f58766c = c0.this.getVisibility();
            this.f58769f = c0.this.getKind();
            this.f58772i = c0.this.f58760w;
            this.f58774k = c0.this.getName();
            this.f58775l = c0.this.getType();
        }

        private static /* synthetic */ void a(int i11) {
            String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 7 || i11 == 9 || i11 == 11 || i11 == 19 || i11 == 13 || i11 == 14 || i11 == 16 || i11 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 7 || i11 == 9 || i11 == 11 || i11 == 19 || i11 == 13 || i11 == 14 || i11 == 16 || i11 == 17) ? 2 : 3];
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i11 == 1) {
                objArr[1] = "setOwner";
            } else if (i11 == 2) {
                objArr[1] = "setOriginal";
            } else if (i11 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i11 == 5) {
                objArr[1] = "setReturnType";
            } else if (i11 == 7) {
                objArr[1] = "setModality";
            } else if (i11 == 9) {
                objArr[1] = "setVisibility";
            } else if (i11 == 11) {
                objArr[1] = "setKind";
            } else if (i11 == 19) {
                objArr[1] = "setName";
            } else if (i11 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i11 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i11 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i11 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 5 && i11 != 7 && i11 != 9 && i11 != 11 && i11 != 19 && i11 != 13 && i11 != 14 && i11 != 16 && i11 != 17) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public w00.i0 n() {
            return c0.this.L0(this);
        }

        w00.j0 o() {
            w00.i0 i0Var = this.f58767d;
            if (i0Var == null) {
                return null;
            }
            return i0Var.getGetter();
        }

        w00.k0 p() {
            w00.i0 i0Var = this.f58767d;
            if (i0Var == null) {
                return null;
            }
            return i0Var.getSetter();
        }

        public a q(boolean z11) {
            this.f58771h = z11;
            return this;
        }

        public a r(b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f58769f = aVar;
            return this;
        }

        public a s(kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
            if (fVar == null) {
                a(6);
            }
            this.f58765b = fVar;
            return this;
        }

        public a t(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f58767d = (w00.i0) bVar;
            return this;
        }

        public a u(w00.i iVar) {
            if (iVar == null) {
                a(0);
            }
            this.f58764a = iVar;
            return this;
        }

        public a v(b1 b1Var) {
            if (b1Var == null) {
                a(15);
            }
            this.f58770g = b1Var;
            return this;
        }

        public a w(w00.q qVar) {
            if (qVar == null) {
                a(8);
            }
            this.f58766c = qVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(w00.i iVar, w00.i0 i0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, boolean z11, u10.f fVar2, b.a aVar, w00.n0 n0Var, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        super(iVar, gVar, fVar2, null, z11, n0Var);
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
        if (aVar == null) {
            w(5);
        }
        if (n0Var == null) {
            w(6);
        }
        this.f58751j = null;
        this.f58749h = fVar;
        this.f58750i = qVar;
        this.f58752k = i0Var == null ? this : i0Var;
        this.f58753l = aVar;
        this.f58754m = z12;
        this.f58755n = z13;
        this.f58756o = z14;
        this.f58757p = z15;
        this.f58758q = z16;
        this.f58759t = z17;
    }

    public static c0 J0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, boolean z11, u10.f fVar2, b.a aVar, w00.n0 n0Var, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
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
        if (aVar == null) {
            w(12);
        }
        if (n0Var == null) {
            w(13);
        }
        return new c0(iVar, null, gVar, fVar, qVar, z11, fVar2, aVar, n0Var, z12, z13, z14, z15, z16, z17);
    }

    private w00.n0 N0(boolean z11, w00.i0 i0Var) {
        w00.n0 n0Var;
        if (z11) {
            if (i0Var == null) {
                i0Var = d0();
            }
            n0Var = i0Var.f();
        } else {
            n0Var = w00.n0.f55303a;
        }
        if (n0Var == null) {
            w(23);
        }
        return n0Var;
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.e O0(d1 d1Var, kotlin.reflect.jvm.internal.impl.descriptors.g gVar) {
        if (d1Var == null) {
            w(25);
        }
        if (gVar == null) {
            w(26);
        }
        if (gVar.n0() != null) {
            return gVar.n0().c(d1Var);
        }
        return null;
    }

    private static w00.q T0(w00.q qVar, b.a aVar) {
        return (aVar == b.a.FAKE_OVERRIDE && w00.p.g(qVar.f())) ? w00.p.f55312h : qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void w(int r11) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.c0.w(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    /* renamed from: I0 */
    public w00.i0 z0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, b.a aVar, boolean z11) {
        w00.i0 n11 = S0().u(iVar).t(null).s(fVar).w(qVar).r(aVar).q(z11).n();
        if (n11 == null) {
            w(37);
        }
        return n11;
    }

    @Override // y00.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public w00.l0 J() {
        return this.f58760w;
    }

    protected c0 K0(w00.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.f fVar, w00.q qVar, w00.i0 i0Var, b.a aVar, u10.f fVar2, w00.n0 n0Var) {
        if (iVar == null) {
            w(27);
        }
        if (fVar == null) {
            w(28);
        }
        if (qVar == null) {
            w(29);
        }
        if (aVar == null) {
            w(30);
        }
        if (fVar2 == null) {
            w(31);
        }
        if (n0Var == null) {
            w(32);
        }
        return new c0(iVar, i0Var, getAnnotations(), fVar, qVar, L(), fVar2, aVar, n0Var, s0(), isConst(), g0(), W(), isExternal(), z());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected w00.i0 L0(a aVar) {
        w00.l0 l0Var;
        f0 f0Var;
        j20.j<y10.g<?>> jVar;
        if (aVar == null) {
            w(24);
        }
        c0 K0 = K0(aVar.f58764a, aVar.f58765b, aVar.f58766c, aVar.f58767d, aVar.f58769f, aVar.f58774k, N0(aVar.f58768e, aVar.f58767d));
        List<s0> typeParameters = aVar.f58773j == null ? getTypeParameters() : aVar.f58773j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        d1 b11 = k20.q.b(typeParameters, aVar.f58770g, K0, arrayList);
        k20.d0 d0Var = aVar.f58775l;
        k1 k1Var = k1.OUT_VARIANCE;
        k20.d0 p11 = b11.p(d0Var, k1Var);
        if (p11 == null) {
            return null;
        }
        w00.l0 l0Var2 = aVar.f58772i;
        if (l0Var2 != 0) {
            l0Var = l0Var2.c(b11);
            if (l0Var == null) {
                return null;
            }
        } else {
            l0Var = null;
        }
        w00.l0 l0Var3 = this.f58761x;
        if (l0Var3 != null) {
            k20.d0 p12 = b11.p(l0Var3.getType(), k1.IN_VARIANCE);
            if (p12 == null) {
                return null;
            }
            f0Var = new f0(K0, new e20.b(K0, p12, this.f58761x.getValue()), this.f58761x.getAnnotations());
        } else {
            f0Var = null;
        }
        K0.V0(p11, arrayList, l0Var, f0Var);
        d0 d0Var2 = this.f58763z == null ? null : new d0(K0, this.f58763z.getAnnotations(), aVar.f58765b, T0(this.f58763z.getVisibility(), aVar.f58769f), this.f58763z.D(), this.f58763z.isExternal(), this.f58763z.isInline(), aVar.f58769f, aVar.o(), w00.n0.f55303a);
        if (d0Var2 != null) {
            k20.d0 returnType = this.f58763z.getReturnType();
            d0Var2.J0(O0(b11, this.f58763z));
            d0Var2.M0(returnType != null ? b11.p(returnType, k1Var) : null);
        }
        e0 e0Var = this.A == null ? null : new e0(K0, this.A.getAnnotations(), aVar.f58765b, T0(this.A.getVisibility(), aVar.f58769f), this.A.D(), this.A.isExternal(), this.A.isInline(), aVar.f58769f, aVar.p(), w00.n0.f55303a);
        if (e0Var != null) {
            List<v0> L0 = p.L0(e0Var, this.A.h(), b11, false, false, null);
            if (L0 == null) {
                K0.U0(true);
                L0 = Collections.singletonList(e0.L0(e0Var, a20.a.g(aVar.f58764a).H(), this.A.h().get(0).getAnnotations()));
            }
            if (L0.size() == 1) {
                e0Var.J0(O0(b11, this.A));
                e0Var.N0(L0.get(0));
            } else {
                throw new IllegalStateException();
            }
        }
        w00.r rVar = this.C;
        o oVar = rVar == null ? null : new o(rVar.getAnnotations(), K0);
        w00.r rVar2 = this.E;
        K0.Q0(d0Var2, e0Var, oVar, rVar2 != null ? new o(rVar2.getAnnotations(), K0) : null);
        if (aVar.f58771h) {
            s20.f b12 = s20.f.b();
            for (w00.i0 i0Var : d()) {
                b12.add(i0Var.c(b11));
            }
            K0.y0(b12);
        }
        if (isConst() && (jVar = this.f58847g) != null) {
            K0.G0(jVar);
        }
        return K0;
    }

    @Override // w00.i0
    /* renamed from: M0 */
    public d0 getGetter() {
        return this.f58763z;
    }

    @Override // y00.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public w00.l0 N() {
        return this.f58761x;
    }

    @Override // w00.i0
    public w00.r O() {
        return this.E;
    }

    public void P0(d0 d0Var, w00.k0 k0Var) {
        Q0(d0Var, k0Var, null, null);
    }

    public void Q0(d0 d0Var, w00.k0 k0Var, w00.r rVar, w00.r rVar2) {
        this.f58763z = d0Var;
        this.A = k0Var;
        this.C = rVar;
        this.E = rVar2;
    }

    public boolean R0() {
        return this.B;
    }

    public a S0() {
        return new a();
    }

    public void U0(boolean z11) {
        this.B = z11;
    }

    public void V0(k20.d0 d0Var, List<? extends s0> list, w00.l0 l0Var, w00.l0 l0Var2) {
        if (d0Var == null) {
            w(14);
        }
        if (list == null) {
            w(15);
        }
        F0(d0Var);
        this.f58762y = new ArrayList(list);
        this.f58761x = l0Var2;
        this.f58760w = l0Var;
    }

    @Override // w00.u
    public boolean W() {
        return this.f58757p;
    }

    public void W0(w00.q qVar) {
        if (qVar == null) {
            w(16);
        }
        this.f58750i = qVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public Collection<? extends w00.i0> d() {
        Collection<? extends w00.i0> collection = this.f58751j;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            w(36);
        }
        return collection;
    }

    @Override // w00.u
    public boolean g0() {
        return this.f58756o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public b.a getKind() {
        b.a aVar = this.f58753l;
        if (aVar == null) {
            w(34);
        }
        return aVar;
    }

    @Override // y00.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public k20.d0 getReturnType() {
        k20.d0 type = getType();
        if (type == null) {
            w(18);
        }
        return type;
    }

    @Override // w00.i0
    public w00.k0 getSetter() {
        return this.A;
    }

    @Override // y00.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public List<s0> getTypeParameters() {
        List<s0> list = this.f58762y;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + toString());
    }

    @Override // w00.m, w00.u
    public w00.q getVisibility() {
        w00.q qVar = this.f58750i;
        if (qVar == null) {
            w(20);
        }
        return qVar;
    }

    public boolean isConst() {
        return this.f58755n;
    }

    public boolean isExternal() {
        return this.f58758q;
    }

    @Override // w00.u
    public kotlin.reflect.jvm.internal.impl.descriptors.f p() {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = this.f58749h;
        if (fVar == null) {
            w(19);
        }
        return fVar;
    }

    @Override // w00.i0
    public w00.r r0() {
        return this.C;
    }

    @Override // w00.w0
    public boolean s0() {
        return this.f58754m;
    }

    @Override // w00.i0
    public List<kotlin.reflect.jvm.internal.impl.descriptors.g> u() {
        ArrayList arrayList = new ArrayList(2);
        d0 d0Var = this.f58763z;
        if (d0Var != null) {
            arrayList.add(d0Var);
        }
        w00.k0 k0Var = this.A;
        if (k0Var != null) {
            arrayList.add(k0Var);
        }
        return arrayList;
    }

    @Override // w00.i
    public <R, D> R v0(w00.k<R, D> kVar, D d11) {
        return kVar.i(this, d11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b
    public void y0(Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == 0) {
            w(35);
        }
        this.f58751j = collection;
    }

    @Override // w00.x0
    public boolean z() {
        return this.f58759t;
    }

    @Override // w00.p0
    /* renamed from: c */
    public kotlin.reflect.jvm.internal.impl.descriptors.a c2(d1 d1Var) {
        if (d1Var == null) {
            w(22);
        }
        return d1Var.k() ? this : S0().v(d1Var.j()).t(d0()).n();
    }

    @Override // y00.k
    /* renamed from: a */
    public w00.i0 d0() {
        w00.i0 i0Var = this.f58752k;
        w00.i0 a11 = i0Var == this ? this : i0Var.a();
        if (a11 == null) {
            w(33);
        }
        return a11;
    }
}
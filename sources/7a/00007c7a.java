package k0;

import c1.n1;
import c1.s1;
import l0.a1;
import v20.o0;
import vz.b0;

/* loaded from: classes.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", l = {862}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a1<i> f34061b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c1.o0<Boolean> f34062c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k0.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0630a extends kotlin.jvm.internal.u implements h00.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a1<i> f34063a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0630a(a1<i> a1Var) {
                super(0);
                this.f34063a = a1Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h00.a
            /* renamed from: invoke */
            public final Boolean mo11invoke() {
                i g11 = this.f34063a.g();
                i iVar = i.Visible;
                return Boolean.valueOf(g11 == iVar || this.f34063a.m() == iVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements kotlinx.coroutines.flow.f<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c1.o0 f34064a;

            public b(c1.o0 o0Var) {
                this.f34064a = o0Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Boolean bool, zz.d<? super b0> dVar) {
                this.f34064a.setValue(kotlin.coroutines.jvm.internal.b.a(bool.booleanValue()));
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a1<i> a1Var, c1.o0<Boolean> o0Var, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f34061b = a1Var;
            this.f34062c = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f34061b, this.f34062c, dVar);
        }

        @Override // h00.p
        public final Object mo160invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f34060a;
            if (i11 == 0) {
                vz.r.b(obj);
                kotlinx.coroutines.flow.e n11 = n1.n(new C0630a(this.f34061b));
                b bVar = new b(this.f34062c);
                this.f34060a = 1;
                if (n11.collect(bVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a1<T> f34065a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<T, Boolean> f34066b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f34067c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f34068d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f34069e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.q<k0.d, c1.i, Integer, b0> f34070f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34071g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(a1<T> a1Var, h00.l<? super T, Boolean> lVar, o1.f fVar, k kVar, m mVar, h00.q<? super k0.d, ? super c1.i, ? super Integer, b0> qVar, int i11) {
            super(2);
            this.f34065a = a1Var;
            this.f34066b = lVar;
            this.f34067c = fVar;
            this.f34068d = kVar;
            this.f34069e = mVar;
            this.f34070f = qVar;
            this.f34071g = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            c.a(this.f34065a, this.f34066b, this.f34067c, this.f34068d, this.f34069e, this.f34070f, iVar, this.f34071g | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0631c extends kotlin.jvm.internal.u implements h00.l<Boolean, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0631c f34072a = new C0631c();

        C0631c() {
            super(1);
        }

        public final Boolean a(boolean z11) {
            return Boolean.valueOf(z11);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean mo12invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f34073a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f34074b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f34075c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f34076d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f34077e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.q<k0.d, c1.i, Integer, b0> f34078f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34079g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f34080h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z11, o1.f fVar, k kVar, m mVar, String str, h00.q<? super k0.d, ? super c1.i, ? super Integer, b0> qVar, int i11, int i12) {
            super(2);
            this.f34073a = z11;
            this.f34074b = fVar;
            this.f34075c = kVar;
            this.f34076d = mVar;
            this.f34077e = str;
            this.f34078f = qVar;
            this.f34079g = i11;
            this.f34080h = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            c.c(this.f34073a, this.f34074b, this.f34075c, this.f34076d, this.f34077e, this.f34078f, iVar, this.f34079g | 1, this.f34080h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<Boolean, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f34081a = new e();

        e() {
            super(1);
        }

        public final Boolean a(boolean z11) {
            return Boolean.valueOf(z11);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean mo12invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0.i f34082a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f34083b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1.f f34084c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f34085d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f34086e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f34087f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h00.q<k0.d, c1.i, Integer, b0> f34088g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f34089h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f34090i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(p0.i iVar, boolean z11, o1.f fVar, k kVar, m mVar, String str, h00.q<? super k0.d, ? super c1.i, ? super Integer, b0> qVar, int i11, int i12) {
            super(2);
            this.f34082a = iVar;
            this.f34083b = z11;
            this.f34084c = fVar;
            this.f34085d = kVar;
            this.f34086e = mVar;
            this.f34087f = str;
            this.f34088g = qVar;
            this.f34089h = i11;
            this.f34090i = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            c.b(this.f34082a, this.f34083b, this.f34084c, this.f34085d, this.f34086e, this.f34087f, this.f34088g, iVar, this.f34089h | 1, this.f34090i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void a(l0.a1<T> r18, h00.l<? super T, java.lang.Boolean> r19, o1.f r20, k0.k r21, k0.m r22, h00.q<? super k0.d, ? super c1.i, ? super java.lang.Integer, vz.b0> r23, c1.i r24, int r25) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.c.a(l0.a1, h00.l, o1.f, k0.k, k0.m, h00.q, c1.i, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(p0.i r24, boolean r25, o1.f r26, k0.k r27, k0.m r28, java.lang.String r29, h00.q<? super k0.d, ? super c1.i, ? super java.lang.Integer, vz.b0> r30, c1.i r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.c.b(p0.i, boolean, o1.f, k0.k, k0.m, java.lang.String, h00.q, c1.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(boolean r23, o1.f r24, k0.k r25, k0.m r26, java.lang.String r27, h00.q<? super k0.d, ? super c1.i, ? super java.lang.Integer, vz.b0> r28, c1.i r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.c.c(boolean, o1.f, k0.k, k0.m, java.lang.String, h00.q, c1.i, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> i e(a1<T> a1Var, h00.l<? super T, Boolean> lVar, T t11, c1.i iVar, int i11) {
        i iVar2;
        iVar.x(-721837653);
        iVar.C(-721837546, a1Var);
        if (a1Var.q()) {
            if (lVar.mo12invoke(t11).booleanValue()) {
                iVar2 = i.Visible;
            } else if (lVar.mo12invoke(a1Var.g()).booleanValue()) {
                iVar2 = i.PostExit;
            } else {
                iVar2 = i.PreEnter;
            }
        } else {
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = s1.d(Boolean.FALSE, null, 2, null);
                iVar.p(y11);
            }
            iVar.N();
            c1.o0 o0Var = (c1.o0) y11;
            if (lVar.mo12invoke(a1Var.g()).booleanValue()) {
                o0Var.setValue(Boolean.TRUE);
            }
            if (lVar.mo12invoke(t11).booleanValue()) {
                iVar2 = i.Visible;
            } else if (((Boolean) o0Var.getValue()).booleanValue()) {
                iVar2 = i.PostExit;
            } else {
                iVar2 = i.PreEnter;
            }
        }
        iVar.M();
        iVar.N();
        return iVar2;
    }
}
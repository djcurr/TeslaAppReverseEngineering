package p0;

import f2.v0;

/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<v0, x2.b, f2.a0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f2.z f45275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.q<f, c1.i, Integer, vz.b0> f45276b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f45277c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p0.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0965a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.q<f, c1.i, Integer, vz.b0> f45278a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f45279b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f45280c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0965a(h00.q<? super f, ? super c1.i, ? super Integer, vz.b0> qVar, g gVar, int i11) {
                super(2);
                this.f45278a = qVar;
                this.f45279b = gVar;
                this.f45280c = i11;
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return vz.b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                } else {
                    this.f45278a.invoke(this.f45279b, iVar, Integer.valueOf((this.f45280c >> 6) & 112));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(f2.z zVar, h00.q<? super f, ? super c1.i, ? super Integer, vz.b0> qVar, int i11) {
            super(2);
            this.f45275a = zVar;
            this.f45276b = qVar;
            this.f45277c = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ f2.a0 invoke(v0 v0Var, x2.b bVar) {
            return m1091invoke0kLqBqw(v0Var, bVar.s());
        }

        /* renamed from: invoke-0kLqBqw  reason: not valid java name */
        public final f2.a0 m1091invoke0kLqBqw(v0 SubcomposeLayout, long j11) {
            kotlin.jvm.internal.s.g(SubcomposeLayout, "$this$SubcomposeLayout");
            return this.f45275a.b(SubcomposeLayout, SubcomposeLayout.F(vz.b0.f54756a, j1.c.c(-985531317, true, new C0965a(this.f45276b, new g(SubcomposeLayout, j11, null), this.f45277c))), j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f45281a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.a f45282b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f45283c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.q<f, c1.i, Integer, vz.b0> f45284d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45285e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f45286f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(o1.f fVar, o1.a aVar, boolean z11, h00.q<? super f, ? super c1.i, ? super Integer, vz.b0> qVar, int i11, int i12) {
            super(2);
            this.f45281a = fVar;
            this.f45282b = aVar;
            this.f45283c = z11;
            this.f45284d = qVar;
            this.f45285e = i11;
            this.f45286f = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            e.a(this.f45281a, this.f45282b, this.f45283c, this.f45284d, iVar, this.f45285e | 1, this.f45286f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(o1.f r11, o1.a r12, boolean r13, h00.q<? super p0.f, ? super c1.i, ? super java.lang.Integer, vz.b0> r14, c1.i r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.e.a(o1.f, o1.a, boolean, h00.q, c1.i, int, int):void");
    }
}
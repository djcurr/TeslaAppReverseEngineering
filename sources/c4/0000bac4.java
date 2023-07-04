package w0;

import java.util.List;
import java.util.Map;
import n2.a;

/* loaded from: classes.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<n2.w, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f54845a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(n2.w wVar) {
            invoke2(wVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(n2.w it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f54846a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f54847b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n2.a0 f54848c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.l<n2.w, vz.b0> f54849d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f54850e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f54851f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f54852g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f54853h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f54854i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, o1.f fVar, n2.a0 a0Var, h00.l<? super n2.w, vz.b0> lVar, int i11, boolean z11, int i12, int i13, int i14) {
            super(2);
            this.f54846a = str;
            this.f54847b = fVar;
            this.f54848c = a0Var;
            this.f54849d = lVar;
            this.f54850e = i11;
            this.f54851f = z11;
            this.f54852g = i12;
            this.f54853h = i13;
            this.f54854i = i14;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            c.b(this.f54846a, this.f54847b, this.f54848c, this.f54849d, this.f54850e, this.f54851f, this.f54852g, iVar, this.f54853h | 1, this.f54854i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1241c extends kotlin.jvm.internal.u implements h00.l<n2.w, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1241c f54855a = new C1241c();

        C1241c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(n2.w wVar) {
            invoke2(wVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(n2.w it2) {
            kotlin.jvm.internal.s.g(it2, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n2.a f54856a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<a.b<h00.q<String, c1.i, Integer, vz.b0>>> f54857b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f54858c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n2.a aVar, List<a.b<h00.q<String, c1.i, Integer, vz.b0>>> list, int i11) {
            super(2);
            this.f54856a = aVar;
            this.f54857b = list;
            this.f54858c = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                w0.h.a(this.f54856a, this.f54857b, iVar, (this.f54858c & 14) | 64);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n2.a f54859a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f54860b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n2.a0 f54861c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.l<n2.w, vz.b0> f54862d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f54863e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f54864f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f54865g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Map<String, l> f54866h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f54867i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f54868j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(n2.a aVar, o1.f fVar, n2.a0 a0Var, h00.l<? super n2.w, vz.b0> lVar, int i11, boolean z11, int i12, Map<String, l> map, int i13, int i14) {
            super(2);
            this.f54859a = aVar;
            this.f54860b = fVar;
            this.f54861c = a0Var;
            this.f54862d = lVar;
            this.f54863e = i11;
            this.f54864f = z11;
            this.f54865g = i12;
            this.f54866h = map;
            this.f54867i = i13;
            this.f54868j = i14;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            c.a(this.f54859a, this.f54860b, this.f54861c, this.f54862d, this.f54863e, this.f54864f, this.f54865g, this.f54866h, iVar, this.f54867i | 1, this.f54868j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x0.o f54869a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(x0.o oVar) {
            super(0);
            this.f54869a = oVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        /* renamed from: invoke */
        public final Long mo11invoke() {
            x0.o oVar = this.f54869a;
            return Long.valueOf(oVar == null ? 0L : oVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x0.o f54870a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(x0.o oVar) {
            super(0);
            this.f54870a = oVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        /* renamed from: invoke */
        public final Long mo11invoke() {
            x0.o oVar = this.f54870a;
            return Long.valueOf(oVar == null ? 0L : oVar.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.u implements h00.a<h2.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a f54871a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(h00.a aVar) {
            super(0);
            this.f54871a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, h2.a] */
        @Override // h00.a
        /* renamed from: invoke */
        public final h2.a mo11invoke() {
            return this.f54871a.mo11invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.u implements h00.p<l1.k, Long, Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x0.o f54872a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(x0.o oVar) {
            super(2);
            this.f54872a = oVar;
        }

        public final Long a(l1.k Saver, long j11) {
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            if (x0.p.b(this.f54872a, j11)) {
                return Long.valueOf(j11);
            }
            return null;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Long mo160invoke(l1.k kVar, Long l11) {
            return a(kVar, l11.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.u implements h00.l<Long, Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f54873a = new j();

        j() {
            super(1);
        }

        public final Long a(long j11) {
            return Long.valueOf(j11);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Long mo12invoke(Long l11) {
            return a(l11.longValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(n2.a r34, o1.f r35, n2.a0 r36, h00.l<? super n2.w, vz.b0> r37, int r38, boolean r39, int r40, java.util.Map<java.lang.String, w0.l> r41, c1.i r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.c.a(n2.a, o1.f, n2.a0, h00.l, int, boolean, int, java.util.Map, c1.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r28, o1.f r29, n2.a0 r30, h00.l<? super n2.w, vz.b0> r31, int r32, boolean r33, int r34, c1.i r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.c.b(java.lang.String, o1.f, n2.a0, h00.l, int, boolean, int, c1.i, int, int):void");
    }

    private static final l1.i<Long, Long> c(x0.o oVar) {
        return l1.j.a(new i(oVar), j.f54873a);
    }
}
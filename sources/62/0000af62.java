package r0;

import f2.a0;
import f2.v0;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends u implements h00.p<v0, x2.b, a0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f48876a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f48877b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f48878c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, p pVar, r rVar) {
            super(2);
            this.f48876a = cVar;
            this.f48877b = pVar;
            this.f48878c = rVar;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ a0 mo160invoke(v0 v0Var, x2.b bVar) {
            return m1098invoke0kLqBqw(v0Var, bVar.s());
        }

        /* renamed from: invoke-0kLqBqw  reason: not valid java name */
        public final a0 m1098invoke0kLqBqw(v0 SubcomposeLayout, long j11) {
            kotlin.jvm.internal.s.g(SubcomposeLayout, "$this$SubcomposeLayout");
            this.f48876a.e(SubcomposeLayout, j11);
            k kVar = new k(this.f48877b.b().mo11invoke(), this.f48876a, SubcomposeLayout);
            h a11 = this.f48878c.a(SubcomposeLayout, kVar, j11);
            i d11 = this.f48877b.d();
            if (d11 != null) {
                d11.a(a11, kVar);
            }
            this.f48877b.c().setValue(a11);
            this.f48877b.h(a11);
            return a11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<f> f48879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f48880b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f48881c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l f48882d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r f48883e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f48884f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f48885g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h00.a<? extends f> aVar, o1.f fVar, p pVar, l lVar, r rVar, int i11, int i12) {
            super(2);
            this.f48879a = aVar;
            this.f48880b = fVar;
            this.f48881c = pVar;
            this.f48882d = lVar;
            this.f48883e = rVar;
            this.f48884f = i11;
            this.f48885g = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            g.a(this.f48879a, this.f48880b, this.f48881c, this.f48882d, this.f48883e, iVar, this.f48884f | 1, this.f48885g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(h00.a<? extends r0.f> r15, o1.f r16, r0.p r17, r0.l r18, r0.r r19, c1.i r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.g.a(h00.a, o1.f, r0.p, r0.l, r0.r, c1.i, int, int):void");
    }
}
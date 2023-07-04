package x1;

import androidx.compose.ui.platform.l0;
import java.util.Map;
import t1.a0;
import vz.b0;
import x1.n;

/* loaded from: classes.dex */
public final class s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f56882a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map<String, n> f56883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q qVar, Map<String, ? extends n> map) {
            super(2);
            this.f56882a = qVar;
            this.f56883b = map;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                s.a((o) this.f56882a, this.f56883b, iVar, 64, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f56884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map<String, n> f56885b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f56886c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f56887d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(o oVar, Map<String, ? extends n> map, int i11, int i12) {
            super(2);
            this.f56884a = oVar;
            this.f56885b = map;
            this.f56886c = i11;
            this.f56887d = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            s.a(this.f56884a, this.f56885b, iVar, this.f56886c | 1, this.f56887d);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements n {
        c() {
        }

        @Override // x1.n
        public <T> T a(u<T> uVar, T t11) {
            return (T) n.a.a(this, uVar, t11);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements n {
        d() {
        }

        @Override // x1.n
        public <T> T a(u<T> uVar, T t11) {
            return (T) n.a.a(this, uVar, t11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f56888a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f56889b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f56890c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(r rVar, long j11, int i11) {
            super(0);
            this.f56888a = rVar;
            this.f56889b = j11;
            this.f56890c = i11;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo11invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f56888a.r(!a0.n(this.f56889b, a0.f51365b.f()) ? t1.b0.f51384b.a(this.f56889b, this.f56890c) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.r<Float, Float, c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x1.c f56891a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(x1.c cVar) {
            super(4);
            this.f56891a = cVar;
        }

        public final void a(float f11, float f12, c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                s.a(this.f56891a.d(), null, iVar, 0, 2);
            }
        }

        @Override // h00.r
        public /* bridge */ /* synthetic */ b0 invoke(Float f11, Float f12, c1.i iVar, Integer num) {
            a(f11.floatValue(), f12.floatValue(), iVar, num.intValue());
            return b0.f54756a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(x1.o r23, java.util.Map<java.lang.String, ? extends x1.n> r24, c1.i r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.s.a(x1.o, java.util.Map, c1.i, int, int):void");
    }

    public static final r b(x1.c image, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(image, "image");
        iVar.x(-1998939043);
        r c11 = c(image.b(), image.a(), image.h(), image.g(), image.c(), image.f(), image.e(), j1.c.b(iVar, -819890981, true, new f(image)), iVar, 12582912, 0);
        iVar.N();
        return c11;
    }

    public static final r c(float f11, float f12, float f13, float f14, String str, long j11, int i11, h00.r<? super Float, ? super Float, ? super c1.i, ? super Integer, b0> content, c1.i iVar, int i12, int i13) {
        kotlin.jvm.internal.s.g(content, "content");
        iVar.x(-1998940692);
        float f15 = (i13 & 4) != 0 ? Float.NaN : f13;
        float f16 = (i13 & 8) == 0 ? f14 : Float.NaN;
        String str2 = (i13 & 16) != 0 ? "VectorRootGroup" : str;
        long f17 = (i13 & 32) != 0 ? a0.f51365b.f() : j11;
        int z11 = (i13 & 64) != 0 ? t1.p.f51470a.z() : i11;
        x2.d dVar = (x2.d) iVar.A(l0.d());
        float i02 = dVar.i0(f11);
        float i03 = dVar.i0(f12);
        if (Float.isNaN(f15)) {
            f15 = i02;
        }
        if (Float.isNaN(f16)) {
            f16 = i03;
        }
        iVar.x(-1998939971);
        iVar.x(-3687241);
        Object y11 = iVar.y();
        if (y11 == c1.i.f8486a.a()) {
            y11 = new r();
            iVar.p(y11);
        }
        iVar.N();
        r rVar = (r) y11;
        rVar.s(s1.m.a(i02, i03));
        int i14 = i12 >> 12;
        rVar.k(str2, f15, f16, content, iVar, 32768 | (i14 & 14) | (i14 & 7168));
        iVar.N();
        c1.b0.h(new e(rVar, f17, z11), iVar, 0);
        iVar.N();
        return rVar;
    }
}
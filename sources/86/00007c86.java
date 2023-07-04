package k0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import l0.d1;
import l0.f1;
import t1.a0;
import t1.c0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final h00.l<u1.c, d1<t1.a0, l0.o>> f34096a = a.f34099a;

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f34097b = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f34098c = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<u1.c, d1<t1.a0, l0.o>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34099a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k0.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0632a extends kotlin.jvm.internal.u implements h00.l<t1.a0, l0.o> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0632a f34100a = new C0632a();

            C0632a() {
                super(1);
            }

            public final l0.o a(long j11) {
                long j12 = t1.a0.j(j11, u1.e.f52899a.g());
                float s11 = t1.a0.s(j12);
                float r11 = t1.a0.r(j12);
                float p11 = t1.a0.p(j12);
                double d11 = 0.33333334f;
                return new l0.o(t1.a0.o(j11), (float) Math.pow(g.e(0, s11, r11, p11, g.f34097b), d11), (float) Math.pow(g.e(1, s11, r11, p11, g.f34097b), d11), (float) Math.pow(g.e(2, s11, r11, p11, g.f34097b), d11));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ l0.o invoke(t1.a0 a0Var) {
                return a(a0Var.v());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<l0.o, t1.a0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ u1.c f34101a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(u1.c cVar) {
                super(1);
                this.f34101a = cVar;
            }

            public final long a(l0.o it2) {
                float l11;
                float l12;
                float l13;
                float l14;
                kotlin.jvm.internal.s.g(it2, "it");
                double d11 = 3.0f;
                float pow = (float) Math.pow(it2.g(), d11);
                float pow2 = (float) Math.pow(it2.h(), d11);
                float pow3 = (float) Math.pow(it2.i(), d11);
                float e11 = g.e(0, pow, pow2, pow3, g.f34098c);
                float e12 = g.e(1, pow, pow2, pow3, g.f34098c);
                float e13 = g.e(2, pow, pow2, pow3, g.f34098c);
                l11 = m00.l.l(it2.f(), BitmapDescriptorFactory.HUE_RED, 1.0f);
                l12 = m00.l.l(e11, -2.0f, 2.0f);
                l13 = m00.l.l(e12, -2.0f, 2.0f);
                l14 = m00.l.l(e13, -2.0f, 2.0f);
                return t1.a0.j(c0.a(l12, l13, l14, l11, u1.e.f52899a.g()), this.f34101a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ t1.a0 invoke(l0.o oVar) {
                return t1.a0.h(a(oVar));
            }
        }

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final d1<t1.a0, l0.o> invoke(u1.c colorSpace) {
            kotlin.jvm.internal.s.g(colorSpace, "colorSpace");
            return f1.a(C0632a.f34100a, new b(colorSpace));
        }
    }

    public static final h00.l<u1.c, d1<t1.a0, l0.o>> d(a0.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f34096a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(int i11, float f11, float f12, float f13, float[] fArr) {
        return (f11 * fArr[i11]) + (f12 * fArr[i11 + 3]) + (f13 * fArr[i11 + 6]);
    }
}
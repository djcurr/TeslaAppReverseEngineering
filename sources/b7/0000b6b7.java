package u1;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import u1.b;

/* loaded from: classes.dex */
public class f {

    /* renamed from: d  reason: collision with root package name */
    public static final a f52925d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final c f52926a;

    /* renamed from: b  reason: collision with root package name */
    private final c f52927b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f52928c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: u1.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1191a extends f {
            C1191a(c cVar, int i11) {
                super(cVar, cVar, i11, null);
            }

            @Override // u1.f
            public float[] a(float[] v11) {
                s.g(v11, "v");
                return v11;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(c cVar, c cVar2, int i11) {
            if (j.e(i11, j.f52942a.a())) {
                long f11 = cVar.f();
                b.a aVar = u1.b.f52891a;
                boolean e11 = u1.b.e(f11, aVar.b());
                boolean e12 = u1.b.e(cVar2.f(), aVar.b());
                if (e11 && e12) {
                    return null;
                }
                if (e11 || e12) {
                    if (!e11) {
                        cVar = cVar2;
                    }
                    k kVar = (k) cVar;
                    float[] c11 = e11 ? kVar.r().c() : g.f52932a.c();
                    float[] c12 = e12 ? kVar.r().c() : g.f52932a.c();
                    return new float[]{c11[0] / c12[0], c11[1] / c12[1], c11[2] / c12[2]};
                }
                return null;
            }
            return null;
        }

        public final f c(c source) {
            s.g(source, "source");
            return new C1191a(source, j.f52942a.c());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: e  reason: collision with root package name */
        private final k f52929e;

        /* renamed from: f  reason: collision with root package name */
        private final k f52930f;

        /* renamed from: g  reason: collision with root package name */
        private final float[] f52931g;

        private b(k kVar, k kVar2, int i11) {
            super(kVar, kVar2, kVar, kVar2, i11, null, null);
            this.f52929e = kVar;
            this.f52930f = kVar2;
            this.f52931g = b(kVar, kVar2, i11);
        }

        public /* synthetic */ b(k kVar, k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, kVar2, i11);
        }

        private final float[] b(k kVar, k kVar2, int i11) {
            if (d.f(kVar.r(), kVar2.r())) {
                return d.k(kVar2.n(), kVar.q());
            }
            float[] q11 = kVar.q();
            float[] n11 = kVar2.n();
            float[] c11 = kVar.r().c();
            float[] c12 = kVar2.r().c();
            m r11 = kVar.r();
            g gVar = g.f52932a;
            if (!d.f(r11, gVar.b())) {
                float[] c13 = u1.a.f52887b.a().c();
                float[] c14 = gVar.c();
                float[] copyOf = Arrays.copyOf(c14, c14.length);
                s.f(copyOf, "copyOf(this, size)");
                q11 = d.k(d.e(c13, c11, copyOf), kVar.q());
            }
            if (!d.f(kVar2.r(), gVar.b())) {
                float[] c15 = u1.a.f52887b.a().c();
                float[] c16 = gVar.c();
                float[] copyOf2 = Arrays.copyOf(c16, c16.length);
                s.f(copyOf2, "copyOf(this, size)");
                n11 = d.j(d.k(d.e(c15, c12, copyOf2), kVar2.q()));
            }
            if (j.e(i11, j.f52942a.a())) {
                q11 = d.l(new float[]{c11[0] / c12[0], c11[1] / c12[1], c11[2] / c12[2]}, q11);
            }
            return d.k(n11, q11);
        }

        @Override // u1.f
        public float[] a(float[] v11) {
            s.g(v11, "v");
            v11[0] = (float) this.f52929e.l().invoke(Double.valueOf(v11[0])).doubleValue();
            v11[1] = (float) this.f52929e.l().invoke(Double.valueOf(v11[1])).doubleValue();
            v11[2] = (float) this.f52929e.l().invoke(Double.valueOf(v11[2])).doubleValue();
            d.m(this.f52931g, v11);
            v11[0] = (float) this.f52930f.o().invoke(Double.valueOf(v11[0])).doubleValue();
            v11[1] = (float) this.f52930f.o().invoke(Double.valueOf(v11[1])).doubleValue();
            v11[2] = (float) this.f52930f.o().invoke(Double.valueOf(v11[2])).doubleValue();
            return v11;
        }
    }

    public /* synthetic */ f(c cVar, c cVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, i11);
    }

    private f(c cVar, c cVar2, c cVar3, c cVar4, int i11, float[] fArr) {
        this.f52926a = cVar3;
        this.f52927b = cVar4;
        this.f52928c = fArr;
    }

    public /* synthetic */ f(c cVar, c cVar2, c cVar3, c cVar4, int i11, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, cVar3, cVar4, i11, fArr);
    }

    public float[] a(float[] v11) {
        s.g(v11, "v");
        float[] i11 = this.f52926a.i(v11);
        float[] fArr = this.f52928c;
        if (fArr != null) {
            i11[0] = i11[0] * fArr[0];
            i11[1] = i11[1] * fArr[1];
            i11[2] = i11[2] * fArr[2];
        }
        return this.f52927b.a(i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private f(u1.c r13, u1.c r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.f()
            u1.b$a r2 = u1.b.f52891a
            long r3 = r2.b()
            boolean r0 = u1.b.e(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L1e
            u1.g r0 = u1.g.f52932a
            u1.m r0 = r0.b()
            u1.c r0 = u1.d.d(r13, r0, r3, r1, r3)
            r7 = r0
            goto L1f
        L1e:
            r7 = r13
        L1f:
            long r4 = r14.f()
            long r8 = r2.b()
            boolean r0 = u1.b.e(r4, r8)
            if (r0 == 0) goto L39
            u1.g r0 = u1.g.f52932a
            u1.m r0 = r0.b()
            u1.c r0 = u1.d.d(r14, r0, r3, r1, r3)
            r8 = r0
            goto L3a
        L39:
            r8 = r14
        L3a:
            u1.f$a r0 = u1.f.f52925d
            float[] r10 = u1.f.a.a(r0, r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.f.<init>(u1.c, u1.c, int):void");
    }
}
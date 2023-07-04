package w0;

import c1.n1;
import c1.s1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: f  reason: collision with root package name */
    public static final c f55185f = new c(null);

    /* renamed from: g  reason: collision with root package name */
    private static final l1.i<q0, Object> f55186g = l1.a.a(a.f55192a, b.f55193a);

    /* renamed from: a  reason: collision with root package name */
    private final c1.o0 f55187a;

    /* renamed from: b  reason: collision with root package name */
    private final c1.o0 f55188b;

    /* renamed from: c  reason: collision with root package name */
    private s1.h f55189c;

    /* renamed from: d  reason: collision with root package name */
    private long f55190d;

    /* renamed from: e  reason: collision with root package name */
    private final c1.o0 f55191e;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<l1.k, q0, List<? extends Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55192a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final List<Object> invoke(l1.k listSaver, q0 it2) {
            List<Object> l11;
            kotlin.jvm.internal.s.g(listSaver, "$this$listSaver");
            kotlin.jvm.internal.s.g(it2, "it");
            Object[] objArr = new Object[2];
            objArr[0] = Float.valueOf(it2.d());
            objArr[1] = Boolean.valueOf(it2.f() == androidx.compose.foundation.gestures.a.Vertical);
            l11 = wz.w.l(objArr);
            return l11;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<List<? extends Object>, q0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f55193a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final q0 invoke(List<? extends Object> restored) {
            kotlin.jvm.internal.s.g(restored, "restored");
            return new q0(((Boolean) restored.get(1)).booleanValue() ? androidx.compose.foundation.gestures.a.Vertical : androidx.compose.foundation.gestures.a.Horizontal, ((Float) restored.get(0)).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l1.i<q0, Object> a() {
            return q0.f55186g;
        }
    }

    public q0(androidx.compose.foundation.gestures.a initialOrientation, float f11) {
        c1.o0 d11;
        c1.o0 d12;
        kotlin.jvm.internal.s.g(initialOrientation, "initialOrientation");
        d11 = s1.d(Float.valueOf(f11), null, 2, null);
        this.f55187a = d11;
        d12 = s1.d(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), null, 2, null);
        this.f55188b = d12;
        this.f55189c = s1.h.f49955e.a();
        this.f55190d = n2.y.f40417b.a();
        this.f55191e = n1.f(initialOrientation, n1.o());
    }

    private final void b(float f11, float f12, int i11) {
        float d11 = d();
        float f13 = i11 + d11;
        if (f11 < d11) {
            i(d() - (d11 - f11));
        } else if (f12 > f13) {
            i(d() + (f12 - f13));
        }
    }

    private final void h(float f11) {
        this.f55188b.setValue(Float.valueOf(f11));
    }

    public final float c() {
        return ((Number) this.f55188b.getValue()).floatValue();
    }

    public final float d() {
        return ((Number) this.f55187a.getValue()).floatValue();
    }

    public final int e(long j11) {
        return n2.y.n(j11) != n2.y.n(g()) ? n2.y.n(j11) : n2.y.i(j11) != n2.y.i(g()) ? n2.y.i(j11) : n2.y.l(j11);
    }

    public final androidx.compose.foundation.gestures.a f() {
        return (androidx.compose.foundation.gestures.a) this.f55191e.getValue();
    }

    public final long g() {
        return this.f55190d;
    }

    public final void i(float f11) {
        this.f55187a.setValue(Float.valueOf(f11));
    }

    public final void j(long j11) {
        this.f55190d = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        if ((r6.l() == r4.f55189c.l()) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(androidx.compose.foundation.gestures.a r5, s1.h r6, int r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.s.g(r5, r0)
            java.lang.String r0 = "cursorRect"
            kotlin.jvm.internal.s.g(r6, r0)
            int r8 = r8 - r7
            float r8 = (float) r8
            r4.h(r8)
            float r0 = r6.i()
            s1.h r1 = r4.f55189c
            float r1 = r1.i()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L21
            r0 = r1
            goto L22
        L21:
            r0 = r2
        L22:
            if (r0 == 0) goto L37
            float r0 = r6.l()
            s1.h r3 = r4.f55189c
            float r3 = r3.l()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L34
            r0 = r1
            goto L35
        L34:
            r0 = r2
        L35:
            if (r0 != 0) goto L58
        L37:
            androidx.compose.foundation.gestures.a r0 = androidx.compose.foundation.gestures.a.Vertical
            if (r5 != r0) goto L3c
            goto L3d
        L3c:
            r1 = r2
        L3d:
            if (r1 == 0) goto L44
            float r5 = r6.l()
            goto L48
        L44:
            float r5 = r6.i()
        L48:
            if (r1 == 0) goto L4f
            float r0 = r6.e()
            goto L53
        L4f:
            float r0 = r6.j()
        L53:
            r4.b(r5, r0, r7)
            r4.f55189c = r6
        L58:
            float r5 = r4.d()
            r6 = 0
            float r5 = m00.j.l(r5, r6, r8)
            r4.i(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.q0.k(androidx.compose.foundation.gestures.a, s1.h, int, int):void");
    }

    public /* synthetic */ q0(androidx.compose.foundation.gestures.a aVar, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i11 & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f11);
    }

    public q0() {
        this(androidx.compose.foundation.gestures.a.Vertical, BitmapDescriptorFactory.HUE_RED, 2, null);
    }
}
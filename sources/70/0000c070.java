package y0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public static final f1 f58111a = new f1();

    /* renamed from: b  reason: collision with root package name */
    private static final float f58112b = x2.g.f(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f58114b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f58115c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f58116d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f58117e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f58118f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o1.f fVar, float f11, long j11, int i11, int i12) {
            super(2);
            this.f58114b = fVar;
            this.f58115c = f11;
            this.f58116d = j11;
            this.f58117e = i11;
            this.f58118f = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            f1.this.a(this.f58114b, this.f58115c, this.f58116d, iVar, this.f58117e | 1, this.f58118f);
        }
    }

    static {
        x2.g.f(2);
        x2.g.f(52);
    }

    private f1() {
    }

    public final void a(o1.f fVar, float f11, long j11, c1.i iVar, int i11, int i12) {
        Object obj;
        int i13;
        float f12;
        long j12;
        o1.f fVar2;
        float f13;
        long l11;
        float f14;
        int i14;
        c1.i h11 = iVar.h(-2003284722);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            obj = fVar;
        } else if ((i11 & 14) == 0) {
            obj = fVar;
            i13 = (h11.O(obj) ? 4 : 2) | i11;
        } else {
            obj = fVar;
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            if ((i12 & 2) == 0) {
                f12 = f11;
                if (h11.b(f12)) {
                    i14 = 32;
                    i13 |= i14;
                }
            } else {
                f12 = f11;
            }
            i14 = 16;
            i13 |= i14;
        } else {
            f12 = f11;
        }
        if ((i11 & 896) == 0) {
            j12 = j11;
            i13 |= ((i12 & 4) == 0 && h11.e(j12)) ? 256 : 128;
        } else {
            j12 = j11;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i13 |= h11.O(this) ? 2048 : 1024;
        }
        if (((i13 & 5851) ^ 1170) == 0 && h11.i()) {
            h11.G();
            f14 = f12;
            l11 = j12;
        } else {
            h11.B();
            if ((i11 & 1) != 0 && !h11.J()) {
                h11.G();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                fVar2 = obj;
                f13 = f12;
            } else {
                fVar2 = i15 != 0 ? o1.f.f42062f1 : obj;
                if ((i12 & 2) != 0) {
                    f13 = b();
                    i13 &= -113;
                } else {
                    f13 = f12;
                }
                if ((i12 & 4) != 0) {
                    l11 = t1.a0.l(((t1.a0) h11.A(p.a())).v(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i13 &= -897;
                    h11.r();
                    w.a(fVar2, l11, f13, BitmapDescriptorFactory.HUE_RED, h11, (i13 & 14) | ((i13 >> 3) & 112) | ((i13 << 3) & 896), 8);
                    f14 = f13;
                    obj = fVar2;
                }
            }
            l11 = j12;
            h11.r();
            w.a(fVar2, l11, f13, BitmapDescriptorFactory.HUE_RED, h11, (i13 & 14) | ((i13 >> 3) & 112) | ((i13 << 3) & 896), 8);
            f14 = f13;
            obj = fVar2;
        }
        c1.e1 l12 = h11.l();
        if (l12 == null) {
            return;
        }
        l12.a(new a(obj, f14, l11, i11, i12));
    }

    public final float b() {
        return f58112b;
    }
}
package y0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    public static final i1 f58144a = new i1();

    /* renamed from: b  reason: collision with root package name */
    private static final float f58145b = x2.g.f(56);

    /* renamed from: c  reason: collision with root package name */
    private static final float f58146c = x2.g.f(280);

    private i1() {
    }

    public final float a() {
        return f58145b;
    }

    public final float b() {
        return f58146c;
    }

    public final g1 c(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, c1.i iVar, int i11, int i12, int i13, int i14) {
        iVar.x(137434936);
        long l11 = (i14 & 1) != 0 ? t1.a0.l(((t1.a0) iVar.A(p.a())).v(), ((Number) iVar.A(o.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j11;
        long l12 = (i14 & 2) != 0 ? t1.a0.l(l11, n.f58482a.b(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j12;
        long l13 = (i14 & 4) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j13;
        long j34 = (i14 & 8) != 0 ? h0.f58131a.a(iVar, 6).j() : j14;
        long d11 = (i14 & 16) != 0 ? h0.f58131a.a(iVar, 6).d() : j15;
        long l14 = (i14 & 32) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).j(), n.f58482a.c(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j16;
        long l15 = (i14 & 64) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).i(), 0.42f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j17;
        long l16 = (i14 & 128) != 0 ? t1.a0.l(l15, n.f58482a.b(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j18;
        long d12 = (i14 & 256) != 0 ? h0.f58131a.a(iVar, 6).d() : j19;
        long l17 = (i14 & 512) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).i(), 0.54f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j21;
        long l18 = (i14 & 1024) != 0 ? t1.a0.l(l17, n.f58482a.b(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j22;
        long j35 = (i14 & 2048) != 0 ? l17 : j23;
        long l19 = (i14 & 4096) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).i(), 0.54f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j24;
        long l21 = (i14 & PKIFailureInfo.certRevoked) != 0 ? t1.a0.l(l19, n.f58482a.b(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j25;
        long d13 = (i14 & 16384) != 0 ? h0.f58131a.a(iVar, 6).d() : j26;
        long l22 = (32768 & i14) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).j(), n.f58482a.c(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j27;
        long l23 = (65536 & i14) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).i(), n.f58482a.d(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j28;
        long l24 = (131072 & i14) != 0 ? t1.a0.l(l23, n.f58482a.b(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j29;
        long d14 = (262144 & i14) != 0 ? h0.f58131a.a(iVar, 6).d() : j31;
        long l25 = (524288 & i14) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).i(), n.f58482a.d(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j32;
        v vVar = new v(l11, l12, j34, d11, l14, l15, d12, l16, l17, l18, j35, l19, l21, d13, l13, l22, l23, l24, d14, l25, (i14 & PKIFailureInfo.badCertTemplate) != 0 ? t1.a0.l(l25, n.f58482a.b(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j33, null);
        iVar.N();
        return vVar;
    }
}
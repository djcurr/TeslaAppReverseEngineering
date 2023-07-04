package u1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f52899a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f52900b;

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f52901c;

    /* renamed from: d  reason: collision with root package name */
    private static final l f52902d;

    /* renamed from: e  reason: collision with root package name */
    private static final l f52903e;

    /* renamed from: f  reason: collision with root package name */
    private static final k f52904f;

    /* renamed from: g  reason: collision with root package name */
    private static final k f52905g;

    /* renamed from: h  reason: collision with root package name */
    private static final k f52906h;

    /* renamed from: i  reason: collision with root package name */
    private static final k f52907i;

    /* renamed from: j  reason: collision with root package name */
    private static final k f52908j;

    /* renamed from: k  reason: collision with root package name */
    private static final k f52909k;

    /* renamed from: l  reason: collision with root package name */
    private static final k f52910l;

    /* renamed from: m  reason: collision with root package name */
    private static final k f52911m;

    /* renamed from: n  reason: collision with root package name */
    private static final k f52912n;

    /* renamed from: o  reason: collision with root package name */
    private static final k f52913o;

    /* renamed from: p  reason: collision with root package name */
    private static final k f52914p;

    /* renamed from: q  reason: collision with root package name */
    private static final k f52915q;

    /* renamed from: r  reason: collision with root package name */
    private static final k f52916r;

    /* renamed from: s  reason: collision with root package name */
    private static final k f52917s;

    /* renamed from: t  reason: collision with root package name */
    private static final c f52918t;

    /* renamed from: u  reason: collision with root package name */
    private static final c f52919u;

    /* renamed from: v  reason: collision with root package name */
    private static final k f52920v;

    /* renamed from: w  reason: collision with root package name */
    private static final c f52921w;

    /* renamed from: x  reason: collision with root package name */
    private static final c[] f52922x;

    /* loaded from: classes.dex */
    static final class a extends u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f52923a = new a();

        a() {
            super(1);
        }

        public final Double a(double d11) {
            return Double.valueOf(d.a(d11, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends u implements h00.l<Double, Double> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f52924a = new b();

        b() {
            super(1);
        }

        public final Double a(double d11) {
            return Double.valueOf(d.b(d11, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f52900b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f52901c = fArr2;
        l lVar = new l(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f52902d = lVar;
        l lVar2 = new l(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f52903e = lVar2;
        g gVar = g.f52932a;
        k kVar = new k("sRGB IEC61966-2.1", fArr, gVar.e(), lVar, 0);
        f52904f = kVar;
        k kVar2 = new k("sRGB IEC61966-2.1 (Linear)", fArr, gVar.e(), 1.0d, BitmapDescriptorFactory.HUE_RED, 1.0f, 1);
        f52905g = kVar2;
        k kVar3 = new k("scRGB-nl IEC 61966-2-2:2003", fArr, gVar.e(), null, a.f52923a, b.f52924a, -0.799f, 2.399f, lVar, 2);
        f52906h = kVar3;
        k kVar4 = new k("scRGB IEC 61966-2-2:2003", fArr, gVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f52907i = kVar4;
        k kVar5 = new k("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, gVar.e(), new l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f52908j = kVar5;
        k kVar6 = new k("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, gVar.e(), new l(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f52909k = kVar6;
        k kVar7 = new k("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new m(0.314f, 0.351f), 2.6d, BitmapDescriptorFactory.HUE_RED, 1.0f, 6);
        f52910l = kVar7;
        k kVar8 = new k("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, gVar.e(), lVar, 7);
        f52911m = kVar8;
        k kVar9 = new k("NTSC (1953)", fArr2, gVar.a(), new l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f52912n = kVar9;
        k kVar10 = new k("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, gVar.e(), new l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f52913o = kVar10;
        k kVar11 = new k("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, gVar.e(), 2.2d, BitmapDescriptorFactory.HUE_RED, 1.0f, 10);
        f52914p = kVar11;
        k kVar12 = new k("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, gVar.b(), new l(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f52915q = kVar12;
        k kVar13 = new k("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0E-4f, -0.077f}, gVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f52916r = kVar13;
        k kVar14 = new k("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, gVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f52917s = kVar14;
        n nVar = new n("Generic XYZ", 14);
        f52918t = nVar;
        h hVar = new h("Generic L*a*b*", 15);
        f52919u = hVar;
        k kVar15 = new k("None", fArr, gVar.e(), lVar2, 16);
        f52920v = kVar15;
        i iVar = new i("Oklab", 17);
        f52921w = iVar;
        f52922x = new c[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, nVar, hVar, kVar15, iVar};
    }

    private e() {
    }

    public final k a() {
        return f52916r;
    }

    public final k b() {
        return f52917s;
    }

    public final k c() {
        return f52914p;
    }

    public final k d() {
        return f52909k;
    }

    public final k e() {
        return f52908j;
    }

    public final c f() {
        return f52919u;
    }

    public final c g() {
        return f52918t;
    }

    public final c[] h() {
        return f52922x;
    }

    public final k i() {
        return f52910l;
    }

    public final k j() {
        return f52911m;
    }

    public final k k() {
        return f52906h;
    }

    public final k l() {
        return f52907i;
    }

    public final k m() {
        return f52905g;
    }

    public final k n() {
        return f52912n;
    }

    public final float[] o() {
        return f52901c;
    }

    public final c p() {
        return f52921w;
    }

    public final k q() {
        return f52915q;
    }

    public final k r() {
        return f52913o;
    }

    public final k s() {
        return f52904f;
    }

    public final float[] t() {
        return f52900b;
    }

    public final k u() {
        return f52920v;
    }
}
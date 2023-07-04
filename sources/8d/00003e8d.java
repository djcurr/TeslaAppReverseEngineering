package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: p  reason: collision with root package name */
    static final h f17591p = new h();

    /* renamed from: a  reason: collision with root package name */
    final double f17592a;

    /* renamed from: b  reason: collision with root package name */
    final String f17593b;

    /* renamed from: c  reason: collision with root package name */
    final h0 f17594c;

    /* renamed from: d  reason: collision with root package name */
    final ReadableMap f17595d;

    /* renamed from: e  reason: collision with root package name */
    j0 f17596e;

    /* renamed from: f  reason: collision with root package name */
    int f17597f;

    /* renamed from: g  reason: collision with root package name */
    final String f17598g;

    /* renamed from: h  reason: collision with root package name */
    final String f17599h;

    /* renamed from: i  reason: collision with root package name */
    final i0 f17600i;

    /* renamed from: j  reason: collision with root package name */
    final k0 f17601j;

    /* renamed from: k  reason: collision with root package name */
    private final l0 f17602k;

    /* renamed from: l  reason: collision with root package name */
    final double f17603l;

    /* renamed from: m  reason: collision with root package name */
    final double f17604m;

    /* renamed from: n  reason: collision with root package name */
    final double f17605n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f17606o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final j0[] f17607a;

        /* renamed from: b  reason: collision with root package name */
        private static final int[] f17608b;

        static {
            j0 j0Var = j0.w100;
            j0 j0Var2 = j0.w900;
            f17607a = new j0[]{j0Var, j0Var, j0.w200, j0.w300, j0.Normal, j0.w500, j0.w600, j0.Bold, j0.w800, j0Var2, j0Var2};
            f17608b = new int[]{400, 700, 100, 200, 300, 400, 500, 600, 700, 800, 900};
        }

        private static int a(int i11) {
            if (i11 < 350) {
                return 400;
            }
            if (i11 < 550) {
                return 700;
            }
            if (i11 < 900) {
                return 900;
            }
            return i11;
        }

        static int b(j0 j0Var, h hVar) {
            if (j0Var == j0.Bolder) {
                return a(hVar.f17597f);
            }
            if (j0Var == j0.Lighter) {
                return c(hVar.f17597f);
            }
            return f17608b[j0Var.ordinal()];
        }

        private static int c(int i11) {
            if (i11 < 100) {
                return i11;
            }
            if (i11 < 550) {
                return 100;
            }
            return i11 < 750 ? 400 : 700;
        }

        static j0 d(int i11) {
            return f17607a[Math.round(i11 / 100.0f)];
        }
    }

    private h() {
        this.f17595d = null;
        this.f17593b = "";
        this.f17594c = h0.normal;
        this.f17596e = j0.Normal;
        this.f17597f = 400;
        this.f17598g = "";
        this.f17599h = "";
        this.f17600i = i0.normal;
        this.f17601j = k0.start;
        this.f17602k = l0.None;
        this.f17606o = false;
        this.f17603l = 0.0d;
        this.f17592a = 12.0d;
        this.f17604m = 0.0d;
        this.f17605n = 0.0d;
    }

    private void a(h hVar, double d11) {
        long round = Math.round(d11);
        if (round >= 1 && round <= 1000) {
            int i11 = (int) round;
            this.f17597f = i11;
            this.f17596e = a.d(i11);
            return;
        }
        b(hVar);
    }

    private void b(h hVar) {
        this.f17597f = hVar.f17597f;
        this.f17596e = hVar.f17596e;
    }

    private double c(ReadableMap readableMap, String str, double d11, double d12, double d13) {
        if (readableMap.getType(str) == ReadableType.Number) {
            return readableMap.getDouble(str);
        }
        return x.b(readableMap.getString(str), d13, d11, d12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ReadableMap readableMap, h hVar, double d11) {
        double d12 = hVar.f17592a;
        if (readableMap.hasKey("fontSize")) {
            this.f17592a = c(readableMap, "fontSize", 1.0d, d12, d12);
        } else {
            this.f17592a = d12;
        }
        if (readableMap.hasKey("fontWeight")) {
            if (readableMap.getType("fontWeight") == ReadableType.Number) {
                a(hVar, readableMap.getDouble("fontWeight"));
            } else {
                String string = readableMap.getString("fontWeight");
                if (j0.hasEnum(string)) {
                    int b11 = a.b(j0.get(string), hVar);
                    this.f17597f = b11;
                    this.f17596e = a.d(b11);
                } else if (string != null) {
                    a(hVar, Double.parseDouble(string));
                } else {
                    b(hVar);
                }
            }
        } else {
            b(hVar);
        }
        this.f17595d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : hVar.f17595d;
        this.f17593b = readableMap.hasKey("fontFamily") ? readableMap.getString("fontFamily") : hVar.f17593b;
        this.f17594c = readableMap.hasKey("fontStyle") ? h0.valueOf(readableMap.getString("fontStyle")) : hVar.f17594c;
        this.f17598g = readableMap.hasKey("fontFeatureSettings") ? readableMap.getString("fontFeatureSettings") : hVar.f17598g;
        this.f17599h = readableMap.hasKey("fontVariationSettings") ? readableMap.getString("fontVariationSettings") : hVar.f17599h;
        this.f17600i = readableMap.hasKey("fontVariantLigatures") ? i0.valueOf(readableMap.getString("fontVariantLigatures")) : hVar.f17600i;
        this.f17601j = readableMap.hasKey("textAnchor") ? k0.valueOf(readableMap.getString("textAnchor")) : hVar.f17601j;
        this.f17602k = readableMap.hasKey("textDecoration") ? l0.getEnum(readableMap.getString("textDecoration")) : hVar.f17602k;
        boolean hasKey = readableMap.hasKey("kerning");
        this.f17606o = hasKey || hVar.f17606o;
        this.f17603l = hasKey ? c(readableMap, "kerning", d11, this.f17592a, 0.0d) : hVar.f17603l;
        this.f17604m = readableMap.hasKey("wordSpacing") ? c(readableMap, "wordSpacing", d11, this.f17592a, 0.0d) : hVar.f17604m;
        this.f17605n = readableMap.hasKey("letterSpacing") ? c(readableMap, "letterSpacing", d11, this.f17592a, 0.0d) : hVar.f17605n;
    }
}
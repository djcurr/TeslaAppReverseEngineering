package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class t {

    /* renamed from: a  reason: collision with root package name */
    static float f17706a;

    /* renamed from: b  reason: collision with root package name */
    private static int f17707b;

    /* renamed from: c  reason: collision with root package name */
    private static int f17708c;

    /* renamed from: d  reason: collision with root package name */
    private static String f17709d;

    /* renamed from: e  reason: collision with root package name */
    private static Path f17710e;

    /* renamed from: f  reason: collision with root package name */
    static ArrayList<s> f17711f;

    /* renamed from: g  reason: collision with root package name */
    private static float f17712g;

    /* renamed from: h  reason: collision with root package name */
    private static float f17713h;

    /* renamed from: i  reason: collision with root package name */
    private static float f17714i;

    /* renamed from: j  reason: collision with root package name */
    private static float f17715j;

    /* renamed from: k  reason: collision with root package name */
    private static float f17716k;

    /* renamed from: l  reason: collision with root package name */
    private static float f17717l;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f17718m;

    private static void A(float f11, float f12, float f13, float f14) {
        f17714i = f11;
        f17715j = f12;
        e((f17712g * 2.0f) - f17714i, (f17713h * 2.0f) - f17715j, f11, f12, f13, f14);
    }

    private static void B(float f11, float f12) {
        C(f11 + f17712g, f12 + f17713h);
    }

    private static void C(float f11, float f12) {
        u((f17712g * 2.0f) - f17714i, (f17713h * 2.0f) - f17715j, f11, f12);
    }

    private static void a(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        b(f11, f12, f13, z11, z12, f14 + f17712g, f15 + f17713h);
    }

    private static void b(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        float f16;
        float f17;
        float f18;
        float f19;
        float f21;
        float f22;
        float f23 = f17712g;
        float f24 = f17713h;
        float abs = Math.abs(f12 == BitmapDescriptorFactory.HUE_RED ? f11 == BitmapDescriptorFactory.HUE_RED ? f15 - f24 : f11 : f12);
        float abs2 = Math.abs(f11 == BitmapDescriptorFactory.HUE_RED ? f14 - f23 : f11);
        if (abs2 != BitmapDescriptorFactory.HUE_RED && abs != BitmapDescriptorFactory.HUE_RED && (f14 != f23 || f15 != f24)) {
            float radians = (float) Math.toRadians(f13);
            double d11 = radians;
            float cos = (float) Math.cos(d11);
            float sin = (float) Math.sin(d11);
            float f25 = f14 - f23;
            float f26 = f15 - f24;
            float f27 = ((cos * f25) / 2.0f) + ((sin * f26) / 2.0f);
            float f28 = -sin;
            float f29 = ((f28 * f25) / 2.0f) + ((cos * f26) / 2.0f);
            float f31 = abs2 * abs2;
            float f32 = abs * abs * f27 * f27;
            if ((((f31 * abs) * abs) - ((f31 * f29) * f29)) - f32 < BitmapDescriptorFactory.HUE_RED) {
                f19 = f28;
                float sqrt = (float) Math.sqrt(1.0f - (f18 / f16));
                abs2 *= sqrt;
                abs *= sqrt;
                f21 = f25 / 2.0f;
                f22 = f26 / 2.0f;
            } else {
                f19 = f28;
                float sqrt2 = (float) Math.sqrt(f18 / (f17 + f32));
                if (z11 == z12) {
                    sqrt2 = -sqrt2;
                }
                float f33 = (((-sqrt2) * f29) * abs2) / abs;
                float f34 = ((sqrt2 * f27) * abs) / abs2;
                f21 = ((cos * f33) - (sin * f34)) + (f25 / 2.0f);
                f22 = (f26 / 2.0f) + (f33 * sin) + (f34 * cos);
            }
            float f35 = cos / abs2;
            float f36 = sin / abs2;
            float f37 = f19 / abs;
            float f38 = cos / abs;
            float f39 = -f21;
            float f41 = -f22;
            float f42 = abs;
            float f43 = abs2;
            float atan2 = (float) Math.atan2((f37 * f39) + (f38 * f41), (f39 * f35) + (f41 * f36));
            float f44 = f25 - f21;
            float f45 = f26 - f22;
            float atan22 = (float) Math.atan2((f37 * f44) + (f38 * f45), (f35 * f44) + (f36 * f45));
            float f46 = f21 + f23;
            float f47 = f22 + f24;
            float f48 = f25 + f23;
            float f49 = f26 + f24;
            w();
            f17714i = f48;
            f17712g = f48;
            f17715j = f49;
            f17713h = f49;
            if (f43 == f42 && radians == BitmapDescriptorFactory.HUE_RED) {
                float degrees = (float) Math.toDegrees(atan2);
                float abs3 = Math.abs((degrees - ((float) Math.toDegrees(atan22))) % 360.0f);
                if (!z11 ? abs3 > 180.0f : abs3 < 180.0f) {
                    abs3 = 360.0f - abs3;
                }
                if (!z12) {
                    abs3 = -abs3;
                }
                float f51 = f17706a;
                f17710e.arcTo(new RectF((f46 - f43) * f51, (f47 - f43) * f51, (f46 + f43) * f51, (f47 + f43) * f51), degrees, abs3);
                f17711f.add(new s(f.kCGPathElementAddCurveToPoint, new w[]{new w(f48, f49)}));
                return;
            }
            c(f46, f47, f43, f42, atan2, atan22, z12, radians);
            return;
        }
        l(f14, f15);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[LOOP:0: B:12:0x0065->B:13:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(float r24, float r25, float r26, float r27, float r28, float r29, boolean r30, float r31) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.t.c(float, float, float, float, float, float, boolean, float):void");
    }

    private static void d() {
        if (f17718m) {
            f17712g = f17716k;
            f17713h = f17717l;
            f17718m = false;
            f17710e.close();
            f17711f.add(new s(f.kCGPathElementCloseSubpath, new w[]{new w(f17712g, f17713h)}));
        }
    }

    private static void e(float f11, float f12, float f13, float f14, float f15, float f16) {
        w();
        f17712g = f15;
        f17713h = f16;
        Path path = f17710e;
        float f17 = f17706a;
        path.cubicTo(f11 * f17, f12 * f17, f13 * f17, f14 * f17, f15 * f17, f16 * f17);
        f17711f.add(new s(f.kCGPathElementAddCurveToPoint, new w[]{new w(f11, f12), new w(f13, f14), new w(f15, f16)}));
    }

    private static void f(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f17712g;
        float f18 = f17713h;
        g(f11 + f17, f12 + f18, f13 + f17, f14 + f18, f15 + f17, f16 + f18);
    }

    private static void g(float f11, float f12, float f13, float f14, float f15, float f16) {
        f17714i = f13;
        f17715j = f14;
        e(f11, f12, f13, f14, f15, f16);
    }

    private static boolean h(char c11) {
        return Character.isUpperCase(c11);
    }

    private static boolean i(char c11) {
        switch (c11) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean j(char c11) {
        return (c11 >= '0' && c11 <= '9') || c11 == '.' || c11 == '-' || c11 == '+';
    }

    private static void k(float f11, float f12) {
        l(f11 + f17712g, f12 + f17713h);
    }

    private static void l(float f11, float f12) {
        w();
        f17712g = f11;
        f17714i = f11;
        f17713h = f12;
        f17715j = f12;
        Path path = f17710e;
        float f13 = f17706a;
        path.lineTo(f11 * f13, f13 * f12);
        f17711f.add(new s(f.kCGPathElementAddLineToPoint, new w[]{new w(f11, f12)}));
    }

    private static void m(float f11, float f12) {
        n(f11 + f17712g, f12 + f17713h);
    }

    private static void n(float f11, float f12) {
        f17712g = f11;
        f17714i = f11;
        f17716k = f11;
        f17713h = f12;
        f17715j = f12;
        f17717l = f12;
        Path path = f17710e;
        float f13 = f17706a;
        path.moveTo(f11 * f13, f13 * f12);
        f17711f.add(new s(f.kCGPathElementMoveToPoint, new w[]{new w(f11, f12)}));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Path o(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.t.o(java.lang.String):android.graphics.Path");
    }

    private static boolean p() {
        y();
        char charAt = f17709d.charAt(f17707b);
        if (charAt != '0' && charAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(f17707b), f17709d));
        }
        int i11 = f17707b + 1;
        f17707b = i11;
        if (i11 < f17708c && f17709d.charAt(i11) == ',') {
            f17707b++;
        }
        y();
        return charAt == '1';
    }

    private static float q() {
        if (f17707b != f17708c) {
            float s11 = s();
            y();
            r();
            return s11;
        }
        throw new Error(String.format("Unexpected end (s=%s)", f17709d));
    }

    private static void r() {
        int i11 = f17707b;
        if (i11 >= f17708c || f17709d.charAt(i11) != ',') {
            return;
        }
        f17707b++;
    }

    private static float s() {
        char charAt;
        y();
        int i11 = f17707b;
        if (i11 != f17708c) {
            char charAt2 = f17709d.charAt(i11);
            if (charAt2 == '-' || charAt2 == '+') {
                int i12 = f17707b + 1;
                f17707b = i12;
                charAt2 = f17709d.charAt(i12);
            }
            if (charAt2 >= '0' && charAt2 <= '9') {
                x();
                int i13 = f17707b;
                if (i13 < f17708c) {
                    charAt2 = f17709d.charAt(i13);
                }
            } else if (charAt2 != '.') {
                throw new Error(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt2), Integer.valueOf(f17707b), f17709d));
            }
            if (charAt2 == '.') {
                f17707b++;
                x();
                int i14 = f17707b;
                if (i14 < f17708c) {
                    charAt2 = f17709d.charAt(i14);
                }
            }
            if (charAt2 == 'e' || charAt2 == 'E') {
                int i15 = f17707b;
                if (i15 + 1 < f17708c && (charAt = f17709d.charAt(i15 + 1)) != 'm' && charAt != 'x') {
                    int i16 = f17707b + 1;
                    f17707b = i16;
                    char charAt3 = f17709d.charAt(i16);
                    if (charAt3 == '+' || charAt3 == '-') {
                        f17707b++;
                        x();
                    } else if (charAt3 >= '0' && charAt3 <= '9') {
                        x();
                    } else {
                        throw new Error(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt3), Integer.valueOf(f17707b), f17709d));
                    }
                }
            }
            String substring = f17709d.substring(i11, f17707b);
            float parseFloat = Float.parseFloat(substring);
            if (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat)) {
                throw new Error(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", substring, Integer.valueOf(i11), Integer.valueOf(f17707b), f17709d));
            }
            return parseFloat;
        }
        throw new Error(String.format("Unexpected end (s=%s)", f17709d));
    }

    private static void t(float f11, float f12, float f13, float f14) {
        float f15 = f17712g;
        float f16 = f17713h;
        u(f11 + f15, f12 + f16, f13 + f15, f14 + f16);
    }

    private static void u(float f11, float f12, float f13, float f14) {
        f17714i = f11;
        f17715j = f12;
        float f15 = f11 * 2.0f;
        float f16 = f12 * 2.0f;
        float f17 = (f17712g + f15) / 3.0f;
        float f18 = (f17713h + f16) / 3.0f;
        e(f17, f18, (f13 + f15) / 3.0f, (f14 + f16) / 3.0f, f13, f14);
    }

    private static double v(double d11) {
        double pow = Math.pow(10.0d, 4.0d);
        return Math.round(d11 * pow) / pow;
    }

    private static void w() {
        if (f17718m) {
            return;
        }
        f17716k = f17712g;
        f17717l = f17713h;
        f17718m = true;
    }

    private static void x() {
        while (true) {
            int i11 = f17707b;
            if (i11 >= f17708c || !Character.isDigit(f17709d.charAt(i11))) {
                return;
            }
            f17707b++;
        }
    }

    private static void y() {
        while (true) {
            int i11 = f17707b;
            if (i11 >= f17708c || !Character.isWhitespace(f17709d.charAt(i11))) {
                return;
            }
            f17707b++;
        }
    }

    private static void z(float f11, float f12, float f13, float f14) {
        float f15 = f17712g;
        float f16 = f17713h;
        A(f11 + f15, f12 + f16, f13 + f15, f14 + f16);
    }
}
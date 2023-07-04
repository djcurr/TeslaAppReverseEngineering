package m3;

import android.graphics.Path;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f38368a;

        /* renamed from: b  reason: collision with root package name */
        boolean f38369b;

        a() {
        }
    }

    private static void a(ArrayList<b> arrayList, char c11, float[] fArr) {
        arrayList.add(new b(c11, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            if (bVarArr[i11].f38370a != bVarArr2[i11].f38370a || bVarArr[i11].f38371b.length != bVarArr2[i11].f38371b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i11, int i12) {
        if (i11 <= i12) {
            int length = fArr.length;
            if (i11 >= 0 && i11 <= length) {
                int i13 = i12 - i11;
                int min = Math.min(i13, length - i11);
                float[] fArr2 = new float[i13];
                System.arraycopy(fArr, i11, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        int i12 = 0;
        while (i11 < str.length()) {
            int i13 = i(str, i11);
            String trim = str.substring(i12, i13).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), h(trim));
            }
            i12 = i13;
            i11 = i13 + 1;
        }
        if (i11 - i12 == 1 && i12 < str.length()) {
            a(arrayList, str.charAt(i12), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] d11 = d(str);
        if (d11 != null) {
            try {
                b.e(d11, path);
                return path;
            } catch (RuntimeException e11) {
                throw new RuntimeException("Error in parsing " + str, e11);
            }
        }
        return null;
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            bVarArr2[i11] = new b(bVarArr[i11]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[LOOP:0: B:3:0x0007->B:24:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(java.lang.String r8, int r9, m3.c.a r10) {
        /*
            r0 = 0
            r10.f38369b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L37
        L27:
            r10.f38369b = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.f38369b = r7
            goto L35
        L31:
            r2 = r0
            goto L37
        L33:
            r2 = r7
            goto L37
        L35:
            r2 = r0
            r4 = r7
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.f38368a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.c.g(java.lang.String, int, m3.c$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i11 = 1;
            int i12 = 0;
            while (i11 < length) {
                g(str, i11, aVar);
                int i13 = aVar.f38368a;
                if (i11 < i13) {
                    fArr[i12] = Float.parseFloat(str.substring(i11, i13));
                    i12++;
                }
                i11 = aVar.f38369b ? i13 : i13 + 1;
            }
            return c(fArr, 0, i12);
        } catch (NumberFormatException e11) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e11);
        }
    }

    private static int i(String str, int i11) {
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i11;
            }
            i11++;
        }
        return i11;
    }

    public static void j(b[] bVarArr, b[] bVarArr2) {
        for (int i11 = 0; i11 < bVarArr2.length; i11++) {
            bVarArr[i11].f38370a = bVarArr2[i11].f38370a;
            for (int i12 = 0; i12 < bVarArr2[i11].f38371b.length; i12++) {
                bVarArr[i11].f38371b[i12] = bVarArr2[i11].f38371b[i12];
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public char f38370a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f38371b;

        b(char c11, float[] fArr) {
            this.f38370a = c11;
            this.f38371b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c11, char c12, float[] fArr2) {
            int i11;
            int i12;
            int i13;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            char c13 = c12;
            char c14 = 0;
            float f19 = fArr[0];
            float f21 = fArr[1];
            float f22 = fArr[2];
            float f23 = fArr[3];
            float f24 = fArr[4];
            float f25 = fArr[5];
            switch (c13) {
                case 'A':
                case 'a':
                    i11 = 7;
                    i12 = i11;
                    break;
                case 'C':
                case 'c':
                    i11 = 6;
                    i12 = i11;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i12 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i12 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i12 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f24, f25);
                    f19 = f24;
                    f22 = f19;
                    f21 = f25;
                    f23 = f21;
                    i12 = 2;
                    break;
            }
            float f26 = f19;
            float f27 = f21;
            float f28 = f24;
            float f29 = f25;
            int i14 = 0;
            char c15 = c11;
            while (i14 < fArr2.length) {
                if (c13 != 'A') {
                    if (c13 == 'C') {
                        i13 = i14;
                        int i15 = i13 + 2;
                        int i16 = i13 + 3;
                        int i17 = i13 + 4;
                        int i18 = i13 + 5;
                        path.cubicTo(fArr2[i13 + 0], fArr2[i13 + 1], fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
                        f26 = fArr2[i17];
                        float f31 = fArr2[i18];
                        float f32 = fArr2[i15];
                        float f33 = fArr2[i16];
                        f27 = f31;
                        f23 = f33;
                        f22 = f32;
                    } else if (c13 == 'H') {
                        i13 = i14;
                        int i19 = i13 + 0;
                        path.lineTo(fArr2[i19], f27);
                        f26 = fArr2[i19];
                    } else if (c13 == 'Q') {
                        i13 = i14;
                        int i21 = i13 + 0;
                        int i22 = i13 + 1;
                        int i23 = i13 + 2;
                        int i24 = i13 + 3;
                        path.quadTo(fArr2[i21], fArr2[i22], fArr2[i23], fArr2[i24]);
                        float f34 = fArr2[i21];
                        float f35 = fArr2[i22];
                        f26 = fArr2[i23];
                        f27 = fArr2[i24];
                        f22 = f34;
                        f23 = f35;
                    } else if (c13 == 'V') {
                        i13 = i14;
                        int i25 = i13 + 0;
                        path.lineTo(f26, fArr2[i25]);
                        f27 = fArr2[i25];
                    } else if (c13 != 'a') {
                        if (c13 != 'c') {
                            if (c13 == 'h') {
                                int i26 = i14 + 0;
                                path.rLineTo(fArr2[i26], BitmapDescriptorFactory.HUE_RED);
                                f26 += fArr2[i26];
                            } else if (c13 != 'q') {
                                if (c13 == 'v') {
                                    int i27 = i14 + 0;
                                    path.rLineTo(BitmapDescriptorFactory.HUE_RED, fArr2[i27]);
                                    f14 = fArr2[i27];
                                } else if (c13 == 'L') {
                                    int i28 = i14 + 0;
                                    int i29 = i14 + 1;
                                    path.lineTo(fArr2[i28], fArr2[i29]);
                                    f26 = fArr2[i28];
                                    f27 = fArr2[i29];
                                } else if (c13 == 'M') {
                                    int i31 = i14 + 0;
                                    f26 = fArr2[i31];
                                    int i32 = i14 + 1;
                                    f27 = fArr2[i32];
                                    if (i14 > 0) {
                                        path.lineTo(fArr2[i31], fArr2[i32]);
                                    } else {
                                        path.moveTo(fArr2[i31], fArr2[i32]);
                                        i13 = i14;
                                        f29 = f27;
                                        f28 = f26;
                                    }
                                } else if (c13 == 'S') {
                                    if (c15 == 'c' || c15 == 's' || c15 == 'C' || c15 == 'S') {
                                        f26 = (f26 * 2.0f) - f22;
                                        f27 = (f27 * 2.0f) - f23;
                                    }
                                    float f36 = f27;
                                    int i33 = i14 + 0;
                                    int i34 = i14 + 1;
                                    int i35 = i14 + 2;
                                    int i36 = i14 + 3;
                                    path.cubicTo(f26, f36, fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                    f11 = fArr2[i33];
                                    f12 = fArr2[i34];
                                    f26 = fArr2[i35];
                                    f27 = fArr2[i36];
                                    f22 = f11;
                                    f23 = f12;
                                } else if (c13 == 'T') {
                                    if (c15 == 'q' || c15 == 't' || c15 == 'Q' || c15 == 'T') {
                                        f26 = (f26 * 2.0f) - f22;
                                        f27 = (f27 * 2.0f) - f23;
                                    }
                                    int i37 = i14 + 0;
                                    int i38 = i14 + 1;
                                    path.quadTo(f26, f27, fArr2[i37], fArr2[i38]);
                                    float f37 = fArr2[i37];
                                    float f38 = fArr2[i38];
                                    i13 = i14;
                                    f23 = f27;
                                    f22 = f26;
                                    f26 = f37;
                                    f27 = f38;
                                } else if (c13 == 'l') {
                                    int i39 = i14 + 0;
                                    int i41 = i14 + 1;
                                    path.rLineTo(fArr2[i39], fArr2[i41]);
                                    f26 += fArr2[i39];
                                    f14 = fArr2[i41];
                                } else if (c13 == 'm') {
                                    int i42 = i14 + 0;
                                    f26 += fArr2[i42];
                                    int i43 = i14 + 1;
                                    f27 += fArr2[i43];
                                    if (i14 > 0) {
                                        path.rLineTo(fArr2[i42], fArr2[i43]);
                                    } else {
                                        path.rMoveTo(fArr2[i42], fArr2[i43]);
                                        i13 = i14;
                                        f29 = f27;
                                        f28 = f26;
                                    }
                                } else if (c13 == 's') {
                                    if (c15 == 'c' || c15 == 's' || c15 == 'C' || c15 == 'S') {
                                        float f39 = f26 - f22;
                                        f15 = f27 - f23;
                                        f16 = f39;
                                    } else {
                                        f16 = BitmapDescriptorFactory.HUE_RED;
                                        f15 = BitmapDescriptorFactory.HUE_RED;
                                    }
                                    int i44 = i14 + 0;
                                    int i45 = i14 + 1;
                                    int i46 = i14 + 2;
                                    int i47 = i14 + 3;
                                    path.rCubicTo(f16, f15, fArr2[i44], fArr2[i45], fArr2[i46], fArr2[i47]);
                                    f11 = fArr2[i44] + f26;
                                    f12 = fArr2[i45] + f27;
                                    f26 += fArr2[i46];
                                    f13 = fArr2[i47];
                                } else if (c13 == 't') {
                                    if (c15 == 'q' || c15 == 't' || c15 == 'Q' || c15 == 'T') {
                                        f17 = f26 - f22;
                                        f18 = f27 - f23;
                                    } else {
                                        f18 = BitmapDescriptorFactory.HUE_RED;
                                        f17 = BitmapDescriptorFactory.HUE_RED;
                                    }
                                    int i48 = i14 + 0;
                                    int i49 = i14 + 1;
                                    path.rQuadTo(f17, f18, fArr2[i48], fArr2[i49]);
                                    float f41 = f17 + f26;
                                    float f42 = f18 + f27;
                                    f26 += fArr2[i48];
                                    f27 += fArr2[i49];
                                    f23 = f42;
                                    f22 = f41;
                                }
                                f27 += f14;
                            } else {
                                int i51 = i14 + 0;
                                int i52 = i14 + 1;
                                int i53 = i14 + 2;
                                int i54 = i14 + 3;
                                path.rQuadTo(fArr2[i51], fArr2[i52], fArr2[i53], fArr2[i54]);
                                f11 = fArr2[i51] + f26;
                                f12 = fArr2[i52] + f27;
                                f26 += fArr2[i53];
                                f13 = fArr2[i54];
                            }
                            i13 = i14;
                        } else {
                            int i55 = i14 + 2;
                            int i56 = i14 + 3;
                            int i57 = i14 + 4;
                            int i58 = i14 + 5;
                            path.rCubicTo(fArr2[i14 + 0], fArr2[i14 + 1], fArr2[i55], fArr2[i56], fArr2[i57], fArr2[i58]);
                            f11 = fArr2[i55] + f26;
                            f12 = fArr2[i56] + f27;
                            f26 += fArr2[i57];
                            f13 = fArr2[i58];
                        }
                        f27 += f13;
                        f22 = f11;
                        f23 = f12;
                        i13 = i14;
                    } else {
                        int i59 = i14 + 5;
                        int i61 = i14 + 6;
                        i13 = i14;
                        c(path, f26, f27, fArr2[i59] + f26, fArr2[i61] + f27, fArr2[i14 + 0], fArr2[i14 + 1], fArr2[i14 + 2], fArr2[i14 + 3] != BitmapDescriptorFactory.HUE_RED, fArr2[i14 + 4] != BitmapDescriptorFactory.HUE_RED);
                        f26 += fArr2[i59];
                        f27 += fArr2[i61];
                    }
                    i14 = i13 + i12;
                    c15 = c12;
                    c13 = c15;
                    c14 = 0;
                } else {
                    i13 = i14;
                    int i62 = i13 + 5;
                    int i63 = i13 + 6;
                    c(path, f26, f27, fArr2[i62], fArr2[i63], fArr2[i13 + 0], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != BitmapDescriptorFactory.HUE_RED, fArr2[i13 + 4] != BitmapDescriptorFactory.HUE_RED);
                    f26 = fArr2[i62];
                    f27 = fArr2[i63];
                }
                f23 = f27;
                f22 = f26;
                i14 = i13 + i12;
                c15 = c12;
                c13 = c15;
                c14 = 0;
            }
            fArr[c14] = f26;
            fArr[1] = f27;
            fArr[2] = f22;
            fArr[3] = f23;
            fArr[4] = f28;
            fArr[5] = f29;
        }

        private static void b(Path path, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
            double d21 = d13;
            int ceil = (int) Math.ceil(Math.abs((d19 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d17);
            double sin = Math.sin(d17);
            double cos2 = Math.cos(d18);
            double sin2 = Math.sin(d18);
            double d22 = -d21;
            double d23 = d22 * cos;
            double d24 = d14 * sin;
            double d25 = (d23 * sin2) - (d24 * cos2);
            double d26 = d22 * sin;
            double d27 = d14 * cos;
            double d28 = (sin2 * d26) + (cos2 * d27);
            double d29 = d19 / ceil;
            double d31 = d28;
            double d32 = d25;
            int i11 = 0;
            double d33 = d15;
            double d34 = d16;
            double d35 = d18;
            while (i11 < ceil) {
                double d36 = d35 + d29;
                double sin3 = Math.sin(d36);
                double cos3 = Math.cos(d36);
                double d37 = (d11 + ((d21 * cos) * cos3)) - (d24 * sin3);
                double d38 = d12 + (d21 * sin * cos3) + (d27 * sin3);
                double d39 = (d23 * sin3) - (d24 * cos3);
                double d41 = (sin3 * d26) + (cos3 * d27);
                double d42 = d36 - d35;
                double tan = Math.tan(d42 / 2.0d);
                double sin4 = (Math.sin(d42) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d43 = d33 + (d32 * sin4);
                path.rLineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                path.cubicTo((float) d43, (float) (d34 + (d31 * sin4)), (float) (d37 - (sin4 * d39)), (float) (d38 - (sin4 * d41)), (float) d37, (float) d38);
                i11++;
                d29 = d29;
                sin = sin;
                d33 = d37;
                d26 = d26;
                cos = cos;
                d35 = d36;
                d31 = d41;
                d32 = d39;
                ceil = ceil;
                d34 = d38;
                d21 = d13;
            }
        }

        private static void c(Path path, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z11, boolean z12) {
            double d11;
            double d12;
            double radians = Math.toRadians(f17);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d13 = f11;
            double d14 = d13 * cos;
            double d15 = f12;
            double d16 = f15;
            double d17 = (d14 + (d15 * sin)) / d16;
            double d18 = f16;
            double d19 = (((-f11) * sin) + (d15 * cos)) / d18;
            double d21 = f14;
            double d22 = ((f13 * cos) + (d21 * sin)) / d16;
            double d23 = (((-f13) * sin) + (d21 * cos)) / d18;
            double d24 = d17 - d22;
            double d25 = d19 - d23;
            double d26 = (d17 + d22) / 2.0d;
            double d27 = (d19 + d23) / 2.0d;
            double d28 = (d24 * d24) + (d25 * d25);
            if (d28 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d29 = (1.0d / d28) - 0.25d;
            if (d29 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d28);
                float sqrt = (float) (Math.sqrt(d28) / 1.99999d);
                c(path, f11, f12, f13, f14, f15 * sqrt, f16 * sqrt, f17, z11, z12);
                return;
            }
            double sqrt2 = Math.sqrt(d29);
            double d31 = d24 * sqrt2;
            double d32 = sqrt2 * d25;
            if (z11 == z12) {
                d11 = d26 - d32;
                d12 = d27 + d31;
            } else {
                d11 = d26 + d32;
                d12 = d27 - d31;
            }
            double atan2 = Math.atan2(d19 - d12, d17 - d11);
            double atan22 = Math.atan2(d23 - d12, d22 - d11) - atan2;
            int i11 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z12 != (i11 >= 0)) {
                atan22 = i11 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d33 = d11 * d16;
            double d34 = d12 * d18;
            b(path, (d33 * cos) - (d34 * sin), (d33 * sin) + (d34 * cos), d16, d18, d13, d15, radians, atan2, atan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c11 = 'm';
            for (int i11 = 0; i11 < bVarArr.length; i11++) {
                a(path, fArr, c11, bVarArr[i11].f38370a, bVarArr[i11].f38371b);
                c11 = bVarArr[i11].f38370a;
            }
        }

        public void d(b bVar, b bVar2, float f11) {
            this.f38370a = bVar.f38370a;
            int i11 = 0;
            while (true) {
                float[] fArr = bVar.f38371b;
                if (i11 >= fArr.length) {
                    return;
                }
                this.f38371b[i11] = (fArr[i11] * (1.0f - f11)) + (bVar2.f38371b[i11] * f11);
                i11++;
            }
        }

        b(b bVar) {
            this.f38370a = bVar.f38370a;
            float[] fArr = bVar.f38371b;
            this.f38371b = c.c(fArr, 0, fArr.length);
        }
    }
}
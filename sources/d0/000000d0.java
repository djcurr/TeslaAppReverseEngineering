package ak;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f519a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f520b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    private static final Object f521c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static int[] f522d = new int[10];

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f523a;

        /* renamed from: b  reason: collision with root package name */
        public final int f524b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f525c;

        public a(int i11, int i12, boolean z11) {
            this.f523a = i11;
            this.f524b = i12;
            this.f525c = z11;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f526a;

        /* renamed from: b  reason: collision with root package name */
        public final int f527b;

        /* renamed from: c  reason: collision with root package name */
        public final int f528c;

        /* renamed from: d  reason: collision with root package name */
        public final int f529d;

        /* renamed from: e  reason: collision with root package name */
        public final int f530e;

        /* renamed from: f  reason: collision with root package name */
        public final int f531f;

        /* renamed from: g  reason: collision with root package name */
        public final float f532g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f533h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f534i;

        /* renamed from: j  reason: collision with root package name */
        public final int f535j;

        /* renamed from: k  reason: collision with root package name */
        public final int f536k;

        /* renamed from: l  reason: collision with root package name */
        public final int f537l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f538m;

        public b(int i11, int i12, int i13, int i14, int i15, int i16, float f11, boolean z11, boolean z12, int i17, int i18, int i19, boolean z13) {
            this.f526a = i11;
            this.f527b = i12;
            this.f528c = i13;
            this.f529d = i14;
            this.f530e = i15;
            this.f531f = i16;
            this.f532g = f11;
            this.f533h = z11;
            this.f534i = z12;
            this.f535j = i17;
            this.f536k = i18;
            this.f537l = i19;
            this.f538m = z13;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i11 + 1;
            if (i13 < position) {
                int i14 = byteBuffer.get(i11) & 255;
                if (i12 == 3) {
                    if (i14 == 1 && (byteBuffer.get(i13) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i11 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i14 == 0) {
                    i12++;
                }
                if (i14 != 0) {
                    i12 = 0;
                }
                i11 = i13;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int c(byte[] bArr, int i11, int i12, boolean[] zArr) {
        int i13 = i12 - i11;
        ak.a.f(i13 >= 0);
        if (i13 == 0) {
            return i12;
        }
        if (zArr[0]) {
            a(zArr);
            return i11 - 3;
        } else if (i13 > 1 && zArr[1] && bArr[i11] == 1) {
            a(zArr);
            return i11 - 2;
        } else if (i13 > 2 && zArr[2] && bArr[i11] == 0 && bArr[i11 + 1] == 1) {
            a(zArr);
            return i11 - 1;
        } else {
            int i14 = i12 - 1;
            int i15 = i11 + 2;
            while (i15 < i14) {
                if ((bArr[i15] & 254) == 0) {
                    int i16 = i15 - 2;
                    if (bArr[i16] == 0 && bArr[i15 - 1] == 0 && bArr[i15] == 1) {
                        a(zArr);
                        return i16;
                    }
                    i15 -= 2;
                }
                i15 += 3;
            }
            zArr[0] = i13 <= 2 ? !(i13 != 2 ? !(zArr[1] && bArr[i14] == 1) : !(zArr[2] && bArr[i12 + (-2)] == 0 && bArr[i14] == 1)) : bArr[i12 + (-3)] == 0 && bArr[i12 + (-2)] == 0 && bArr[i14] == 1;
            zArr[1] = i13 <= 1 ? zArr[2] && bArr[i14] == 0 : bArr[i12 + (-2)] == 0 && bArr[i14] == 0;
            zArr[2] = bArr[i14] == 0;
            return i12;
        }
    }

    private static int d(byte[] bArr, int i11, int i12) {
        while (i11 < i12 - 2) {
            if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static int e(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i11) {
        return bArr[i11 + 3] & 31;
    }

    public static boolean g(String str, byte b11) {
        if ("video/avc".equals(str) && (b11 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b11 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i11, int i12) {
        w wVar = new w(bArr, i11, i12);
        wVar.l(8);
        int h11 = wVar.h();
        int h12 = wVar.h();
        wVar.k();
        return new a(h11, h12, wVar.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ak.t.b i(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.t.i(byte[], int, int):ak.t$b");
    }

    private static void j(w wVar, int i11) {
        int i12 = 8;
        int i13 = 8;
        for (int i14 = 0; i14 < i11; i14++) {
            if (i12 != 0) {
                i12 = ((wVar.g() + i13) + 256) % 256;
            }
            if (i12 != 0) {
                i13 = i12;
            }
        }
    }

    public static int k(byte[] bArr, int i11) {
        int i12;
        synchronized (f521c) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11) {
                try {
                    i13 = d(bArr, i13, i11);
                    if (i13 < i11) {
                        int[] iArr = f522d;
                        if (iArr.length <= i14) {
                            f522d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f522d[i14] = i13;
                        i13 += 3;
                        i14++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i12 = i11 - i14;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = f522d[i17] - i16;
                System.arraycopy(bArr, i16, bArr, i15, i18);
                int i19 = i15 + i18;
                int i21 = i19 + 1;
                bArr[i19] = 0;
                i15 = i21 + 1;
                bArr[i21] = 0;
                i16 += i18 + 3;
            }
            System.arraycopy(bArr, i16, bArr, i15, i12 - i15);
        }
        return i12;
    }
}
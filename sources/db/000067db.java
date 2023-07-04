package ei;

import com.google.android.exoplayer2.ParserException;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f25107a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f25108b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f25109a;

        /* renamed from: b  reason: collision with root package name */
        public final int f25110b;

        /* renamed from: c  reason: collision with root package name */
        public final String f25111c;

        private b(int i11, int i12, String str) {
            this.f25109a = i11;
            this.f25110b = i12;
            this.f25111c = str;
        }
    }

    public static byte[] a(int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = -1;
        while (true) {
            int[] iArr = f25107a;
            if (i14 >= iArr.length) {
                break;
            }
            if (i11 == iArr[i14]) {
                i15 = i14;
            }
            i14++;
        }
        int i16 = -1;
        while (true) {
            int[] iArr2 = f25108b;
            if (i13 >= iArr2.length) {
                break;
            }
            if (i12 == iArr2[i13]) {
                i16 = i13;
            }
            i13++;
        }
        if (i11 != -1 && i16 != -1) {
            return b(2, i15, i16);
        }
        StringBuilder sb2 = new StringBuilder(67);
        sb2.append("Invalid sample rate or number of channels: ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static byte[] b(int i11, int i12, int i13) {
        return new byte[]{(byte) (((i11 << 3) & 248) | ((i12 >> 1) & 7)), (byte) (((i12 << 7) & 128) | ((i13 << 3) & 120))};
    }

    private static int c(ak.u uVar) {
        int h11 = uVar.h(5);
        return h11 == 31 ? uVar.h(6) + 32 : h11;
    }

    public static int d(int i11) {
        if (i11 != 2) {
            if (i11 != 5) {
                if (i11 != 29) {
                    if (i11 != 42) {
                        if (i11 != 22) {
                            return i11 != 23 ? 0 : 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    private static int e(ak.u uVar) {
        int h11 = uVar.h(4);
        if (h11 == 15) {
            return uVar.h(24);
        }
        if (h11 < 13) {
            return f25107a[h11];
        }
        throw new ParserException();
    }

    public static b f(ak.u uVar, boolean z11) {
        int c11 = c(uVar);
        int e11 = e(uVar);
        int h11 = uVar.h(4);
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append("mp4a.40.");
        sb2.append(c11);
        String sb3 = sb2.toString();
        if (c11 == 5 || c11 == 29) {
            e11 = e(uVar);
            c11 = c(uVar);
            if (c11 == 22) {
                h11 = uVar.h(4);
            }
        }
        if (z11) {
            if (c11 != 1 && c11 != 2 && c11 != 3 && c11 != 4 && c11 != 6 && c11 != 7 && c11 != 17) {
                switch (c11) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb4 = new StringBuilder(42);
                        sb4.append("Unsupported audio object type: ");
                        sb4.append(c11);
                        throw new ParserException(sb4.toString());
                }
            }
            h(uVar, c11, h11);
            switch (c11) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h12 = uVar.h(2);
                    if (h12 == 2 || h12 == 3) {
                        StringBuilder sb5 = new StringBuilder(33);
                        sb5.append("Unsupported epConfig: ");
                        sb5.append(h12);
                        throw new ParserException(sb5.toString());
                    }
            }
        }
        int i11 = f25108b[h11];
        if (i11 != -1) {
            return new b(e11, i11, sb3);
        }
        throw new ParserException();
    }

    public static b g(byte[] bArr) {
        return f(new ak.u(bArr), false);
    }

    private static void h(ak.u uVar, int i11, int i12) {
        if (uVar.g()) {
            ak.o.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (uVar.g()) {
            uVar.r(14);
        }
        boolean g11 = uVar.g();
        if (i12 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i11 == 6 || i11 == 20) {
            uVar.r(3);
        }
        if (g11) {
            if (i11 == 22) {
                uVar.r(16);
            }
            if (i11 == 17 || i11 == 19 || i11 == 20 || i11 == 23) {
                uVar.r(3);
            }
            uVar.r(1);
        }
    }
}
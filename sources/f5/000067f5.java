package ei;

import ch.qos.logback.classic.Level;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f25171a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f25172b = {44100, 48000, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f25173c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f25174d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f25175e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f25176f = {32000, Level.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f25177g = {8000, 16000, 24000, 32000, Level.ERROR_INT, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f25178a;

        /* renamed from: b  reason: collision with root package name */
        public String f25179b;

        /* renamed from: c  reason: collision with root package name */
        public int f25180c;

        /* renamed from: d  reason: collision with root package name */
        public int f25181d;

        /* renamed from: e  reason: collision with root package name */
        public int f25182e;

        /* renamed from: f  reason: collision with root package name */
        public int f25183f;

        /* renamed from: g  reason: collision with root package name */
        public int f25184g;

        public boolean a(int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (!s.l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
                return false;
            }
            this.f25178a = i12;
            this.f25179b = s.f25171a[3 - i13];
            int i16 = s.f25172b[i15];
            this.f25181d = i16;
            if (i12 == 2) {
                this.f25181d = i16 / 2;
            } else if (i12 == 0) {
                this.f25181d = i16 / 4;
            }
            int i17 = (i11 >>> 9) & 1;
            this.f25184g = s.k(i12, i13);
            if (i13 == 3) {
                int i18 = i12 == 3 ? s.f25173c[i14 - 1] : s.f25174d[i14 - 1];
                this.f25183f = i18;
                this.f25180c = (((i18 * 12) / this.f25181d) + i17) * 4;
            } else {
                if (i12 == 3) {
                    int i19 = i13 == 2 ? s.f25175e[i14 - 1] : s.f25176f[i14 - 1];
                    this.f25183f = i19;
                    this.f25180c = ((i19 * 144) / this.f25181d) + i17;
                } else {
                    int i21 = s.f25177g[i14 - 1];
                    this.f25183f = i21;
                    this.f25180c = (((i13 == 1 ? 72 : 144) * i21) / this.f25181d) + i17;
                }
            }
            this.f25182e = ((i11 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int j(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (!l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f25172b[i15];
        if (i12 == 2) {
            i17 /= 2;
        } else if (i12 == 0) {
            i17 /= 4;
        }
        int i18 = (i11 >>> 9) & 1;
        if (i13 == 3) {
            return ((((i12 == 3 ? f25173c[i14 - 1] : f25174d[i14 - 1]) * 12) / i17) + i18) * 4;
        }
        if (i12 == 3) {
            i16 = i13 == 2 ? f25175e[i14 - 1] : f25176f[i14 - 1];
        } else {
            i16 = f25177g[i14 - 1];
        }
        if (i12 == 3) {
            return ((i16 * 144) / i17) + i18;
        }
        return (((i13 == 1 ? 72 : 144) * i16) / i17) + i18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i11, int i12) {
        if (i12 == 1) {
            return i11 == 3 ? 1152 : 576;
        } else if (i12 != 2) {
            if (i12 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else {
            return 1152;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i11) {
        return (i11 & (-2097152)) == -2097152;
    }

    public static int m(int i11) {
        int i12;
        int i13;
        if (!l(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0) {
            return -1;
        }
        int i14 = (i11 >>> 12) & 15;
        int i15 = (i11 >>> 10) & 3;
        if (i14 == 0 || i14 == 15 || i15 == 3) {
            return -1;
        }
        return k(i12, i13);
    }
}
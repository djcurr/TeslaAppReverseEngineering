package ax;

import ax.b;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class a extends b {

    /* renamed from: k  reason: collision with root package name */
    static final byte[] f7075k = {13, 10};

    /* renamed from: l  reason: collision with root package name */
    private static final byte[] f7076l = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f7077m = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: n  reason: collision with root package name */
    private static final byte[] f7078n = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, Tnaf.POW_2_WIDTH, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f7079f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f7080g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f7081h;

    /* renamed from: i  reason: collision with root package name */
    private final int f7082i;

    /* renamed from: j  reason: collision with root package name */
    private final int f7083j;

    public a() {
        this(0);
    }

    public static byte[] p(String str) {
        return new a().d(str);
    }

    public static byte[] q(byte[] bArr, boolean z11) {
        return r(bArr, z11, false);
    }

    public static byte[] r(byte[] bArr, boolean z11, boolean z12) {
        return s(bArr, z11, z12, Integer.MAX_VALUE);
    }

    public static byte[] s(byte[] bArr, boolean z11, boolean z12, int i11) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = z11 ? new a(z12) : new a(0, f7075k, z12);
        long k11 = aVar.k(bArr);
        if (k11 <= i11) {
            return aVar.g(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + k11 + ") than the specified maximum size of " + i11);
    }

    public static String t(byte[] bArr) {
        return b.m(q(bArr, false));
    }

    @Override // ax.b
    void c(byte[] bArr, int i11, int i12, b.a aVar) {
        byte b11;
        if (aVar.f7094f) {
            return;
        }
        if (i12 < 0) {
            aVar.f7094f = true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            byte[] h11 = h(this.f7082i, aVar);
            int i14 = i11 + 1;
            byte b12 = bArr[i11];
            if (b12 == this.f7084a) {
                aVar.f7094f = true;
                break;
            }
            if (b12 >= 0) {
                byte[] bArr2 = f7078n;
                if (b12 < bArr2.length && (b11 = bArr2[b12]) >= 0) {
                    int i15 = (aVar.f7096h + 1) % 4;
                    aVar.f7096h = i15;
                    int i16 = (aVar.f7089a << 6) + b11;
                    aVar.f7089a = i16;
                    if (i15 == 0) {
                        int i17 = aVar.f7092d;
                        int i18 = i17 + 1;
                        aVar.f7092d = i18;
                        h11[i17] = (byte) ((i16 >> 16) & 255);
                        int i19 = i18 + 1;
                        aVar.f7092d = i19;
                        h11[i18] = (byte) ((i16 >> 8) & 255);
                        aVar.f7092d = i19 + 1;
                        h11[i19] = (byte) (i16 & 255);
                    }
                }
            }
            i13++;
            i11 = i14;
        }
        if (!aVar.f7094f || aVar.f7096h == 0) {
            return;
        }
        byte[] h12 = h(this.f7082i, aVar);
        int i21 = aVar.f7096h;
        if (i21 != 1) {
            if (i21 == 2) {
                int i22 = aVar.f7089a >> 4;
                aVar.f7089a = i22;
                int i23 = aVar.f7092d;
                aVar.f7092d = i23 + 1;
                h12[i23] = (byte) (i22 & 255);
            } else if (i21 == 3) {
                int i24 = aVar.f7089a >> 2;
                aVar.f7089a = i24;
                int i25 = aVar.f7092d;
                int i26 = i25 + 1;
                aVar.f7092d = i26;
                h12[i25] = (byte) ((i24 >> 8) & 255);
                aVar.f7092d = i26 + 1;
                h12[i26] = (byte) (i24 & 255);
            } else {
                throw new IllegalStateException("Impossible modulus " + aVar.f7096h);
            }
        }
    }

    @Override // ax.b
    void f(byte[] bArr, int i11, int i12, b.a aVar) {
        if (aVar.f7094f) {
            return;
        }
        if (i12 >= 0) {
            int i13 = 0;
            while (i13 < i12) {
                byte[] h11 = h(this.f7083j, aVar);
                int i14 = (aVar.f7096h + 1) % 3;
                aVar.f7096h = i14;
                int i15 = i11 + 1;
                int i16 = bArr[i11];
                if (i16 < 0) {
                    i16 += 256;
                }
                int i17 = (aVar.f7089a << 8) + i16;
                aVar.f7089a = i17;
                if (i14 == 0) {
                    int i18 = aVar.f7092d;
                    int i19 = i18 + 1;
                    aVar.f7092d = i19;
                    byte[] bArr2 = this.f7079f;
                    h11[i18] = bArr2[(i17 >> 18) & 63];
                    int i21 = i19 + 1;
                    aVar.f7092d = i21;
                    h11[i19] = bArr2[(i17 >> 12) & 63];
                    int i22 = i21 + 1;
                    aVar.f7092d = i22;
                    h11[i21] = bArr2[(i17 >> 6) & 63];
                    int i23 = i22 + 1;
                    aVar.f7092d = i23;
                    h11[i22] = bArr2[i17 & 63];
                    int i24 = aVar.f7095g + 4;
                    aVar.f7095g = i24;
                    int i25 = this.f7087d;
                    if (i25 > 0 && i25 <= i24) {
                        byte[] bArr3 = this.f7081h;
                        System.arraycopy(bArr3, 0, h11, i23, bArr3.length);
                        aVar.f7092d += this.f7081h.length;
                        aVar.f7095g = 0;
                    }
                }
                i13++;
                i11 = i15;
            }
            return;
        }
        aVar.f7094f = true;
        if (aVar.f7096h == 0 && this.f7087d == 0) {
            return;
        }
        byte[] h12 = h(this.f7083j, aVar);
        int i26 = aVar.f7092d;
        int i27 = aVar.f7096h;
        if (i27 != 0) {
            if (i27 == 1) {
                int i28 = i26 + 1;
                aVar.f7092d = i28;
                byte[] bArr4 = this.f7079f;
                int i29 = aVar.f7089a;
                h12[i26] = bArr4[(i29 >> 2) & 63];
                int i31 = i28 + 1;
                aVar.f7092d = i31;
                h12[i28] = bArr4[(i29 << 4) & 63];
                if (bArr4 == f7076l) {
                    int i32 = i31 + 1;
                    aVar.f7092d = i32;
                    byte b11 = this.f7084a;
                    h12[i31] = b11;
                    aVar.f7092d = i32 + 1;
                    h12[i32] = b11;
                }
            } else if (i27 == 2) {
                int i33 = i26 + 1;
                aVar.f7092d = i33;
                byte[] bArr5 = this.f7079f;
                int i34 = aVar.f7089a;
                h12[i26] = bArr5[(i34 >> 10) & 63];
                int i35 = i33 + 1;
                aVar.f7092d = i35;
                h12[i33] = bArr5[(i34 >> 4) & 63];
                int i36 = i35 + 1;
                aVar.f7092d = i36;
                h12[i35] = bArr5[(i34 << 2) & 63];
                if (bArr5 == f7076l) {
                    aVar.f7092d = i36 + 1;
                    h12[i36] = this.f7084a;
                }
            } else {
                throw new IllegalStateException("Impossible modulus " + aVar.f7096h);
            }
        }
        int i37 = aVar.f7095g;
        int i38 = aVar.f7092d;
        int i39 = i37 + (i38 - i26);
        aVar.f7095g = i39;
        if (this.f7087d <= 0 || i39 <= 0) {
            return;
        }
        byte[] bArr6 = this.f7081h;
        System.arraycopy(bArr6, 0, h12, i38, bArr6.length);
        aVar.f7092d += this.f7081h.length;
    }

    @Override // ax.b
    protected boolean l(byte b11) {
        if (b11 >= 0) {
            byte[] bArr = this.f7080g;
            if (b11 < bArr.length && bArr[b11] != -1) {
                return true;
            }
        }
        return false;
    }

    public a(boolean z11) {
        this(76, f7075k, z11);
    }

    public a(int i11) {
        this(i11, f7075k);
    }

    public a(int i11, byte[] bArr) {
        this(i11, bArr, false);
    }

    public a(int i11, byte[] bArr, boolean z11) {
        super(3, 4, i11, bArr == null ? 0 : bArr.length);
        this.f7080g = f7078n;
        if (bArr != null) {
            if (b(bArr)) {
                String m11 = b.m(bArr);
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + m11 + "]");
            } else if (i11 > 0) {
                this.f7083j = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.f7081h = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.f7083j = 4;
                this.f7081h = null;
            }
        } else {
            this.f7083j = 4;
            this.f7081h = null;
        }
        this.f7082i = this.f7083j - 1;
        this.f7079f = z11 ? f7077m : f7076l;
    }
}
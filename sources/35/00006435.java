package cp;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class c extends k {

    /* renamed from: e  reason: collision with root package name */
    static final int[] f23014e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, 138, 42};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f23015a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f23016b;

    /* renamed from: c  reason: collision with root package name */
    private final StringBuilder f23017c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f23018d;

    public c() {
        this(false);
    }

    private static String g(CharSequence charSequence) {
        int i11;
        char c11;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i12 = 0;
        while (i12 < length) {
            char charAt = charSequence.charAt(i12);
            if (charAt != '+' && charAt != '$' && charAt != '%' && charAt != '/') {
                sb2.append(charAt);
            } else {
                i12++;
                char charAt2 = charSequence.charAt(i12);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i11 = charAt2 - ' ';
                                } else if (charAt2 != 'Z') {
                                    throw FormatException.a();
                                } else {
                                    c11 = CoreConstants.COLON_CHAR;
                                    sb2.append(c11);
                                }
                            }
                            c11 = 0;
                            sb2.append(c11);
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw FormatException.a();
                        } else {
                            i11 = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i11 = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i11 = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i11 = charAt2 + 16;
                    } else if (charAt2 < 'P' || charAt2 > 'T') {
                        if (charAt2 != 'U') {
                            if (charAt2 == 'V') {
                                c11 = '@';
                            } else if (charAt2 == 'W') {
                                c11 = '`';
                            } else if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                throw FormatException.a();
                            } else {
                                c11 = 127;
                            }
                            sb2.append(c11);
                        }
                        c11 = 0;
                        sb2.append(c11);
                    } else {
                        i11 = charAt2 + '+';
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw FormatException.a();
                } else {
                    i11 = charAt2 - '@';
                }
                c11 = (char) i11;
                sb2.append(c11);
            }
            i12++;
        }
        return sb2.toString();
    }

    private static int[] h(uo.a aVar, int[] iArr) {
        int g11 = aVar.g();
        int e11 = aVar.e(0);
        int length = iArr.length;
        boolean z11 = false;
        int i11 = 0;
        int i12 = e11;
        while (e11 < g11) {
            if (aVar.c(e11) != z11) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else if (j(iArr) == 148 && aVar.h(Math.max(0, i12 - ((e11 - i12) / 2)), i12, false)) {
                    return new int[]{i12, e11};
                } else {
                    i12 += iArr[0] + iArr[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i13);
                    iArr[i13] = 0;
                    iArr[i11] = 0;
                    i11--;
                }
                iArr[i11] = 1;
                z11 = !z11;
            }
            e11++;
        }
        throw NotFoundException.a();
    }

    private static char i(int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = f23014e;
            if (i12 >= iArr.length) {
                if (i11 == 148) {
                    return '*';
                }
                throw NotFoundException.a();
            } else if (iArr[i12] == i11) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i12);
            } else {
                i12++;
            }
        }
    }

    private static int j(int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            int i12 = Integer.MAX_VALUE;
            for (int i13 : iArr) {
                if (i13 < i12 && i13 > i11) {
                    i12 = i13;
                }
            }
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < length; i17++) {
                int i18 = iArr[i17];
                if (i18 > i12) {
                    i15 |= 1 << ((length - 1) - i17);
                    i14++;
                    i16 += i18;
                }
            }
            if (i14 == 3) {
                for (int i19 = 0; i19 < length && i14 > 0; i19++) {
                    int i21 = iArr[i19];
                    if (i21 > i12) {
                        i14--;
                        if ((i21 << 1) >= i16) {
                            return -1;
                        }
                    }
                }
                return i15;
            } else if (i14 <= 3) {
                return -1;
            } else {
                i11 = i12;
            }
        }
    }

    @Override // cp.k
    public com.google.zxing.j b(int i11, uo.a aVar, Map<com.google.zxing.d, ?> map) {
        int[] h11;
        String sb2;
        int[] iArr = this.f23018d;
        Arrays.fill(iArr, 0);
        StringBuilder sb3 = this.f23017c;
        sb3.setLength(0);
        int e11 = aVar.e(h(aVar, iArr)[1]);
        int g11 = aVar.g();
        while (true) {
            k.e(aVar, e11, iArr);
            int j11 = j(iArr);
            if (j11 >= 0) {
                char i12 = i(j11);
                sb3.append(i12);
                int i13 = e11;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                int e12 = aVar.e(i13);
                if (i12 == '*') {
                    sb3.setLength(sb3.length() - 1);
                    int i15 = 0;
                    for (int i16 : iArr) {
                        i15 += i16;
                    }
                    int i17 = (e12 - e11) - i15;
                    if (e12 != g11 && (i17 << 1) < i15) {
                        throw NotFoundException.a();
                    }
                    if (this.f23015a) {
                        int length = sb3.length() - 1;
                        int i18 = 0;
                        for (int i19 = 0; i19 < length; i19++) {
                            i18 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f23017c.charAt(i19));
                        }
                        if (sb3.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i18 % 43)) {
                            sb3.setLength(length);
                        } else {
                            throw ChecksumException.a();
                        }
                    }
                    if (sb3.length() != 0) {
                        if (this.f23016b) {
                            sb2 = g(sb3);
                        } else {
                            sb2 = sb3.toString();
                        }
                        float f11 = i11;
                        return new com.google.zxing.j(sb2, null, new com.google.zxing.l[]{new com.google.zxing.l((h11[1] + h11[0]) / 2.0f, f11), new com.google.zxing.l(e11 + (i15 / 2.0f), f11)}, com.google.zxing.a.CODE_39);
                    }
                    throw NotFoundException.a();
                }
                e11 = e12;
            } else {
                throw NotFoundException.a();
            }
        }
    }

    public c(boolean z11) {
        this(z11, false);
    }

    public c(boolean z11, boolean z12) {
        this.f23015a = z11;
        this.f23016b = z12;
        this.f23017c = new StringBuilder(20);
        this.f23018d = new int[9];
    }
}
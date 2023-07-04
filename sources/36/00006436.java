package cp;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.wallet.WalletConstants;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes2.dex */
public final class d extends k {

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f23019c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d  reason: collision with root package name */
    static final int[] f23020d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f23021e;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f23022a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    private final int[] f23023b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, WalletConstants.ERROR_CODE_INVALID_PARAMETERS, WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, 394, 360, 356, 354, StatusLine.HTTP_PERM_REDIRECT, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f23020d = iArr;
        f23021e = iArr[47];
    }

    private static void g(CharSequence charSequence) {
        int length = charSequence.length();
        h(charSequence, length - 2, 20);
        h(charSequence, length - 1, 15);
    }

    private static void h(CharSequence charSequence, int i11, int i12) {
        int i13 = 0;
        int i14 = 1;
        for (int i15 = i11 - 1; i15 >= 0; i15--) {
            i13 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i15)) * i14;
            i14++;
            if (i14 > i12) {
                i14 = 1;
            }
        }
        if (charSequence.charAt(i11) != f23019c[i13 % 47]) {
            throw ChecksumException.a();
        }
    }

    private static String i(CharSequence charSequence) {
        int i11;
        char c11;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i12 = 0;
        while (i12 < length) {
            char charAt = charSequence.charAt(i12);
            if (charAt < 'a' || charAt > 'd') {
                sb2.append(charAt);
            } else if (i12 < length - 1) {
                i12++;
                char charAt2 = charSequence.charAt(i12);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i11 = charAt2 - '@';
                            c11 = (char) i11;
                            break;
                        } else {
                            throw FormatException.a();
                        }
                        break;
                    case 'b':
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            i11 = charAt2 - '&';
                        } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                            i11 = charAt2 - 11;
                        } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                            i11 = charAt2 + 16;
                        } else if (charAt2 >= 'P' && charAt2 <= 'S') {
                            i11 = charAt2 + '+';
                        } else if (charAt2 >= 'T' && charAt2 <= 'Z') {
                            c11 = 127;
                            break;
                        } else {
                            throw FormatException.a();
                        }
                        c11 = (char) i11;
                        break;
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            i11 = charAt2 - ' ';
                            c11 = (char) i11;
                            break;
                        } else if (charAt2 == 'Z') {
                            c11 = CoreConstants.COLON_CHAR;
                            break;
                        } else {
                            throw FormatException.a();
                        }
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i11 = charAt2 + ' ';
                            c11 = (char) i11;
                            break;
                        } else {
                            throw FormatException.a();
                        }
                    default:
                        c11 = 0;
                        break;
                }
                sb2.append(c11);
            } else {
                throw FormatException.a();
            }
            i12++;
        }
        return sb2.toString();
    }

    private int[] j(uo.a aVar) {
        int g11 = aVar.g();
        int e11 = aVar.e(0);
        Arrays.fill(this.f23023b, 0);
        int[] iArr = this.f23023b;
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
                } else if (l(iArr) == f23021e) {
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

    private static char k(int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = f23020d;
            if (i12 < iArr.length) {
                if (iArr[i12] == i11) {
                    return f23019c[i12];
                }
                i12++;
            } else {
                throw NotFoundException.a();
            }
        }
    }

    private static int l(int[] iArr) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        int length = iArr.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            int round = Math.round((iArr[i14] * 9.0f) / i11);
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i14 & 1) == 0) {
                for (int i15 = 0; i15 < round; i15++) {
                    i13 = (i13 << 1) | 1;
                }
            } else {
                i13 <<= round;
            }
        }
        return i13;
    }

    @Override // cp.k
    public com.google.zxing.j b(int i11, uo.a aVar, Map<com.google.zxing.d, ?> map) {
        int[] j11;
        int e11 = aVar.e(j(aVar)[1]);
        int g11 = aVar.g();
        int[] iArr = this.f23023b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f23022a;
        sb2.setLength(0);
        while (true) {
            k.e(aVar, e11, iArr);
            int l11 = l(iArr);
            if (l11 >= 0) {
                char k11 = k(l11);
                sb2.append(k11);
                int i12 = e11;
                for (int i13 : iArr) {
                    i12 += i13;
                }
                int e12 = aVar.e(i12);
                if (k11 == '*') {
                    sb2.deleteCharAt(sb2.length() - 1);
                    int i14 = 0;
                    for (int i15 : iArr) {
                        i14 += i15;
                    }
                    if (e12 != g11 && aVar.c(e12)) {
                        if (sb2.length() >= 2) {
                            g(sb2);
                            sb2.setLength(sb2.length() - 2);
                            float f11 = i11;
                            return new com.google.zxing.j(i(sb2), null, new com.google.zxing.l[]{new com.google.zxing.l((j11[1] + j11[0]) / 2.0f, f11), new com.google.zxing.l(e11 + (i14 / 2.0f), f11)}, com.google.zxing.a.CODE_93);
                        }
                        throw NotFoundException.a();
                    }
                    throw NotFoundException.a();
                }
                e11 = e12;
            } else {
                throw NotFoundException.a();
            }
        }
    }
}
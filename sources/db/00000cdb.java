package bp;

import java.text.DecimalFormat;
import org.spongycastle.math.ec.Tnaf;
import uo.e;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f7898a = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e a(byte[] bArr, int i11) {
        String h11;
        StringBuilder sb2 = new StringBuilder(144);
        if (i11 == 2 || i11 == 3) {
            if (i11 == 2) {
                h11 = new DecimalFormat("0000000000".substring(0, g(bArr))).format(f(bArr));
            } else {
                h11 = h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format(c(bArr));
            String format2 = decimalFormat.format(i(bArr));
            sb2.append(e(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                sb2.insert(9, h11 + (char) 29 + format + (char) 29 + format2 + (char) 29);
            } else {
                sb2.insert(0, h11 + (char) 29 + format + (char) 29 + format2 + (char) 29);
            }
        } else if (i11 == 4) {
            sb2.append(e(bArr, 1, 93));
        } else if (i11 == 5) {
            sb2.append(e(bArr, 1, 77));
        }
        return new e(bArr, sb2.toString(), null, String.valueOf(i11));
    }

    private static int b(int i11, byte[] bArr) {
        int i12 = i11 - 1;
        return ((1 << (5 - (i12 % 6))) & bArr[i12 / 6]) == 0 ? 0 : 1;
    }

    private static int c(byte[] bArr) {
        return d(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    private static int d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < bArr2.length; i12++) {
                i11 += b(bArr2[i12], bArr) << ((bArr2.length - i12) - 1);
            }
            return i11;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String e(byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        StringBuilder sb2 = new StringBuilder();
        int i17 = i11;
        int i18 = 0;
        int i19 = 0;
        int i21 = -1;
        while (i17 < i11 + i12) {
            char charAt = f7898a[i18].charAt(bArr[i17]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i19 = i18;
                    i18 = charAt - 65520;
                    i21 = 1;
                    break;
                case 65525:
                    i21 = 2;
                    i19 = i18;
                    i18 = 0;
                    break;
                case 65526:
                    i21 = 3;
                    i19 = i18;
                    i18 = 0;
                    break;
                case 65527:
                    i18 = 0;
                    i21 = -1;
                    break;
                case 65528:
                    i21 = -1;
                    i18 = 1;
                    break;
                case 65529:
                    i21 = -1;
                    break;
                case 65530:
                default:
                    sb2.append(charAt);
                    break;
                case 65531:
                    i17 = i17 + 1 + 1 + 1 + 1 + 1;
                    sb2.append(new DecimalFormat("000000000").format((bArr[i13] << 24) + (bArr[i14] << 18) + (bArr[i15] << 12) + (bArr[i16] << 6) + bArr[i17]));
                    break;
            }
            int i22 = i21 - 1;
            if (i21 == 0) {
                i18 = i19;
            }
            i17++;
            i21 = i22;
        }
        while (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == 65532) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    private static int f(byte[] bArr) {
        return d(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, Tnaf.POW_2_WIDTH, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    private static int g(byte[] bArr) {
        return d(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    private static String h(byte[] bArr) {
        String[] strArr = f7898a;
        return String.valueOf(new char[]{strArr[0].charAt(d(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(d(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(d(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(d(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(d(bArr, new byte[]{15, Tnaf.POW_2_WIDTH, 17, 18, 7, 8})), strArr[0].charAt(d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    private static int i(byte[] bArr) {
        return d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
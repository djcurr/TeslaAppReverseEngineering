package so;

import cg.c;
import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.stripe.android.core.networking.FileUploadRequest;
import com.stripe.android.model.Stripe3ds2AuthResult;
import ezvcard.property.Gender;
import java.util.Arrays;
import org.slf4j.Marker;
import uo.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f50478b = {"CTRL_PS", " ", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "E", Gender.FEMALE, "G", "H", "I", "J", "K", "L", Gender.MALE, Gender.NONE, Gender.OTHER, "P", "Q", "R", "S", "T", Gender.UNKNOWN, "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f50479c = {"CTRL_PS", " ", "a", "b", c.f9084i, "d", "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f50480d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f50481e = {"", "\r", FileUploadRequest.LINE_BREAK, ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", Marker.ANY_MARKER, Marker.ANY_NON_NULL_MARKER, ",", "-", ".", "/", ":", ";", "<", "=", ">", CallerData.NA, "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f50482f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a  reason: collision with root package name */
    private ro.a f50483a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: so.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C1121a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f50484a;

        static {
            int[] iArr = new int[b.values().length];
            f50484a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50484a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50484a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50484a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50484a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = h(zArr, i11 << 3);
        }
        return bArr;
    }

    private boolean[] b(boolean[] zArr) {
        wo.a aVar;
        int i11 = 8;
        if (this.f50483a.d() <= 2) {
            i11 = 6;
            aVar = wo.a.f56142j;
        } else if (this.f50483a.d() <= 8) {
            aVar = wo.a.f56146n;
        } else if (this.f50483a.d() <= 22) {
            i11 = 10;
            aVar = wo.a.f56141i;
        } else {
            i11 = 12;
            aVar = wo.a.f56140h;
        }
        int c11 = this.f50483a.c();
        int length = zArr.length / i11;
        if (length >= c11) {
            int length2 = zArr.length % i11;
            int[] iArr = new int[length];
            int i12 = 0;
            while (i12 < length) {
                iArr[i12] = i(zArr, length2, i11);
                i12++;
                length2 += i11;
            }
            try {
                new wo.c(aVar).a(iArr, length - c11);
                int i13 = (1 << i11) - 1;
                int i14 = 0;
                for (int i15 = 0; i15 < c11; i15++) {
                    int i16 = iArr[i15];
                    if (i16 == 0 || i16 == i13) {
                        throw FormatException.a();
                    }
                    if (i16 == 1 || i16 == i13 - 1) {
                        i14++;
                    }
                }
                boolean[] zArr2 = new boolean[(c11 * i11) - i14];
                int i17 = 0;
                for (int i18 = 0; i18 < c11; i18++) {
                    int i19 = iArr[i18];
                    if (i19 == 1 || i19 == i13 - 1) {
                        Arrays.fill(zArr2, i17, (i17 + i11) - 1, i19 > 1);
                        i17 += i11 - 1;
                    } else {
                        int i21 = i11 - 1;
                        while (i21 >= 0) {
                            int i22 = i17 + 1;
                            zArr2[i17] = ((1 << i21) & i19) != 0;
                            i21--;
                            i17 = i22;
                        }
                    }
                }
                return zArr2;
            } catch (ReedSolomonException e11) {
                throw FormatException.b(e11);
            }
        }
        throw FormatException.a();
    }

    private boolean[] d(uo.b bVar) {
        boolean e11 = this.f50483a.e();
        int d11 = this.f50483a.d();
        int i11 = (e11 ? 11 : 14) + (d11 << 2);
        int[] iArr = new int[i11];
        boolean[] zArr = new boolean[j(d11, e11)];
        int i12 = 2;
        if (e11) {
            for (int i13 = 0; i13 < i11; i13++) {
                iArr[i13] = i13;
            }
        } else {
            int i14 = i11 / 2;
            int i15 = ((i11 + 1) + (((i14 - 1) / 15) * 2)) / 2;
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = (i16 / 15) + i16;
                iArr[(i14 - i16) - 1] = (i15 - i17) - 1;
                iArr[i14 + i16] = i17 + i15 + 1;
            }
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < d11) {
            int i21 = ((d11 - i18) << i12) + (e11 ? 9 : 12);
            int i22 = i18 << 1;
            int i23 = (i11 - 1) - i22;
            int i24 = 0;
            while (i24 < i21) {
                int i25 = i24 << 1;
                int i26 = 0;
                while (i26 < i12) {
                    int i27 = i22 + i26;
                    int i28 = i22 + i24;
                    zArr[i19 + i25 + i26] = bVar.d(iArr[i27], iArr[i28]);
                    int i29 = iArr[i28];
                    int i31 = i23 - i26;
                    boolean z11 = e11;
                    zArr[(i21 * 2) + i19 + i25 + i26] = bVar.d(i29, iArr[i31]);
                    int i32 = i23 - i24;
                    zArr[(i21 * 4) + i19 + i25 + i26] = bVar.d(iArr[i31], iArr[i32]);
                    zArr[(i21 * 6) + i19 + i25 + i26] = bVar.d(iArr[i32], iArr[i27]);
                    i26++;
                    d11 = d11;
                    e11 = z11;
                    i12 = 2;
                }
                i24++;
                i12 = 2;
            }
            i19 += i21 << 3;
            i18++;
            i12 = 2;
        }
        return zArr;
    }

    private static String e(b bVar, int i11) {
        int i12 = C1121a.f50484a[bVar.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 == 5) {
                            return f50482f[i11];
                        }
                        throw new IllegalStateException("Bad table");
                    }
                    return f50481e[i11];
                }
                return f50480d[i11];
            }
            return f50479c[i11];
        }
        return f50478b[i11];
    }

    private static String f(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        b bVar2 = bVar;
        int i11 = 0;
        while (i11 < length) {
            if (bVar != b.BINARY) {
                int i12 = bVar == b.DIGIT ? 4 : 5;
                if (length - i11 < i12) {
                    break;
                }
                int i13 = i(zArr, i11, i12);
                i11 += i12;
                String e11 = e(bVar, i13);
                if (e11.startsWith("CTRL_")) {
                    bVar2 = g(e11.charAt(5));
                    if (e11.charAt(6) != 'L') {
                        bVar2 = bVar;
                        bVar = bVar2;
                    }
                } else {
                    sb2.append(e11);
                }
                bVar = bVar2;
            } else if (length - i11 < 5) {
                break;
            } else {
                int i14 = i(zArr, i11, 5);
                i11 += 5;
                if (i14 == 0) {
                    if (length - i11 < 11) {
                        break;
                    }
                    i14 = i(zArr, i11, 11) + 31;
                    i11 += 11;
                }
                int i15 = 0;
                while (true) {
                    if (i15 >= i14) {
                        break;
                    } else if (length - i11 < 8) {
                        i11 = length;
                        break;
                    } else {
                        sb2.append((char) i(zArr, i11, 8));
                        i11 += 8;
                        i15++;
                    }
                }
                bVar = bVar2;
            }
        }
        return sb2.toString();
    }

    private static b g(char c11) {
        if (c11 != 'B') {
            if (c11 != 'D') {
                if (c11 != 'P') {
                    if (c11 != 'L') {
                        if (c11 != 'M') {
                            return b.UPPER;
                        }
                        return b.MIXED;
                    }
                    return b.LOWER;
                }
                return b.PUNCT;
            }
            return b.DIGIT;
        }
        return b.BINARY;
    }

    private static byte h(boolean[] zArr, int i11) {
        int i12;
        int length = zArr.length - i11;
        if (length >= 8) {
            i12 = i(zArr, i11, 8);
        } else {
            i12 = i(zArr, i11, length) << (8 - length);
        }
        return (byte) i12;
    }

    private static int i(boolean[] zArr, int i11, int i12) {
        int i13 = 0;
        for (int i14 = i11; i14 < i11 + i12; i14++) {
            i13 <<= 1;
            if (zArr[i14]) {
                i13 |= 1;
            }
        }
        return i13;
    }

    private static int j(int i11, boolean z11) {
        return ((z11 ? 88 : 112) + (i11 << 4)) * i11;
    }

    public e c(ro.a aVar) {
        this.f50483a = aVar;
        boolean[] b11 = b(d(aVar.a()));
        e eVar = new e(a(b11), f(b11), null, null);
        eVar.l(b11.length);
        return eVar;
    }
}
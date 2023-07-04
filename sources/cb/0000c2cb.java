package yo;

import androidx.recyclerview.widget.l;
import ch.qos.logback.core.CoreConstants;
import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f59652a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO};

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f59653b;

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f59654c;

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f59655d;

    /* renamed from: e  reason: collision with root package name */
    private static final char[] f59656e;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59657a;

        static {
            int[] iArr = new int[b.values().length];
            f59657a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59657a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59657a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59657a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59657a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', CoreConstants.DOUBLE_QUOTE_CHAR, '#', CoreConstants.DOLLAR, CoreConstants.PERCENT_CHAR, '&', CoreConstants.SINGLE_QUOTE_CHAR, CoreConstants.LEFT_PARENTHESIS_CHAR, CoreConstants.RIGHT_PARENTHESIS_CHAR, '*', '+', CoreConstants.COMMA_CHAR, CoreConstants.DASH_CHAR, CoreConstants.DOT, '/', CoreConstants.COLON_CHAR, ';', '<', '=', '>', '?', '@', '[', CoreConstants.ESCAPE_CHAR, ']', '^', '_'};
        f59653b = cArr;
        f59654c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        f59655d = cArr;
        f59656e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, CoreConstants.CURLY_LEFT, '|', CoreConstants.CURLY_RIGHT, '~', 127};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static uo.e a(byte[] bArr) {
        uo.c cVar = new uo.c(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b bVar = b.ASCII_ENCODE;
        do {
            b bVar2 = b.ASCII_ENCODE;
            if (bVar == bVar2) {
                bVar = c(cVar, sb2, sb3);
            } else {
                int i11 = a.f59657a[bVar.ordinal()];
                if (i11 == 1) {
                    e(cVar, sb2);
                } else if (i11 == 2) {
                    g(cVar, sb2);
                } else if (i11 == 3) {
                    b(cVar, sb2);
                } else if (i11 == 4) {
                    f(cVar, sb2);
                } else if (i11 == 5) {
                    d(cVar, sb2, arrayList);
                } else {
                    throw FormatException.a();
                }
                bVar = bVar2;
            }
            if (bVar == b.PAD_ENCODE) {
                break;
            }
        } while (cVar.a() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        String sb4 = sb2.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new uo.e(bArr, sb4, arrayList, null);
    }

    private static void b(uo.c cVar, StringBuilder sb2) {
        int d11;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (d11 = cVar.d(8)) != 254) {
            h(d11, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i12 == 0) {
                    sb2.append('\r');
                } else if (i12 == 1) {
                    sb2.append('*');
                } else if (i12 == 2) {
                    sb2.append('>');
                } else if (i12 == 3) {
                    sb2.append(' ');
                } else if (i12 < 14) {
                    sb2.append((char) (i12 + 44));
                } else if (i12 < 40) {
                    sb2.append((char) (i12 + 51));
                } else {
                    throw FormatException.a();
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static b c(uo.c cVar, StringBuilder sb2, StringBuilder sb3) {
        boolean z11 = false;
        do {
            int d11 = cVar.d(8);
            if (d11 == 0) {
                throw FormatException.a();
            }
            if (d11 > 128) {
                if (d11 != 129) {
                    if (d11 <= 229) {
                        int i11 = d11 - 130;
                        if (i11 < 10) {
                            sb2.append('0');
                        }
                        sb2.append(i11);
                    } else {
                        switch (d11) {
                            case 230:
                                return b.C40_ENCODE;
                            case 231:
                                return b.BASE256_ENCODE;
                            case 232:
                                sb2.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z11 = true;
                                break;
                            case 236:
                                sb2.append("[)>\u001e05\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                sb2.append("[)>\u001e06\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return b.ANSIX12_ENCODE;
                            case 239:
                                return b.TEXT_ENCODE;
                            case 240:
                                return b.EDIFACT_ENCODE;
                            default:
                                if (d11 != 254 || cVar.a() != 0) {
                                    throw FormatException.a();
                                }
                                break;
                        }
                    }
                } else {
                    return b.PAD_ENCODE;
                }
            } else {
                if (z11) {
                    d11 += 128;
                }
                sb2.append((char) (d11 - 1));
                return b.ASCII_ENCODE;
            }
        } while (cVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    private static void d(uo.c cVar, StringBuilder sb2, Collection<byte[]> collection) {
        int c11 = cVar.c() + 1;
        int i11 = c11 + 1;
        int i12 = i(cVar.d(8), c11);
        if (i12 == 0) {
            i12 = cVar.a() / 8;
        } else if (i12 >= 250) {
            i12 = ((i12 - 249) * l.f.DEFAULT_SWIPE_ANIMATION_DURATION) + i(cVar.d(8), i11);
            i11++;
        }
        if (i12 >= 0) {
            byte[] bArr = new byte[i12];
            int i13 = 0;
            while (i13 < i12) {
                if (cVar.a() >= 8) {
                    bArr[i13] = (byte) i(cVar.d(8), i11);
                    i13++;
                    i11++;
                } else {
                    throw FormatException.a();
                }
            }
            collection.add(bArr);
            try {
                sb2.append(new String(bArr, "ISO8859_1"));
                return;
            } catch (UnsupportedEncodingException e11) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e11)));
            }
        }
        throw FormatException.a();
    }

    private static void e(uo.c cVar, StringBuilder sb2) {
        int d11;
        int[] iArr = new int[3];
        boolean z11 = false;
        int i11 = 0;
        while (cVar.a() != 8 && (d11 = cVar.d(8)) != 254) {
            h(d11, cVar.d(8), iArr);
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            char[] cArr = f59653b;
                            if (i13 < cArr.length) {
                                char c11 = cArr[i13];
                                if (z11) {
                                    sb2.append((char) (c11 + 128));
                                    z11 = false;
                                } else {
                                    sb2.append(c11);
                                }
                            } else if (i13 == 27) {
                                sb2.append((char) 29);
                            } else if (i13 != 30) {
                                throw FormatException.a();
                            } else {
                                z11 = true;
                            }
                            i11 = 0;
                        } else if (i11 != 3) {
                            throw FormatException.a();
                        } else {
                            if (z11) {
                                sb2.append((char) (i13 + 224));
                                z11 = false;
                                i11 = 0;
                            } else {
                                sb2.append((char) (i13 + 96));
                                i11 = 0;
                            }
                        }
                    } else if (z11) {
                        sb2.append((char) (i13 + 128));
                        z11 = false;
                        i11 = 0;
                    } else {
                        sb2.append((char) i13);
                        i11 = 0;
                    }
                } else if (i13 < 3) {
                    i11 = i13 + 1;
                } else {
                    char[] cArr2 = f59652a;
                    if (i13 < cArr2.length) {
                        char c12 = cArr2[i13];
                        if (z11) {
                            sb2.append((char) (c12 + 128));
                            z11 = false;
                        } else {
                            sb2.append(c12);
                        }
                    } else {
                        throw FormatException.a();
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void f(uo.c cVar, StringBuilder sb2) {
        while (cVar.a() > 16) {
            for (int i11 = 0; i11 < 4; i11++) {
                int d11 = cVar.d(6);
                if (d11 == 31) {
                    int b11 = 8 - cVar.b();
                    if (b11 != 8) {
                        cVar.d(b11);
                        return;
                    }
                    return;
                }
                if ((d11 & 32) == 0) {
                    d11 |= 64;
                }
                sb2.append((char) d11);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void g(uo.c cVar, StringBuilder sb2) {
        int d11;
        int[] iArr = new int[3];
        boolean z11 = false;
        int i11 = 0;
        while (cVar.a() != 8 && (d11 = cVar.d(8)) != 254) {
            h(d11, cVar.d(8), iArr);
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            char[] cArr = f59655d;
                            if (i13 < cArr.length) {
                                char c11 = cArr[i13];
                                if (z11) {
                                    sb2.append((char) (c11 + 128));
                                    z11 = false;
                                } else {
                                    sb2.append(c11);
                                }
                            } else if (i13 == 27) {
                                sb2.append((char) 29);
                            } else if (i13 != 30) {
                                throw FormatException.a();
                            } else {
                                z11 = true;
                            }
                            i11 = 0;
                        } else if (i11 == 3) {
                            char[] cArr2 = f59656e;
                            if (i13 < cArr2.length) {
                                char c12 = cArr2[i13];
                                if (z11) {
                                    sb2.append((char) (c12 + 128));
                                    z11 = false;
                                    i11 = 0;
                                } else {
                                    sb2.append(c12);
                                    i11 = 0;
                                }
                            } else {
                                throw FormatException.a();
                            }
                        } else {
                            throw FormatException.a();
                        }
                    } else if (z11) {
                        sb2.append((char) (i13 + 128));
                        z11 = false;
                        i11 = 0;
                    } else {
                        sb2.append((char) i13);
                        i11 = 0;
                    }
                } else if (i13 < 3) {
                    i11 = i13 + 1;
                } else {
                    char[] cArr3 = f59654c;
                    if (i13 < cArr3.length) {
                        char c13 = cArr3[i13];
                        if (z11) {
                            sb2.append((char) (c13 + 128));
                            z11 = false;
                        } else {
                            sb2.append(c13);
                        }
                    } else {
                        throw FormatException.a();
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void h(int i11, int i12, int[] iArr) {
        int i13 = ((i11 << 8) + i12) - 1;
        int i14 = i13 / 1600;
        iArr[0] = i14;
        int i15 = i13 - (i14 * 1600);
        int i16 = i15 / 40;
        iArr[1] = i16;
        iArr[2] = i15 - (i16 * 40);
    }

    private static int i(int i11, int i12) {
        int i13 = i11 - (((i12 * 149) % 255) + 1);
        return i13 >= 0 ? i13 : i13 + 256;
    }
}
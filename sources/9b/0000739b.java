package hp;

import com.google.zxing.FormatException;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f29373a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f29374b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c  reason: collision with root package name */
    private static final BigInteger[] f29375c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29376a;

        static {
            int[] iArr = new int[b.values().length];
            f29376a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29376a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29376a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29376a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29376a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29376a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f29375c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i11 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f29375c;
            if (i11 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i11] = bigIntegerArr2[i11 - 1].multiply(valueOf);
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0021 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.e.a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static uo.e b(int[] r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = r6[r2]
            gp.c r3 = new gp.c
            r3.<init>()
            r4 = 2
        L12:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L6d
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L58
            switch(r2) {
                case 900: goto L53;
                case 901: goto L4e;
                case 902: goto L49;
                default: goto L1e;
            }
        L1e:
            switch(r2) {
                case 922: goto L44;
                case 923: goto L44;
                case 924: goto L4e;
                case 925: goto L41;
                case 926: goto L3e;
                case 927: goto L2d;
                case 928: goto L28;
                default: goto L21;
            }
        L21:
            int r4 = r4 + (-1)
            int r2 = g(r6, r4, r0)
            goto L60
        L28:
            int r2 = d(r6, r4, r3)
            goto L60
        L2d:
            int r2 = r4 + 1
            r1 = r6[r4]
            uo.d r1 = uo.d.getCharacterSetECIByValue(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L60
        L3e:
            int r2 = r4 + 2
            goto L60
        L41:
            int r2 = r4 + 1
            goto L60
        L44:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.a()
            throw r6
        L49:
            int r2 = f(r6, r4, r0)
            goto L60
        L4e:
            int r2 = a(r2, r6, r1, r4, r0)
            goto L60
        L53:
            int r2 = g(r6, r4, r0)
            goto L60
        L58:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L60:
            int r4 = r6.length
            if (r2 >= r4) goto L68
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L12
        L68:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.a()
            throw r6
        L6d:
            int r6 = r0.length()
            if (r6 == 0) goto L81
            uo.e r6 = new uo.e
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.m(r3)
            return r6
        L81:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.e.b(int[], java.lang.String):uo.e");
    }

    private static String c(int[] iArr, int i11) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i12 = 0; i12 < i11; i12++) {
            bigInteger = bigInteger.add(f29375c[(i11 - i12) - 1].multiply(BigInteger.valueOf(iArr[i12])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.a();
    }

    static int d(int[] iArr, int i11, gp.c cVar) {
        if (i11 + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i12 = 0;
            while (i12 < 2) {
                iArr2[i12] = iArr[i11];
                i12++;
                i11++;
            }
            cVar.j(Integer.parseInt(c(iArr2, 2)));
            StringBuilder sb2 = new StringBuilder();
            int g11 = g(iArr, i11, sb2);
            cVar.d(sb2.toString());
            int i13 = iArr[g11] == 923 ? g11 + 1 : -1;
            while (g11 < iArr[0]) {
                int i14 = iArr[g11];
                if (i14 == 922) {
                    g11++;
                    cVar.g(true);
                } else if (i14 == 923) {
                    int i15 = g11 + 1;
                    switch (iArr[i15]) {
                        case 0:
                            StringBuilder sb3 = new StringBuilder();
                            g11 = g(iArr, i15 + 1, sb3);
                            cVar.e(sb3.toString());
                            continue;
                        case 1:
                            StringBuilder sb4 = new StringBuilder();
                            g11 = f(iArr, i15 + 1, sb4);
                            cVar.i(Integer.parseInt(sb4.toString()));
                            continue;
                        case 2:
                            StringBuilder sb5 = new StringBuilder();
                            g11 = f(iArr, i15 + 1, sb5);
                            cVar.l(Long.parseLong(sb5.toString()));
                            continue;
                        case 3:
                            StringBuilder sb6 = new StringBuilder();
                            g11 = g(iArr, i15 + 1, sb6);
                            cVar.k(sb6.toString());
                            continue;
                        case 4:
                            StringBuilder sb7 = new StringBuilder();
                            g11 = g(iArr, i15 + 1, sb7);
                            cVar.b(sb7.toString());
                            continue;
                        case 5:
                            StringBuilder sb8 = new StringBuilder();
                            g11 = f(iArr, i15 + 1, sb8);
                            cVar.f(Long.parseLong(sb8.toString()));
                            continue;
                        case 6:
                            StringBuilder sb9 = new StringBuilder();
                            g11 = f(iArr, i15 + 1, sb9);
                            cVar.c(Integer.parseInt(sb9.toString()));
                            continue;
                        default:
                            throw FormatException.a();
                    }
                } else {
                    throw FormatException.a();
                }
            }
            if (i13 != -1) {
                int i16 = g11 - i13;
                if (cVar.a()) {
                    i16--;
                }
                cVar.h(Arrays.copyOfRange(iArr, i13, i16 + i13));
            }
            return g11;
        }
        throw FormatException.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void e(int[] iArr, int[] iArr2, int i11, StringBuilder sb2) {
        b bVar;
        int i12;
        b bVar2 = b.ALPHA;
        b bVar3 = bVar2;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = iArr[i13];
            char c11 = ' ';
            switch (a.f29376a[bVar2.ordinal()]) {
                case 1:
                    if (i14 < 26) {
                        i12 = i14 + 65;
                        c11 = (char) i12;
                        break;
                    } else {
                        if (i14 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i14 != 913) {
                            switch (i14) {
                                case 27:
                                    bVar2 = b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = b.MIXED;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    c11 = 0;
                                    b bVar4 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar4;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                        break;
                    }
                case 2:
                    if (i14 < 26) {
                        i12 = i14 + 97;
                        c11 = (char) i12;
                        break;
                    } else {
                        if (i14 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i14 != 913) {
                            switch (i14) {
                                case 27:
                                    bVar = b.ALPHA_SHIFT;
                                    c11 = 0;
                                    b bVar42 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar42;
                                    break;
                                case 28:
                                    bVar2 = b.MIXED;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    c11 = 0;
                                    b bVar422 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar422;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                        break;
                    }
                case 3:
                    if (i14 < 25) {
                        c11 = f29374b[i14];
                        break;
                    } else {
                        if (i14 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i14 != 913) {
                            switch (i14) {
                                case 25:
                                    bVar2 = b.PUNCT;
                                    break;
                                case 27:
                                    bVar2 = b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = b.ALPHA;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    c11 = 0;
                                    b bVar4222 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar4222;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                        break;
                    }
                case 4:
                    if (i14 < 29) {
                        c11 = f29373a[i14];
                        break;
                    } else {
                        if (i14 == 29) {
                            bVar2 = b.ALPHA;
                        } else if (i14 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i14 == 913) {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                        break;
                    }
                case 5:
                    if (i14 < 26) {
                        c11 = (char) (i14 + 65);
                    } else if (i14 != 26) {
                        bVar2 = i14 != 900 ? bVar3 : b.ALPHA;
                        c11 = 0;
                        break;
                    }
                    bVar2 = bVar3;
                    break;
                case 6:
                    if (i14 >= 29) {
                        if (i14 == 29) {
                            bVar2 = b.ALPHA;
                        } else if (i14 != 900) {
                            if (i14 == 913) {
                                sb2.append((char) iArr2[i13]);
                            }
                            c11 = 0;
                        } else {
                            bVar2 = b.ALPHA;
                        }
                        c11 = 0;
                        break;
                    } else {
                        c11 = f29373a[i14];
                    }
                    bVar2 = bVar3;
                    break;
                default:
                    c11 = 0;
                    break;
            }
            if (c11 != 0) {
                sb2.append(c11);
            }
        }
    }

    private static int f(int[] iArr, int i11, StringBuilder sb2) {
        int[] iArr2 = new int[15];
        boolean z11 = false;
        int i12 = 0;
        while (i11 < iArr[0] && !z11) {
            int i13 = i11 + 1;
            int i14 = iArr[i11];
            if (i13 == iArr[0]) {
                z11 = true;
            }
            if (i14 < 900) {
                iArr2[i12] = i14;
                i12++;
            } else {
                if (i14 != 900 && i14 != 901 && i14 != 928) {
                    switch (i14) {
                    }
                }
                i13--;
                z11 = true;
            }
            if ((i12 % 15 == 0 || i14 == 902 || z11) && i12 > 0) {
                sb2.append(c(iArr2, i12));
                i12 = 0;
            }
            i11 = i13;
        }
        return i11;
    }

    private static int g(int[] iArr, int i11, StringBuilder sb2) {
        int[] iArr2 = new int[(iArr[0] - i11) << 1];
        int[] iArr3 = new int[(iArr[0] - i11) << 1];
        boolean z11 = false;
        int i12 = 0;
        while (i11 < iArr[0] && !z11) {
            int i13 = i11 + 1;
            int i14 = iArr[i11];
            if (i14 < 900) {
                iArr2[i12] = i14 / 30;
                iArr2[i12 + 1] = i14 % 30;
                i12 += 2;
            } else if (i14 != 913) {
                if (i14 != 928) {
                    switch (i14) {
                        case 900:
                            iArr2[i12] = 900;
                            i12++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i14) {
                            }
                    }
                }
                i11 = i13 - 1;
                z11 = true;
            } else {
                iArr2[i12] = 913;
                i11 = i13 + 1;
                iArr3[i12] = iArr[i13];
                i12++;
            }
            i11 = i13;
        }
        e(iArr2, iArr3, i12, sb2);
        return i11;
    }
}
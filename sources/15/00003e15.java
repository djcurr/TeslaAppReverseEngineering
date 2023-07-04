package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import uo.l;

/* loaded from: classes2.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f17444a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17445a;

        static {
            int[] iArr = new int[h.values().length];
            f17445a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17445a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17445a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17445a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17445a[h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17445a[h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17445a[h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17445a[h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17445a[h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17445a[h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static uo.e a(byte[] bArr, j jVar, f fVar, Map<com.google.zxing.d, ?> map) {
        h forBits;
        h hVar;
        uo.c cVar = new uo.c(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        boolean z11 = true;
        ArrayList arrayList = new ArrayList(1);
        boolean z12 = false;
        int i11 = -1;
        int i12 = -1;
        uo.d dVar = null;
        while (true) {
            try {
                if (cVar.a() < 4) {
                    forBits = h.TERMINATOR;
                } else {
                    forBits = h.forBits(cVar.d(4));
                }
                h hVar2 = forBits;
                int[] iArr = a.f17445a;
                switch (iArr[hVar2.ordinal()]) {
                    case 5:
                        hVar = hVar2;
                        break;
                    case 6:
                    case 7:
                        z12 = z11;
                        hVar = hVar2;
                        break;
                    case 8:
                        if (cVar.a() >= 16) {
                            int d11 = cVar.d(8);
                            i12 = cVar.d(8);
                            i11 = d11;
                            hVar = hVar2;
                            break;
                        } else {
                            throw FormatException.a();
                        }
                    case 9:
                        dVar = uo.d.getCharacterSetECIByValue(g(cVar));
                        if (dVar != null) {
                            hVar = hVar2;
                            break;
                        } else {
                            throw FormatException.a();
                        }
                    case 10:
                        int d12 = cVar.d(4);
                        int d13 = cVar.d(hVar2.getCharacterCountBits(jVar));
                        if (d12 == z11) {
                            d(cVar, sb2, d13);
                        }
                        hVar = hVar2;
                        break;
                    default:
                        int d14 = cVar.d(hVar2.getCharacterCountBits(jVar));
                        int i13 = iArr[hVar2.ordinal()];
                        if (i13 == z11) {
                            hVar = hVar2;
                            f(cVar, sb2, d14);
                            break;
                        } else if (i13 == 2) {
                            hVar = hVar2;
                            b(cVar, sb2, d14, z12);
                            break;
                        } else if (i13 == 3) {
                            hVar = hVar2;
                            c(cVar, sb2, d14, dVar, arrayList, map);
                            break;
                        } else if (i13 == 4) {
                            e(cVar, sb2, d14);
                            hVar = hVar2;
                            break;
                        } else {
                            throw FormatException.a();
                        }
                }
                if (hVar == h.TERMINATOR) {
                    return new uo.e(bArr, sb2.toString(), arrayList.isEmpty() ? null : arrayList, fVar == null ? null : fVar.toString(), i11, i12);
                }
                z11 = true;
            } catch (IllegalArgumentException unused) {
                throw FormatException.a();
            }
        }
    }

    private static void b(uo.c cVar, StringBuilder sb2, int i11, boolean z11) {
        while (i11 > 1) {
            if (cVar.a() >= 11) {
                int d11 = cVar.d(11);
                sb2.append(h(d11 / 45));
                sb2.append(h(d11 % 45));
                i11 -= 2;
            } else {
                throw FormatException.a();
            }
        }
        if (i11 == 1) {
            if (cVar.a() >= 6) {
                sb2.append(h(cVar.d(6)));
            } else {
                throw FormatException.a();
            }
        }
        if (z11) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i12 = length + 1;
                        if (sb2.charAt(i12) == '%') {
                            sb2.deleteCharAt(i12);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    private static void c(uo.c cVar, StringBuilder sb2, int i11, uo.d dVar, Collection<byte[]> collection, Map<com.google.zxing.d, ?> map) {
        String name;
        if ((i11 << 3) <= cVar.a()) {
            byte[] bArr = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                bArr[i12] = (byte) cVar.d(8);
            }
            if (dVar == null) {
                name = l.a(bArr, map);
            } else {
                name = dVar.name();
            }
            try {
                sb2.append(new String(bArr, name));
                collection.add(bArr);
                return;
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.a();
            }
        }
        throw FormatException.a();
    }

    private static void d(uo.c cVar, StringBuilder sb2, int i11) {
        if (i11 * 13 <= cVar.a()) {
            byte[] bArr = new byte[i11 * 2];
            int i12 = 0;
            while (i11 > 0) {
                int d11 = cVar.d(13);
                int i13 = (d11 % 96) | ((d11 / 96) << 8);
                int i14 = i13 + (i13 < 959 ? 41377 : 42657);
                bArr[i12] = (byte) (i14 >> 8);
                bArr[i12 + 1] = (byte) i14;
                i12 += 2;
                i11--;
            }
            try {
                sb2.append(new String(bArr, "GB2312"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.a();
            }
        }
        throw FormatException.a();
    }

    private static void e(uo.c cVar, StringBuilder sb2, int i11) {
        if (i11 * 13 <= cVar.a()) {
            byte[] bArr = new byte[i11 * 2];
            int i12 = 0;
            while (i11 > 0) {
                int d11 = cVar.d(13);
                int i13 = (d11 % 192) | ((d11 / 192) << 8);
                int i14 = i13 + (i13 < 7936 ? 33088 : 49472);
                bArr[i12] = (byte) (i14 >> 8);
                bArr[i12 + 1] = (byte) i14;
                i12 += 2;
                i11--;
            }
            try {
                sb2.append(new String(bArr, "SJIS"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.a();
            }
        }
        throw FormatException.a();
    }

    private static void f(uo.c cVar, StringBuilder sb2, int i11) {
        while (i11 >= 3) {
            if (cVar.a() >= 10) {
                int d11 = cVar.d(10);
                if (d11 < 1000) {
                    sb2.append(h(d11 / 100));
                    sb2.append(h((d11 / 10) % 10));
                    sb2.append(h(d11 % 10));
                    i11 -= 3;
                } else {
                    throw FormatException.a();
                }
            } else {
                throw FormatException.a();
            }
        }
        if (i11 == 2) {
            if (cVar.a() >= 7) {
                int d12 = cVar.d(7);
                if (d12 < 100) {
                    sb2.append(h(d12 / 10));
                    sb2.append(h(d12 % 10));
                    return;
                }
                throw FormatException.a();
            }
            throw FormatException.a();
        } else if (i11 == 1) {
            if (cVar.a() >= 4) {
                int d13 = cVar.d(4);
                if (d13 < 10) {
                    sb2.append(h(d13));
                    return;
                }
                throw FormatException.a();
            }
            throw FormatException.a();
        }
    }

    private static int g(uo.c cVar) {
        int d11 = cVar.d(8);
        if ((d11 & 128) == 0) {
            return d11 & 127;
        }
        if ((d11 & 192) == 128) {
            return cVar.d(8) | ((d11 & 63) << 8);
        }
        if ((d11 & 224) == 192) {
            return cVar.d(16) | ((d11 & 31) << 16);
        }
        throw FormatException.a();
    }

    private static char h(int i11) {
        char[] cArr = f17444a;
        if (i11 < cArr.length) {
            return cArr[i11];
        }
        throw FormatException.a();
    }
}
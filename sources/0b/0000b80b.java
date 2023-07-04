package uo;

import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final String f53644a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f53645b;

    static {
        String name = Charset.defaultCharset().name();
        f53644a = name;
        f53645b = "SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name);
    }

    public static String a(byte[] bArr, Map<com.google.zxing.d, ?> map) {
        byte[] bArr2 = bArr;
        if (map != null) {
            com.google.zxing.d dVar = com.google.zxing.d.CHARACTER_SET;
            if (map.containsKey(dVar)) {
                return map.get(dVar).toString();
            }
        }
        int length = bArr2.length;
        boolean z11 = true;
        int i11 = 0;
        boolean z12 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        boolean z13 = true;
        boolean z14 = true;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i13 < length && (z11 || z13 || z14)) {
            int i24 = bArr2[i13] & 255;
            if (z14) {
                if (i14 > 0) {
                    if ((i24 & 128) != 0) {
                        i14--;
                    }
                    z14 = false;
                } else if ((i24 & 128) != 0) {
                    if ((i24 & 64) != 0) {
                        i14++;
                        if ((i24 & 32) == 0) {
                            i16++;
                        } else {
                            i14++;
                            if ((i24 & 16) == 0) {
                                i17++;
                            } else {
                                i14++;
                                if ((i24 & 8) == 0) {
                                    i18++;
                                }
                            }
                        }
                    }
                    z14 = false;
                }
            }
            if (z11) {
                if (i24 > 127 && i24 < 160) {
                    z11 = false;
                } else if (i24 > 159 && (i24 < 192 || i24 == 215 || i24 == 247)) {
                    i21++;
                }
            }
            if (z13) {
                if (i15 > 0) {
                    if (i24 >= 64 && i24 != 127 && i24 <= 252) {
                        i15--;
                    }
                    z13 = false;
                } else {
                    if (i24 != 128 && i24 != 160 && i24 <= 239) {
                        if (i24 <= 160 || i24 >= 224) {
                            if (i24 > 127) {
                                i15++;
                                int i25 = i22 + 1;
                                if (i25 > i11) {
                                    i11 = i25;
                                    i22 = i11;
                                } else {
                                    i22 = i25;
                                }
                            } else {
                                i22 = 0;
                            }
                            i23 = 0;
                        } else {
                            i12++;
                            int i26 = i23 + 1;
                            if (i26 > i19) {
                                i19 = i26;
                                i23 = i19;
                            } else {
                                i23 = i26;
                            }
                            i22 = 0;
                        }
                    }
                    z13 = false;
                }
            }
            i13++;
            bArr2 = bArr;
        }
        if (z14 && i14 > 0) {
            z14 = false;
        }
        if (z13 && i15 > 0) {
            z13 = false;
        }
        return (!z14 || (!z12 && (i16 + i17) + i18 <= 0)) ? (!z13 || (!f53645b && i19 < 3 && i11 < 3)) ? (z11 && z13) ? (!(i19 == 2 && i12 == 2) && i21 * 10 < length) ? "ISO8859_1" : "SJIS" : z11 ? "ISO8859_1" : z13 ? "SJIS" : z14 ? "UTF8" : f53644a : "SJIS" : "UTF8";
    }
}
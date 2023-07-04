package ei;

import ak.k0;
import ak.v;
import ci.i;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import java.nio.ByteBuffer;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f25112a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f25113b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f25114c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f25115d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f25116e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f25117f = {69, 87, 104, 121, 139, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 208, 243, 278, 348, 417, DownloaderService.STATUS_FILE_DELIVERED_INCORRECTLY, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: ei.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0488b {

        /* renamed from: a  reason: collision with root package name */
        public final String f25118a;

        /* renamed from: b  reason: collision with root package name */
        public final int f25119b;

        /* renamed from: c  reason: collision with root package name */
        public final int f25120c;

        /* renamed from: d  reason: collision with root package name */
        public final int f25121d;

        /* renamed from: e  reason: collision with root package name */
        public final int f25122e;

        private C0488b(String str, int i11, int i12, int i13, int i14, int i15) {
            this.f25118a = str;
            this.f25120c = i12;
            this.f25119b = i13;
            this.f25121d = i14;
            this.f25122e = i15;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i11 = position; i11 <= limit; i11++) {
            if ((k0.H(byteBuffer, i11 + 4) & (-2)) == -126718022) {
                return i11 - position;
            }
        }
        return -1;
    }

    private static int b(int i11, int i12) {
        int i13 = i12 / 2;
        if (i11 >= 0) {
            int[] iArr = f25113b;
            if (i11 >= iArr.length || i12 < 0) {
                return -1;
            }
            int[] iArr2 = f25117f;
            if (i13 >= iArr2.length) {
                return -1;
            }
            int i14 = iArr[i11];
            if (i14 == 44100) {
                return (iArr2[i13] + (i12 % 2)) * 2;
            }
            int i15 = f25116e[i13];
            return i14 == 32000 ? i15 * 6 : i15 * 4;
        }
        return -1;
    }

    public static ci.i c(v vVar, String str, String str2, com.google.android.exoplayer2.drm.e eVar) {
        int i11 = f25113b[(vVar.C() & 192) >> 6];
        int C = vVar.C();
        int i12 = f25115d[(C & 56) >> 3];
        if ((C & 4) != 0) {
            i12++;
        }
        return new i.b().S(str).e0("audio/ac3").H(i12).f0(i11).L(eVar).V(str2).E();
    }

    public static int d(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f25112a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0488b e(ak.u uVar) {
        int b11;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int h11;
        int i15;
        int i16;
        int i17;
        int i18;
        int e11 = uVar.e();
        uVar.r(40);
        boolean z11 = uVar.h(5) > 10;
        uVar.p(e11);
        int i19 = -1;
        if (z11) {
            uVar.r(16);
            int h12 = uVar.h(2);
            if (h12 == 0) {
                i19 = 0;
            } else if (h12 == 1) {
                i19 = 1;
            } else if (h12 == 2) {
                i19 = 2;
            }
            uVar.r(3);
            b11 = (uVar.h(11) + 1) * 2;
            int h13 = uVar.h(2);
            if (h13 == 3) {
                i11 = f25114c[uVar.h(2)];
                i15 = 6;
                h11 = 3;
            } else {
                h11 = uVar.h(2);
                i15 = f25112a[h11];
                i11 = f25113b[h13];
            }
            i12 = i15 * 256;
            int h14 = uVar.h(3);
            boolean g11 = uVar.g();
            i13 = f25115d[h14] + (g11 ? 1 : 0);
            uVar.r(10);
            if (uVar.g()) {
                uVar.r(8);
            }
            if (h14 == 0) {
                uVar.r(5);
                if (uVar.g()) {
                    uVar.r(8);
                }
            }
            if (i19 == 1 && uVar.g()) {
                uVar.r(16);
            }
            if (uVar.g()) {
                if (h14 > 2) {
                    uVar.r(2);
                }
                if ((h14 & 1) == 0 || h14 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    uVar.r(6);
                }
                if ((h14 & 4) != 0) {
                    uVar.r(i17);
                }
                if (g11 && uVar.g()) {
                    uVar.r(5);
                }
                if (i19 == 0) {
                    if (uVar.g()) {
                        i18 = 6;
                        uVar.r(6);
                    } else {
                        i18 = 6;
                    }
                    if (h14 == 0 && uVar.g()) {
                        uVar.r(i18);
                    }
                    if (uVar.g()) {
                        uVar.r(i18);
                    }
                    int h15 = uVar.h(2);
                    if (h15 == 1) {
                        uVar.r(5);
                    } else if (h15 == 2) {
                        uVar.r(12);
                    } else if (h15 == 3) {
                        int h16 = uVar.h(5);
                        if (uVar.g()) {
                            uVar.r(5);
                            if (uVar.g()) {
                                uVar.r(4);
                            }
                            if (uVar.g()) {
                                uVar.r(4);
                            }
                            if (uVar.g()) {
                                uVar.r(4);
                            }
                            if (uVar.g()) {
                                uVar.r(4);
                            }
                            if (uVar.g()) {
                                uVar.r(4);
                            }
                            if (uVar.g()) {
                                uVar.r(4);
                            }
                            if (uVar.g()) {
                                uVar.r(4);
                            }
                            if (uVar.g()) {
                                if (uVar.g()) {
                                    uVar.r(4);
                                }
                                if (uVar.g()) {
                                    uVar.r(4);
                                }
                            }
                        }
                        if (uVar.g()) {
                            uVar.r(5);
                            if (uVar.g()) {
                                uVar.r(7);
                                if (uVar.g()) {
                                    uVar.r(8);
                                }
                            }
                        }
                        uVar.r((h16 + 2) * 8);
                        uVar.c();
                    }
                    if (h14 < 2) {
                        if (uVar.g()) {
                            uVar.r(14);
                        }
                        if (h14 == 0 && uVar.g()) {
                            uVar.r(14);
                        }
                    }
                    if (uVar.g()) {
                        if (h11 == 0) {
                            uVar.r(5);
                        } else {
                            for (int i21 = 0; i21 < i15; i21++) {
                                if (uVar.g()) {
                                    uVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (uVar.g()) {
                uVar.r(5);
                if (h14 == 2) {
                    uVar.r(4);
                }
                if (h14 >= 6) {
                    uVar.r(2);
                }
                if (uVar.g()) {
                    uVar.r(8);
                }
                if (h14 == 0 && uVar.g()) {
                    uVar.r(8);
                }
                if (h13 < 3) {
                    uVar.q();
                }
            }
            if (i19 == 0 && h11 != 3) {
                uVar.q();
            }
            if (i19 == 2 && (h11 == 3 || uVar.g())) {
                i16 = 6;
                uVar.r(6);
            } else {
                i16 = 6;
            }
            str = (uVar.g() && uVar.h(i16) == 1 && uVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i14 = i19;
        } else {
            uVar.r(32);
            int h17 = uVar.h(2);
            String str2 = h17 == 3 ? null : "audio/ac3";
            b11 = b(h17, uVar.h(6));
            uVar.r(8);
            int h18 = uVar.h(3);
            if ((h18 & 1) != 0 && h18 != 1) {
                uVar.r(2);
            }
            if ((h18 & 4) != 0) {
                uVar.r(2);
            }
            if (h18 == 2) {
                uVar.r(2);
            }
            int[] iArr = f25113b;
            i11 = h17 < iArr.length ? iArr[h17] : -1;
            i12 = 1536;
            i13 = f25115d[h18] + (uVar.g() ? 1 : 0);
            i14 = -1;
            str = str2;
        }
        return new C0488b(str, i14, i13, i11, b11, i12);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return b((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static ci.i g(v vVar, String str, String str2, com.google.android.exoplayer2.drm.e eVar) {
        vVar.P(2);
        int i11 = f25113b[(vVar.C() & 192) >> 6];
        int C = vVar.C();
        int i12 = f25115d[(C & 14) >> 1];
        if ((C & 1) != 0) {
            i12++;
        }
        if (((vVar.C() & 30) >> 1) > 0 && (2 & vVar.C()) != 0) {
            i12 += 2;
        }
        return new i.b().S(str).e0((vVar.a() <= 0 || (vVar.C() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").H(i12).f0(i11).L(eVar).V(str2).E();
    }

    public static int h(ByteBuffer byteBuffer, int i11) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i11) + ((byteBuffer.get((byteBuffer.position() + i11) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }
}
package ui;

import ak.k0;
import ak.v;
import android.util.Pair;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import ji.h;
import ji.j;
import ji.l;
import ji.u;
import ji.x;
import okhttp3.internal.http.StatusLine;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
public final class b implements h {

    /* renamed from: a */
    private j f53435a;

    /* renamed from: b */
    private x f53436b;

    /* renamed from: c */
    private InterfaceC1199b f53437c;

    /* renamed from: d */
    private int f53438d = -1;

    /* renamed from: e */
    private long f53439e = -1;

    /* loaded from: classes3.dex */
    private static final class a implements InterfaceC1199b {

        /* renamed from: m */
        private static final int[] f53440m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        private static final int[] f53441n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 143, 157, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, DownloaderService.STATUS_UNHANDLED_HTTP_CODE, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        private final j f53442a;

        /* renamed from: b */
        private final x f53443b;

        /* renamed from: c */
        private final ui.c f53444c;

        /* renamed from: d */
        private final int f53445d;

        /* renamed from: e */
        private final byte[] f53446e;

        /* renamed from: f */
        private final v f53447f;

        /* renamed from: g */
        private final int f53448g;

        /* renamed from: h */
        private final i f53449h;

        /* renamed from: i */
        private int f53450i;

        /* renamed from: j */
        private long f53451j;

        /* renamed from: k */
        private int f53452k;

        /* renamed from: l */
        private long f53453l;

        public a(j jVar, x xVar, ui.c cVar) {
            this.f53442a = jVar;
            this.f53443b = xVar;
            this.f53444c = cVar;
            int max = Math.max(1, cVar.f53464c / 10);
            this.f53448g = max;
            v vVar = new v(cVar.f53467f);
            vVar.u();
            int u11 = vVar.u();
            this.f53445d = u11;
            int i11 = cVar.f53463b;
            int i12 = (((cVar.f53465d - (i11 * 4)) * 8) / (cVar.f53466e * i11)) + 1;
            if (u11 == i12) {
                int l11 = k0.l(max, u11);
                this.f53446e = new byte[cVar.f53465d * l11];
                this.f53447f = new v(l11 * h(u11, i11));
                int i13 = ((cVar.f53464c * cVar.f53465d) * 8) / u11;
                this.f53449h = new i.b().e0("audio/raw").G(i13).Z(i13).W(h(max, i11)).H(cVar.f53463b).f0(cVar.f53464c).Y(2).E();
                return;
            }
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append("Expected frames per block: ");
            sb2.append(i12);
            sb2.append("; got: ");
            sb2.append(u11);
            throw new ParserException(sb2.toString());
        }

        private void d(byte[] bArr, int i11, v vVar) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < this.f53444c.f53463b; i13++) {
                    e(bArr, i12, i13, vVar.d());
                }
            }
            int g11 = g(this.f53445d * i11);
            vVar.O(0);
            vVar.N(g11);
        }

        private void e(byte[] bArr, int i11, int i12, byte[] bArr2) {
            ui.c cVar = this.f53444c;
            int i13 = cVar.f53465d;
            int i14 = cVar.f53463b;
            int i15 = (i11 * i13) + (i12 * 4);
            int i16 = (i14 * 4) + i15;
            int i17 = (i13 / i14) - 4;
            int i18 = (short) (((bArr[i15 + 1] & 255) << 8) | (bArr[i15] & 255));
            int min = Math.min(bArr[i15 + 2] & 255, 88);
            int i19 = f53441n[min];
            int i21 = ((i11 * this.f53445d * i14) + i12) * 2;
            bArr2[i21] = (byte) (i18 & 255);
            bArr2[i21 + 1] = (byte) (i18 >> 8);
            for (int i22 = 0; i22 < i17 * 2; i22++) {
                int i23 = bArr[((i22 / 8) * i14 * 4) + i16 + ((i22 / 2) % 4)] & 255;
                int i24 = i22 % 2 == 0 ? i23 & 15 : i23 >> 4;
                int i25 = ((((i24 & 7) * 2) + 1) * i19) >> 3;
                if ((i24 & 8) != 0) {
                    i25 = -i25;
                }
                i18 = k0.r(i18 + i25, -32768, 32767);
                i21 += i14 * 2;
                bArr2[i21] = (byte) (i18 & 255);
                bArr2[i21 + 1] = (byte) (i18 >> 8);
                int i26 = min + f53440m[i24];
                int[] iArr = f53441n;
                min = k0.r(i26, 0, iArr.length - 1);
                i19 = iArr[min];
            }
        }

        private int f(int i11) {
            return i11 / (this.f53444c.f53463b * 2);
        }

        private int g(int i11) {
            return h(i11, this.f53444c.f53463b);
        }

        private static int h(int i11, int i12) {
            return i11 * 2 * i12;
        }

        private void i(int i11) {
            long I0 = this.f53451j + k0.I0(this.f53453l, 1000000L, this.f53444c.f53464c);
            int g11 = g(i11);
            this.f53443b.f(I0, 1, g11, this.f53452k - g11, null);
            this.f53453l += i11;
            this.f53452k -= g11;
        }

        @Override // ui.b.InterfaceC1199b
        public void a(int i11, long j11) {
            this.f53442a.p(new e(this.f53444c, this.f53445d, i11, j11));
            this.f53443b.d(this.f53449h);
        }

        @Override // ui.b.InterfaceC1199b
        public void b(long j11) {
            this.f53450i = 0;
            this.f53451j = j11;
            this.f53452k = 0;
            this.f53453l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0047  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0035 -> B:31:0x001b). Please submit an issue!!! */
        @Override // ui.b.InterfaceC1199b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(ji.i r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f53448g
                int r1 = r6.f53452k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f53445d
                int r0 = ak.k0.l(r0, r1)
                ui.c r1 = r6.f53444c
                int r1 = r1.f53465d
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f53450i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f53446e
                int r5 = r6.f53450i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f53450i
                int r4 = r4 + r3
                r6.f53450i = r4
                goto L1e
            L3e:
                int r7 = r6.f53450i
                ui.c r8 = r6.f53444c
                int r8 = r8.f53465d
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f53446e
                ak.v r9 = r6.f53447f
                r6.d(r8, r7, r9)
                int r8 = r6.f53450i
                ui.c r9 = r6.f53444c
                int r9 = r9.f53465d
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f53450i = r8
                ak.v r7 = r6.f53447f
                int r7 = r7.f()
                ji.x r8 = r6.f53443b
                ak.v r9 = r6.f53447f
                r8.e(r9, r7)
                int r8 = r6.f53452k
                int r8 = r8 + r7
                r6.f53452k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f53448g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f53452k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ui.b.a.c(ji.i, long):boolean");
        }
    }

    /* renamed from: ui.b$b */
    /* loaded from: classes3.dex */
    private interface InterfaceC1199b {
        void a(int i11, long j11);

        void b(long j11);

        boolean c(ji.i iVar, long j11);
    }

    /* loaded from: classes3.dex */
    private static final class c implements InterfaceC1199b {

        /* renamed from: a */
        private final j f53454a;

        /* renamed from: b */
        private final x f53455b;

        /* renamed from: c */
        private final ui.c f53456c;

        /* renamed from: d */
        private final i f53457d;

        /* renamed from: e */
        private final int f53458e;

        /* renamed from: f */
        private long f53459f;

        /* renamed from: g */
        private int f53460g;

        /* renamed from: h */
        private long f53461h;

        public c(j jVar, x xVar, ui.c cVar, String str, int i11) {
            this.f53454a = jVar;
            this.f53455b = xVar;
            this.f53456c = cVar;
            int i12 = (cVar.f53463b * cVar.f53466e) / 8;
            if (cVar.f53465d == i12) {
                int i13 = cVar.f53464c;
                int i14 = i13 * i12 * 8;
                int max = Math.max(i12, (i13 * i12) / 10);
                this.f53458e = max;
                this.f53457d = new i.b().e0(str).G(i14).Z(i14).W(max).H(cVar.f53463b).f0(cVar.f53464c).Y(i11).E();
                return;
            }
            int i15 = cVar.f53465d;
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Expected block size: ");
            sb2.append(i12);
            sb2.append("; got: ");
            sb2.append(i15);
            throw new ParserException(sb2.toString());
        }

        @Override // ui.b.InterfaceC1199b
        public void a(int i11, long j11) {
            this.f53454a.p(new e(this.f53456c, 1, i11, j11));
            this.f53455b.d(this.f53457d);
        }

        @Override // ui.b.InterfaceC1199b
        public void b(long j11) {
            this.f53459f = j11;
            this.f53460g = 0;
            this.f53461h = 0L;
        }

        @Override // ui.b.InterfaceC1199b
        public boolean c(ji.i iVar, long j11) {
            int i11;
            ui.c cVar;
            int i12;
            int i13;
            long j12 = j11;
            while (true) {
                i11 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                if (i11 <= 0 || (i12 = this.f53460g) >= (i13 = this.f53458e)) {
                    break;
                }
                int a11 = this.f53455b.a(iVar, (int) Math.min(i13 - i12, j12), true);
                if (a11 == -1) {
                    j12 = 0;
                } else {
                    this.f53460g += a11;
                    j12 -= a11;
                }
            }
            int i14 = this.f53456c.f53465d;
            int i15 = this.f53460g / i14;
            if (i15 > 0) {
                int i16 = i15 * i14;
                int i17 = this.f53460g - i16;
                this.f53455b.f(this.f53459f + k0.I0(this.f53461h, 1000000L, cVar.f53464c), 1, i16, i17, null);
                this.f53461h += i15;
                this.f53460g = i17;
            }
            return i11 <= 0;
        }
    }

    static {
        ui.a aVar = new l() { // from class: ui.a
            @Override // ji.l
            public final h[] b() {
                return b.c();
            }
        };
    }

    public static /* synthetic */ h[] c() {
        return g();
    }

    private void f() {
        ak.a.h(this.f53436b);
        k0.j(this.f53435a);
    }

    public static /* synthetic */ h[] g() {
        return new h[]{new b()};
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        InterfaceC1199b interfaceC1199b = this.f53437c;
        if (interfaceC1199b != null) {
            interfaceC1199b.b(j12);
        }
    }

    @Override // ji.h
    public void b(j jVar) {
        this.f53435a = jVar;
        this.f53436b = jVar.f(0, 1);
        jVar.s();
    }

    @Override // ji.h
    public boolean d(ji.i iVar) {
        return d.a(iVar) != null;
    }

    @Override // ji.h
    public int e(ji.i iVar, u uVar) {
        f();
        if (this.f53437c == null) {
            ui.c a11 = d.a(iVar);
            if (a11 != null) {
                int i11 = a11.f53462a;
                if (i11 == 17) {
                    this.f53437c = new a(this.f53435a, this.f53436b, a11);
                } else if (i11 == 6) {
                    this.f53437c = new c(this.f53435a, this.f53436b, a11, "audio/g711-alaw", -1);
                } else if (i11 == 7) {
                    this.f53437c = new c(this.f53435a, this.f53436b, a11, "audio/g711-mlaw", -1);
                } else {
                    int a12 = ei.u.a(i11, a11.f53466e);
                    if (a12 != 0) {
                        this.f53437c = new c(this.f53435a, this.f53436b, a11, "audio/raw", a12);
                    } else {
                        int i12 = a11.f53462a;
                        StringBuilder sb2 = new StringBuilder(40);
                        sb2.append("Unsupported WAV format type: ");
                        sb2.append(i12);
                        throw new ParserException(sb2.toString());
                    }
                }
            } else {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
        }
        if (this.f53438d == -1) {
            Pair<Long, Long> b11 = d.b(iVar);
            this.f53438d = ((Long) b11.first).intValue();
            long longValue = ((Long) b11.second).longValue();
            this.f53439e = longValue;
            this.f53437c.a(this.f53438d, longValue);
        } else if (iVar.getPosition() == 0) {
            iVar.k(this.f53438d);
        }
        ak.a.f(this.f53439e != -1);
        return this.f53437c.c(iVar, this.f53439e - iVar.getPosition()) ? -1 : 0;
    }

    @Override // ji.h
    public void release() {
    }
}
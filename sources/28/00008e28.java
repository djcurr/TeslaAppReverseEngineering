package oi;

import ak.k0;
import ak.o;
import ak.p;
import ak.t;
import ak.v;
import android.util.Pair;
import android.util.SparseArray;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import ji.h;
import ji.i;
import ji.j;
import ji.l;
import ji.u;
import ji.v;
import ji.x;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
public class e implements h {

    /* renamed from: b0 */
    private static final byte[] f42475b0;

    /* renamed from: c0 */
    private static final byte[] f42476c0;

    /* renamed from: d0 */
    private static final byte[] f42477d0;

    /* renamed from: e0 */
    private static final UUID f42478e0;

    /* renamed from: f0 */
    private static final Map<String, Integer> f42479f0;
    private long A;
    private long B;
    private p C;
    private p D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private byte Y;
    private boolean Z;

    /* renamed from: a */
    private final oi.c f42480a;

    /* renamed from: a0 */
    private j f42481a0;

    /* renamed from: b */
    private final g f42482b;

    /* renamed from: c */
    private final SparseArray<c> f42483c;

    /* renamed from: d */
    private final boolean f42484d;

    /* renamed from: e */
    private final v f42485e;

    /* renamed from: f */
    private final v f42486f;

    /* renamed from: g */
    private final v f42487g;

    /* renamed from: h */
    private final v f42488h;

    /* renamed from: i */
    private final v f42489i;

    /* renamed from: j */
    private final v f42490j;

    /* renamed from: k */
    private final v f42491k;

    /* renamed from: l */
    private final v f42492l;

    /* renamed from: m */
    private final v f42493m;

    /* renamed from: n */
    private final v f42494n;

    /* renamed from: o */
    private ByteBuffer f42495o;

    /* renamed from: p */
    private long f42496p;

    /* renamed from: q */
    private long f42497q;

    /* renamed from: r */
    private long f42498r;

    /* renamed from: s */
    private long f42499s;

    /* renamed from: t */
    private long f42500t;

    /* renamed from: u */
    private c f42501u;

    /* renamed from: v */
    private boolean f42502v;

    /* renamed from: w */
    private int f42503w;

    /* renamed from: x */
    private long f42504x;

    /* renamed from: y */
    private boolean f42505y;

    /* renamed from: z */
    private long f42506z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class b implements oi.b {
        private b() {
            e.this = r1;
        }

        @Override // oi.b
        public void a(int i11) {
            e.this.o(i11);
        }

        @Override // oi.b
        public void b(int i11, double d11) {
            e.this.r(i11, d11);
        }

        @Override // oi.b
        public void c(int i11, int i12, i iVar) {
            e.this.l(i11, i12, iVar);
        }

        @Override // oi.b
        public void d(int i11, long j11) {
            e.this.x(i11, j11);
        }

        @Override // oi.b
        public int e(int i11) {
            return e.this.u(i11);
        }

        @Override // oi.b
        public boolean f(int i11) {
            return e.this.z(i11);
        }

        @Override // oi.b
        public void g(int i11, String str) {
            e.this.H(i11, str);
        }

        @Override // oi.b
        public void h(int i11, long j11, long j12) {
            e.this.G(i11, j11, j12);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public int A;
        public int B;
        public int C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public byte[] N;
        public int O;
        public int P;
        public int Q;
        public long R;
        public long S;
        public d T;
        public boolean U;
        public boolean V;
        private String W;
        public x X;
        public int Y;

        /* renamed from: a */
        public String f42508a;

        /* renamed from: b */
        public String f42509b;

        /* renamed from: c */
        public int f42510c;

        /* renamed from: d */
        public int f42511d;

        /* renamed from: e */
        public int f42512e;

        /* renamed from: f */
        public int f42513f;

        /* renamed from: g */
        private int f42514g;

        /* renamed from: h */
        public boolean f42515h;

        /* renamed from: i */
        public byte[] f42516i;

        /* renamed from: j */
        public x.a f42517j;

        /* renamed from: k */
        public byte[] f42518k;

        /* renamed from: l */
        public com.google.android.exoplayer2.drm.e f42519l;

        /* renamed from: m */
        public int f42520m;

        /* renamed from: n */
        public int f42521n;

        /* renamed from: o */
        public int f42522o;

        /* renamed from: p */
        public int f42523p;

        /* renamed from: q */
        public int f42524q;

        /* renamed from: r */
        public int f42525r;

        /* renamed from: s */
        public float f42526s;

        /* renamed from: t */
        public float f42527t;

        /* renamed from: u */
        public float f42528u;

        /* renamed from: v */
        public byte[] f42529v;

        /* renamed from: w */
        public int f42530w;

        /* renamed from: x */
        public boolean f42531x;

        /* renamed from: y */
        public int f42532y;

        /* renamed from: z */
        public int f42533z;

        private c() {
            this.f42520m = -1;
            this.f42521n = -1;
            this.f42522o = -1;
            this.f42523p = -1;
            this.f42524q = 0;
            this.f42525r = -1;
            this.f42526s = BitmapDescriptorFactory.HUE_RED;
            this.f42527t = BitmapDescriptorFactory.HUE_RED;
            this.f42528u = BitmapDescriptorFactory.HUE_RED;
            this.f42529v = null;
            this.f42530w = -1;
            this.f42531x = false;
            this.f42532y = -1;
            this.f42533z = -1;
            this.A = -1;
            this.B = 1000;
            this.C = 200;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = -1.0f;
            this.O = 1;
            this.P = -1;
            this.Q = 8000;
            this.R = 0L;
            this.S = 0L;
            this.V = true;
            this.W = "eng";
        }

        public void e() {
            ak.a.e(this.X);
        }

        private byte[] f(String str) {
            byte[] bArr = this.f42518k;
            if (bArr == null) {
                String valueOf = String.valueOf(str);
                throw new ParserException(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "));
            }
            return bArr;
        }

        private byte[] g() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.K * 50000.0f) + 0.5f));
            order.putShort((short) (this.L + 0.5f));
            order.putShort((short) (this.M + 0.5f));
            order.putShort((short) this.B);
            order.putShort((short) this.C);
            return bArr;
        }

        private static Pair<String, List<byte[]>> j(v vVar) {
            try {
                vVar.P(16);
                long s11 = vVar.s();
                if (s11 == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (s11 == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (s11 == 826496599) {
                    byte[] d11 = vVar.d();
                    for (int e11 = vVar.e() + 20; e11 < d11.length - 4; e11++) {
                        if (d11[e11] == 0 && d11[e11 + 1] == 0 && d11[e11 + 2] == 1 && d11[e11 + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d11, e11, d11.length)));
                        }
                    }
                    throw new ParserException("Failed to find FourCC VC1 initialization data");
                }
                o.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC private data");
            }
        }

        private static boolean k(v vVar) {
            try {
                int u11 = vVar.u();
                if (u11 == 1) {
                    return true;
                }
                if (u11 == 65534) {
                    vVar.O(24);
                    if (vVar.v() == e.f42478e0.getMostSignificantBits()) {
                        if (vVar.v() == e.f42478e0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }

        private static List<byte[]> l(byte[] bArr) {
            try {
                if (bArr[0] == 2) {
                    int i11 = 0;
                    int i12 = 1;
                    while ((bArr[i12] & 255) == 255) {
                        i11 += 255;
                        i12++;
                    }
                    int i13 = i12 + 1;
                    int i14 = i11 + (bArr[i12] & 255);
                    int i15 = 0;
                    while ((bArr[i13] & 255) == 255) {
                        i15 += 255;
                        i13++;
                    }
                    int i16 = i13 + 1;
                    int i17 = i15 + (bArr[i13] & 255);
                    if (bArr[i16] == 1) {
                        byte[] bArr2 = new byte[i14];
                        System.arraycopy(bArr, i16, bArr2, 0, i14);
                        int i18 = i16 + i14;
                        if (bArr[i18] == 3) {
                            int i19 = i18 + i17;
                            if (bArr[i19] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i19];
                                System.arraycopy(bArr, i19, bArr3, 0, bArr.length - i19);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new ParserException("Error parsing vorbis codec private");
                        }
                        throw new ParserException("Error parsing vorbis codec private");
                    }
                    throw new ParserException("Error parsing vorbis codec private");
                }
                throw new ParserException("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing vorbis codec private");
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:479:0x0452  */
        /* JADX WARN: Removed duplicated region for block: B:484:0x046a  */
        /* JADX WARN: Removed duplicated region for block: B:485:0x046c  */
        /* JADX WARN: Removed duplicated region for block: B:488:0x0479  */
        /* JADX WARN: Removed duplicated region for block: B:489:0x048b  */
        /* JADX WARN: Removed duplicated region for block: B:553:0x0594  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h(ji.j r21, int r22) {
            /*
                Method dump skipped, instructions count: 1700
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: oi.e.c.h(ji.j, int):void");
        }

        public void i() {
            d dVar = this.T;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void m() {
            d dVar = this.T;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        private final byte[] f42534a = new byte[10];

        /* renamed from: b */
        private boolean f42535b;

        /* renamed from: c */
        private int f42536c;

        /* renamed from: d */
        private long f42537d;

        /* renamed from: e */
        private int f42538e;

        /* renamed from: f */
        private int f42539f;

        /* renamed from: g */
        private int f42540g;

        public void a(c cVar) {
            if (this.f42536c > 0) {
                cVar.X.f(this.f42537d, this.f42538e, this.f42539f, this.f42540g, cVar.f42517j);
                this.f42536c = 0;
            }
        }

        public void b() {
            this.f42535b = false;
            this.f42536c = 0;
        }

        public void c(c cVar, long j11, int i11, int i12, int i13) {
            if (this.f42535b) {
                int i14 = this.f42536c;
                int i15 = i14 + 1;
                this.f42536c = i15;
                if (i14 == 0) {
                    this.f42537d = j11;
                    this.f42538e = i11;
                    this.f42539f = 0;
                }
                this.f42539f += i12;
                this.f42540g = i13;
                if (i15 >= 16) {
                    a(cVar);
                }
            }
        }

        public void d(i iVar) {
            if (this.f42535b) {
                return;
            }
            iVar.n(this.f42534a, 0, 10);
            iVar.d();
            if (ei.b.i(this.f42534a) == 0) {
                return;
            }
            this.f42535b = true;
        }
    }

    static {
        oi.d dVar = new l() { // from class: oi.d
            @Override // ji.l
            public final h[] b() {
                return e.c();
            }
        };
        f42475b0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        f42476c0 = k0.l0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        f42477d0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f42478e0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", Integer.valueOf((int) CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256));
        hashMap.put("htc_video_rotA-270", 270);
        f42479f0 = Collections.unmodifiableMap(hashMap);
    }

    public e() {
        this(0);
    }

    public static /* synthetic */ h[] A() {
        return new h[]{new e()};
    }

    private boolean B(u uVar, long j11) {
        if (this.f42505y) {
            this.A = j11;
            uVar.f33770a = this.f42506z;
            this.f42505y = false;
            return true;
        }
        if (this.f42502v) {
            long j12 = this.A;
            if (j12 != -1) {
                uVar.f33770a = j12;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    private void C(i iVar, int i11) {
        if (this.f42487g.f() >= i11) {
            return;
        }
        if (this.f42487g.b() < i11) {
            v vVar = this.f42487g;
            vVar.c(Math.max(vVar.b() * 2, i11));
        }
        iVar.readFully(this.f42487g.d(), this.f42487g.f(), i11 - this.f42487g.f());
        this.f42487g.N(i11);
    }

    private void D() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.f42490j.K(0);
    }

    private long E(long j11) {
        long j12 = this.f42498r;
        if (j12 != -9223372036854775807L) {
            return k0.I0(j11, j12, 1000L);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    private static void F(String str, long j11, byte[] bArr) {
        byte[] s11;
        int i11;
        str.hashCode();
        if (str.equals("S_TEXT/ASS")) {
            s11 = s(j11, "%01d:%02d:%02d:%02d", AbstractComponentTracker.LINGERING_TIMEOUT);
            i11 = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            s11 = s(j11, "%02d:%02d:%02d,%03d", 1000L);
            i11 = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(s11, 0, bArr, i11, s11.length);
    }

    private int I(i iVar, c cVar, int i11) {
        int i12;
        if ("S_TEXT/UTF8".equals(cVar.f42509b)) {
            J(iVar, f42475b0, i11);
            return q();
        } else if ("S_TEXT/ASS".equals(cVar.f42509b)) {
            J(iVar, f42477d0, i11);
            return q();
        } else {
            x xVar = cVar.X;
            if (!this.U) {
                if (cVar.f42515h) {
                    this.O &= -1073741825;
                    if (!this.V) {
                        iVar.readFully(this.f42487g.d(), 0, 1);
                        this.R++;
                        if ((this.f42487g.d()[0] & 128) != 128) {
                            this.Y = this.f42487g.d()[0];
                            this.V = true;
                        } else {
                            throw new ParserException("Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.Y;
                    if ((b11 & 1) == 1) {
                        boolean z11 = (b11 & 2) == 2;
                        this.O |= 1073741824;
                        if (!this.Z) {
                            iVar.readFully(this.f42492l.d(), 0, 8);
                            this.R += 8;
                            this.Z = true;
                            this.f42487g.d()[0] = (byte) ((z11 ? 128 : 0) | 8);
                            this.f42487g.O(0);
                            xVar.c(this.f42487g, 1, 1);
                            this.S++;
                            this.f42492l.O(0);
                            xVar.c(this.f42492l, 8, 1);
                            this.S += 8;
                        }
                        if (z11) {
                            if (!this.W) {
                                iVar.readFully(this.f42487g.d(), 0, 1);
                                this.R++;
                                this.f42487g.O(0);
                                this.X = this.f42487g.C();
                                this.W = true;
                            }
                            int i13 = this.X * 4;
                            this.f42487g.K(i13);
                            iVar.readFully(this.f42487g.d(), 0, i13);
                            this.R += i13;
                            short s11 = (short) ((this.X / 2) + 1);
                            int i14 = (s11 * 6) + 2;
                            ByteBuffer byteBuffer = this.f42495o;
                            if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                this.f42495o = ByteBuffer.allocate(i14);
                            }
                            this.f42495o.position(0);
                            this.f42495o.putShort(s11);
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i12 = this.X;
                                if (i15 >= i12) {
                                    break;
                                }
                                int G = this.f42487g.G();
                                if (i15 % 2 == 0) {
                                    this.f42495o.putShort((short) (G - i16));
                                } else {
                                    this.f42495o.putInt(G - i16);
                                }
                                i15++;
                                i16 = G;
                            }
                            int i17 = (i11 - this.R) - i16;
                            if (i12 % 2 == 1) {
                                this.f42495o.putInt(i17);
                            } else {
                                this.f42495o.putShort((short) i17);
                                this.f42495o.putInt(0);
                            }
                            this.f42493m.M(this.f42495o.array(), i14);
                            xVar.c(this.f42493m, i14, 1);
                            this.S += i14;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f42516i;
                    if (bArr != null) {
                        this.f42490j.M(bArr, bArr.length);
                    }
                }
                if (cVar.f42513f > 0) {
                    this.O |= 268435456;
                    this.f42494n.K(0);
                    this.f42487g.K(4);
                    this.f42487g.d()[0] = (byte) ((i11 >> 24) & 255);
                    this.f42487g.d()[1] = (byte) ((i11 >> 16) & 255);
                    this.f42487g.d()[2] = (byte) ((i11 >> 8) & 255);
                    this.f42487g.d()[3] = (byte) (i11 & 255);
                    xVar.c(this.f42487g, 4, 2);
                    this.S += 4;
                }
                this.U = true;
            }
            int f11 = i11 + this.f42490j.f();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f42509b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f42509b)) {
                if (cVar.T != null) {
                    ak.a.f(this.f42490j.f() == 0);
                    cVar.T.d(iVar);
                }
                while (true) {
                    int i18 = this.R;
                    if (i18 >= f11) {
                        break;
                    }
                    int K = K(iVar, xVar, f11 - i18);
                    this.R += K;
                    this.S += K;
                }
            } else {
                byte[] d11 = this.f42486f.d();
                d11[0] = 0;
                d11[1] = 0;
                d11[2] = 0;
                int i19 = cVar.Y;
                int i21 = 4 - i19;
                while (this.R < f11) {
                    int i22 = this.T;
                    if (i22 == 0) {
                        L(iVar, d11, i21, i19);
                        this.R += i19;
                        this.f42486f.O(0);
                        this.T = this.f42486f.G();
                        this.f42485e.O(0);
                        xVar.e(this.f42485e, 4);
                        this.S += 4;
                    } else {
                        int K2 = K(iVar, xVar, i22);
                        this.R += K2;
                        this.S += K2;
                        this.T -= K2;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f42509b)) {
                this.f42488h.O(0);
                xVar.e(this.f42488h, 4);
                this.S += 4;
            }
            return q();
        }
    }

    private void J(i iVar, byte[] bArr, int i11) {
        int length = bArr.length + i11;
        if (this.f42491k.b() < length) {
            this.f42491k.L(Arrays.copyOf(bArr, length + i11));
        } else {
            System.arraycopy(bArr, 0, this.f42491k.d(), 0, bArr.length);
        }
        iVar.readFully(this.f42491k.d(), bArr.length, i11);
        this.f42491k.O(0);
        this.f42491k.N(length);
    }

    private int K(i iVar, x xVar, int i11) {
        int a11 = this.f42490j.a();
        if (a11 > 0) {
            int min = Math.min(i11, a11);
            xVar.e(this.f42490j, min);
            return min;
        }
        return xVar.a(iVar, i11, false);
    }

    private void L(i iVar, byte[] bArr, int i11, int i12) {
        int min = Math.min(i12, this.f42490j.a());
        iVar.readFully(bArr, i11 + min, i12 - min);
        if (min > 0) {
            this.f42490j.j(bArr, i11, min);
        }
    }

    public static /* synthetic */ h[] c() {
        return A();
    }

    private void i(int i11) {
        if (this.C == null || this.D == null) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Element ");
            sb2.append(i11);
            sb2.append(" must be in a Cues");
            throw new ParserException(sb2.toString());
        }
    }

    private void j(int i11) {
        if (this.f42501u != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Element ");
        sb2.append(i11);
        sb2.append(" must be in a TrackEntry");
        throw new ParserException(sb2.toString());
    }

    private void k() {
        ak.a.h(this.f42481a0);
    }

    private ji.v m(p pVar, p pVar2) {
        int i11;
        if (this.f42497q != -1 && this.f42500t != -9223372036854775807L && pVar != null && pVar.c() != 0 && pVar2 != null && pVar2.c() == pVar.c()) {
            int c11 = pVar.c();
            int[] iArr = new int[c11];
            long[] jArr = new long[c11];
            long[] jArr2 = new long[c11];
            long[] jArr3 = new long[c11];
            int i12 = 0;
            for (int i13 = 0; i13 < c11; i13++) {
                jArr3[i13] = pVar.b(i13);
                jArr[i13] = this.f42497q + pVar2.b(i13);
            }
            while (true) {
                i11 = c11 - 1;
                if (i12 >= i11) {
                    break;
                }
                int i14 = i12 + 1;
                iArr[i12] = (int) (jArr[i14] - jArr[i12]);
                jArr2[i12] = jArr3[i14] - jArr3[i12];
                i12 = i14;
            }
            iArr[i11] = (int) ((this.f42497q + this.f42496p) - jArr[i11]);
            jArr2[i11] = this.f42500t - jArr3[i11];
            long j11 = jArr2[i11];
            if (j11 <= 0) {
                StringBuilder sb2 = new StringBuilder(72);
                sb2.append("Discarding last cue point with unexpected duration: ");
                sb2.append(j11);
                o.h("MatroskaExtractor", sb2.toString());
                iArr = Arrays.copyOf(iArr, i11);
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                jArr3 = Arrays.copyOf(jArr3, i11);
            }
            return new ji.c(iArr, jArr, jArr2, jArr3);
        }
        return new v.b(this.f42500t);
    }

    private void n(c cVar, long j11, int i11, int i12, int i13) {
        d dVar = cVar.T;
        if (dVar != null) {
            dVar.c(cVar, j11, i11, i12, i13);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f42509b) || "S_TEXT/ASS".equals(cVar.f42509b)) {
                if (this.K > 1) {
                    o.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j12 = this.I;
                    if (j12 == -9223372036854775807L) {
                        o.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        F(cVar.f42509b, j12, this.f42491k.d());
                        int e11 = this.f42491k.e();
                        while (true) {
                            if (e11 >= this.f42491k.f()) {
                                break;
                            } else if (this.f42491k.d()[e11] == 0) {
                                this.f42491k.N(e11);
                                break;
                            } else {
                                e11++;
                            }
                        }
                        x xVar = cVar.X;
                        ak.v vVar = this.f42491k;
                        xVar.e(vVar, vVar.f());
                        i12 += this.f42491k.f();
                    }
                }
            }
            if ((268435456 & i11) != 0) {
                if (this.K > 1) {
                    i11 &= -268435457;
                } else {
                    int f11 = this.f42494n.f();
                    cVar.X.c(this.f42494n, f11, 2);
                    i12 += f11;
                }
            }
            cVar.X.f(j11, i11, i12, i13, cVar.f42517j);
        }
        this.F = true;
    }

    private static int[] p(int[] iArr, int i11) {
        if (iArr == null) {
            return new int[i11];
        }
        return iArr.length >= i11 ? iArr : new int[Math.max(iArr.length * 2, i11)];
    }

    private int q() {
        int i11 = this.S;
        D();
        return i11;
    }

    private static byte[] s(long j11, String str, long j12) {
        ak.a.a(j11 != -9223372036854775807L);
        int i11 = (int) (j11 / 3600000000L);
        long j13 = j11 - ((i11 * 3600) * 1000000);
        int i12 = (int) (j13 / 60000000);
        long j14 = j13 - ((i12 * 60) * 1000000);
        int i13 = (int) (j14 / 1000000);
        return k0.l0(String.format(Locale.US, str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf((int) ((j14 - (i13 * 1000000)) / j12))));
    }

    private c t(int i11) {
        j(i11);
        return this.f42501u;
    }

    private static boolean y(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c11 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c11 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c11 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c11 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c11 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c11 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c11 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c11 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c11 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c11 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c11 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c11 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c11 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c11 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c11 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c11 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c11 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c11 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c11 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c11 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c11 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c11 = 26;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c11 = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c11 = 28;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c11 = 29;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c11 = 30;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c11 = 31;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    protected void G(int i11, long j11, long j12) {
        k();
        if (i11 == 160) {
            this.Q = false;
        } else if (i11 == 174) {
            this.f42501u = new c();
        } else if (i11 == 187) {
            this.E = false;
        } else if (i11 == 19899) {
            this.f42503w = -1;
            this.f42504x = -1L;
        } else if (i11 == 20533) {
            t(i11).f42515h = true;
        } else if (i11 == 21968) {
            t(i11).f42531x = true;
        } else if (i11 == 408125543) {
            long j13 = this.f42497q;
            if (j13 != -1 && j13 != j11) {
                throw new ParserException("Multiple Segment elements not supported");
            }
            this.f42497q = j11;
            this.f42496p = j12;
        } else if (i11 != 475249515) {
            if (i11 == 524531317 && !this.f42502v) {
                if (this.f42484d && this.f42506z != -1) {
                    this.f42505y = true;
                    return;
                }
                this.f42481a0.p(new v.b(this.f42500t));
                this.f42502v = true;
            }
        } else {
            this.C = new p();
            this.D = new p();
        }
    }

    protected void H(int i11, String str) {
        if (i11 == 134) {
            t(i11).f42509b = str;
        } else if (i11 != 17026) {
            if (i11 == 21358) {
                t(i11).f42508a = str;
            } else if (i11 != 2274716) {
            } else {
                t(i11).W = str;
            }
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22);
            sb2.append("DocType ");
            sb2.append(str);
            sb2.append(" not supported");
            throw new ParserException(sb2.toString());
        }
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f42480a.reset();
        this.f42482b.e();
        D();
        for (int i11 = 0; i11 < this.f42483c.size(); i11++) {
            this.f42483c.valueAt(i11).m();
        }
    }

    @Override // ji.h
    public final void b(j jVar) {
        this.f42481a0 = jVar;
    }

    @Override // ji.h
    public final boolean d(i iVar) {
        return new f().b(iVar);
    }

    @Override // ji.h
    public final int e(i iVar, u uVar) {
        this.F = false;
        boolean z11 = true;
        while (z11 && !this.F) {
            z11 = this.f42480a.a(iVar);
            if (z11 && B(uVar, iVar.getPosition())) {
                return 1;
            }
        }
        if (z11) {
            return 0;
        }
        for (int i11 = 0; i11 < this.f42483c.size(); i11++) {
            c valueAt = this.f42483c.valueAt(i11);
            valueAt.e();
            valueAt.i();
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0231, code lost:
        throw new com.google.android.exoplayer2.ParserException("EBML lacing sample size out of range.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void l(int r22, int r23, ji.i r24) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.e.l(int, int, ji.i):void");
    }

    protected void o(int i11) {
        k();
        if (i11 == 160) {
            if (this.G != 2) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.K; i13++) {
                i12 += this.L[i13];
            }
            c cVar = this.f42483c.get(this.M);
            cVar.e();
            for (int i14 = 0; i14 < this.K; i14++) {
                long j11 = ((cVar.f42512e * i14) / 1000) + this.H;
                int i15 = this.O;
                if (i14 == 0 && !this.Q) {
                    i15 |= 1;
                }
                int i16 = this.L[i14];
                i12 -= i16;
                n(cVar, j11, i15, i16, i12);
            }
            this.G = 0;
        } else if (i11 == 174) {
            c cVar2 = (c) ak.a.h(this.f42501u);
            String str = cVar2.f42509b;
            if (str != null) {
                if (y(str)) {
                    cVar2.h(this.f42481a0, cVar2.f42510c);
                    this.f42483c.put(cVar2.f42510c, cVar2);
                }
                this.f42501u = null;
                return;
            }
            throw new ParserException("CodecId is missing in TrackEntry element");
        } else if (i11 == 19899) {
            int i17 = this.f42503w;
            if (i17 != -1) {
                long j12 = this.f42504x;
                if (j12 != -1) {
                    if (i17 == 475249515) {
                        this.f42506z = j12;
                        return;
                    }
                    return;
                }
            }
            throw new ParserException("Mandatory element SeekID or SeekPosition not found");
        } else if (i11 == 25152) {
            j(i11);
            c cVar3 = this.f42501u;
            if (cVar3.f42515h) {
                if (cVar3.f42517j != null) {
                    cVar3.f42519l = new com.google.android.exoplayer2.drm.e(new e.b(ci.b.f9153a, "video/webm", this.f42501u.f42517j.f33779b));
                    return;
                }
                throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
            }
        } else if (i11 == 28032) {
            j(i11);
            c cVar4 = this.f42501u;
            if (cVar4.f42515h && cVar4.f42516i != null) {
                throw new ParserException("Combining encryption and compression is not supported");
            }
        } else if (i11 == 357149030) {
            if (this.f42498r == -9223372036854775807L) {
                this.f42498r = 1000000L;
            }
            long j13 = this.f42499s;
            if (j13 != -9223372036854775807L) {
                this.f42500t = E(j13);
            }
        } else if (i11 == 374648427) {
            if (this.f42483c.size() != 0) {
                this.f42481a0.s();
                return;
            }
            throw new ParserException("No valid tracks were found");
        } else if (i11 == 475249515) {
            if (!this.f42502v) {
                this.f42481a0.p(m(this.C, this.D));
                this.f42502v = true;
            }
            this.C = null;
            this.D = null;
        }
    }

    protected void r(int i11, double d11) {
        if (i11 == 181) {
            t(i11).Q = (int) d11;
        } else if (i11 != 17545) {
            switch (i11) {
                case 21969:
                    t(i11).D = (float) d11;
                    return;
                case 21970:
                    t(i11).E = (float) d11;
                    return;
                case 21971:
                    t(i11).F = (float) d11;
                    return;
                case 21972:
                    t(i11).G = (float) d11;
                    return;
                case 21973:
                    t(i11).H = (float) d11;
                    return;
                case 21974:
                    t(i11).I = (float) d11;
                    return;
                case 21975:
                    t(i11).J = (float) d11;
                    return;
                case 21976:
                    t(i11).K = (float) d11;
                    return;
                case 21977:
                    t(i11).L = (float) d11;
                    return;
                case 21978:
                    t(i11).M = (float) d11;
                    return;
                default:
                    switch (i11) {
                        case 30323:
                            t(i11).f42526s = (float) d11;
                            return;
                        case 30324:
                            t(i11).f42527t = (float) d11;
                            return;
                        case 30325:
                            t(i11).f42528u = (float) d11;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f42499s = (long) d11;
        }
    }

    @Override // ji.h
    public final void release() {
    }

    protected int u(int i11) {
        switch (i11) {
            case SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE:
            case 136:
            case 155:
            case 159:
            case 176:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256 /* 166 */:
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
            case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 /* 163 */:
            case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 /* 165 */:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void v(c cVar, i iVar, int i11) {
        if (cVar.f42514g != 1685485123 && cVar.f42514g != 1685480259) {
            iVar.k(i11);
            return;
        }
        byte[] bArr = new byte[i11];
        cVar.N = bArr;
        iVar.readFully(bArr, 0, i11);
    }

    protected void w(c cVar, int i11, i iVar, int i12) {
        if (i11 == 4 && "V_VP9".equals(cVar.f42509b)) {
            this.f42494n.K(i12);
            iVar.readFully(this.f42494n.d(), 0, i12);
            return;
        }
        iVar.k(i12);
    }

    protected void x(int i11, long j11) {
        if (i11 == 20529) {
            if (j11 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j11);
            sb2.append(" not supported");
            throw new ParserException(sb2.toString());
        } else if (i11 == 20530) {
            if (j11 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(55);
            sb3.append("ContentEncodingScope ");
            sb3.append(j11);
            sb3.append(" not supported");
            throw new ParserException(sb3.toString());
        } else {
            switch (i11) {
                case SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE:
                    t(i11).f42511d = (int) j11;
                    return;
                case 136:
                    t(i11).V = j11 == 1;
                    return;
                case 155:
                    this.I = E(j11);
                    return;
                case 159:
                    t(i11).O = (int) j11;
                    return;
                case 176:
                    t(i11).f42520m = (int) j11;
                    return;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                    i(i11);
                    this.C.a(E(j11));
                    return;
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                    t(i11).f42521n = (int) j11;
                    return;
                case 215:
                    t(i11).f42510c = (int) j11;
                    return;
                case 231:
                    this.B = E(j11);
                    return;
                case 238:
                    this.P = (int) j11;
                    return;
                case 241:
                    if (this.E) {
                        return;
                    }
                    i(i11);
                    this.D.a(j11);
                    this.E = true;
                    return;
                case 251:
                    this.Q = true;
                    return;
                case 16871:
                    t(i11).f42514g = (int) j11;
                    return;
                case 16980:
                    if (j11 == 3) {
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder(50);
                    sb4.append("ContentCompAlgo ");
                    sb4.append(j11);
                    sb4.append(" not supported");
                    throw new ParserException(sb4.toString());
                case 17029:
                    if (j11 < 1 || j11 > 2) {
                        StringBuilder sb5 = new StringBuilder(53);
                        sb5.append("DocTypeReadVersion ");
                        sb5.append(j11);
                        sb5.append(" not supported");
                        throw new ParserException(sb5.toString());
                    }
                    return;
                case 17143:
                    if (j11 == 1) {
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(50);
                    sb6.append("EBMLReadVersion ");
                    sb6.append(j11);
                    sb6.append(" not supported");
                    throw new ParserException(sb6.toString());
                case 18401:
                    if (j11 == 5) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(49);
                    sb7.append("ContentEncAlgo ");
                    sb7.append(j11);
                    sb7.append(" not supported");
                    throw new ParserException(sb7.toString());
                case 18408:
                    if (j11 == 1) {
                        return;
                    }
                    StringBuilder sb8 = new StringBuilder(56);
                    sb8.append("AESSettingsCipherMode ");
                    sb8.append(j11);
                    sb8.append(" not supported");
                    throw new ParserException(sb8.toString());
                case 21420:
                    this.f42504x = j11 + this.f42497q;
                    return;
                case 21432:
                    int i12 = (int) j11;
                    j(i11);
                    if (i12 == 0) {
                        this.f42501u.f42530w = 0;
                        return;
                    } else if (i12 == 1) {
                        this.f42501u.f42530w = 2;
                        return;
                    } else if (i12 == 3) {
                        this.f42501u.f42530w = 1;
                        return;
                    } else if (i12 != 15) {
                        return;
                    } else {
                        this.f42501u.f42530w = 3;
                        return;
                    }
                case 21680:
                    t(i11).f42522o = (int) j11;
                    return;
                case 21682:
                    t(i11).f42524q = (int) j11;
                    return;
                case 21690:
                    t(i11).f42523p = (int) j11;
                    return;
                case 21930:
                    t(i11).U = j11 == 1;
                    return;
                case 21998:
                    t(i11).f42513f = (int) j11;
                    return;
                case 22186:
                    t(i11).R = j11;
                    return;
                case 22203:
                    t(i11).S = j11;
                    return;
                case 25188:
                    t(i11).P = (int) j11;
                    return;
                case 30321:
                    j(i11);
                    int i13 = (int) j11;
                    if (i13 == 0) {
                        this.f42501u.f42525r = 0;
                        return;
                    } else if (i13 == 1) {
                        this.f42501u.f42525r = 1;
                        return;
                    } else if (i13 == 2) {
                        this.f42501u.f42525r = 2;
                        return;
                    } else if (i13 != 3) {
                        return;
                    } else {
                        this.f42501u.f42525r = 3;
                        return;
                    }
                case 2352003:
                    t(i11).f42512e = (int) j11;
                    return;
                case 2807729:
                    this.f42498r = j11;
                    return;
                default:
                    switch (i11) {
                        case 21945:
                            j(i11);
                            int i14 = (int) j11;
                            if (i14 == 1) {
                                this.f42501u.A = 2;
                                return;
                            } else if (i14 != 2) {
                                return;
                            } else {
                                this.f42501u.A = 1;
                                return;
                            }
                        case 21946:
                            j(i11);
                            int i15 = (int) j11;
                            if (i15 != 1) {
                                if (i15 == 16) {
                                    this.f42501u.f42533z = 6;
                                    return;
                                } else if (i15 == 18) {
                                    this.f42501u.f42533z = 7;
                                    return;
                                } else if (i15 != 6 && i15 != 7) {
                                    return;
                                }
                            }
                            this.f42501u.f42533z = 3;
                            return;
                        case 21947:
                            j(i11);
                            c cVar = this.f42501u;
                            cVar.f42531x = true;
                            int i16 = (int) j11;
                            if (i16 == 1) {
                                cVar.f42532y = 1;
                                return;
                            } else if (i16 == 9) {
                                cVar.f42532y = 6;
                                return;
                            } else if (i16 == 4 || i16 == 5 || i16 == 6 || i16 == 7) {
                                cVar.f42532y = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            t(i11).B = (int) j11;
                            return;
                        case 21949:
                            t(i11).C = (int) j11;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    protected boolean z(int i11) {
        return i11 == 357149030 || i11 == 524531317 || i11 == 475249515 || i11 == 374648427;
    }

    public e(int i11) {
        this(new oi.a(), i11);
    }

    e(oi.c cVar, int i11) {
        this.f42497q = -1L;
        this.f42498r = -9223372036854775807L;
        this.f42499s = -9223372036854775807L;
        this.f42500t = -9223372036854775807L;
        this.f42506z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f42480a = cVar;
        cVar.b(new b());
        this.f42484d = (i11 & 1) == 0;
        this.f42482b = new g();
        this.f42483c = new SparseArray<>();
        this.f42487g = new ak.v(4);
        this.f42488h = new ak.v(ByteBuffer.allocate(4).putInt(-1).array());
        this.f42489i = new ak.v(4);
        this.f42485e = new ak.v(t.f519a);
        this.f42486f = new ak.v(4);
        this.f42490j = new ak.v();
        this.f42491k = new ak.v();
        this.f42492l = new ak.v(8);
        this.f42493m = new ak.v();
        this.f42494n = new ak.v();
        this.L = new int[1];
    }
}
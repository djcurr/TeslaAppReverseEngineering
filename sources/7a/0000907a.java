package op;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@g(objectTypeIndication = 64, tags = {5})
/* loaded from: classes2.dex */
public class a extends op.b {
    public static Map<Integer, Integer> U = new HashMap();
    public static Map<Integer, String> V = new HashMap();
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;

    /* renamed from: d  reason: collision with root package name */
    byte[] f42851d;

    /* renamed from: e  reason: collision with root package name */
    public int f42852e;

    /* renamed from: f  reason: collision with root package name */
    public int f42853f;

    /* renamed from: g  reason: collision with root package name */
    public int f42854g;

    /* renamed from: h  reason: collision with root package name */
    public int f42855h;

    /* renamed from: i  reason: collision with root package name */
    public int f42856i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f42857j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f42858k;

    /* renamed from: l  reason: collision with root package name */
    public int f42859l;

    /* renamed from: m  reason: collision with root package name */
    public int f42860m;

    /* renamed from: n  reason: collision with root package name */
    public int f42861n;

    /* renamed from: o  reason: collision with root package name */
    public int f42862o;

    /* renamed from: p  reason: collision with root package name */
    public int f42863p;

    /* renamed from: q  reason: collision with root package name */
    public int f42864q;

    /* renamed from: r  reason: collision with root package name */
    public int f42865r;

    /* renamed from: s  reason: collision with root package name */
    public int f42866s;

    /* renamed from: t  reason: collision with root package name */
    public int f42867t;

    /* renamed from: u  reason: collision with root package name */
    public int f42868u;

    /* renamed from: v  reason: collision with root package name */
    public int f42869v;

    /* renamed from: w  reason: collision with root package name */
    public int f42870w;

    /* renamed from: x  reason: collision with root package name */
    public int f42871x;

    /* renamed from: y  reason: collision with root package name */
    public int f42872y;

    /* renamed from: z  reason: collision with root package name */
    public int f42873z;

    /* renamed from: op.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0857a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f42874a;

        public C0857a(int i11, c cVar) {
            int i12;
            cVar.b();
            cVar.b();
            cVar.b();
            cVar.b();
            boolean b11 = cVar.b();
            this.f42874a = b11;
            if (b11) {
                cVar.b();
                cVar.b();
                a(i11, cVar);
            }
            while (cVar.a(4) != 0) {
                int a11 = cVar.a(4);
                if (a11 == 15) {
                    i12 = cVar.a(8);
                    a11 += i12;
                } else {
                    i12 = 0;
                }
                if (i12 == 255) {
                    a11 += cVar.a(16);
                }
                for (int i13 = 0; i13 < a11; i13++) {
                    cVar.a(8);
                }
            }
        }

        public void a(int i11, c cVar) {
            int i12;
            switch (i11) {
                case 1:
                case 2:
                    i12 = 1;
                    break;
                case 3:
                    i12 = 2;
                    break;
                case 4:
                case 5:
                case 6:
                    i12 = 3;
                    break;
                case 7:
                    i12 = 4;
                    break;
                default:
                    i12 = 0;
                    break;
            }
            for (int i13 = 0; i13 < i12; i13++) {
                new b(a.this, cVar);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f42876a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f42877b;

        public b(a aVar, c cVar) {
            cVar.b();
            cVar.a(4);
            cVar.a(4);
            cVar.a(3);
            cVar.a(2);
            this.f42876a = cVar.b();
            this.f42877b = cVar.b();
            if (this.f42876a) {
                cVar.a(2);
                cVar.b();
                cVar.a(2);
            }
            if (this.f42877b) {
                cVar.a(2);
                cVar.a(2);
                cVar.b();
            }
            cVar.b();
        }
    }

    static {
        U.put(0, 96000);
        U.put(1, 88200);
        U.put(2, 64000);
        U.put(3, 48000);
        U.put(4, 44100);
        U.put(5, 32000);
        U.put(6, 24000);
        U.put(7, 22050);
        U.put(8, 16000);
        U.put(9, 12000);
        U.put(10, 11025);
        U.put(11, 8000);
        V.put(1, "AAC main");
        V.put(2, "AAC LC");
        V.put(3, "AAC SSR");
        V.put(4, "AAC LTP");
        V.put(5, "SBR");
        V.put(6, "AAC Scalable");
        V.put(7, "TwinVQ");
        V.put(8, "CELP");
        V.put(9, "HVXC");
        V.put(10, "(reserved)");
        V.put(11, "(reserved)");
        V.put(12, "TTSI");
        V.put(13, "Main synthetic");
        V.put(14, "Wavetable synthesis");
        V.put(15, "General MIDI");
        V.put(16, "Algorithmic Synthesis and Audio FX");
        V.put(17, "ER AAC LC");
        V.put(18, "(reserved)");
        V.put(19, "ER AAC LTP");
        V.put(20, "ER AAC Scalable");
        V.put(21, "ER TwinVQ");
        V.put(22, "ER BSAC");
        V.put(23, "ER AAC LD");
        V.put(24, "ER CELP");
        V.put(25, "ER HVXC");
        V.put(26, "ER HILN");
        V.put(27, "ER Parametric");
        V.put(28, "SSC");
        V.put(29, "PS");
        V.put(30, "MPEG Surround");
        V.put(31, "(escape)");
        V.put(32, "Layer-1");
        V.put(33, "Layer-2");
        V.put(34, "Layer-3");
        V.put(35, "DST");
        V.put(36, "ALS");
        V.put(37, "SLS");
        V.put(38, "SLS non-core");
        V.put(39, "ER AAC ELD");
        V.put(40, "SMR Simple");
        V.put(41, "SMR Main");
    }

    private int f() {
        return 0;
    }

    private int g(c cVar) {
        int a11 = cVar.a(5);
        return a11 == 31 ? cVar.a(6) + 32 : a11;
    }

    private void h(int i11, int i12, int i13, c cVar) {
        this.I = cVar.a(1);
        this.J = cVar.a(2);
        int a11 = cVar.a(1);
        this.K = a11;
        if (a11 == 1) {
            this.L = cVar.a(1);
        }
    }

    private void i(int i11, int i12, int i13, c cVar) {
        this.f42867t = cVar.a(1);
        int a11 = cVar.a(1);
        this.f42868u = a11;
        if (a11 == 1) {
            this.f42869v = cVar.a(14);
        }
        this.f42870w = cVar.a(1);
        if (i12 != 0) {
            if (i13 == 6 || i13 == 20) {
                this.f42871x = cVar.a(3);
            }
            if (this.f42870w == 1) {
                if (i13 == 22) {
                    this.f42872y = cVar.a(5);
                    this.f42873z = cVar.a(11);
                }
                if (i13 == 17 || i13 == 19 || i13 == 20 || i13 == 23) {
                    this.A = cVar.b();
                    this.B = cVar.b();
                    this.C = cVar.b();
                }
                this.D = cVar.a(1);
            }
            this.E = true;
            return;
        }
        throw new UnsupportedOperationException("can't parse program_config_element yet");
    }

    private void j(int i11, int i12, int i13, c cVar) {
        this.M = cVar.a(1);
        this.N = cVar.a(8);
        this.O = cVar.a(4);
        this.P = cVar.a(12);
        this.Q = cVar.a(2);
    }

    private void k(int i11, int i12, int i13, c cVar) {
        int a11 = cVar.a(1);
        this.R = a11;
        if (a11 == 1) {
            this.S = cVar.a(2);
        }
    }

    private void l(int i11, int i12, int i13, c cVar) {
        int a11 = cVar.a(2);
        this.G = a11;
        if (a11 != 1) {
            h(i11, i12, i13, cVar);
        }
        if (this.G != 0) {
            j(i11, i12, i13, cVar);
        }
        this.H = cVar.a(1);
        this.T = true;
    }

    private void m(int i11, int i12, int i13, c cVar) {
        int a11 = cVar.a(1);
        this.F = a11;
        if (a11 == 1) {
            l(i11, i12, i13, cVar);
        } else {
            k(i11, i12, i13, cVar);
        }
    }

    @Override // op.b
    public void e(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f42879b);
        byteBuffer.position(byteBuffer.position() + this.f42879b);
        byte[] bArr = new byte[this.f42879b];
        this.f42851d = bArr;
        slice.get(bArr);
        slice.rewind();
        c cVar = new c(slice);
        this.f42852e = g(cVar);
        int a11 = cVar.a(4);
        this.f42853f = a11;
        if (a11 == 15) {
            this.f42854g = cVar.a(24);
        }
        this.f42855h = cVar.a(4);
        int i11 = this.f42852e;
        if (i11 != 5 && i11 != 29) {
            this.f42856i = 0;
        } else {
            this.f42856i = 5;
            this.f42857j = true;
            if (i11 == 29) {
                this.f42858k = true;
            }
            int a12 = cVar.a(4);
            this.f42859l = a12;
            if (a12 == 15) {
                this.f42860m = cVar.a(24);
            }
            int g11 = g(cVar);
            this.f42852e = g11;
            if (g11 == 22) {
                this.f42861n = cVar.a(4);
            }
        }
        int i12 = this.f42852e;
        switch (i12) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i(this.f42853f, this.f42855h, i12, cVar);
                break;
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                m(this.f42853f, this.f42855h, i12, cVar);
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f42862o = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f42863p = cVar.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                new C0857a(this.f42855h, cVar);
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i13 = this.f42852e;
        if (i13 != 17 && i13 != 39) {
            switch (i13) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    if (this.f42856i != 5 || cVar.c() < 16) {
                        return;
                    }
                    int a13 = cVar.a(11);
                    this.f42866s = a13;
                    if (a13 == 695) {
                        int g12 = g(cVar);
                        this.f42856i = g12;
                        if (g12 == 5) {
                            boolean b11 = cVar.b();
                            this.f42857j = b11;
                            if (b11) {
                                int a14 = cVar.a(4);
                                this.f42859l = a14;
                                if (a14 == 15) {
                                    this.f42860m = cVar.a(24);
                                }
                                if (cVar.c() >= 12) {
                                    int a15 = cVar.a(11);
                                    this.f42866s = a15;
                                    if (a15 == 1352) {
                                        this.f42858k = cVar.b();
                                    }
                                }
                            }
                        }
                        if (this.f42856i == 22) {
                            boolean b12 = cVar.b();
                            this.f42857j = b12;
                            if (b12) {
                                int a16 = cVar.a(4);
                                this.f42859l = a16;
                                if (a16 == 15) {
                                    this.f42860m = cVar.a(24);
                                }
                            }
                            this.f42861n = cVar.a(4);
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
        int a17 = cVar.a(2);
        this.f42864q = a17;
        if (a17 != 2 && a17 != 3) {
            if (a17 == 3) {
                int a18 = cVar.a(1);
                this.f42865r = a18;
                if (a18 == 0) {
                    throw new RuntimeException("not implemented");
                }
            }
            if (this.f42856i != 5) {
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.B == aVar.B && this.A == aVar.A && this.C == aVar.C && this.f42852e == aVar.f42852e && this.f42855h == aVar.f42855h && this.f42869v == aVar.f42869v && this.f42868u == aVar.f42868u && this.f42865r == aVar.f42865r && this.f42864q == aVar.f42864q && this.K == aVar.K && this.f42856i == aVar.f42856i && this.f42861n == aVar.f42861n && this.f42870w == aVar.f42870w && this.D == aVar.D && this.f42860m == aVar.f42860m && this.f42859l == aVar.f42859l && this.f42863p == aVar.f42863p && this.f42867t == aVar.f42867t && this.E == aVar.E && this.Q == aVar.Q && this.R == aVar.R && this.S == aVar.S && this.P == aVar.P && this.N == aVar.N && this.M == aVar.M && this.O == aVar.O && this.J == aVar.J && this.I == aVar.I && this.F == aVar.F && this.f42871x == aVar.f42871x && this.f42873z == aVar.f42873z && this.f42872y == aVar.f42872y && this.H == aVar.H && this.G == aVar.G && this.T == aVar.T && this.f42858k == aVar.f42858k && this.f42862o == aVar.f42862o && this.f42854g == aVar.f42854g && this.f42853f == aVar.f42853f && this.f42857j == aVar.f42857j && this.f42866s == aVar.f42866s && this.L == aVar.L && Arrays.equals(this.f42851d, aVar.f42851d);
    }

    public int hashCode() {
        byte[] bArr = this.f42851d;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f42852e) * 31) + this.f42853f) * 31) + this.f42854g) * 31) + this.f42855h) * 31) + this.f42856i) * 31) + (this.f42857j ? 1 : 0)) * 31) + (this.f42858k ? 1 : 0)) * 31) + this.f42859l) * 31) + this.f42860m) * 31) + this.f42861n) * 31) + this.f42862o) * 31) + this.f42863p) * 31) + this.f42864q) * 31) + this.f42865r) * 31) + this.f42866s) * 31) + this.f42867t) * 31) + this.f42868u) * 31) + this.f42869v) * 31) + this.f42870w) * 31) + this.f42871x) * 31) + this.f42872y) * 31) + this.f42873z) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + (this.T ? 1 : 0);
    }

    public ByteBuffer n() {
        ByteBuffer allocate = ByteBuffer.allocate(o());
        hb.e.i(allocate, 5);
        hb.e.i(allocate, o() - 2);
        d dVar = new d(allocate);
        dVar.a(this.f42852e, 5);
        dVar.a(this.f42853f, 4);
        if (this.f42853f != 15) {
            dVar.a(this.f42855h, 4);
            return allocate;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public int o() {
        if (this.f42852e == 2) {
            return f() + 4;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public void p(int i11) {
        this.f42852e = i11;
    }

    public void q(int i11) {
        this.f42855h = i11;
    }

    public void r(int i11) {
        this.f42853f = i11;
    }

    @Override // op.b
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AudioSpecificConfig");
        sb2.append("{configBytes=");
        sb2.append(hb.b.a(this.f42851d));
        sb2.append(", audioObjectType=");
        sb2.append(this.f42852e);
        sb2.append(" (");
        sb2.append(V.get(Integer.valueOf(this.f42852e)));
        sb2.append(")");
        sb2.append(", samplingFrequencyIndex=");
        sb2.append(this.f42853f);
        sb2.append(" (");
        sb2.append(U.get(Integer.valueOf(this.f42853f)));
        sb2.append(")");
        sb2.append(", samplingFrequency=");
        sb2.append(this.f42854g);
        sb2.append(", channelConfiguration=");
        sb2.append(this.f42855h);
        if (this.f42856i > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f42856i);
            sb2.append(" (");
            sb2.append(V.get(Integer.valueOf(this.f42856i)));
            sb2.append(")");
            sb2.append(", sbrPresentFlag=");
            sb2.append(this.f42857j);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f42858k);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f42859l);
            sb2.append(" (");
            sb2.append(U.get(Integer.valueOf(this.f42859l)));
            sb2.append(")");
            sb2.append(", extensionSamplingFrequency=");
            sb2.append(this.f42860m);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f42861n);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f42866s);
        if (this.E) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.f42867t);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f42868u);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.f42869v);
            sb2.append(", extensionFlag=");
            sb2.append(this.f42870w);
            sb2.append(", layerNr=");
            sb2.append(this.f42871x);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.f42872y);
            sb2.append(", layer_length=");
            sb2.append(this.f42873z);
            sb2.append(", aacSectionDataResilienceFlag=");
            sb2.append(this.A);
            sb2.append(", aacScalefactorDataResilienceFlag=");
            sb2.append(this.B);
            sb2.append(", aacSpectralDataResilienceFlag=");
            sb2.append(this.C);
            sb2.append(", extensionFlag3=");
            sb2.append(this.D);
        }
        if (this.T) {
            sb2.append(", isBaseLayer=");
            sb2.append(this.F);
            sb2.append(", paraMode=");
            sb2.append(this.G);
            sb2.append(", paraExtensionFlag=");
            sb2.append(this.H);
            sb2.append(", hvxcVarMode=");
            sb2.append(this.I);
            sb2.append(", hvxcRateMode=");
            sb2.append(this.J);
            sb2.append(", erHvxcExtensionFlag=");
            sb2.append(this.K);
            sb2.append(", var_ScalableFlag=");
            sb2.append(this.L);
            sb2.append(", hilnQuantMode=");
            sb2.append(this.M);
            sb2.append(", hilnMaxNumLine=");
            sb2.append(this.N);
            sb2.append(", hilnSampleRateCode=");
            sb2.append(this.O);
            sb2.append(", hilnFrameLength=");
            sb2.append(this.P);
            sb2.append(", hilnContMode=");
            sb2.append(this.Q);
            sb2.append(", hilnEnhaLayer=");
            sb2.append(this.R);
            sb2.append(", hilnEnhaQuantMode=");
            sb2.append(this.S);
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}
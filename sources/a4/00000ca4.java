package bk;

import ak.h0;
import ak.k0;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import bk.w;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.h;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.gms.common.Scopes;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class g extends MediaCodecRenderer {
    private static final int[] D4 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean E4;
    private static boolean F4;
    private int A4;
    b B4;
    private k C4;
    private final Context R3;
    private final l S3;
    private final w.a T3;
    private final long U3;
    private final int V3;
    private final boolean W3;
    private a X3;
    private boolean Y3;
    private boolean Z3;

    /* renamed from: a4  reason: collision with root package name */
    private Surface f7750a4;

    /* renamed from: b4  reason: collision with root package name */
    private Surface f7751b4;

    /* renamed from: c4  reason: collision with root package name */
    private boolean f7752c4;

    /* renamed from: d4  reason: collision with root package name */
    private int f7753d4;

    /* renamed from: e4  reason: collision with root package name */
    private boolean f7754e4;

    /* renamed from: f4  reason: collision with root package name */
    private boolean f7755f4;

    /* renamed from: g4  reason: collision with root package name */
    private boolean f7756g4;

    /* renamed from: h4  reason: collision with root package name */
    private long f7757h4;

    /* renamed from: i4  reason: collision with root package name */
    private long f7758i4;

    /* renamed from: j4  reason: collision with root package name */
    private long f7759j4;

    /* renamed from: k4  reason: collision with root package name */
    private int f7760k4;

    /* renamed from: l4  reason: collision with root package name */
    private int f7761l4;

    /* renamed from: m4  reason: collision with root package name */
    private int f7762m4;

    /* renamed from: n4  reason: collision with root package name */
    private long f7763n4;

    /* renamed from: o4  reason: collision with root package name */
    private long f7764o4;

    /* renamed from: p4  reason: collision with root package name */
    private long f7765p4;

    /* renamed from: q4  reason: collision with root package name */
    private int f7766q4;

    /* renamed from: r4  reason: collision with root package name */
    private int f7767r4;

    /* renamed from: s4  reason: collision with root package name */
    private int f7768s4;

    /* renamed from: t4  reason: collision with root package name */
    private int f7769t4;

    /* renamed from: u4  reason: collision with root package name */
    private float f7770u4;

    /* renamed from: v4  reason: collision with root package name */
    private int f7771v4;

    /* renamed from: w4  reason: collision with root package name */
    private int f7772w4;

    /* renamed from: x4  reason: collision with root package name */
    private int f7773x4;

    /* renamed from: y4  reason: collision with root package name */
    private float f7774y4;

    /* renamed from: z4  reason: collision with root package name */
    private boolean f7775z4;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7776a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7777b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7778c;

        public a(int i11, int i12, int i13) {
            this.f7776a = i11;
            this.f7777b = i12;
            this.f7778c = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class b implements h.b, Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f7779a;

        public b(com.google.android.exoplayer2.mediacodec.h hVar) {
            Handler y11 = k0.y(this);
            this.f7779a = y11;
            hVar.a(this, y11);
        }

        private void b(long j11) {
            g gVar = g.this;
            if (this != gVar.B4) {
                return;
            }
            if (j11 == Long.MAX_VALUE) {
                gVar.Q1();
                return;
            }
            try {
                gVar.P1(j11);
            } catch (ExoPlaybackException e11) {
                g.this.g1(e11);
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.h.b
        public void a(com.google.android.exoplayer2.mediacodec.h hVar, long j11, long j12) {
            if (k0.f477a < 30) {
                this.f7779a.sendMessageAtFrontOfQueue(Message.obtain(this.f7779a, 0, (int) (j11 >> 32), (int) j11));
                return;
            }
            b(j11);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(k0.Q0(message.arg1, message.arg2));
            return true;
        }
    }

    public g(Context context, com.google.android.exoplayer2.mediacodec.j jVar, long j11, boolean z11, Handler handler, w wVar, int i11) {
        this(context, h.a.f13699a, jVar, j11, z11, handler, wVar, i11);
    }

    private static Point A1(com.google.android.exoplayer2.mediacodec.i iVar, ci.i iVar2) {
        int[] iArr;
        int i11 = iVar2.f9211t;
        int i12 = iVar2.f9210q;
        boolean z11 = i11 > i12;
        int i13 = z11 ? i11 : i12;
        if (z11) {
            i11 = i12;
        }
        float f11 = i11 / i13;
        for (int i14 : D4) {
            int i15 = (int) (i14 * f11);
            if (i14 <= i13 || i15 <= i11) {
                break;
            }
            if (k0.f477a >= 21) {
                int i16 = z11 ? i15 : i14;
                if (!z11) {
                    i14 = i15;
                }
                Point b11 = iVar.b(i16, i14);
                if (iVar.t(b11.x, b11.y, iVar2.f9212w)) {
                    return b11;
                }
            } else {
                try {
                    int l11 = k0.l(i14, 16) * 16;
                    int l12 = k0.l(i15, 16) * 16;
                    if (l11 * l12 <= MediaCodecUtil.M()) {
                        int i17 = z11 ? l12 : l11;
                        if (!z11) {
                            l11 = l12;
                        }
                        return new Point(i17, l11);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    private static List<com.google.android.exoplayer2.mediacodec.i> C1(com.google.android.exoplayer2.mediacodec.j jVar, ci.i iVar, boolean z11, boolean z12) {
        Pair<Integer, Integer> p11;
        String str = iVar.f9205l;
        if (str == null) {
            return Collections.emptyList();
        }
        List<com.google.android.exoplayer2.mediacodec.i> t11 = MediaCodecUtil.t(jVar.a(str, z11, z12), iVar);
        if ("video/dolby-vision".equals(str) && (p11 = MediaCodecUtil.p(iVar)) != null) {
            int intValue = ((Integer) p11.first).intValue();
            if (intValue == 16 || intValue == 256) {
                t11.addAll(jVar.a("video/hevc", z11, z12));
            } else if (intValue == 512) {
                t11.addAll(jVar.a("video/avc", z11, z12));
            }
        }
        return Collections.unmodifiableList(t11);
    }

    protected static int D1(com.google.android.exoplayer2.mediacodec.i iVar, ci.i iVar2) {
        if (iVar2.f9206m != -1) {
            int size = iVar2.f9207n.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += iVar2.f9207n.get(i12).length;
            }
            return iVar2.f9206m + i11;
        }
        return z1(iVar, iVar2.f9205l, iVar2.f9210q, iVar2.f9211t);
    }

    private static boolean F1(long j11) {
        return j11 < -30000;
    }

    private static boolean G1(long j11) {
        return j11 < -500000;
    }

    private void I1() {
        if (this.f7760k4 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.T3.m(this.f7760k4, elapsedRealtime - this.f7759j4);
            this.f7760k4 = 0;
            this.f7759j4 = elapsedRealtime;
        }
    }

    private void K1() {
        int i11 = this.f7766q4;
        if (i11 != 0) {
            this.T3.z(this.f7765p4, i11);
            this.f7765p4 = 0L;
            this.f7766q4 = 0;
        }
    }

    private void L1() {
        int i11 = this.f7767r4;
        if (i11 == -1 && this.f7768s4 == -1) {
            return;
        }
        if (this.f7771v4 == i11 && this.f7772w4 == this.f7768s4 && this.f7773x4 == this.f7769t4 && this.f7774y4 == this.f7770u4) {
            return;
        }
        this.T3.A(i11, this.f7768s4, this.f7769t4, this.f7770u4);
        this.f7771v4 = this.f7767r4;
        this.f7772w4 = this.f7768s4;
        this.f7773x4 = this.f7769t4;
        this.f7774y4 = this.f7770u4;
    }

    private void M1() {
        if (this.f7752c4) {
            this.T3.y(this.f7750a4);
        }
    }

    private void N1() {
        int i11 = this.f7771v4;
        if (i11 == -1 && this.f7772w4 == -1) {
            return;
        }
        this.T3.A(i11, this.f7772w4, this.f7773x4, this.f7774y4);
    }

    private void O1(long j11, long j12, ci.i iVar) {
        k kVar = this.C4;
        if (kVar != null) {
            kVar.a(j11, j12, iVar, w0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q1() {
        f1();
    }

    private static void T1(com.google.android.exoplayer2.mediacodec.h hVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        hVar.setParameters(bundle);
    }

    private void U1() {
        this.f7758i4 = this.U3 > 0 ? SystemClock.elapsedRealtime() + this.U3 : -9223372036854775807L;
    }

    private void W1(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.f7751b4;
            if (surface2 != null) {
                surface = surface2;
            } else {
                com.google.android.exoplayer2.mediacodec.i t02 = t0();
                if (t02 != null && a2(t02)) {
                    surface = d.c(this.R3, t02.f13705f);
                    this.f7751b4 = surface;
                }
            }
        }
        if (this.f7750a4 != surface) {
            this.f7750a4 = surface;
            this.S3.o(surface);
            this.f7752c4 = false;
            int state = getState();
            com.google.android.exoplayer2.mediacodec.h s02 = s0();
            if (s02 != null) {
                if (k0.f477a >= 23 && surface != null && !this.Y3) {
                    V1(s02, surface);
                } else {
                    Y0();
                    J0();
                }
            }
            if (surface != null && surface != this.f7751b4) {
                N1();
                s1();
                if (state == 2) {
                    U1();
                    return;
                }
                return;
            }
            t1();
            s1();
        } else if (surface == null || surface == this.f7751b4) {
        } else {
            N1();
            M1();
        }
    }

    private boolean a2(com.google.android.exoplayer2.mediacodec.i iVar) {
        return k0.f477a >= 23 && !this.f7775z4 && !u1(iVar.f13700a) && (!iVar.f13705f || d.b(this.R3));
    }

    private void s1() {
        com.google.android.exoplayer2.mediacodec.h s02;
        this.f7754e4 = false;
        if (k0.f477a < 23 || !this.f7775z4 || (s02 = s0()) == null) {
            return;
        }
        this.B4 = new b(s02);
    }

    private void t1() {
        this.f7771v4 = -1;
        this.f7772w4 = -1;
        this.f7774y4 = -1.0f;
        this.f7773x4 = -1;
    }

    private static void v1(MediaFormat mediaFormat, int i11) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i11);
    }

    private static boolean w1() {
        return "NVIDIA".equals(k0.f479c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x07cd, code lost:
        if (r0.equals("NX541J") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0823, code lost:
        if (r0.equals("AFTN") == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean y1() {
        /*
            Method dump skipped, instructions count: 3026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.g.y1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int z1(com.google.android.exoplayer2.mediacodec.i iVar, String str, int i11, int i12) {
        char c11;
        int i13;
        if (i11 == -1 || i12 == -1) {
            return -1;
        }
        str.hashCode();
        int i14 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
            case 2:
            case 4:
                i13 = i11 * i12;
                i14 = 2;
                break;
            case 1:
            case 5:
                i13 = i11 * i12;
                break;
            case 3:
                String str2 = k0.f480d;
                if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(k0.f479c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !iVar.f13705f)))) {
                    i13 = k0.l(i11, 16) * k0.l(i12, 16) * 16 * 16;
                    i14 = 2;
                    break;
                } else {
                    return -1;
                }
                break;
            default:
                return -1;
        }
        return (i13 * 3) / (i14 * 2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void B0(DecoderInputBuffer decoderInputBuffer) {
        if (this.Z3) {
            ByteBuffer byteBuffer = (ByteBuffer) ak.a.e(decoderInputBuffer.f13267f);
            if (byteBuffer.remaining() >= 7) {
                byte b11 = byteBuffer.get();
                short s11 = byteBuffer.getShort();
                short s12 = byteBuffer.getShort();
                byte b12 = byteBuffer.get();
                byte b13 = byteBuffer.get();
                byteBuffer.position(0);
                if (b11 == -75 && s11 == 60 && s12 == 1 && b12 == 4 && b13 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    T1(s0(), bArr);
                }
            }
        }
    }

    protected a B1(com.google.android.exoplayer2.mediacodec.i iVar, ci.i iVar2, ci.i[] iVarArr) {
        int z12;
        int i11 = iVar2.f9210q;
        int i12 = iVar2.f9211t;
        int D1 = D1(iVar, iVar2);
        if (iVarArr.length == 1) {
            if (D1 != -1 && (z12 = z1(iVar, iVar2.f9205l, iVar2.f9210q, iVar2.f9211t)) != -1) {
                D1 = Math.min((int) (D1 * 1.5f), z12);
            }
            return new a(i11, i12, D1);
        }
        int length = iVarArr.length;
        boolean z11 = false;
        for (int i13 = 0; i13 < length; i13++) {
            ci.i iVar3 = iVarArr[i13];
            if (iVar2.B != null && iVar3.B == null) {
                iVar3 = iVar3.a().J(iVar2.B).E();
            }
            if (iVar.e(iVar2, iVar3).f26272d != 0) {
                int i14 = iVar3.f9210q;
                z11 |= i14 == -1 || iVar3.f9211t == -1;
                i11 = Math.max(i11, i14);
                i12 = Math.max(i12, iVar3.f9211t);
                D1 = Math.max(D1, D1(iVar, iVar3));
            }
        }
        if (z11) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Resolutions unknown. Codec max resolution: ");
            sb2.append(i11);
            sb2.append("x");
            sb2.append(i12);
            ak.o.h("MediaCodecVideoRenderer", sb2.toString());
            Point A1 = A1(iVar, iVar2);
            if (A1 != null) {
                i11 = Math.max(i11, A1.x);
                i12 = Math.max(i12, A1.y);
                D1 = Math.max(D1, z1(iVar, iVar2.f9205l, i11, i12));
                StringBuilder sb3 = new StringBuilder(57);
                sb3.append("Codec max resolution adjusted to: ");
                sb3.append(i11);
                sb3.append("x");
                sb3.append(i12);
                ak.o.h("MediaCodecVideoRenderer", sb3.toString());
            }
        }
        return new a(i11, i12, D1);
    }

    protected MediaFormat E1(ci.i iVar, String str, a aVar, float f11, boolean z11, int i11) {
        Pair<Integer, Integer> p11;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(Snapshot.WIDTH, iVar.f9210q);
        mediaFormat.setInteger(Snapshot.HEIGHT, iVar.f9211t);
        vi.e.e(mediaFormat, iVar.f9207n);
        vi.e.c(mediaFormat, "frame-rate", iVar.f9212w);
        vi.e.d(mediaFormat, "rotation-degrees", iVar.f9213x);
        vi.e.b(mediaFormat, iVar.B);
        if ("video/dolby-vision".equals(iVar.f9205l) && (p11 = MediaCodecUtil.p(iVar)) != null) {
            vi.e.d(mediaFormat, Scopes.PROFILE, ((Integer) p11.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f7776a);
        mediaFormat.setInteger("max-height", aVar.f7777b);
        vi.e.d(mediaFormat, "max-input-size", aVar.f7778c);
        if (k0.f477a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f11 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f11);
            }
        }
        if (z11) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i11 != 0) {
            v1(mediaFormat, i11);
        }
        return mediaFormat;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, ci.a
    public void H() {
        t1();
        s1();
        this.f7752c4 = false;
        this.S3.g();
        this.B4 = null;
        try {
            super.H();
        } finally {
            this.T3.l(this.M3);
        }
    }

    protected boolean H1(long j11, boolean z11) {
        int P = P(j11);
        if (P == 0) {
            return false;
        }
        fi.d dVar = this.M3;
        dVar.f26266i++;
        int i11 = this.f7762m4 + P;
        if (z11) {
            dVar.f26263f += i11;
        } else {
            c2(i11);
        }
        p0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, ci.a
    public void I(boolean z11, boolean z12) {
        super.I(z11, z12);
        boolean z13 = C().f9249a;
        ak.a.f((z13 && this.A4 == 0) ? false : true);
        if (this.f7775z4 != z13) {
            this.f7775z4 = z13;
            Y0();
        }
        this.T3.n(this.M3);
        this.S3.h();
        this.f7755f4 = z12;
        this.f7756g4 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, ci.a
    public void J(long j11, boolean z11) {
        super.J(j11, z11);
        s1();
        this.S3.l();
        this.f7763n4 = -9223372036854775807L;
        this.f7757h4 = -9223372036854775807L;
        this.f7761l4 = 0;
        if (z11) {
            U1();
        } else {
            this.f7758i4 = -9223372036854775807L;
        }
    }

    void J1() {
        this.f7756g4 = true;
        if (this.f7754e4) {
            return;
        }
        this.f7754e4 = true;
        this.T3.y(this.f7750a4);
        this.f7752c4 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, ci.a
    public void K() {
        try {
            super.K();
            Surface surface = this.f7751b4;
            if (surface != null) {
                if (this.f7750a4 == surface) {
                    this.f7750a4 = null;
                }
                surface.release();
                this.f7751b4 = null;
            }
        } catch (Throwable th2) {
            if (this.f7751b4 != null) {
                Surface surface2 = this.f7750a4;
                Surface surface3 = this.f7751b4;
                if (surface2 == surface3) {
                    this.f7750a4 = null;
                }
                surface3.release();
                this.f7751b4 = null;
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, ci.a
    public void L() {
        super.L();
        this.f7760k4 = 0;
        this.f7759j4 = SystemClock.elapsedRealtime();
        this.f7764o4 = SystemClock.elapsedRealtime() * 1000;
        this.f7765p4 = 0L;
        this.f7766q4 = 0;
        this.S3.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, ci.a
    public void M() {
        this.f7758i4 = -9223372036854775807L;
        I1();
        K1();
        this.S3.n();
        super.M();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void M0(String str, long j11, long j12) {
        this.T3.j(str, j11, j12);
        this.Y3 = u1(str);
        this.Z3 = ((com.google.android.exoplayer2.mediacodec.i) ak.a.e(t0())).n();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void N0(String str) {
        this.T3.k(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public fi.e O0(ci.j jVar) {
        fi.e O0 = super.O0(jVar);
        this.T3.o(jVar.f9243b, O0);
        return O0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void P0(ci.i iVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        com.google.android.exoplayer2.mediacodec.h s02 = s0();
        if (s02 != null) {
            s02.b(this.f7753d4);
        }
        if (this.f7775z4) {
            this.f7767r4 = iVar.f9210q;
            this.f7768s4 = iVar.f9211t;
        } else {
            ak.a.e(mediaFormat);
            boolean z11 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z11) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger(Snapshot.WIDTH);
            }
            this.f7767r4 = integer;
            if (z11) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger(Snapshot.HEIGHT);
            }
            this.f7768s4 = integer2;
        }
        float f11 = iVar.f9214y;
        this.f7770u4 = f11;
        if (k0.f477a >= 21) {
            int i11 = iVar.f9213x;
            if (i11 == 90 || i11 == 270) {
                int i12 = this.f7767r4;
                this.f7767r4 = this.f7768s4;
                this.f7768s4 = i12;
                this.f7770u4 = 1.0f / f11;
            }
        } else {
            this.f7769t4 = iVar.f9213x;
        }
        this.S3.i(iVar.f9212w);
    }

    protected void P1(long j11) {
        p1(j11);
        L1();
        this.M3.f26262e++;
        J1();
        Q0(j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void Q0(long j11) {
        super.Q0(j11);
        if (this.f7775z4) {
            return;
        }
        this.f7762m4--;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void R0() {
        super.R0();
        s1();
    }

    protected void R1(com.google.android.exoplayer2.mediacodec.h hVar, int i11, long j11) {
        L1();
        h0.a("releaseOutputBuffer");
        hVar.releaseOutputBuffer(i11, true);
        h0.c();
        this.f7764o4 = SystemClock.elapsedRealtime() * 1000;
        this.M3.f26262e++;
        this.f7761l4 = 0;
        J1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected fi.e S(com.google.android.exoplayer2.mediacodec.i iVar, ci.i iVar2, ci.i iVar3) {
        fi.e e11 = iVar.e(iVar2, iVar3);
        int i11 = e11.f26273e;
        int i12 = iVar3.f9210q;
        a aVar = this.X3;
        if (i12 > aVar.f7776a || iVar3.f9211t > aVar.f7777b) {
            i11 |= 256;
        }
        if (D1(iVar, iVar3) > this.X3.f7778c) {
            i11 |= 64;
        }
        int i13 = i11;
        return new fi.e(iVar.f13700a, iVar2, iVar3, i13 != 0 ? 0 : e11.f26272d, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void S0(DecoderInputBuffer decoderInputBuffer) {
        boolean z11 = this.f7775z4;
        if (!z11) {
            this.f7762m4++;
        }
        if (k0.f477a >= 23 || !z11) {
            return;
        }
        P1(decoderInputBuffer.f13266e);
    }

    protected void S1(com.google.android.exoplayer2.mediacodec.h hVar, int i11, long j11, long j12) {
        L1();
        h0.a("releaseOutputBuffer");
        hVar.e(i11, j12);
        h0.c();
        this.f7764o4 = SystemClock.elapsedRealtime() * 1000;
        this.M3.f26262e++;
        this.f7761l4 = 0;
        J1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean U0(long j11, long j12, com.google.android.exoplayer2.mediacodec.h hVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, ci.i iVar) {
        boolean z13;
        long j14;
        ak.a.e(hVar);
        if (this.f7757h4 == -9223372036854775807L) {
            this.f7757h4 = j11;
        }
        if (j13 != this.f7763n4) {
            this.S3.j(j13);
            this.f7763n4 = j13;
        }
        long z02 = z0();
        long j15 = j13 - z02;
        if (z11 && !z12) {
            b2(hVar, i11, j15);
            return true;
        }
        double A0 = A0();
        boolean z14 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j16 = (long) ((j13 - j11) / A0);
        if (z14) {
            j16 -= elapsedRealtime - j12;
        }
        if (this.f7750a4 == this.f7751b4) {
            if (F1(j16)) {
                b2(hVar, i11, j15);
                d2(j16);
                return true;
            }
            return false;
        }
        long j17 = elapsedRealtime - this.f7764o4;
        if (this.f7756g4 ? this.f7754e4 : !(z14 || this.f7755f4)) {
            j14 = j17;
            z13 = false;
        } else {
            z13 = true;
            j14 = j17;
        }
        if (this.f7758i4 == -9223372036854775807L && j11 >= z02 && (z13 || (z14 && Z1(j16, j14)))) {
            long nanoTime = System.nanoTime();
            O1(j15, nanoTime, iVar);
            if (k0.f477a >= 21) {
                S1(hVar, i11, j15, nanoTime);
            } else {
                R1(hVar, i11, j15);
            }
            d2(j16);
            return true;
        }
        if (z14 && j11 != this.f7757h4) {
            long nanoTime2 = System.nanoTime();
            long b11 = this.S3.b((j16 * 1000) + nanoTime2);
            long j18 = (b11 - nanoTime2) / 1000;
            boolean z15 = this.f7758i4 != -9223372036854775807L;
            if (X1(j18, j12, z12) && H1(j11, z15)) {
                return false;
            }
            if (Y1(j18, j12, z12)) {
                if (z15) {
                    b2(hVar, i11, j15);
                } else {
                    x1(hVar, i11, j15);
                }
                d2(j18);
                return true;
            } else if (k0.f477a >= 21) {
                if (j18 < 50000) {
                    O1(j15, b11, iVar);
                    S1(hVar, i11, j15, b11);
                    d2(j18);
                    return true;
                }
            } else if (j18 < 30000) {
                if (j18 > 11000) {
                    try {
                        Thread.sleep((j18 - AbstractComponentTracker.LINGERING_TIMEOUT) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                O1(j15, b11, iVar);
                R1(hVar, i11, j15);
                d2(j18);
                return true;
            }
        }
        return false;
    }

    protected void V1(com.google.android.exoplayer2.mediacodec.h hVar, Surface surface) {
        hVar.c(surface);
    }

    protected boolean X1(long j11, long j12, boolean z11) {
        return G1(j11) && !z11;
    }

    protected boolean Y1(long j11, long j12, boolean z11) {
        return F1(j11) && !z11;
    }

    protected boolean Z1(long j11, long j12) {
        return F1(j11) && j12 > 100000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void a1() {
        super.a1();
        this.f7762m4 = 0;
    }

    protected void b2(com.google.android.exoplayer2.mediacodec.h hVar, int i11, long j11) {
        h0.a("skipVideoBuffer");
        hVar.releaseOutputBuffer(i11, false);
        h0.c();
        this.M3.f26263f++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void c0(com.google.android.exoplayer2.mediacodec.i iVar, com.google.android.exoplayer2.mediacodec.h hVar, ci.i iVar2, MediaCrypto mediaCrypto, float f11) {
        String str = iVar.f13702c;
        a B1 = B1(iVar, iVar2, F());
        this.X3 = B1;
        MediaFormat E1 = E1(iVar2, str, B1, f11, this.W3, this.f7775z4 ? this.A4 : 0);
        if (this.f7750a4 == null) {
            if (a2(iVar)) {
                if (this.f7751b4 == null) {
                    this.f7751b4 = d.c(this.R3, iVar.f13705f);
                }
                this.f7750a4 = this.f7751b4;
            } else {
                throw new IllegalStateException();
            }
        }
        hVar.configure(E1, this.f7750a4, mediaCrypto, 0);
        if (k0.f477a < 23 || !this.f7775z4) {
            return;
        }
        this.B4 = new b(hVar);
    }

    protected void c2(int i11) {
        fi.d dVar = this.M3;
        dVar.f26264g += i11;
        this.f7760k4 += i11;
        int i12 = this.f7761l4 + i11;
        this.f7761l4 = i12;
        dVar.f26265h = Math.max(i12, dVar.f26265h);
        int i13 = this.V3;
        if (i13 <= 0 || this.f7760k4 < i13) {
            return;
        }
        I1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException d0(Throwable th2, com.google.android.exoplayer2.mediacodec.i iVar) {
        return new MediaCodecVideoDecoderException(th2, iVar, this.f7750a4);
    }

    protected void d2(long j11) {
        this.M3.a(j11);
        this.f7765p4 += j11;
        this.f7766q4++;
    }

    @Override // com.google.android.exoplayer2.v0, ci.n
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.v0
    public boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.f7754e4 || (((surface = this.f7751b4) != null && this.f7750a4 == surface) || s0() == null || this.f7775z4))) {
            this.f7758i4 = -9223372036854775807L;
            return true;
        } else if (this.f7758i4 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f7758i4) {
                return true;
            }
            this.f7758i4 = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean j1(com.google.android.exoplayer2.mediacodec.i iVar) {
        return this.f7750a4 != null || a2(iVar);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int l1(com.google.android.exoplayer2.mediacodec.j jVar, ci.i iVar) {
        int i11 = 0;
        if (!ak.r.s(iVar.f9205l)) {
            return ci.n.l(0);
        }
        boolean z11 = iVar.f9208o != null;
        List<com.google.android.exoplayer2.mediacodec.i> C1 = C1(jVar, iVar, z11, false);
        if (z11 && C1.isEmpty()) {
            C1 = C1(jVar, iVar, false, false);
        }
        if (C1.isEmpty()) {
            return ci.n.l(1);
        }
        if (!MediaCodecRenderer.m1(iVar)) {
            return ci.n.l(2);
        }
        com.google.android.exoplayer2.mediacodec.i iVar2 = C1.get(0);
        boolean m11 = iVar2.m(iVar);
        int i12 = iVar2.o(iVar) ? 16 : 8;
        if (m11) {
            List<com.google.android.exoplayer2.mediacodec.i> C12 = C1(jVar, iVar, z11, true);
            if (!C12.isEmpty()) {
                com.google.android.exoplayer2.mediacodec.i iVar3 = C12.get(0);
                if (iVar3.m(iVar) && iVar3.o(iVar)) {
                    i11 = 32;
                }
            }
        }
        return ci.n.r(m11 ? 4 : 3, i12, i11);
    }

    @Override // ci.a, com.google.android.exoplayer2.t0.b
    public void m(int i11, Object obj) {
        if (i11 == 1) {
            W1((Surface) obj);
        } else if (i11 == 4) {
            this.f7753d4 = ((Integer) obj).intValue();
            com.google.android.exoplayer2.mediacodec.h s02 = s0();
            if (s02 != null) {
                s02.b(this.f7753d4);
            }
        } else if (i11 == 6) {
            this.C4 = (k) obj;
        } else if (i11 != 102) {
            super.m(i11, obj);
        } else {
            int intValue = ((Integer) obj).intValue();
            if (this.A4 != intValue) {
                this.A4 = intValue;
                if (this.f7775z4) {
                    Y0();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.v0
    public void t(float f11, float f12) {
        super.t(f11, f12);
        this.S3.k(f11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean u0() {
        return this.f7775z4 && k0.f477a < 23;
    }

    protected boolean u1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (g.class) {
            if (!E4) {
                F4 = y1();
                E4 = true;
            }
        }
        return F4;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float v0(float f11, ci.i iVar, ci.i[] iVarArr) {
        float f12 = -1.0f;
        for (ci.i iVar2 : iVarArr) {
            float f13 = iVar2.f9212w;
            if (f13 != -1.0f) {
                f12 = Math.max(f12, f13);
            }
        }
        if (f12 == -1.0f) {
            return -1.0f;
        }
        return f12 * f11;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected List<com.google.android.exoplayer2.mediacodec.i> x0(com.google.android.exoplayer2.mediacodec.j jVar, ci.i iVar, boolean z11) {
        return C1(jVar, iVar, z11, this.f7775z4);
    }

    protected void x1(com.google.android.exoplayer2.mediacodec.h hVar, int i11, long j11) {
        h0.a("dropVideoBuffer");
        hVar.releaseOutputBuffer(i11, false);
        h0.c();
        c2(1);
    }

    public g(Context context, h.a aVar, com.google.android.exoplayer2.mediacodec.j jVar, long j11, boolean z11, Handler handler, w wVar, int i11) {
        super(2, aVar, jVar, z11, 30.0f);
        this.U3 = j11;
        this.V3 = i11;
        Context applicationContext = context.getApplicationContext();
        this.R3 = applicationContext;
        this.S3 = new l(applicationContext);
        this.T3 = new w.a(handler, wVar);
        this.W3 = w1();
        this.f7758i4 = -9223372036854775807L;
        this.f7767r4 = -1;
        this.f7768s4 = -1;
        this.f7770u4 = -1.0f;
        this.f7753d4 = 1;
        this.A4 = 0;
        t1();
    }
}
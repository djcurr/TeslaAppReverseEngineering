package com.google.android.exoplayer2.audio;

import ak.k0;
import ak.q;
import ak.r;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import ci.i;
import ci.n;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.h;
import com.google.android.exoplayer2.v0;
import ei.p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class g extends MediaCodecRenderer implements q {
    private final Context R3;
    private final a.C0246a S3;
    private final AudioSink T3;
    private int U3;
    private boolean V3;
    private ci.i W3;
    private long X3;
    private boolean Y3;
    private boolean Z3;

    /* renamed from: a4  reason: collision with root package name */
    private boolean f13151a4;

    /* renamed from: b4  reason: collision with root package name */
    private boolean f13152b4;

    /* renamed from: c4  reason: collision with root package name */
    private v0.a f13153c4;

    /* loaded from: classes3.dex */
    private final class b implements AudioSink.a {
        private b() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void a(boolean z11) {
            g.this.S3.z(z11);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void b(long j11) {
            g.this.S3.y(j11);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void c(Exception exc) {
            g.this.S3.j(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void d(long j11) {
            if (g.this.f13153c4 != null) {
                g.this.f13153c4.b(j11);
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void e(int i11, long j11, long j12) {
            g.this.S3.A(i11, j11, j12);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void f() {
            g.this.x1();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void g() {
            if (g.this.f13153c4 != null) {
                g.this.f13153c4.a();
            }
        }
    }

    public g(Context context, com.google.android.exoplayer2.mediacodec.j jVar, boolean z11, Handler handler, com.google.android.exoplayer2.audio.a aVar, AudioSink audioSink) {
        this(context, h.a.f13699a, jVar, z11, handler, aVar, audioSink);
    }

    private static boolean s1(String str) {
        if (k0.f477a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(k0.f479c)) {
            String str2 = k0.f478b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean t1() {
        if (k0.f477a == 23) {
            String str = k0.f480d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int u1(com.google.android.exoplayer2.mediacodec.i iVar, ci.i iVar2) {
        int i11;
        if (!"OMX.google.raw.decoder".equals(iVar.f13700a) || (i11 = k0.f477a) >= 24 || (i11 == 23 && k0.s0(this.R3))) {
            return iVar2.f9206m;
        }
        return -1;
    }

    private void y1() {
        long n11 = this.T3.n(c());
        if (n11 != Long.MIN_VALUE) {
            if (!this.Z3) {
                n11 = Math.max(this.X3, n11);
            }
            this.X3 = n11;
            this.Z3 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, ci.a
    public void H() {
        this.f13151a4 = true;
        try {
            this.T3.flush();
            try {
                super.H();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.H();
                throw th2;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, ci.a
    public void I(boolean z11, boolean z12) {
        super.I(z11, z12);
        this.S3.n(this.M3);
        if (C().f9249a) {
            this.T3.s();
        } else {
            this.T3.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, ci.a
    public void J(long j11, boolean z11) {
        super.J(j11, z11);
        if (this.f13152b4) {
            this.T3.l();
        } else {
            this.T3.flush();
        }
        this.X3 = j11;
        this.Y3 = true;
        this.Z3 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, ci.a
    public void K() {
        try {
            super.K();
        } finally {
            if (this.f13151a4) {
                this.f13151a4 = false;
                this.T3.reset();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, ci.a
    public void L() {
        super.L();
        this.T3.u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, ci.a
    public void M() {
        y1();
        this.T3.d();
        super.M();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void M0(String str, long j11, long j12) {
        this.S3.k(str, j11, j12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void N0(String str) {
        this.S3.l(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public fi.e O0(ci.j jVar) {
        fi.e O0 = super.O0(jVar);
        this.S3.o(jVar.f9243b, O0);
        return O0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void P0(ci.i iVar, MediaFormat mediaFormat) {
        int i11;
        int i12;
        ci.i iVar2 = this.W3;
        int[] iArr = null;
        if (iVar2 != null) {
            iVar = iVar2;
        } else if (s0() != null) {
            if ("audio/raw".equals(iVar.f9205l)) {
                i11 = iVar.F;
            } else if (k0.f477a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i11 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i11 = k0.a0(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i11 = "audio/raw".equals(iVar.f9205l) ? iVar.F : 2;
            }
            ci.i E = new i.b().e0("audio/raw").Y(i11).M(iVar.G).N(iVar.H).H(mediaFormat.getInteger("channel-count")).f0(mediaFormat.getInteger("sample-rate")).E();
            if (this.V3 && E.C == 6 && (i12 = iVar.C) < 6) {
                iArr = new int[i12];
                for (int i13 = 0; i13 < iVar.C; i13++) {
                    iArr[i13] = i13;
                }
            }
            iVar = E;
        }
        try {
            this.T3.o(iVar, 0, iArr);
        } catch (AudioSink.ConfigurationException e11) {
            throw A(e11, e11.f13044a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void R0() {
        super.R0();
        this.T3.q();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected fi.e S(com.google.android.exoplayer2.mediacodec.i iVar, ci.i iVar2, ci.i iVar3) {
        fi.e e11 = iVar.e(iVar2, iVar3);
        int i11 = e11.f26273e;
        if (u1(iVar, iVar3) > this.U3) {
            i11 |= 64;
        }
        int i12 = i11;
        return new fi.e(iVar.f13700a, iVar2, iVar3, i12 != 0 ? 0 : e11.f26272d, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void S0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.Y3 || decoderInputBuffer.k()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f13266e - this.X3) > 500000) {
            this.X3 = decoderInputBuffer.f13266e;
        }
        this.Y3 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean U0(long j11, long j12, com.google.android.exoplayer2.mediacodec.h hVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, ci.i iVar) {
        ak.a.e(byteBuffer);
        if (this.W3 != null && (i12 & 2) != 0) {
            ((com.google.android.exoplayer2.mediacodec.h) ak.a.e(hVar)).releaseOutputBuffer(i11, false);
            return true;
        } else if (z11) {
            if (hVar != null) {
                hVar.releaseOutputBuffer(i11, false);
            }
            this.M3.f26263f += i13;
            this.T3.q();
            return true;
        } else {
            try {
                if (this.T3.j(byteBuffer, j13, i13)) {
                    if (hVar != null) {
                        hVar.releaseOutputBuffer(i11, false);
                    }
                    this.M3.f26262e += i13;
                    return true;
                }
                return false;
            } catch (AudioSink.InitializationException e11) {
                throw B(e11, e11.f13046b, e11.f13045a);
            } catch (AudioSink.WriteException e12) {
                throw B(e12, iVar, e12.f13047a);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void Z0() {
        try {
            this.T3.m();
        } catch (AudioSink.WriteException e11) {
            throw B(e11, e11.f13048b, e11.f13047a);
        }
    }

    @Override // ak.q
    public ci.l b() {
        return this.T3.b();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.v0
    public boolean c() {
        return super.c() && this.T3.c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void c0(com.google.android.exoplayer2.mediacodec.i iVar, com.google.android.exoplayer2.mediacodec.h hVar, ci.i iVar2, MediaCrypto mediaCrypto, float f11) {
        this.U3 = v1(iVar, iVar2, F());
        this.V3 = s1(iVar.f13700a);
        boolean z11 = false;
        hVar.configure(w1(iVar2, iVar.f13702c, this.U3, f11), null, mediaCrypto, 0);
        if ("audio/raw".equals(iVar.f13701b) && !"audio/raw".equals(iVar2.f9205l)) {
            z11 = true;
        }
        if (!z11) {
            iVar2 = null;
        }
        this.W3 = iVar2;
    }

    @Override // ak.q
    public void e(ci.l lVar) {
        this.T3.e(lVar);
    }

    @Override // com.google.android.exoplayer2.v0, ci.n
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.v0
    public boolean isReady() {
        return this.T3.f() || super.isReady();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean k1(ci.i iVar) {
        return this.T3.a(iVar);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int l1(com.google.android.exoplayer2.mediacodec.j jVar, ci.i iVar) {
        if (!r.p(iVar.f9205l)) {
            return n.l(0);
        }
        int i11 = k0.f477a >= 21 ? 32 : 0;
        boolean z11 = iVar.L != null;
        boolean m12 = MediaCodecRenderer.m1(iVar);
        int i12 = 8;
        if (m12 && this.T3.a(iVar) && (!z11 || MediaCodecUtil.u() != null)) {
            return n.r(4, 8, i11);
        }
        if ("audio/raw".equals(iVar.f9205l) && !this.T3.a(iVar)) {
            return n.l(1);
        }
        if (!this.T3.a(k0.b0(2, iVar.C, iVar.E))) {
            return n.l(1);
        }
        List<com.google.android.exoplayer2.mediacodec.i> x02 = x0(jVar, iVar, false);
        if (x02.isEmpty()) {
            return n.l(1);
        }
        if (!m12) {
            return n.l(2);
        }
        com.google.android.exoplayer2.mediacodec.i iVar2 = x02.get(0);
        boolean m11 = iVar2.m(iVar);
        if (m11 && iVar2.o(iVar)) {
            i12 = 16;
        }
        return n.r(m11 ? 4 : 3, i12, i11);
    }

    @Override // ci.a, com.google.android.exoplayer2.t0.b
    public void m(int i11, Object obj) {
        if (i11 == 2) {
            this.T3.r(((Float) obj).floatValue());
        } else if (i11 == 3) {
            this.T3.t((ei.d) obj);
        } else if (i11 != 5) {
            switch (i11) {
                case 101:
                    this.T3.v(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    this.T3.g(((Integer) obj).intValue());
                    return;
                case 103:
                    this.f13153c4 = (v0.a) obj;
                    return;
                default:
                    super.m(i11, obj);
                    return;
            }
        } else {
            this.T3.i((p) obj);
        }
    }

    @Override // ak.q
    public long s() {
        if (getState() == 2) {
            y1();
        }
        return this.X3;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float v0(float f11, ci.i iVar, ci.i[] iVarArr) {
        int i11 = -1;
        for (ci.i iVar2 : iVarArr) {
            int i12 = iVar2.E;
            if (i12 != -1) {
                i11 = Math.max(i11, i12);
            }
        }
        if (i11 == -1) {
            return -1.0f;
        }
        return f11 * i11;
    }

    protected int v1(com.google.android.exoplayer2.mediacodec.i iVar, ci.i iVar2, ci.i[] iVarArr) {
        int u12 = u1(iVar, iVar2);
        if (iVarArr.length == 1) {
            return u12;
        }
        for (ci.i iVar3 : iVarArr) {
            if (iVar.e(iVar2, iVar3).f26272d != 0) {
                u12 = Math.max(u12, u1(iVar, iVar3));
            }
        }
        return u12;
    }

    protected MediaFormat w1(ci.i iVar, String str, int i11, float f11) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", iVar.C);
        mediaFormat.setInteger("sample-rate", iVar.E);
        vi.e.e(mediaFormat, iVar.f9207n);
        vi.e.d(mediaFormat, "max-input-size", i11);
        int i12 = k0.f477a;
        if (i12 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f11 != -1.0f && !t1()) {
                mediaFormat.setFloat("operating-rate", f11);
            }
        }
        if (i12 <= 28 && "audio/ac4".equals(iVar.f9205l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i12 >= 24 && this.T3.p(k0.b0(4, iVar.C, iVar.E)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected List<com.google.android.exoplayer2.mediacodec.i> x0(com.google.android.exoplayer2.mediacodec.j jVar, ci.i iVar, boolean z11) {
        com.google.android.exoplayer2.mediacodec.i u11;
        String str = iVar.f9205l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.T3.a(iVar) && (u11 = MediaCodecUtil.u()) != null) {
            return Collections.singletonList(u11);
        }
        List<com.google.android.exoplayer2.mediacodec.i> t11 = MediaCodecUtil.t(jVar.a(str, z11, false), iVar);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(t11);
            arrayList.addAll(jVar.a("audio/eac3", z11, false));
            t11 = arrayList;
        }
        return Collections.unmodifiableList(t11);
    }

    protected void x1() {
        this.Z3 = true;
    }

    @Override // ci.a, com.google.android.exoplayer2.v0
    public q y() {
        return this;
    }

    public g(Context context, h.a aVar, com.google.android.exoplayer2.mediacodec.j jVar, boolean z11, Handler handler, com.google.android.exoplayer2.audio.a aVar2, AudioSink audioSink) {
        super(1, aVar, jVar, z11, 44100.0f);
        this.R3 = context.getApplicationContext();
        this.T3 = audioSink;
        this.S3 = new a.C0246a(handler, aVar2);
        audioSink.k(new b());
    }
}
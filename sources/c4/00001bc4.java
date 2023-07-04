package com.google.android.exoplayer2.mediacodec;

import ak.f0;
import ak.h0;
import ak.k0;
import ak.t;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.b;
import com.google.android.exoplayer2.mediacodec.h;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class MediaCodecRenderer extends ci.a {
    private static final byte[] Q3 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final long[] A;
    private boolean A3;
    private final long[] B;
    private boolean B3;
    private final long[] C;
    private long C3;
    private long D3;
    private ci.i E;
    private boolean E3;
    private ci.i F;
    private boolean F3;
    private DrmSession G;
    private boolean G3;
    private DrmSession H;
    private boolean H3;
    private boolean I3;
    private boolean J3;
    private MediaCrypto K;
    private boolean K3;
    private boolean L;
    private ExoPlaybackException L3;
    protected fi.d M3;
    private long N3;
    private long O;
    private long O3;
    private float P;
    private int P3;
    private float Q;
    private int Q1;
    private boolean Q2;
    private h R;
    private ci.i T;
    private boolean V1;
    private MediaFormat Y;

    /* renamed from: b1  reason: collision with root package name */
    private boolean f13599b1;

    /* renamed from: b2  reason: collision with root package name */
    private boolean f13600b2;

    /* renamed from: g1  reason: collision with root package name */
    private float f13601g1;

    /* renamed from: g2  reason: collision with root package name */
    private boolean f13602g2;

    /* renamed from: i3  reason: collision with root package name */
    private boolean f13603i3;

    /* renamed from: j3  reason: collision with root package name */
    private boolean f13604j3;

    /* renamed from: k3  reason: collision with root package name */
    private boolean f13605k3;

    /* renamed from: l  reason: collision with root package name */
    private final h.a f13606l;

    /* renamed from: l3  reason: collision with root package name */
    private g f13607l3;

    /* renamed from: m  reason: collision with root package name */
    private final j f13608m;

    /* renamed from: m3  reason: collision with root package name */
    private long f13609m3;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f13610n;

    /* renamed from: n3  reason: collision with root package name */
    private int f13611n3;

    /* renamed from: o  reason: collision with root package name */
    private final float f13612o;

    /* renamed from: o3  reason: collision with root package name */
    private int f13613o3;

    /* renamed from: p  reason: collision with root package name */
    private final DecoderInputBuffer f13614p;

    /* renamed from: p1  reason: collision with root package name */
    private ArrayDeque<i> f13615p1;

    /* renamed from: p2  reason: collision with root package name */
    private boolean f13616p2;

    /* renamed from: p3  reason: collision with root package name */
    private ByteBuffer f13617p3;

    /* renamed from: q  reason: collision with root package name */
    private final DecoderInputBuffer f13618q;

    /* renamed from: q3  reason: collision with root package name */
    private boolean f13619q3;

    /* renamed from: r3  reason: collision with root package name */
    private boolean f13620r3;

    /* renamed from: s3  reason: collision with root package name */
    private boolean f13621s3;

    /* renamed from: t  reason: collision with root package name */
    private final DecoderInputBuffer f13622t;

    /* renamed from: t3  reason: collision with root package name */
    private boolean f13623t3;

    /* renamed from: u3  reason: collision with root package name */
    private boolean f13624u3;

    /* renamed from: v3  reason: collision with root package name */
    private boolean f13625v3;

    /* renamed from: w  reason: collision with root package name */
    private final f f13626w;

    /* renamed from: w3  reason: collision with root package name */
    private int f13627w3;

    /* renamed from: x  reason: collision with root package name */
    private final f0<ci.i> f13628x;

    /* renamed from: x1  reason: collision with root package name */
    private DecoderInitializationException f13629x1;

    /* renamed from: x2  reason: collision with root package name */
    private boolean f13630x2;

    /* renamed from: x3  reason: collision with root package name */
    private int f13631x3;

    /* renamed from: y  reason: collision with root package name */
    private final ArrayList<Long> f13632y;

    /* renamed from: y1  reason: collision with root package name */
    private i f13633y1;

    /* renamed from: y2  reason: collision with root package name */
    private boolean f13634y2;

    /* renamed from: y3  reason: collision with root package name */
    private int f13635y3;

    /* renamed from: z  reason: collision with root package name */
    private final MediaCodec.BufferInfo f13636z;

    /* renamed from: z3  reason: collision with root package name */
    private boolean f13637z3;

    public MediaCodecRenderer(int i11, h.a aVar, j jVar, boolean z11, float f11) {
        super(i11);
        this.f13606l = aVar;
        this.f13608m = (j) ak.a.e(jVar);
        this.f13610n = z11;
        this.f13612o = f11;
        this.f13614p = DecoderInputBuffer.v();
        this.f13618q = new DecoderInputBuffer(0);
        this.f13622t = new DecoderInputBuffer(2);
        f fVar = new f();
        this.f13626w = fVar;
        this.f13628x = new f0<>();
        this.f13632y = new ArrayList<>();
        this.f13636z = new MediaCodec.BufferInfo();
        this.P = 1.0f;
        this.Q = 1.0f;
        this.O = -9223372036854775807L;
        this.A = new long[10];
        this.B = new long[10];
        this.C = new long[10];
        this.N3 = -9223372036854775807L;
        this.O3 = -9223372036854775807L;
        fVar.r(0);
        fVar.f13264c.order(ByteOrder.nativeOrder());
        b1();
    }

    private boolean C0() {
        return this.f13613o3 >= 0;
    }

    private void D0(ci.i iVar) {
        e0();
        String str = iVar.f9205l;
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.f13626w.E(1);
        } else {
            this.f13626w.E(32);
        }
        this.f13621s3 = true;
    }

    private void E0(i iVar, MediaCrypto mediaCrypto) {
        h a11;
        String str = iVar.f13700a;
        int i11 = k0.f477a;
        float v02 = i11 < 23 ? -1.0f : v0(this.Q, this.E, F());
        float f11 = v02 <= this.f13612o ? -1.0f : v02;
        h hVar = null;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String valueOf = String.valueOf(str);
            h0.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            if (this.I3 && i11 >= 23) {
                a11 = new b.C0249b(d(), this.J3, this.K3).a(createByCodecName);
            } else {
                a11 = this.f13606l.a(createByCodecName);
            }
            h hVar2 = a11;
            try {
                h0.c();
                h0.a("configureCodec");
                c0(iVar, hVar2, this.E, mediaCrypto, f11);
                h0.c();
                h0.a("startCodec");
                hVar2.start();
                h0.c();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                this.R = hVar2;
                this.f13633y1 = iVar;
                this.f13601g1 = f11;
                this.T = this.E;
                this.Q1 = T(str);
                this.V1 = U(str, this.T);
                this.f13600b2 = Z(str);
                this.f13602g2 = b0(str);
                this.f13616p2 = W(str);
                this.f13630x2 = X(str);
                this.f13634y2 = V(str);
                this.Q2 = a0(str, this.T);
                this.f13605k3 = Y(iVar) || u0();
                if ("c2.android.mp3.decoder".equals(iVar.f13700a)) {
                    this.f13607l3 = new g();
                }
                if (getState() == 2) {
                    this.f13609m3 = SystemClock.elapsedRealtime() + 1000;
                }
                this.M3.f26258a++;
                M0(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            } catch (Exception e11) {
                e = e11;
                hVar = hVar2;
                if (hVar != null) {
                    hVar.release();
                }
                throw e;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    private boolean F0(long j11) {
        int size = this.f13632y.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f13632y.get(i11).longValue() == j11) {
                this.f13632y.remove(i11);
                return true;
            }
        }
        return false;
    }

    private static boolean G0(IllegalStateException illegalStateException) {
        if (k0.f477a < 21 || !H0(illegalStateException)) {
            StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
            return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
        }
        return true;
    }

    private static boolean H0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private void K0(MediaCrypto mediaCrypto, boolean z11) {
        if (this.f13615p1 == null) {
            try {
                List<i> r02 = r0(z11);
                ArrayDeque<i> arrayDeque = new ArrayDeque<>();
                this.f13615p1 = arrayDeque;
                if (this.f13610n) {
                    arrayDeque.addAll(r02);
                } else if (!r02.isEmpty()) {
                    this.f13615p1.add(r02.get(0));
                }
                this.f13629x1 = null;
            } catch (MediaCodecUtil.DecoderQueryException e11) {
                throw new DecoderInitializationException(this.E, e11, z11, -49998);
            }
        }
        if (!this.f13615p1.isEmpty()) {
            while (this.R == null) {
                i peekFirst = this.f13615p1.peekFirst();
                if (!j1(peekFirst)) {
                    return;
                }
                try {
                    E0(peekFirst, mediaCrypto);
                } catch (Exception e12) {
                    String valueOf = String.valueOf(peekFirst);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 30);
                    sb2.append("Failed to initialize decoder: ");
                    sb2.append(valueOf);
                    ak.o.i("MediaCodecRenderer", sb2.toString(), e12);
                    this.f13615p1.removeFirst();
                    DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.E, e12, z11, peekFirst);
                    if (this.f13629x1 != null) {
                        this.f13629x1 = this.f13629x1.c(decoderInitializationException);
                    } else {
                        this.f13629x1 = decoderInitializationException;
                    }
                    if (this.f13615p1.isEmpty()) {
                        throw this.f13629x1;
                    }
                }
            }
            this.f13615p1 = null;
            return;
        }
        throw new DecoderInitializationException(this.E, (Throwable) null, z11, -49999);
    }

    private boolean L0(hi.n nVar, ci.i iVar) {
        if (nVar.f29226c) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(nVar.f29224a, nVar.f29225b);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(iVar.f9205l);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private void Q() {
        ak.a.f(!this.E3);
        ci.j D = D();
        this.f13622t.f();
        do {
            this.f13622t.f();
            int O = O(D, this.f13622t, false);
            if (O == -5) {
                O0(D);
                return;
            } else if (O != -4) {
                if (O != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f13622t.l()) {
                this.E3 = true;
                return;
            } else {
                if (this.G3) {
                    ci.i iVar = (ci.i) ak.a.e(this.E);
                    this.F = iVar;
                    P0(iVar, null);
                    this.G3 = false;
                }
                this.f13622t.s();
            }
        } while (this.f13626w.x(this.f13622t));
        this.f13623t3 = true;
    }

    private boolean R(long j11, long j12) {
        boolean z11;
        ak.a.f(!this.F3);
        if (this.f13626w.D()) {
            f fVar = this.f13626w;
            if (!U0(j11, j12, null, fVar.f13264c, this.f13613o3, 0, fVar.B(), this.f13626w.z(), this.f13626w.k(), this.f13626w.l(), this.F)) {
                return false;
            }
            Q0(this.f13626w.A());
            this.f13626w.f();
            z11 = false;
        } else {
            z11 = false;
        }
        if (this.E3) {
            this.F3 = true;
            return z11;
        }
        if (this.f13623t3) {
            ak.a.f(this.f13626w.x(this.f13622t));
            this.f13623t3 = z11;
        }
        if (this.f13624u3) {
            if (this.f13626w.D()) {
                return true;
            }
            e0();
            this.f13624u3 = z11;
            J0();
            if (!this.f13621s3) {
                return z11;
            }
        }
        Q();
        if (this.f13626w.D()) {
            this.f13626w.s();
        }
        if (this.f13626w.D() || this.E3 || this.f13624u3) {
            return true;
        }
        return z11;
    }

    private int T(String str) {
        int i11 = k0.f477a;
        if (i11 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = k0.f480d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i11 < 24) {
            if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
                String str3 = k0.f478b;
                return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
            }
            return 0;
        }
        return 0;
    }

    private void T0() {
        int i11 = this.f13635y3;
        if (i11 == 1) {
            o0();
        } else if (i11 == 2) {
            o0();
            o1();
        } else if (i11 != 3) {
            this.F3 = true;
            Z0();
        } else {
            X0();
        }
    }

    private static boolean U(String str, ci.i iVar) {
        return k0.f477a < 21 && iVar.f9207n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean V(String str) {
        if (k0.f477a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(k0.f479c)) {
            String str2 = k0.f478b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private void V0() {
        this.B3 = true;
        MediaFormat outputFormat = this.R.getOutputFormat();
        if (this.Q1 != 0 && outputFormat.getInteger(Snapshot.WIDTH) == 32 && outputFormat.getInteger(Snapshot.HEIGHT) == 32) {
            this.f13604j3 = true;
            return;
        }
        if (this.Q2) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.Y = outputFormat;
        this.f13599b1 = true;
    }

    private static boolean W(String str) {
        int i11 = k0.f477a;
        if (i11 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i11 <= 19) {
                String str2 = k0.f478b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private boolean W0(boolean z11) {
        ci.j D = D();
        this.f13614p.f();
        int O = O(D, this.f13614p, z11);
        if (O == -5) {
            O0(D);
            return true;
        } else if (O == -4 && this.f13614p.l()) {
            this.E3 = true;
            T0();
            return false;
        } else {
            return false;
        }
    }

    private static boolean X(String str) {
        return k0.f477a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private void X0() {
        Y0();
        J0();
    }

    private static boolean Y(i iVar) {
        String str = iVar.f13700a;
        int i11 = k0.f477a;
        return (i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i11 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i11 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(k0.f479c) && "AFTS".equals(k0.f480d) && iVar.f13705f));
    }

    private static boolean Z(String str) {
        int i11 = k0.f477a;
        return i11 < 18 || (i11 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i11 == 19 && k0.f480d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean a0(String str, ci.i iVar) {
        return k0.f477a <= 18 && iVar.C == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private static boolean b0(String str) {
        return k0.f477a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void c1() {
        this.f13611n3 = -1;
        this.f13618q.f13264c = null;
    }

    private void d1() {
        this.f13613o3 = -1;
        this.f13617p3 = null;
    }

    private void e0() {
        this.f13624u3 = false;
        this.f13626w.f();
        this.f13622t.f();
        this.f13623t3 = false;
        this.f13621s3 = false;
    }

    private void e1(DrmSession drmSession) {
        DrmSession.f(this.G, drmSession);
        this.G = drmSession;
    }

    private boolean f0() {
        if (this.f13637z3) {
            this.f13631x3 = 1;
            if (!this.f13600b2 && !this.f13616p2) {
                this.f13635y3 = 1;
            } else {
                this.f13635y3 = 3;
                return false;
            }
        }
        return true;
    }

    private void g0() {
        if (this.f13637z3) {
            this.f13631x3 = 1;
            this.f13635y3 = 3;
            return;
        }
        X0();
    }

    private boolean h0() {
        if (this.f13637z3) {
            this.f13631x3 = 1;
            if (!this.f13600b2 && !this.f13616p2) {
                this.f13635y3 = 2;
            } else {
                this.f13635y3 = 3;
                return false;
            }
        } else {
            o1();
        }
        return true;
    }

    private void h1(DrmSession drmSession) {
        DrmSession.f(this.H, drmSession);
        this.H = drmSession;
    }

    private boolean i0(long j11, long j12) {
        boolean z11;
        boolean U0;
        int g11;
        if (!C0()) {
            if (this.f13630x2 && this.A3) {
                try {
                    g11 = this.R.g(this.f13636z);
                } catch (IllegalStateException unused) {
                    T0();
                    if (this.F3) {
                        Y0();
                    }
                    return false;
                }
            } else {
                g11 = this.R.g(this.f13636z);
            }
            if (g11 < 0) {
                if (g11 == -2) {
                    V0();
                    return true;
                }
                if (this.f13605k3 && (this.E3 || this.f13631x3 == 2)) {
                    T0();
                }
                return false;
            } else if (this.f13604j3) {
                this.f13604j3 = false;
                this.R.releaseOutputBuffer(g11, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo = this.f13636z;
                if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                    T0();
                    return false;
                }
                this.f13613o3 = g11;
                ByteBuffer outputBuffer = this.R.getOutputBuffer(g11);
                this.f13617p3 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(this.f13636z.offset);
                    ByteBuffer byteBuffer = this.f13617p3;
                    MediaCodec.BufferInfo bufferInfo2 = this.f13636z;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.f13634y2) {
                    MediaCodec.BufferInfo bufferInfo3 = this.f13636z;
                    if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                        long j13 = this.C3;
                        if (j13 != -9223372036854775807L) {
                            bufferInfo3.presentationTimeUs = j13;
                        }
                    }
                }
                this.f13619q3 = F0(this.f13636z.presentationTimeUs);
                long j14 = this.D3;
                long j15 = this.f13636z.presentationTimeUs;
                this.f13620r3 = j14 == j15;
                p1(j15);
            }
        }
        if (this.f13630x2 && this.A3) {
            try {
                h hVar = this.R;
                ByteBuffer byteBuffer2 = this.f13617p3;
                int i11 = this.f13613o3;
                MediaCodec.BufferInfo bufferInfo4 = this.f13636z;
                z11 = false;
                try {
                    U0 = U0(j11, j12, hVar, byteBuffer2, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f13619q3, this.f13620r3, this.F);
                } catch (IllegalStateException unused2) {
                    T0();
                    if (this.F3) {
                        Y0();
                    }
                    return z11;
                }
            } catch (IllegalStateException unused3) {
                z11 = false;
            }
        } else {
            z11 = false;
            h hVar2 = this.R;
            ByteBuffer byteBuffer3 = this.f13617p3;
            int i12 = this.f13613o3;
            MediaCodec.BufferInfo bufferInfo5 = this.f13636z;
            U0 = U0(j11, j12, hVar2, byteBuffer3, i12, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f13619q3, this.f13620r3, this.F);
        }
        if (U0) {
            Q0(this.f13636z.presentationTimeUs);
            boolean z12 = (this.f13636z.flags & 4) != 0 ? true : z11;
            d1();
            if (!z12) {
                return true;
            }
            T0();
        }
        return z11;
    }

    private boolean i1(long j11) {
        return this.O == -9223372036854775807L || SystemClock.elapsedRealtime() - j11 < this.O;
    }

    private boolean j0(i iVar, ci.i iVar2, DrmSession drmSession, DrmSession drmSession2) {
        hi.n y02;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 == null || drmSession == null || k0.f477a < 23) {
            return true;
        }
        UUID uuid = ci.b.f9157e;
        if (uuid.equals(drmSession.c()) || uuid.equals(drmSession2.c()) || (y02 = y0(drmSession2)) == null) {
            return true;
        }
        return !iVar.f13705f && L0(y02, iVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean m1(ci.i iVar) {
        Class<? extends hi.m> cls = iVar.L;
        return cls == null || hi.n.class.equals(cls);
    }

    private boolean n0() {
        h hVar = this.R;
        if (hVar == null || this.f13631x3 == 2 || this.E3) {
            return false;
        }
        if (this.f13611n3 < 0) {
            int f11 = hVar.f();
            this.f13611n3 = f11;
            if (f11 < 0) {
                return false;
            }
            this.f13618q.f13264c = this.R.getInputBuffer(f11);
            this.f13618q.f();
        }
        if (this.f13631x3 == 1) {
            if (!this.f13605k3) {
                this.A3 = true;
                this.R.queueInputBuffer(this.f13611n3, 0, 0, 0L, 4);
                c1();
            }
            this.f13631x3 = 2;
            return false;
        } else if (this.f13603i3) {
            this.f13603i3 = false;
            ByteBuffer byteBuffer = this.f13618q.f13264c;
            byte[] bArr = Q3;
            byteBuffer.put(bArr);
            this.R.queueInputBuffer(this.f13611n3, 0, bArr.length, 0L, 0);
            c1();
            this.f13637z3 = true;
            return true;
        } else {
            if (this.f13627w3 == 1) {
                for (int i11 = 0; i11 < this.T.f9207n.size(); i11++) {
                    this.f13618q.f13264c.put(this.T.f9207n.get(i11));
                }
                this.f13627w3 = 2;
            }
            int position = this.f13618q.f13264c.position();
            ci.j D = D();
            int O = O(D, this.f13618q, false);
            if (g()) {
                this.D3 = this.C3;
            }
            if (O == -3) {
                return false;
            }
            if (O == -5) {
                if (this.f13627w3 == 2) {
                    this.f13618q.f();
                    this.f13627w3 = 1;
                }
                O0(D);
                return true;
            } else if (this.f13618q.l()) {
                if (this.f13627w3 == 2) {
                    this.f13618q.f();
                    this.f13627w3 = 1;
                }
                this.E3 = true;
                if (!this.f13637z3) {
                    T0();
                    return false;
                }
                try {
                    if (!this.f13605k3) {
                        this.A3 = true;
                        this.R.queueInputBuffer(this.f13611n3, 0, 0, 0L, 4);
                        c1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e11) {
                    throw A(e11, this.E);
                }
            } else if (!this.f13637z3 && !this.f13618q.n()) {
                this.f13618q.f();
                if (this.f13627w3 == 2) {
                    this.f13627w3 = 1;
                }
                return true;
            } else {
                boolean t11 = this.f13618q.t();
                if (t11) {
                    this.f13618q.f13263b.b(position);
                }
                if (this.V1 && !t11) {
                    t.b(this.f13618q.f13264c);
                    if (this.f13618q.f13264c.position() == 0) {
                        return true;
                    }
                    this.V1 = false;
                }
                DecoderInputBuffer decoderInputBuffer = this.f13618q;
                long j11 = decoderInputBuffer.f13266e;
                g gVar = this.f13607l3;
                if (gVar != null) {
                    j11 = gVar.c(this.E, decoderInputBuffer);
                }
                long j12 = j11;
                if (this.f13618q.k()) {
                    this.f13632y.add(Long.valueOf(j12));
                }
                if (this.G3) {
                    this.f13628x.a(j12, this.E);
                    this.G3 = false;
                }
                if (this.f13607l3 != null) {
                    this.C3 = Math.max(this.C3, this.f13618q.f13266e);
                } else {
                    this.C3 = Math.max(this.C3, j12);
                }
                this.f13618q.s();
                if (this.f13618q.i()) {
                    B0(this.f13618q);
                }
                S0(this.f13618q);
                try {
                    if (t11) {
                        this.R.d(this.f13611n3, 0, this.f13618q.f13263b, j12, 0);
                    } else {
                        this.R.queueInputBuffer(this.f13611n3, 0, this.f13618q.f13264c.limit(), j12, 0);
                    }
                    c1();
                    this.f13637z3 = true;
                    this.f13627w3 = 0;
                    this.M3.f26260c++;
                    return true;
                } catch (MediaCodec.CryptoException e12) {
                    throw A(e12, this.E);
                }
            }
        }
    }

    private boolean n1(ci.i iVar) {
        if (k0.f477a < 23) {
            return true;
        }
        float v02 = v0(this.Q, iVar, F());
        float f11 = this.f13601g1;
        if (f11 == v02) {
            return true;
        }
        if (v02 == -1.0f) {
            g0();
            return false;
        } else if (f11 != -1.0f || v02 > this.f13612o) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", v02);
            this.R.setParameters(bundle);
            this.f13601g1 = v02;
            return true;
        } else {
            return true;
        }
    }

    private void o0() {
        try {
            this.R.flush();
        } finally {
            a1();
        }
    }

    private void o1() {
        try {
            this.K.setMediaDrmSession(y0(this.H).f29225b);
            e1(this.H);
            this.f13631x3 = 0;
            this.f13635y3 = 0;
        } catch (MediaCryptoException e11) {
            throw A(e11, this.E);
        }
    }

    private List<i> r0(boolean z11) {
        List<i> x02 = x0(this.f13608m, this.E, z11);
        if (x02.isEmpty() && z11) {
            x02 = x0(this.f13608m, this.E, false);
            if (!x02.isEmpty()) {
                String str = this.E.f9205l;
                String valueOf = String.valueOf(x02);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 99 + valueOf.length());
                sb2.append("Drm session requires secure decoder for ");
                sb2.append(str);
                sb2.append(", but no secure decoder available. Trying to proceed with ");
                sb2.append(valueOf);
                sb2.append(".");
                ak.o.h("MediaCodecRenderer", sb2.toString());
            }
        }
        return x02;
    }

    private hi.n y0(DrmSession drmSession) {
        hi.m e11 = drmSession.e();
        if (e11 != null && !(e11 instanceof hi.n)) {
            String valueOf = String.valueOf(e11);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 42);
            sb2.append("Expecting FrameworkMediaCrypto but found: ");
            sb2.append(valueOf);
            throw A(new IllegalArgumentException(sb2.toString()), this.E);
        }
        return (hi.n) e11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float A0() {
        return this.P;
    }

    protected void B0(DecoderInputBuffer decoderInputBuffer) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ci.a
    public void H() {
        this.E = null;
        this.N3 = -9223372036854775807L;
        this.O3 = -9223372036854775807L;
        this.P3 = 0;
        if (this.H == null && this.G == null) {
            q0();
        } else {
            K();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ci.a
    public void I(boolean z11, boolean z12) {
        this.M3 = new fi.d();
    }

    protected boolean I0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ci.a
    public void J(long j11, boolean z11) {
        this.E3 = false;
        this.F3 = false;
        this.H3 = false;
        if (this.f13621s3) {
            this.f13626w.f();
            this.f13622t.f();
            this.f13623t3 = false;
        } else {
            p0();
        }
        if (this.f13628x.k() > 0) {
            this.G3 = true;
        }
        this.f13628x.c();
        int i11 = this.P3;
        if (i11 != 0) {
            this.O3 = this.B[i11 - 1];
            this.N3 = this.A[i11 - 1];
            this.P3 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J0() {
        ci.i iVar;
        if (this.R != null || this.f13621s3 || (iVar = this.E) == null) {
            return;
        }
        if (this.H == null && k1(iVar)) {
            D0(this.E);
            return;
        }
        e1(this.H);
        String str = this.E.f9205l;
        DrmSession drmSession = this.G;
        if (drmSession != null) {
            if (this.K == null) {
                hi.n y02 = y0(drmSession);
                if (y02 == null) {
                    if (this.G.getError() == null) {
                        return;
                    }
                } else {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(y02.f29224a, y02.f29225b);
                        this.K = mediaCrypto;
                        this.L = !y02.f29226c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e11) {
                        throw A(e11, this.E);
                    }
                }
            }
            if (hi.n.f29223d) {
                int state = this.G.getState();
                if (state == 1) {
                    throw A(this.G.getError(), this.E);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            K0(this.K, this.L);
        } catch (DecoderInitializationException e12) {
            throw A(e12, this.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ci.a
    public void K() {
        try {
            e0();
            Y0();
        } finally {
            h1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ci.a
    public void L() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ci.a
    public void M() {
    }

    protected abstract void M0(String str, long j11, long j12);

    @Override // ci.a
    protected void N(ci.i[] iVarArr, long j11, long j12) {
        if (this.O3 == -9223372036854775807L) {
            ak.a.f(this.N3 == -9223372036854775807L);
            this.N3 = j11;
            this.O3 = j12;
            return;
        }
        int i11 = this.P3;
        long[] jArr = this.B;
        if (i11 == jArr.length) {
            long j13 = jArr[i11 - 1];
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Too many stream changes, so dropping offset: ");
            sb2.append(j13);
            ak.o.h("MediaCodecRenderer", sb2.toString());
        } else {
            this.P3 = i11 + 1;
        }
        long[] jArr2 = this.A;
        int i12 = this.P3;
        jArr2[i12 - 1] = j11;
        this.B[i12 - 1] = j12;
        this.C[i12 - 1] = this.C3;
    }

    protected abstract void N0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
        if (h0() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
        if (h0() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d4, code lost:
        r7 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fi.e O0(ci.j r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.O0(ci.j):fi.e");
    }

    protected abstract void P0(ci.i iVar, MediaFormat mediaFormat);

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q0(long j11) {
        while (true) {
            int i11 = this.P3;
            if (i11 == 0 || j11 < this.C[0]) {
                return;
            }
            long[] jArr = this.A;
            this.N3 = jArr[0];
            this.O3 = this.B[0];
            int i12 = i11 - 1;
            this.P3 = i12;
            System.arraycopy(jArr, 1, jArr, 0, i12);
            long[] jArr2 = this.B;
            System.arraycopy(jArr2, 1, jArr2, 0, this.P3);
            long[] jArr3 = this.C;
            System.arraycopy(jArr3, 1, jArr3, 0, this.P3);
            R0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void R0() {
    }

    protected abstract fi.e S(i iVar, ci.i iVar2, ci.i iVar3);

    protected abstract void S0(DecoderInputBuffer decoderInputBuffer);

    protected abstract boolean U0(long j11, long j12, h hVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, ci.i iVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.drm.DrmSession, android.media.MediaCrypto] */
    public void Y0() {
        try {
            h hVar = this.R;
            if (hVar != null) {
                hVar.release();
                this.M3.f26259b++;
                N0(this.f13633y1.f13700a);
            }
            this.R = null;
            try {
                MediaCrypto mediaCrypto = this.K;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.R = null;
            try {
                MediaCrypto mediaCrypto2 = this.K;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    protected void Z0() {
    }

    @Override // ci.n
    public final int a(ci.i iVar) {
        try {
            return l1(this.f13608m, iVar);
        } catch (MediaCodecUtil.DecoderQueryException e11) {
            throw A(e11, iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a1() {
        c1();
        d1();
        this.f13609m3 = -9223372036854775807L;
        this.A3 = false;
        this.f13637z3 = false;
        this.f13603i3 = false;
        this.f13604j3 = false;
        this.f13619q3 = false;
        this.f13620r3 = false;
        this.f13632y.clear();
        this.C3 = -9223372036854775807L;
        this.D3 = -9223372036854775807L;
        g gVar = this.f13607l3;
        if (gVar != null) {
            gVar.b();
        }
        this.f13631x3 = 0;
        this.f13635y3 = 0;
        this.f13627w3 = this.f13625v3 ? 1 : 0;
    }

    protected void b1() {
        a1();
        this.L3 = null;
        this.f13607l3 = null;
        this.f13615p1 = null;
        this.f13633y1 = null;
        this.T = null;
        this.Y = null;
        this.f13599b1 = false;
        this.B3 = false;
        this.f13601g1 = -1.0f;
        this.Q1 = 0;
        this.V1 = false;
        this.f13600b2 = false;
        this.f13602g2 = false;
        this.f13616p2 = false;
        this.f13630x2 = false;
        this.f13634y2 = false;
        this.Q2 = false;
        this.f13605k3 = false;
        this.f13625v3 = false;
        this.f13627w3 = 0;
        this.L = false;
    }

    @Override // com.google.android.exoplayer2.v0
    public boolean c() {
        return this.F3;
    }

    protected abstract void c0(i iVar, h hVar, ci.i iVar2, MediaCrypto mediaCrypto, float f11);

    protected MediaCodecDecoderException d0(Throwable th2, i iVar) {
        return new MediaCodecDecoderException(th2, iVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f1() {
        this.H3 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g1(ExoPlaybackException exoPlaybackException) {
        this.L3 = exoPlaybackException;
    }

    @Override // com.google.android.exoplayer2.v0
    public boolean isReady() {
        return this.E != null && (G() || C0() || (this.f13609m3 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f13609m3));
    }

    protected boolean j1(i iVar) {
        return true;
    }

    public void k0(boolean z11) {
        this.I3 = z11;
    }

    protected boolean k1(ci.i iVar) {
        return false;
    }

    public void l0(boolean z11) {
        this.J3 = z11;
    }

    protected abstract int l1(j jVar, ci.i iVar);

    public void m0(boolean z11) {
        this.K3 = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean p0() {
        boolean q02 = q0();
        if (q02) {
            J0();
        }
        return q02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p1(long j11) {
        boolean z11;
        ci.i i11 = this.f13628x.i(j11);
        if (i11 == null && this.f13599b1) {
            i11 = this.f13628x.h();
        }
        if (i11 != null) {
            this.F = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || (this.f13599b1 && this.F != null)) {
            P0(this.F, this.Y);
            this.f13599b1 = false;
        }
    }

    protected boolean q0() {
        if (this.R == null) {
            return false;
        }
        if (this.f13635y3 != 3 && !this.f13600b2 && ((!this.f13602g2 || this.B3) && (!this.f13616p2 || !this.A3))) {
            o0();
            return false;
        }
        Y0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final h s0() {
        return this.R;
    }

    @Override // com.google.android.exoplayer2.v0
    public void t(float f11, float f12) {
        this.P = f11;
        this.Q = f12;
        if (this.R == null || this.f13635y3 == 3 || getState() == 0) {
            return;
        }
        n1(this.T);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final i t0() {
        return this.f13633y1;
    }

    @Override // ci.a, ci.n
    public final int u() {
        return 8;
    }

    protected boolean u0() {
        return false;
    }

    @Override // com.google.android.exoplayer2.v0
    public void v(long j11, long j12) {
        if (this.H3) {
            this.H3 = false;
            T0();
        }
        ExoPlaybackException exoPlaybackException = this.L3;
        if (exoPlaybackException == null) {
            try {
                if (this.F3) {
                    Z0();
                    return;
                } else if (this.E != null || W0(true)) {
                    J0();
                    if (this.f13621s3) {
                        h0.a("bypassRender");
                        while (R(j11, j12)) {
                        }
                        h0.c();
                    } else if (this.R != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        h0.a("drainAndFeed");
                        while (i0(j11, j12) && i1(elapsedRealtime)) {
                        }
                        while (n0() && i1(elapsedRealtime)) {
                        }
                        h0.c();
                    } else {
                        this.M3.f26261d += P(j11);
                        W0(false);
                    }
                    this.M3.c();
                    return;
                } else {
                    return;
                }
            } catch (IllegalStateException e11) {
                if (G0(e11)) {
                    throw A(d0(e11, t0()), this.E);
                }
                throw e11;
            }
        }
        this.L3 = null;
        throw exoPlaybackException;
    }

    protected abstract float v0(float f11, ci.i iVar, ci.i[] iVarArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaFormat w0() {
        return this.Y;
    }

    protected abstract List<i> x0(j jVar, ci.i iVar, boolean z11);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long z0() {
        return this.O3;
    }

    /* loaded from: classes3.dex */
    public static class DecoderInitializationException extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final String f13638a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13639b;

        /* renamed from: c  reason: collision with root package name */
        public final i f13640c;

        /* renamed from: d  reason: collision with root package name */
        public final String f13641d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public DecoderInitializationException(ci.i r12, java.lang.Throwable r13, boolean r14, int r15) {
            /*
                r11 = this;
                java.lang.String r0 = java.lang.String.valueOf(r12)
                int r1 = r0.length()
                int r1 = r1 + 36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Decoder init failed: ["
                r2.append(r1)
                r2.append(r15)
                java.lang.String r1 = "], "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.f9205l
                java.lang.String r9 = b(r15)
                r8 = 0
                r10 = 0
                r3 = r11
                r5 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(ci.i, java.lang.Throwable, boolean, int):void");
        }

        private static String b(int i11) {
            String str = i11 < 0 ? "neg_" : "";
            int abs = Math.abs(i11);
            StringBuilder sb2 = new StringBuilder(str.length() + 71);
            sb2.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb2.append(str);
            sb2.append(abs);
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException c(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.f13638a, this.f13639b, this.f13640c, this.f13641d, decoderInitializationException);
        }

        private static String d(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public DecoderInitializationException(ci.i r9, java.lang.Throwable r10, boolean r11, com.google.android.exoplayer2.mediacodec.i r12) {
            /*
                r8 = this;
                java.lang.String r0 = r12.f13700a
                java.lang.String r1 = java.lang.String.valueOf(r9)
                java.lang.String r2 = java.lang.String.valueOf(r0)
                int r2 = r2.length()
                int r2 = r2 + 23
                int r3 = r1.length()
                int r2 = r2 + r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Decoder init failed: "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ", "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                java.lang.String r3 = r9.f9205l
                int r0 = ak.k0.f477a
                r2 = 21
                if (r0 < r2) goto L3b
                java.lang.String r0 = d(r10)
                goto L3c
            L3b:
                r0 = 0
            L3c:
                r6 = r0
                r7 = 0
                r0 = r8
                r2 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(ci.i, java.lang.Throwable, boolean, com.google.android.exoplayer2.mediacodec.i):void");
        }

        private DecoderInitializationException(String str, Throwable th2, String str2, boolean z11, i iVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.f13638a = str2;
            this.f13639b = z11;
            this.f13640c = iVar;
            this.f13641d = str3;
        }
    }
}
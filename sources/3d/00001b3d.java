package com.google.android.exoplayer2.audio;

import ak.k0;
import ak.o;
import ak.r;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import ch.qos.logback.classic.Level;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ei.p;
import ei.s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
public final class DefaultAudioSink implements AudioSink {

    /* renamed from: a0  reason: collision with root package name */
    public static boolean f13049a0 = false;
    private long A;
    private long B;
    private long C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private float H;
    private AudioProcessor[] I;
    private ByteBuffer[] J;
    private ByteBuffer K;
    private int L;
    private ByteBuffer M;
    private byte[] N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private p V;
    private boolean W;
    private long X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final ei.e f13050a;

    /* renamed from: b  reason: collision with root package name */
    private final b f13051b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13052c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.exoplayer2.audio.e f13053d;

    /* renamed from: e  reason: collision with root package name */
    private final l f13054e;

    /* renamed from: f  reason: collision with root package name */
    private final AudioProcessor[] f13055f;

    /* renamed from: g  reason: collision with root package name */
    private final AudioProcessor[] f13056g;

    /* renamed from: h  reason: collision with root package name */
    private final ConditionVariable f13057h;

    /* renamed from: i  reason: collision with root package name */
    private final com.google.android.exoplayer2.audio.c f13058i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayDeque<e> f13059j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f13060k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f13061l;

    /* renamed from: m  reason: collision with root package name */
    private h f13062m;

    /* renamed from: n  reason: collision with root package name */
    private final f<AudioSink.InitializationException> f13063n;

    /* renamed from: o  reason: collision with root package name */
    private final f<AudioSink.WriteException> f13064o;

    /* renamed from: p  reason: collision with root package name */
    private AudioSink.a f13065p;

    /* renamed from: q  reason: collision with root package name */
    private c f13066q;

    /* renamed from: r  reason: collision with root package name */
    private c f13067r;

    /* renamed from: s  reason: collision with root package name */
    private AudioTrack f13068s;

    /* renamed from: t  reason: collision with root package name */
    private ei.d f13069t;

    /* renamed from: u  reason: collision with root package name */
    private e f13070u;

    /* renamed from: v  reason: collision with root package name */
    private e f13071v;

    /* renamed from: w  reason: collision with root package name */
    private ci.l f13072w;

    /* renamed from: x  reason: collision with root package name */
    private ByteBuffer f13073x;

    /* renamed from: y  reason: collision with root package name */
    private int f13074y;

    /* renamed from: z  reason: collision with root package name */
    private long f13075z;

    /* loaded from: classes3.dex */
    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        /* synthetic */ InvalidAudioTrackTimestampException(String str, a aVar) {
            this(str);
        }

        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AudioTrack f13076a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, AudioTrack audioTrack) {
            super(str);
            this.f13076a = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f13076a.flush();
                this.f13076a.release();
            } finally {
                DefaultAudioSink.this.f13057h.open();
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        ci.l a(ci.l lVar);

        long b(long j11);

        AudioProcessor[] c();

        long d();

        boolean e(boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final ci.i f13078a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13079b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13080c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13081d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13082e;

        /* renamed from: f  reason: collision with root package name */
        public final int f13083f;

        /* renamed from: g  reason: collision with root package name */
        public final int f13084g;

        /* renamed from: h  reason: collision with root package name */
        public final int f13085h;

        /* renamed from: i  reason: collision with root package name */
        public final AudioProcessor[] f13086i;

        public c(ci.i iVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11, AudioProcessor[] audioProcessorArr) {
            this.f13078a = iVar;
            this.f13079b = i11;
            this.f13080c = i12;
            this.f13081d = i13;
            this.f13082e = i14;
            this.f13083f = i15;
            this.f13084g = i16;
            this.f13086i = audioProcessorArr;
            this.f13085h = c(i17, z11);
        }

        private int c(int i11, boolean z11) {
            if (i11 != 0) {
                return i11;
            }
            int i12 = this.f13080c;
            if (i12 == 0) {
                return m(z11 ? 8.0f : 1.0f);
            } else if (i12 != 1) {
                if (i12 == 2) {
                    return l(250000L);
                }
                throw new IllegalStateException();
            } else {
                return l(50000000L);
            }
        }

        private AudioTrack d(boolean z11, ei.d dVar, int i11) {
            int i12 = k0.f477a;
            if (i12 >= 29) {
                return f(z11, dVar, i11);
            }
            if (i12 >= 21) {
                return e(z11, dVar, i11);
            }
            return g(dVar, i11);
        }

        private AudioTrack e(boolean z11, ei.d dVar, int i11) {
            return new AudioTrack(j(dVar, z11), DefaultAudioSink.L(this.f13082e, this.f13083f, this.f13084g), this.f13085h, 1, i11);
        }

        private AudioTrack f(boolean z11, ei.d dVar, int i11) {
            return new AudioTrack.Builder().setAudioAttributes(j(dVar, z11)).setAudioFormat(DefaultAudioSink.L(this.f13082e, this.f13083f, this.f13084g)).setTransferMode(1).setBufferSizeInBytes(this.f13085h).setSessionId(i11).setOffloadedPlayback(this.f13080c == 1).build();
        }

        private AudioTrack g(ei.d dVar, int i11) {
            int e02 = k0.e0(dVar.f25131c);
            if (i11 == 0) {
                return new AudioTrack(e02, this.f13082e, this.f13083f, this.f13084g, this.f13085h, 1);
            }
            return new AudioTrack(e02, this.f13082e, this.f13083f, this.f13084g, this.f13085h, 1, i11);
        }

        private static AudioAttributes j(ei.d dVar, boolean z11) {
            if (z11) {
                return k();
            }
            return dVar.a();
        }

        private static AudioAttributes k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        private int l(long j11) {
            int R = DefaultAudioSink.R(this.f13084g);
            if (this.f13084g == 5) {
                R *= 2;
            }
            return (int) ((j11 * R) / 1000000);
        }

        private int m(float f11) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f13082e, this.f13083f, this.f13084g);
            ak.a.f(minBufferSize != -2);
            int r11 = k0.r(minBufferSize * 4, ((int) h(250000L)) * this.f13081d, Math.max(minBufferSize, ((int) h(750000L)) * this.f13081d));
            return f11 != 1.0f ? Math.round(r11 * f11) : r11;
        }

        public AudioTrack a(boolean z11, ei.d dVar, int i11) {
            try {
                AudioTrack d11 = d(z11, dVar, i11);
                int state = d11.getState();
                if (state == 1) {
                    return d11;
                }
                try {
                    d11.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f13082e, this.f13083f, this.f13085h, this.f13078a, o(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e11) {
                throw new AudioSink.InitializationException(0, this.f13082e, this.f13083f, this.f13085h, this.f13078a, o(), e11);
            }
        }

        public boolean b(c cVar) {
            return cVar.f13080c == this.f13080c && cVar.f13084g == this.f13084g && cVar.f13082e == this.f13082e && cVar.f13083f == this.f13083f && cVar.f13081d == this.f13081d;
        }

        public long h(long j11) {
            return (j11 * this.f13082e) / 1000000;
        }

        public long i(long j11) {
            return (j11 * 1000000) / this.f13082e;
        }

        public long n(long j11) {
            return (j11 * 1000000) / this.f13078a.E;
        }

        public boolean o() {
            return this.f13080c == 1;
        }
    }

    /* loaded from: classes3.dex */
    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        private final AudioProcessor[] f13087a;

        /* renamed from: b  reason: collision with root package name */
        private final i f13088b;

        /* renamed from: c  reason: collision with root package name */
        private final k f13089c;

        public d(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new i(), new k());
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public ci.l a(ci.l lVar) {
            this.f13089c.i(lVar.f9245a);
            this.f13089c.h(lVar.f9246b);
            return lVar;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public long b(long j11) {
            return this.f13089c.g(j11);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public AudioProcessor[] c() {
            return this.f13087a;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public long d() {
            return this.f13088b.p();
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public boolean e(boolean z11) {
            this.f13088b.v(z11);
            return z11;
        }

        public d(AudioProcessor[] audioProcessorArr, i iVar, k kVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f13087a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f13088b = iVar;
            this.f13089c = kVar;
            audioProcessorArr2[audioProcessorArr.length] = iVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = kVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final ci.l f13090a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13091b;

        /* renamed from: c  reason: collision with root package name */
        public final long f13092c;

        /* renamed from: d  reason: collision with root package name */
        public final long f13093d;

        /* synthetic */ e(ci.l lVar, boolean z11, long j11, long j12, a aVar) {
            this(lVar, z11, j11, j12);
        }

        private e(ci.l lVar, boolean z11, long j11, long j12) {
            this.f13090a = lVar;
            this.f13091b = z11;
            this.f13092c = j11;
            this.f13093d = j12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class f<T extends Exception> {

        /* renamed from: a  reason: collision with root package name */
        private final long f13094a;

        /* renamed from: b  reason: collision with root package name */
        private T f13095b;

        /* renamed from: c  reason: collision with root package name */
        private long f13096c;

        public f(long j11) {
            this.f13094a = j11;
        }

        public void a() {
            this.f13095b = null;
        }

        public void b(T t11) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f13095b == null) {
                this.f13095b = t11;
                this.f13096c = this.f13094a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f13096c) {
                T t12 = this.f13095b;
                if (t12 != t11) {
                    t12.addSuppressed(t11);
                }
                T t13 = this.f13095b;
                a();
                throw t13;
            }
        }
    }

    /* loaded from: classes3.dex */
    private final class g implements c.a {
        private g() {
        }

        @Override // com.google.android.exoplayer2.audio.c.a
        public void a(int i11, long j11) {
            if (DefaultAudioSink.this.f13065p != null) {
                DefaultAudioSink.this.f13065p.e(i11, j11, SystemClock.elapsedRealtime() - DefaultAudioSink.this.X);
            }
        }

        @Override // com.google.android.exoplayer2.audio.c.a
        public void b(long j11) {
            if (DefaultAudioSink.this.f13065p != null) {
                DefaultAudioSink.this.f13065p.b(j11);
            }
        }

        @Override // com.google.android.exoplayer2.audio.c.a
        public void c(long j11) {
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("Ignoring impossibly large audio latency: ");
            sb2.append(j11);
            o.h("DefaultAudioSink", sb2.toString());
        }

        @Override // com.google.android.exoplayer2.audio.c.a
        public void d(long j11, long j12, long j13, long j14) {
            long U = DefaultAudioSink.this.U();
            long V = DefaultAudioSink.this.V();
            StringBuilder sb2 = new StringBuilder((int) CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256);
            sb2.append("Spurious audio timestamp (frame position mismatch): ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            sb2.append(j14);
            sb2.append(", ");
            sb2.append(U);
            sb2.append(", ");
            sb2.append(V);
            String sb3 = sb2.toString();
            if (!DefaultAudioSink.f13049a0) {
                o.h("DefaultAudioSink", sb3);
                return;
            }
            throw new InvalidAudioTrackTimestampException(sb3, null);
        }

        @Override // com.google.android.exoplayer2.audio.c.a
        public void e(long j11, long j12, long j13, long j14) {
            long U = DefaultAudioSink.this.U();
            long V = DefaultAudioSink.this.V();
            StringBuilder sb2 = new StringBuilder((int) CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256);
            sb2.append("Spurious audio timestamp (system clock mismatch): ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            sb2.append(j14);
            sb2.append(", ");
            sb2.append(U);
            sb2.append(", ");
            sb2.append(V);
            String sb3 = sb2.toString();
            if (!DefaultAudioSink.f13049a0) {
                o.h("DefaultAudioSink", sb3);
                return;
            }
            throw new InvalidAudioTrackTimestampException(sb3, null);
        }

        /* synthetic */ g(DefaultAudioSink defaultAudioSink, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class h {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f13098a = new Handler();

        /* renamed from: b  reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f13099b;

        /* loaded from: classes3.dex */
        class a extends AudioTrack.StreamEventCallback {
            a(DefaultAudioSink defaultAudioSink) {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i11) {
                ak.a.f(audioTrack == DefaultAudioSink.this.f13068s);
                if (DefaultAudioSink.this.f13065p == null || !DefaultAudioSink.this.S) {
                    return;
                }
                DefaultAudioSink.this.f13065p.g();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                ak.a.f(audioTrack == DefaultAudioSink.this.f13068s);
                if (DefaultAudioSink.this.f13065p == null || !DefaultAudioSink.this.S) {
                    return;
                }
                DefaultAudioSink.this.f13065p.g();
            }
        }

        public h() {
            this.f13099b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            final Handler handler = this.f13098a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: ei.q
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f13099b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f13099b);
            this.f13098a.removeCallbacksAndMessages(null);
        }
    }

    public DefaultAudioSink(ei.e eVar, b bVar, boolean z11, boolean z12, boolean z13) {
        this.f13050a = eVar;
        this.f13051b = (b) ak.a.e(bVar);
        int i11 = k0.f477a;
        this.f13052c = i11 >= 21 && z11;
        this.f13060k = i11 >= 23 && z12;
        this.f13061l = i11 >= 29 && z13;
        this.f13057h = new ConditionVariable(true);
        this.f13058i = new com.google.android.exoplayer2.audio.c(new g(this, null));
        com.google.android.exoplayer2.audio.e eVar2 = new com.google.android.exoplayer2.audio.e();
        this.f13053d = eVar2;
        l lVar = new l();
        this.f13054e = lVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new com.google.android.exoplayer2.audio.h(), eVar2, lVar);
        Collections.addAll(arrayList, bVar.c());
        this.f13055f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f13056g = new AudioProcessor[]{new com.google.android.exoplayer2.audio.f()};
        this.H = 1.0f;
        this.f13069t = ei.d.f25128f;
        this.U = 0;
        this.V = new p(0, BitmapDescriptorFactory.HUE_RED);
        ci.l lVar2 = ci.l.f9244d;
        this.f13071v = new e(lVar2, false, 0L, 0L, null);
        this.f13072w = lVar2;
        this.P = -1;
        this.I = new AudioProcessor[0];
        this.J = new ByteBuffer[0];
        this.f13059j = new ArrayDeque<>();
        this.f13063n = new f<>(100L);
        this.f13064o = new f<>(100L);
    }

    private void F(long j11) {
        ci.l lVar;
        if (o0()) {
            lVar = this.f13051b.a(M());
        } else {
            lVar = ci.l.f9244d;
        }
        ci.l lVar2 = lVar;
        boolean e11 = o0() ? this.f13051b.e(T()) : false;
        this.f13059j.add(new e(lVar2, e11, Math.max(0L, j11), this.f13067r.i(V()), null));
        n0();
        AudioSink.a aVar = this.f13065p;
        if (aVar != null) {
            aVar.a(e11);
        }
    }

    private long G(long j11) {
        while (!this.f13059j.isEmpty() && j11 >= this.f13059j.getFirst().f13093d) {
            this.f13071v = this.f13059j.remove();
        }
        e eVar = this.f13071v;
        long j12 = j11 - eVar.f13093d;
        if (eVar.f13090a.equals(ci.l.f9244d)) {
            return this.f13071v.f13092c + j12;
        }
        if (this.f13059j.isEmpty()) {
            return this.f13071v.f13092c + this.f13051b.b(j12);
        }
        e first = this.f13059j.getFirst();
        return first.f13092c - k0.W(first.f13093d - j11, this.f13071v.f13090a.f9245a);
    }

    private long H(long j11) {
        return j11 + this.f13067r.i(this.f13051b.d());
    }

    private AudioTrack I() {
        try {
            return ((c) ak.a.e(this.f13067r)).a(this.W, this.f13069t, this.U);
        } catch (AudioSink.InitializationException e11) {
            d0();
            AudioSink.a aVar = this.f13065p;
            if (aVar != null) {
                aVar.c(e11);
            }
            throw e11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean J() {
        /*
            r9 = this;
            int r0 = r9.P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.P = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.P
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.f()
        L1f:
            r9.f0(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.P
            int r0 = r0 + r2
            r9.P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            r9.q0(r0, r7)
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.P = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.J():boolean");
    }

    private void K() {
        int i11 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.I;
            if (i11 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i11];
            audioProcessor.flush();
            this.J[i11] = audioProcessor.b();
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat L(int i11, int i12, int i13) {
        return new AudioFormat.Builder().setSampleRate(i11).setChannelMask(i12).setEncoding(i13).build();
    }

    private ci.l M() {
        return S().f13090a;
    }

    private static int N(int i11) {
        int i12 = k0.f477a;
        if (i12 <= 28) {
            if (i11 == 7) {
                i11 = 8;
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                i11 = 6;
            }
        }
        if (i12 <= 26 && "fugu".equals(k0.f478b) && i11 == 1) {
            i11 = 2;
        }
        return k0.G(i11);
    }

    private static Pair<Integer, Integer> O(ci.i iVar, ei.e eVar) {
        if (eVar == null) {
            return null;
        }
        int f11 = r.f((String) ak.a.e(iVar.f9205l), iVar.f9202i);
        int i11 = 6;
        if (f11 == 5 || f11 == 6 || f11 == 18 || f11 == 17 || f11 == 7 || f11 == 8 || f11 == 14) {
            if (f11 == 18 && !eVar.e(18)) {
                f11 = 6;
            }
            if (eVar.e(f11)) {
                if (f11 == 18) {
                    if (k0.f477a >= 29 && (i11 = Q(18, iVar.E)) == 0) {
                        o.h("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                        return null;
                    }
                } else {
                    i11 = iVar.C;
                    if (i11 > eVar.d()) {
                        return null;
                    }
                }
                int N = N(i11);
                if (N == 0) {
                    return null;
                }
                return Pair.create(Integer.valueOf(f11), Integer.valueOf(N));
            }
            return null;
        }
        return null;
    }

    private static int P(int i11, ByteBuffer byteBuffer) {
        switch (i11) {
            case 5:
            case 6:
            case 18:
                return ei.b.d(byteBuffer);
            case 7:
            case 8:
                return ei.r.e(byteBuffer);
            case 9:
                int m11 = s.m(k0.H(byteBuffer, byteBuffer.position()));
                if (m11 != -1) {
                    return m11;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("Unexpected audio encoding: ");
                sb2.append(i11);
                throw new IllegalStateException(sb2.toString());
            case 14:
                int a11 = ei.b.a(byteBuffer);
                if (a11 == -1) {
                    return 0;
                }
                return ei.b.h(byteBuffer, a11) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return ei.c.c(byteBuffer);
        }
    }

    private static int Q(int i11, int i12) {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i13 = 8; i13 > 0; i13--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i12).setChannelMask(k0.G(i13)).build(), build)) {
                return i13;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int R(int i11) {
        switch (i11) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return Level.ERROR_INT;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    private e S() {
        e eVar = this.f13070u;
        if (eVar != null) {
            return eVar;
        }
        if (!this.f13059j.isEmpty()) {
            return this.f13059j.getLast();
        }
        return this.f13071v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long U() {
        c cVar = this.f13067r;
        if (cVar.f13080c == 0) {
            return this.f13075z / cVar.f13079b;
        }
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long V() {
        c cVar = this.f13067r;
        if (cVar.f13080c == 0) {
            return this.B / cVar.f13081d;
        }
        return this.C;
    }

    private void W() {
        this.f13057h.block();
        AudioTrack I = I();
        this.f13068s = I;
        if (a0(I)) {
            g0(this.f13068s);
            AudioTrack audioTrack = this.f13068s;
            ci.i iVar = this.f13067r.f13078a;
            audioTrack.setOffloadDelayPadding(iVar.G, iVar.H);
        }
        this.U = this.f13068s.getAudioSessionId();
        com.google.android.exoplayer2.audio.c cVar = this.f13058i;
        AudioTrack audioTrack2 = this.f13068s;
        c cVar2 = this.f13067r;
        cVar.t(audioTrack2, cVar2.f13080c == 2, cVar2.f13084g, cVar2.f13081d, cVar2.f13085h);
        k0();
        int i11 = this.V.f25165a;
        if (i11 != 0) {
            this.f13068s.attachAuxEffect(i11);
            this.f13068s.setAuxEffectSendLevel(this.V.f25166b);
        }
        this.F = true;
    }

    private static boolean X(int i11) {
        return (k0.f477a >= 24 && i11 == -6) || i11 == -32;
    }

    private boolean Y() {
        return this.f13068s != null;
    }

    private static boolean Z() {
        return k0.f477a >= 30 && k0.f480d.startsWith("Pixel");
    }

    private static boolean a0(AudioTrack audioTrack) {
        return k0.f477a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private static boolean b0(ci.i iVar, ei.d dVar) {
        int f11;
        int G;
        if (k0.f477a >= 29 && (f11 = r.f((String) ak.a.e(iVar.f9205l), iVar.f9202i)) != 0 && (G = k0.G(iVar.C)) != 0 && AudioManager.isOffloadedPlaybackSupported(L(iVar.E, G, f11), dVar.a())) {
            return (iVar.G == 0 && iVar.H == 0) || Z();
        }
        return false;
    }

    private static boolean c0(ci.i iVar, ei.e eVar) {
        return O(iVar, eVar) != null;
    }

    private void d0() {
        if (this.f13067r.o()) {
            this.Y = true;
        }
    }

    private void e0() {
        if (this.R) {
            return;
        }
        this.R = true;
        this.f13058i.h(V());
        this.f13068s.stop();
        this.f13074y = 0;
    }

    private void f0(long j11) {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i11 = length;
        while (i11 >= 0) {
            if (i11 > 0) {
                byteBuffer = this.J[i11 - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f13038a;
                }
            }
            if (i11 == length) {
                q0(byteBuffer, j11);
            } else {
                AudioProcessor audioProcessor = this.I[i11];
                if (i11 > this.P) {
                    audioProcessor.d(byteBuffer);
                }
                ByteBuffer b11 = audioProcessor.b();
                this.J[i11] = b11;
                if (b11.hasRemaining()) {
                    i11++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i11--;
        }
    }

    private void g0(AudioTrack audioTrack) {
        if (this.f13062m == null) {
            this.f13062m = new h();
        }
        this.f13062m.a(audioTrack);
    }

    private void h0() {
        this.f13075z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.Z = false;
        this.D = 0;
        this.f13071v = new e(M(), T(), 0L, 0L, null);
        this.G = 0L;
        this.f13070u = null;
        this.f13059j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.f13073x = null;
        this.f13074y = 0;
        this.f13054e.n();
        K();
    }

    private void i0(ci.l lVar, boolean z11) {
        e S = S();
        if (lVar.equals(S.f13090a) && z11 == S.f13091b) {
            return;
        }
        e eVar = new e(lVar, z11, -9223372036854775807L, -9223372036854775807L, null);
        if (Y()) {
            this.f13070u = eVar;
        } else {
            this.f13071v = eVar;
        }
    }

    private void j0(ci.l lVar) {
        if (Y()) {
            try {
                this.f13068s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(lVar.f9245a).setPitch(lVar.f9246b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e11) {
                o.i("DefaultAudioSink", "Failed to set playback params", e11);
            }
            lVar = new ci.l(this.f13068s.getPlaybackParams().getSpeed(), this.f13068s.getPlaybackParams().getPitch());
            this.f13058i.u(lVar.f9245a);
        }
        this.f13072w = lVar;
    }

    private void k0() {
        if (Y()) {
            if (k0.f477a >= 21) {
                l0(this.f13068s, this.H);
            } else {
                m0(this.f13068s, this.H);
            }
        }
    }

    private static void l0(AudioTrack audioTrack, float f11) {
        audioTrack.setVolume(f11);
    }

    private static void m0(AudioTrack audioTrack, float f11) {
        audioTrack.setStereoVolume(f11, f11);
    }

    private void n0() {
        AudioProcessor[] audioProcessorArr = this.f13067r.f13086i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.a()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.I = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.J = new ByteBuffer[size];
        K();
    }

    private boolean o0() {
        return (this.W || !"audio/raw".equals(this.f13067r.f13078a.f9205l) || p0(this.f13067r.f13078a.F)) ? false : true;
    }

    private boolean p0(int i11) {
        return this.f13052c && k0.o0(i11);
    }

    private void q0(ByteBuffer byteBuffer, long j11) {
        int r02;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.M;
            if (byteBuffer2 != null) {
                ak.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.M = byteBuffer;
                if (k0.f477a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.N;
                    if (bArr == null || bArr.length < remaining) {
                        this.N = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.N, 0, remaining);
                    byteBuffer.position(position);
                    this.O = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (k0.f477a < 21) {
                int c11 = this.f13058i.c(this.B);
                if (c11 > 0) {
                    r02 = this.f13068s.write(this.N, this.O, Math.min(remaining2, c11));
                    if (r02 > 0) {
                        this.O += r02;
                        byteBuffer.position(byteBuffer.position() + r02);
                    }
                } else {
                    r02 = 0;
                }
            } else if (this.W) {
                ak.a.f(j11 != -9223372036854775807L);
                r02 = s0(this.f13068s, byteBuffer, remaining2, j11);
            } else {
                r02 = r0(this.f13068s, byteBuffer, remaining2);
            }
            this.X = SystemClock.elapsedRealtime();
            if (r02 < 0) {
                boolean X = X(r02);
                if (X) {
                    d0();
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(r02, this.f13067r.f13078a, X);
                AudioSink.a aVar = this.f13065p;
                if (aVar != null) {
                    aVar.c(writeException);
                }
                if (!writeException.f13047a) {
                    this.f13064o.b(writeException);
                    return;
                }
                throw writeException;
            }
            this.f13064o.a();
            if (a0(this.f13068s)) {
                long j12 = this.C;
                if (j12 > 0) {
                    this.Z = false;
                }
                if (this.S && this.f13065p != null && r02 < remaining2 && !this.Z) {
                    this.f13065p.d(this.f13058i.e(j12));
                }
            }
            int i11 = this.f13067r.f13080c;
            if (i11 == 0) {
                this.B += r02;
            }
            if (r02 == remaining2) {
                if (i11 != 0) {
                    ak.a.f(byteBuffer == this.K);
                    this.C += this.D * this.L;
                }
                this.M = null;
            }
        }
    }

    private static int r0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i11) {
        return audioTrack.write(byteBuffer, i11, 1);
    }

    private int s0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i11, long j11) {
        if (k0.f477a >= 26) {
            return audioTrack.write(byteBuffer, i11, 1, j11 * 1000);
        }
        if (this.f13073x == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f13073x = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f13073x.putInt(1431633921);
        }
        if (this.f13074y == 0) {
            this.f13073x.putInt(4, i11);
            this.f13073x.putLong(8, j11 * 1000);
            this.f13073x.position(0);
            this.f13074y = i11;
        }
        int remaining = this.f13073x.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f13073x, remaining, 1);
            if (write < 0) {
                this.f13074y = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int r02 = r0(audioTrack, byteBuffer, i11);
        if (r02 < 0) {
            this.f13074y = 0;
            return r02;
        }
        this.f13074y -= r02;
        return r02;
    }

    public boolean T() {
        return S().f13091b;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean a(ci.i iVar) {
        return p(iVar) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public ci.l b() {
        if (this.f13060k) {
            return this.f13072w;
        }
        return M();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean c() {
        return !Y() || (this.Q && !f());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void d() {
        this.S = false;
        if (Y() && this.f13058i.q()) {
            this.f13068s.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void e(ci.l lVar) {
        ci.l lVar2 = new ci.l(k0.q(lVar.f9245a, 0.1f, 8.0f), k0.q(lVar.f9246b, 0.1f, 8.0f));
        if (this.f13060k && k0.f477a >= 23) {
            j0(lVar2);
        } else {
            i0(lVar2, T());
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean f() {
        return Y() && this.f13058i.i(V());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (Y()) {
            h0();
            if (this.f13058i.j()) {
                this.f13068s.pause();
            }
            if (a0(this.f13068s)) {
                ((h) ak.a.e(this.f13062m)).b(this.f13068s);
            }
            AudioTrack audioTrack = this.f13068s;
            this.f13068s = null;
            if (k0.f477a < 21 && !this.T) {
                this.U = 0;
            }
            c cVar = this.f13066q;
            if (cVar != null) {
                this.f13067r = cVar;
                this.f13066q = null;
            }
            this.f13058i.r();
            this.f13057h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f13064o.a();
        this.f13063n.a();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void g(int i11) {
        if (this.U != i11) {
            this.U = i11;
            this.T = i11 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void h() {
        if (this.W) {
            this.W = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void i(p pVar) {
        if (this.V.equals(pVar)) {
            return;
        }
        int i11 = pVar.f25165a;
        float f11 = pVar.f25166b;
        AudioTrack audioTrack = this.f13068s;
        if (audioTrack != null) {
            if (this.V.f25165a != i11) {
                audioTrack.attachAuxEffect(i11);
            }
            if (i11 != 0) {
                this.f13068s.setAuxEffectSendLevel(f11);
            }
        }
        this.V = pVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean j(ByteBuffer byteBuffer, long j11, int i11) {
        ByteBuffer byteBuffer2 = this.K;
        ak.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f13066q != null) {
            if (!J()) {
                return false;
            }
            if (!this.f13066q.b(this.f13067r)) {
                e0();
                if (f()) {
                    return false;
                }
                flush();
            } else {
                this.f13067r = this.f13066q;
                this.f13066q = null;
                if (a0(this.f13068s)) {
                    this.f13068s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f13068s;
                    ci.i iVar = this.f13067r.f13078a;
                    audioTrack.setOffloadDelayPadding(iVar.G, iVar.H);
                    this.Z = true;
                }
            }
            F(j11);
        }
        if (!Y()) {
            try {
                W();
            } catch (AudioSink.InitializationException e11) {
                if (!e11.f13045a) {
                    this.f13063n.b(e11);
                    return false;
                }
                throw e11;
            }
        }
        this.f13063n.a();
        if (this.F) {
            this.G = Math.max(0L, j11);
            this.E = false;
            this.F = false;
            if (this.f13060k && k0.f477a >= 23) {
                j0(this.f13072w);
            }
            F(j11);
            if (this.S) {
                u();
            }
        }
        if (this.f13058i.l(V())) {
            if (this.K == null) {
                ak.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                c cVar = this.f13067r;
                if (cVar.f13080c != 0 && this.D == 0) {
                    int P = P(cVar.f13084g, byteBuffer);
                    this.D = P;
                    if (P == 0) {
                        return true;
                    }
                }
                if (this.f13070u != null) {
                    if (!J()) {
                        return false;
                    }
                    F(j11);
                    this.f13070u = null;
                }
                long n11 = this.G + this.f13067r.n(U() - this.f13054e.m());
                if (!this.E && Math.abs(n11 - j11) > 200000) {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(n11);
                    sb2.append(", got ");
                    sb2.append(j11);
                    sb2.append("]");
                    o.c("DefaultAudioSink", sb2.toString());
                    this.E = true;
                }
                if (this.E) {
                    if (!J()) {
                        return false;
                    }
                    long j12 = j11 - n11;
                    this.G += j12;
                    this.E = false;
                    F(j11);
                    AudioSink.a aVar = this.f13065p;
                    if (aVar != null && j12 != 0) {
                        aVar.f();
                    }
                }
                if (this.f13067r.f13080c == 0) {
                    this.f13075z += byteBuffer.remaining();
                } else {
                    this.A += this.D * i11;
                }
                this.K = byteBuffer;
                this.L = i11;
            }
            f0(j11);
            if (!this.K.hasRemaining()) {
                this.K = null;
                this.L = 0;
                return true;
            } else if (this.f13058i.k(V())) {
                o.h("DefaultAudioSink", "Resetting stalled audio track");
                flush();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void k(AudioSink.a aVar) {
        this.f13065p = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void l() {
        if (k0.f477a < 25) {
            flush();
            return;
        }
        this.f13064o.a();
        this.f13063n.a();
        if (Y()) {
            h0();
            if (this.f13058i.j()) {
                this.f13068s.pause();
            }
            this.f13068s.flush();
            this.f13058i.r();
            com.google.android.exoplayer2.audio.c cVar = this.f13058i;
            AudioTrack audioTrack = this.f13068s;
            c cVar2 = this.f13067r;
            cVar.t(audioTrack, cVar2.f13080c == 2, cVar2.f13084g, cVar2.f13081d, cVar2.f13085h);
            this.F = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void m() {
        if (!this.Q && Y() && J()) {
            e0();
            this.Q = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long n(boolean z11) {
        if (!Y() || this.F) {
            return Long.MIN_VALUE;
        }
        return H(G(Math.min(this.f13058i.d(z11), this.f13067r.i(V()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void o(ci.i iVar, int i11, int[] iArr) {
        AudioProcessor[] audioProcessorArr;
        int i12;
        int intValue;
        int intValue2;
        int i13;
        int i14;
        int i15;
        AudioProcessor[] audioProcessorArr2;
        int[] iArr2;
        if ("audio/raw".equals(iVar.f9205l)) {
            ak.a.a(k0.p0(iVar.F));
            i12 = k0.c0(iVar.F, iVar.C);
            if (p0(iVar.F)) {
                audioProcessorArr2 = this.f13056g;
            } else {
                audioProcessorArr2 = this.f13055f;
            }
            this.f13054e.o(iVar.G, iVar.H);
            if (k0.f477a < 21 && iVar.C == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i16 = 0; i16 < 6; i16++) {
                    iArr2[i16] = i16;
                }
            } else {
                iArr2 = iArr;
            }
            this.f13053d.m(iArr2);
            AudioProcessor.a aVar = new AudioProcessor.a(iVar.E, iVar.C, iVar.F);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.a e11 = audioProcessor.e(aVar);
                    if (audioProcessor.a()) {
                        aVar = e11;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e12) {
                    throw new AudioSink.ConfigurationException(e12, iVar);
                }
            }
            int i17 = aVar.f13042c;
            i13 = aVar.f13040a;
            intValue2 = k0.G(aVar.f13041b);
            audioProcessorArr = audioProcessorArr2;
            intValue = i17;
            i15 = k0.c0(i17, aVar.f13041b);
            i14 = 0;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            int i18 = iVar.E;
            if (this.f13061l && b0(iVar, this.f13069t)) {
                audioProcessorArr = audioProcessorArr3;
                i12 = -1;
                intValue = r.f((String) ak.a.e(iVar.f9205l), iVar.f9202i);
                i15 = -1;
                i13 = i18;
                i14 = 1;
                intValue2 = k0.G(iVar.C);
            } else {
                Pair<Integer, Integer> O = O(iVar, this.f13050a);
                if (O != null) {
                    audioProcessorArr = audioProcessorArr3;
                    i12 = -1;
                    intValue = ((Integer) O.first).intValue();
                    intValue2 = ((Integer) O.second).intValue();
                    i13 = i18;
                    i14 = 2;
                    i15 = -1;
                } else {
                    String valueOf = String.valueOf(iVar);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 37);
                    sb2.append("Unable to configure passthrough for: ");
                    sb2.append(valueOf);
                    throw new AudioSink.ConfigurationException(sb2.toString(), iVar);
                }
            }
        }
        if (intValue == 0) {
            String valueOf2 = String.valueOf(iVar);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 48);
            sb3.append("Invalid output encoding (mode=");
            sb3.append(i14);
            sb3.append(") for: ");
            sb3.append(valueOf2);
            throw new AudioSink.ConfigurationException(sb3.toString(), iVar);
        } else if (intValue2 != 0) {
            this.Y = false;
            c cVar = new c(iVar, i12, i14, i15, i13, intValue2, intValue, i11, this.f13060k, audioProcessorArr);
            if (Y()) {
                this.f13066q = cVar;
            } else {
                this.f13067r = cVar;
            }
        } else {
            String valueOf3 = String.valueOf(iVar);
            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 54);
            sb4.append("Invalid output channel config (mode=");
            sb4.append(i14);
            sb4.append(") for: ");
            sb4.append(valueOf3);
            throw new AudioSink.ConfigurationException(sb4.toString(), iVar);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int p(ci.i iVar) {
        if (!"audio/raw".equals(iVar.f9205l)) {
            return ((this.f13061l && !this.Y && b0(iVar, this.f13069t)) || c0(iVar, this.f13050a)) ? 2 : 0;
        } else if (!k0.p0(iVar.F)) {
            int i11 = iVar.F;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Invalid PCM encoding: ");
            sb2.append(i11);
            o.h("DefaultAudioSink", sb2.toString());
            return 0;
        } else {
            int i12 = iVar.F;
            return (i12 == 2 || (this.f13052c && i12 == 4)) ? 2 : 1;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void q() {
        this.E = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void r(float f11) {
        if (this.H != f11) {
            this.H = f11;
            k0();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        for (AudioProcessor audioProcessor : this.f13055f) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.f13056g) {
            audioProcessor2.reset();
        }
        this.S = false;
        this.Y = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void s() {
        ak.a.f(k0.f477a >= 21);
        ak.a.f(this.T);
        if (this.W) {
            return;
        }
        this.W = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void t(ei.d dVar) {
        if (this.f13069t.equals(dVar)) {
            return;
        }
        this.f13069t = dVar;
        if (this.W) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void u() {
        this.S = true;
        if (Y()) {
            this.f13058i.v();
            this.f13068s.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void v(boolean z11) {
        i0(M(), z11);
    }
}
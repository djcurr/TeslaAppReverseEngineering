package ci;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import bk.w;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.v0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class e implements p {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9179a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9182d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9184f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9185g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9186h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9187i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9188j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9189k;

    /* renamed from: b  reason: collision with root package name */
    private int f9180b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f9181c = 5000;

    /* renamed from: e  reason: collision with root package name */
    private com.google.android.exoplayer2.mediacodec.j f9183e = com.google.android.exoplayer2.mediacodec.j.f13707a;

    public e(Context context) {
        this.f9179a = context;
    }

    @Override // ci.p
    public v0[] a(Handler handler, w wVar, com.google.android.exoplayer2.audio.a aVar, nj.k kVar, wi.e eVar) {
        ArrayList<v0> arrayList = new ArrayList<>();
        h(this.f9179a, this.f9180b, this.f9183e, this.f9182d, handler, wVar, this.f9181c, arrayList);
        AudioSink c11 = c(this.f9179a, this.f9187i, this.f9188j, this.f9189k);
        if (c11 != null) {
            b(this.f9179a, this.f9180b, this.f9183e, this.f9182d, c11, handler, aVar, arrayList);
        }
        g(this.f9179a, kVar, handler.getLooper(), this.f9180b, arrayList);
        e(this.f9179a, eVar, handler.getLooper(), this.f9180b, arrayList);
        d(this.f9179a, this.f9180b, arrayList);
        f(this.f9179a, handler, this.f9180b, arrayList);
        return (v0[]) arrayList.toArray(new v0[0]);
    }

    protected void b(Context context, int i11, com.google.android.exoplayer2.mediacodec.j jVar, boolean z11, AudioSink audioSink, Handler handler, com.google.android.exoplayer2.audio.a aVar, ArrayList<v0> arrayList) {
        int i12;
        int i13;
        com.google.android.exoplayer2.audio.g gVar = new com.google.android.exoplayer2.audio.g(context, jVar, z11, handler, aVar, audioSink);
        gVar.k0(this.f9184f);
        gVar.l0(this.f9185g);
        gVar.m0(this.f9186h);
        arrayList.add(gVar);
        if (i11 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i11 == 2) {
            size--;
        }
        try {
            try {
                i12 = size + 1;
                try {
                    arrayList.add(size, (v0) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.a.class, AudioSink.class).newInstance(handler, aVar, audioSink));
                    ak.o.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i12;
                    i12 = size;
                    try {
                        i13 = i12 + 1;
                        arrayList.add(i12, (v0) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.a.class, AudioSink.class).newInstance(handler, aVar, audioSink));
                        ak.o.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        arrayList.add(i13, (v0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.a.class, AudioSink.class).newInstance(handler, aVar, audioSink));
                        ak.o.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (Exception e11) {
                        throw new RuntimeException("Error instantiating FLAC extension", e11);
                    }
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                i13 = i12 + 1;
            } catch (ClassNotFoundException unused3) {
            }
            try {
                try {
                    arrayList.add(i12, (v0) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.a.class, AudioSink.class).newInstance(handler, aVar, audioSink));
                    ak.o.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused4) {
                    i12 = i13;
                    i13 = i12;
                    arrayList.add(i13, (v0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.a.class, AudioSink.class).newInstance(handler, aVar, audioSink));
                    ak.o.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                }
                arrayList.add(i13, (v0) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.a.class, AudioSink.class).newInstance(handler, aVar, audioSink));
                ak.o.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e12) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e12);
            }
        } catch (Exception e13) {
            throw new RuntimeException("Error instantiating Opus extension", e13);
        }
    }

    protected AudioSink c(Context context, boolean z11, boolean z12, boolean z13) {
        return new DefaultAudioSink(ei.e.b(context), new DefaultAudioSink.d(new AudioProcessor[0]), z11, z12, z13);
    }

    protected void d(Context context, int i11, ArrayList<v0> arrayList) {
        arrayList.add(new ck.b());
    }

    protected void e(Context context, wi.e eVar, Looper looper, int i11, ArrayList<v0> arrayList) {
        arrayList.add(new wi.f(eVar, looper));
    }

    protected void f(Context context, Handler handler, int i11, ArrayList<v0> arrayList) {
    }

    protected void g(Context context, nj.k kVar, Looper looper, int i11, ArrayList<v0> arrayList) {
        arrayList.add(new nj.l(kVar, looper));
    }

    protected void h(Context context, int i11, com.google.android.exoplayer2.mediacodec.j jVar, boolean z11, Handler handler, w wVar, long j11, ArrayList<v0> arrayList) {
        int i12;
        bk.g gVar = new bk.g(context, jVar, j11, z11, handler, wVar, 50);
        gVar.k0(this.f9184f);
        gVar.l0(this.f9185g);
        gVar.m0(this.f9186h);
        arrayList.add(gVar);
        if (i11 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i11 == 2) {
            size--;
        }
        try {
            try {
                i12 = size + 1;
                try {
                    arrayList.add(size, (v0) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, w.class, Integer.TYPE).newInstance(Long.valueOf(j11), handler, wVar, 50));
                    ak.o.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i12;
                    i12 = size;
                    arrayList.add(i12, (v0) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, w.class, Integer.TYPE).newInstance(Long.valueOf(j11), handler, wVar, 50));
                    ak.o.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                arrayList.add(i12, (v0) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, w.class, Integer.TYPE).newInstance(Long.valueOf(j11), handler, wVar, 50));
                ak.o.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating AV1 extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating VP9 extension", e12);
        }
    }

    public e i(int i11) {
        this.f9180b = i11;
        return this;
    }
}
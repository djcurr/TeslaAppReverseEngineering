package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.d;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    private final AudioManager f13225a;

    /* renamed from: b */
    private final a f13226b;

    /* renamed from: c */
    private b f13227c;

    /* renamed from: d */
    private ei.d f13228d;

    /* renamed from: f */
    private int f13230f;

    /* renamed from: h */
    private AudioFocusRequest f13232h;

    /* renamed from: i */
    private boolean f13233i;

    /* renamed from: g */
    private float f13231g = 1.0f;

    /* renamed from: e */
    private int f13229e = 0;

    /* loaded from: classes3.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        private final Handler f13234a;

        public a(Handler handler) {
            d.this = r1;
            this.f13234a = handler;
        }

        public static /* synthetic */ void a(a aVar, int i11) {
            aVar.b(i11);
        }

        public /* synthetic */ void b(int i11) {
            d.this.h(i11);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i11) {
            this.f13234a.post(new Runnable() { // from class: com.google.android.exoplayer2.c
                {
                    d.a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    d.a.a(d.a.this, i11);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void F(float f11);

        void M(int i11);
    }

    public d(Context context, Handler handler, b bVar) {
        this.f13225a = (AudioManager) ak.a.e((AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        this.f13227c = bVar;
        this.f13226b = new a(handler);
    }

    private void a() {
        if (this.f13229e == 0) {
            return;
        }
        if (ak.k0.f477a >= 26) {
            c();
        } else {
            b();
        }
        n(0);
    }

    private void b() {
        this.f13225a.abandonAudioFocus(this.f13226b);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f13232h;
        if (audioFocusRequest != null) {
            this.f13225a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int e(ei.d dVar) {
        if (dVar == null) {
            return 0;
        }
        int i11 = dVar.f25131c;
        switch (i11) {
            case 0:
                ak.o.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (dVar.f25129a == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unidentified audio usage: ");
                sb2.append(i11);
                ak.o.h("AudioFocusManager", sb2.toString());
                return 0;
            case 16:
                return ak.k0.f477a >= 19 ? 4 : 2;
        }
        return 3;
    }

    private void f(int i11) {
        b bVar = this.f13227c;
        if (bVar != null) {
            bVar.M(i11);
        }
    }

    public void h(int i11) {
        if (i11 == -3 || i11 == -2) {
            if (i11 != -2 && !q()) {
                n(3);
                return;
            }
            f(0);
            n(2);
        } else if (i11 == -1) {
            f(-1);
            a();
        } else if (i11 != 1) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Unknown focus change type: ");
            sb2.append(i11);
            ak.o.h("AudioFocusManager", sb2.toString());
        } else {
            n(1);
            f(1);
        }
    }

    private int j() {
        if (this.f13229e == 1) {
            return 1;
        }
        if ((ak.k0.f477a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    private int k() {
        return this.f13225a.requestAudioFocus(this.f13226b, ak.k0.e0(((ei.d) ak.a.e(this.f13228d)).f25131c), this.f13230f);
    }

    private int l() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f13232h;
        if (audioFocusRequest == null || this.f13233i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f13230f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f13232h);
            }
            this.f13232h = builder.setAudioAttributes(((ei.d) ak.a.e(this.f13228d)).a()).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f13226b).build();
            this.f13233i = false;
        }
        return this.f13225a.requestAudioFocus(this.f13232h);
    }

    private void n(int i11) {
        if (this.f13229e == i11) {
            return;
        }
        this.f13229e = i11;
        float f11 = i11 == 3 ? 0.2f : 1.0f;
        if (this.f13231g == f11) {
            return;
        }
        this.f13231g = f11;
        b bVar = this.f13227c;
        if (bVar != null) {
            bVar.F(f11);
        }
    }

    private boolean o(int i11) {
        return i11 == 1 || this.f13230f != 1;
    }

    private boolean q() {
        ei.d dVar = this.f13228d;
        return dVar != null && dVar.f25129a == 1;
    }

    public float g() {
        return this.f13231g;
    }

    public void i() {
        this.f13227c = null;
        a();
    }

    public void m(ei.d dVar) {
        if (ak.k0.c(this.f13228d, dVar)) {
            return;
        }
        this.f13228d = dVar;
        int e11 = e(dVar);
        this.f13230f = e11;
        boolean z11 = true;
        if (e11 != 1 && e11 != 0) {
            z11 = false;
        }
        ak.a.b(z11, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int p(boolean z11, int i11) {
        if (o(i11)) {
            a();
            return z11 ? 1 : -1;
        } else if (z11) {
            return j();
        } else {
            return -1;
        }
    }
}
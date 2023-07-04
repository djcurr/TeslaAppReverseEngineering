package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.x0;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public final class x0 {

    /* renamed from: a */
    private final Context f14766a;

    /* renamed from: b */
    private final Handler f14767b;

    /* renamed from: c */
    private final b f14768c;

    /* renamed from: d */
    private final AudioManager f14769d;

    /* renamed from: e */
    private c f14770e;

    /* renamed from: f */
    private int f14771f;

    /* renamed from: g */
    private int f14772g;

    /* renamed from: h */
    private boolean f14773h;

    /* loaded from: classes3.dex */
    public interface b {
        void o(int i11);

        void v(int i11, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class c extends BroadcastReceiver {
        private c() {
            x0.this = r1;
        }

        public static /* synthetic */ void a(x0 x0Var) {
            x0.b(x0Var);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = x0.this.f14767b;
            final x0 x0Var = x0.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.y0
                @Override // java.lang.Runnable
                public final void run() {
                    x0.c.a(x0Var);
                }
            });
        }
    }

    public x0(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f14766a = applicationContext;
        this.f14767b = handler;
        this.f14768c = bVar;
        AudioManager audioManager = (AudioManager) ak.a.h((AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        this.f14769d = audioManager;
        this.f14771f = 3;
        this.f14772g = f(audioManager, 3);
        this.f14773h = e(audioManager, this.f14771f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f14770e = cVar;
        } catch (RuntimeException e11) {
            ak.o.i("StreamVolumeManager", "Error registering stream volume receiver", e11);
        }
    }

    public static /* synthetic */ void b(x0 x0Var) {
        x0Var.i();
    }

    private static boolean e(AudioManager audioManager, int i11) {
        if (ak.k0.f477a >= 23) {
            return audioManager.isStreamMute(i11);
        }
        return f(audioManager, i11) == 0;
    }

    private static int f(AudioManager audioManager, int i11) {
        try {
            return audioManager.getStreamVolume(i11);
        } catch (RuntimeException e11) {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append("Could not retrieve stream volume for stream type ");
            sb2.append(i11);
            ak.o.i("StreamVolumeManager", sb2.toString(), e11);
            return audioManager.getStreamMaxVolume(i11);
        }
    }

    public void i() {
        int f11 = f(this.f14769d, this.f14771f);
        boolean e11 = e(this.f14769d, this.f14771f);
        if (this.f14772g == f11 && this.f14773h == e11) {
            return;
        }
        this.f14772g = f11;
        this.f14773h = e11;
        this.f14768c.v(f11, e11);
    }

    public int c() {
        return this.f14769d.getStreamMaxVolume(this.f14771f);
    }

    public int d() {
        if (ak.k0.f477a >= 28) {
            return this.f14769d.getStreamMinVolume(this.f14771f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f14770e;
        if (cVar != null) {
            try {
                this.f14766a.unregisterReceiver(cVar);
            } catch (RuntimeException e11) {
                ak.o.i("StreamVolumeManager", "Error unregistering stream volume receiver", e11);
            }
            this.f14770e = null;
        }
    }

    public void h(int i11) {
        if (this.f14771f == i11) {
            return;
        }
        this.f14771f = i11;
        i();
        this.f14768c.o(i11);
    }
}
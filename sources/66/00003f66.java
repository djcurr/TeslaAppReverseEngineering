package com.oney.WebRTCModule;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: e  reason: collision with root package name */
    static final String f18080e = "com.oney.WebRTCModule.q";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, a> f18081a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Timer f18082b = new Timer("VideoTrackMutedTimer");

    /* renamed from: c  reason: collision with root package name */
    private final int f18083c;

    /* renamed from: d  reason: collision with root package name */
    private final WebRTCModule f18084d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a implements VideoSink {

        /* renamed from: a  reason: collision with root package name */
        private TimerTask f18085a;

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f18086b;

        /* renamed from: c  reason: collision with root package name */
        private AtomicInteger f18087c = new AtomicInteger();

        /* renamed from: d  reason: collision with root package name */
        private boolean f18088d;

        /* renamed from: e  reason: collision with root package name */
        private final String f18089e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.oney.WebRTCModule.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0324a extends TimerTask {

            /* renamed from: a  reason: collision with root package name */
            private int f18091a;

            C0324a() {
                this.f18091a = a.this.f18087c.get();
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (a.this.f18086b) {
                    return;
                }
                boolean z11 = this.f18091a == a.this.f18087c.get();
                if (z11 != a.this.f18088d) {
                    a.this.f18088d = z11;
                    a.this.h(z11);
                }
                this.f18091a = a.this.f18087c.get();
            }
        }

        a(String str) {
            this.f18089e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(boolean z11) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("peerConnectionId", q.this.f18083c);
            createMap.putString("trackId", this.f18089e);
            createMap.putBoolean("muted", z11);
            String str = q.f18080e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z11 ? "Mute" : "Unmute");
            sb2.append(" event pcId: ");
            sb2.append(q.this.f18083c);
            sb2.append(" trackId: ");
            sb2.append(this.f18089e);
            Log.d(str, sb2.toString());
            q.this.f18084d.sendEvent("mediaStreamTrackMuteChanged", createMap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() {
            if (this.f18086b) {
                return;
            }
            synchronized (this) {
                TimerTask timerTask = this.f18085a;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                this.f18085a = new C0324a();
                q.this.f18082b.schedule(this.f18085a, 3000L, PrimaryButtonAnimator.HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION);
            }
        }

        void g() {
            this.f18086b = true;
            synchronized (this) {
                TimerTask timerTask = this.f18085a;
                if (timerTask != null) {
                    timerTask.cancel();
                    this.f18085a = null;
                }
            }
        }

        @Override // org.webrtc.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            this.f18087c.addAndGet(1);
        }
    }

    public q(WebRTCModule webRTCModule, int i11) {
        this.f18083c = i11;
        this.f18084d = webRTCModule;
    }

    public void d(VideoTrack videoTrack) {
        String id2 = videoTrack.id();
        if (this.f18081a.containsKey(id2)) {
            String str = f18080e;
            Log.w(str, "Attempted to add adapter twice for track ID: " + id2);
            return;
        }
        a aVar = new a(id2);
        String str2 = f18080e;
        Log.d(str2, "Created adapter for " + id2);
        this.f18081a.put(id2, aVar);
        videoTrack.addSink(aVar);
        aVar.i();
    }

    public void e(VideoTrack videoTrack) {
        String id2 = videoTrack.id();
        a remove = this.f18081a.remove(id2);
        if (remove == null) {
            String str = f18080e;
            Log.w(str, "removeAdapter - no adapter for " + id2);
            return;
        }
        videoTrack.removeSink(remove);
        remove.g();
        String str2 = f18080e;
        Log.d(str2, "Deleted adapter for " + id2);
    }
}
package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes3.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13211a;

    /* renamed from: b  reason: collision with root package name */
    private final a f13212b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13213c;

    /* loaded from: classes3.dex */
    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final InterfaceC0247b f13214a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f13215b;

        public a(Handler handler, InterfaceC0247b interfaceC0247b) {
            this.f13215b = handler;
            this.f13214a = interfaceC0247b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f13215b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f13213c) {
                this.f13214a.b();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0247b {
        void b();
    }

    public b(Context context, Handler handler, InterfaceC0247b interfaceC0247b) {
        this.f13211a = context.getApplicationContext();
        this.f13212b = new a(handler, interfaceC0247b);
    }

    public void b(boolean z11) {
        if (z11 && !this.f13213c) {
            this.f13211a.registerReceiver(this.f13212b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f13213c = true;
        } else if (z11 || !this.f13213c) {
        } else {
            this.f13211a.unregisterReceiver(this.f13212b);
            this.f13213c = false;
        }
    }
}
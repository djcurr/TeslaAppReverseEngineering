package com.oney.WebRTCModule;

import org.webrtc.VideoCapturer;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f17968a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17969b;

    /* renamed from: c  reason: collision with root package name */
    private final int f17970c;

    /* renamed from: d  reason: collision with root package name */
    protected VideoCapturer f17971d;

    public a(int i11, int i12, int i13) {
        this.f17968a = i11;
        this.f17969b = i12;
        this.f17970c = i13;
    }

    protected abstract VideoCapturer a();

    public void b() {
        VideoCapturer videoCapturer = this.f17971d;
        if (videoCapturer != null) {
            videoCapturer.dispose();
            this.f17971d = null;
        }
    }

    public int c() {
        return this.f17970c;
    }

    public int d() {
        return this.f17969b;
    }

    public int e() {
        return this.f17968a;
    }

    public void f() {
        this.f17971d = a();
    }

    public void g() {
        try {
            this.f17971d.startCapture(this.f17968a, this.f17969b, this.f17970c);
        } catch (RuntimeException unused) {
        }
    }

    public boolean h() {
        try {
            this.f17971d.stopCapture();
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }
}
package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;

/* loaded from: classes3.dex */
public class a implements NotThreadSafeBridgeIdleDebugListener, pg.a {

    /* renamed from: a  reason: collision with root package name */
    private final yf.b f11985a = yf.b.b(20);

    /* renamed from: b  reason: collision with root package name */
    private final yf.b f11986b = yf.b.b(20);

    /* renamed from: c  reason: collision with root package name */
    private final yf.b f11987c = yf.b.b(20);

    /* renamed from: d  reason: collision with root package name */
    private final yf.b f11988d = yf.b.b(20);

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f11989e = true;

    private static void c(yf.b bVar, long j11) {
        int g11 = bVar.g();
        int i11 = 0;
        for (int i12 = 0; i12 < g11; i12++) {
            if (bVar.d(i12) < j11) {
                i11++;
            }
        }
        if (i11 > 0) {
            for (int i13 = 0; i13 < g11 - i11; i13++) {
                bVar.f(i13, bVar.d(i13 + i11));
            }
            bVar.c(i11);
        }
    }

    private boolean d(long j11, long j12) {
        long f11 = f(this.f11985a, j11, j12);
        long f12 = f(this.f11986b, j11, j12);
        if (f11 == -1 && f12 == -1) {
            return this.f11989e;
        }
        return f11 > f12;
    }

    private static long f(yf.b bVar, long j11, long j12) {
        long j13 = -1;
        for (int i11 = 0; i11 < bVar.g(); i11++) {
            long d11 = bVar.d(i11);
            if (d11 >= j11 && d11 < j12) {
                j13 = d11;
            } else if (d11 >= j12) {
                break;
            }
        }
        return j13;
    }

    private static boolean g(yf.b bVar, long j11, long j12) {
        for (int i11 = 0; i11 < bVar.g(); i11++) {
            long d11 = bVar.d(i11);
            if (d11 >= j11 && d11 < j12) {
                return true;
            }
        }
        return false;
    }

    @Override // pg.a
    public synchronized void a() {
        this.f11988d.a(System.nanoTime());
    }

    @Override // pg.a
    public synchronized void b() {
        this.f11987c.a(System.nanoTime());
    }

    public synchronized boolean e(long j11, long j12) {
        boolean z11;
        boolean g11 = g(this.f11988d, j11, j12);
        boolean d11 = d(j11, j12);
        z11 = true;
        if (!g11 && (!d11 || g(this.f11987c, j11, j12))) {
            z11 = false;
        }
        c(this.f11985a, j12);
        c(this.f11986b, j12);
        c(this.f11987c, j12);
        c(this.f11988d, j12);
        this.f11989e = d11;
        return z11;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.f11986b.a(System.nanoTime());
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.f11985a.a(System.nanoTime());
    }
}
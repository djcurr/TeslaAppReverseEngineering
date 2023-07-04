package com.google.android.exoplayer2;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f14396a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14397b;

    /* renamed from: c  reason: collision with root package name */
    private final ak.b f14398c;

    /* renamed from: d  reason: collision with root package name */
    private final z0 f14399d;

    /* renamed from: e  reason: collision with root package name */
    private int f14400e;

    /* renamed from: f  reason: collision with root package name */
    private Object f14401f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f14402g;

    /* renamed from: h  reason: collision with root package name */
    private int f14403h;

    /* renamed from: i  reason: collision with root package name */
    private long f14404i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14405j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14406k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f14407l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f14408m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f14409n;

    /* loaded from: classes3.dex */
    public interface a {
        void d(t0 t0Var);
    }

    /* loaded from: classes3.dex */
    public interface b {
        void m(int i11, Object obj);
    }

    public t0(a aVar, b bVar, z0 z0Var, int i11, ak.b bVar2, Looper looper) {
        this.f14397b = aVar;
        this.f14396a = bVar;
        this.f14399d = z0Var;
        this.f14402g = looper;
        this.f14398c = bVar2;
        this.f14403h = i11;
    }

    public synchronized boolean a(long j11) {
        boolean z11;
        ak.a.f(this.f14406k);
        ak.a.f(this.f14402g.getThread() != Thread.currentThread());
        long elapsedRealtime = this.f14398c.elapsedRealtime() + j11;
        while (true) {
            z11 = this.f14408m;
            if (z11 || j11 <= 0) {
                break;
            }
            wait(j11);
            j11 = elapsedRealtime - this.f14398c.elapsedRealtime();
        }
        if (!z11) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f14407l;
    }

    public boolean b() {
        return this.f14405j;
    }

    public Looper c() {
        return this.f14402g;
    }

    public Object d() {
        return this.f14401f;
    }

    public long e() {
        return this.f14404i;
    }

    public b f() {
        return this.f14396a;
    }

    public z0 g() {
        return this.f14399d;
    }

    public int h() {
        return this.f14400e;
    }

    public int i() {
        return this.f14403h;
    }

    public synchronized boolean j() {
        return this.f14409n;
    }

    public synchronized void k(boolean z11) {
        this.f14407l = z11 | this.f14407l;
        this.f14408m = true;
        notifyAll();
    }

    public t0 l() {
        ak.a.f(!this.f14406k);
        if (this.f14404i == -9223372036854775807L) {
            ak.a.a(this.f14405j);
        }
        this.f14406k = true;
        this.f14397b.d(this);
        return this;
    }

    public t0 m(Object obj) {
        ak.a.f(!this.f14406k);
        this.f14401f = obj;
        return this;
    }

    public t0 n(int i11) {
        ak.a.f(!this.f14406k);
        this.f14400e = i11;
        return this;
    }
}
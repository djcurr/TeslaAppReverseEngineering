package com.bumptech.glide.load.engine;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
class o<Z> implements ja.c<Z> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f10687a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10688b;

    /* renamed from: c  reason: collision with root package name */
    private final ja.c<Z> f10689c;

    /* renamed from: d  reason: collision with root package name */
    private final a f10690d;

    /* renamed from: e  reason: collision with root package name */
    private final ha.b f10691e;

    /* renamed from: f  reason: collision with root package name */
    private int f10692f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10693g;

    /* loaded from: classes.dex */
    interface a {
        void d(ha.b bVar, o<?> oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(ja.c<Z> cVar, boolean z11, boolean z12, ha.b bVar, a aVar) {
        this.f10689c = (ja.c) bb.j.d(cVar);
        this.f10687a = z11;
        this.f10688b = z12;
        this.f10691e = bVar;
        this.f10690d = (a) bb.j.d(aVar);
    }

    @Override // ja.c
    public int a() {
        return this.f10689c.a();
    }

    @Override // ja.c
    public Class<Z> b() {
        return this.f10689c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void c() {
        if (!this.f10693g) {
            this.f10692f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ja.c<Z> d() {
        return this.f10689c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f10687a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        boolean z11;
        synchronized (this) {
            int i11 = this.f10692f;
            if (i11 > 0) {
                z11 = true;
                int i12 = i11 - 1;
                this.f10692f = i12;
                if (i12 != 0) {
                    z11 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z11) {
            this.f10690d.d(this.f10691e, this);
        }
    }

    @Override // ja.c
    public Z get() {
        return this.f10689c.get();
    }

    @Override // ja.c
    public synchronized void recycle() {
        if (this.f10692f <= 0) {
            if (!this.f10693g) {
                this.f10693g = true;
                if (this.f10688b) {
                    this.f10689c.recycle();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f10687a + ", listener=" + this.f10690d + ", key=" + this.f10691e + ", acquired=" + this.f10692f + ", isRecycled=" + this.f10693g + ", resource=" + this.f10689c + CoreConstants.CURLY_RIGHT;
    }
}
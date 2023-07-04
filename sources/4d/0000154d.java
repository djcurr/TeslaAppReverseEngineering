package com.bumptech.glide.load.engine;

import cb.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r<Z> implements ja.c<Z>, a.f {

    /* renamed from: e  reason: collision with root package name */
    private static final v3.f<r<?>> f10699e = cb.a.d(20, new a());

    /* renamed from: a  reason: collision with root package name */
    private final cb.c f10700a = cb.c.a();

    /* renamed from: b  reason: collision with root package name */
    private ja.c<Z> f10701b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10702c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10703d;

    /* loaded from: classes.dex */
    class a implements a.d<r<?>> {
        a() {
        }

        @Override // cb.a.d
        /* renamed from: a */
        public r<?> create() {
            return new r<>();
        }
    }

    r() {
    }

    private void c(ja.c<Z> cVar) {
        this.f10703d = false;
        this.f10702c = true;
        this.f10701b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <Z> r<Z> e(ja.c<Z> cVar) {
        r<Z> rVar = (r) bb.j.d(f10699e.b());
        rVar.c(cVar);
        return rVar;
    }

    private void f() {
        this.f10701b = null;
        f10699e.a(this);
    }

    @Override // ja.c
    public int a() {
        return this.f10701b.a();
    }

    @Override // ja.c
    public Class<Z> b() {
        return this.f10701b.b();
    }

    @Override // cb.a.f
    public cb.c d() {
        return this.f10700a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g() {
        this.f10700a.c();
        if (this.f10702c) {
            this.f10702c = false;
            if (this.f10703d) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // ja.c
    public Z get() {
        return this.f10701b.get();
    }

    @Override // ja.c
    public synchronized void recycle() {
        this.f10700a.c();
        this.f10703d = true;
        if (!this.f10702c) {
            this.f10701b.recycle();
            f();
        }
    }
}
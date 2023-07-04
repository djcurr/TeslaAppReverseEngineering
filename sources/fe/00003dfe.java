package com.google.zxing;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f17419a;

    /* renamed from: b  reason: collision with root package name */
    private uo.b f17420b;

    public c(b bVar) {
        if (bVar != null) {
            this.f17419a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public uo.b a() {
        if (this.f17420b == null) {
            this.f17420b = this.f17419a.b();
        }
        return this.f17420b;
    }

    public uo.a b(int i11, uo.a aVar) {
        return this.f17419a.c(i11, aVar);
    }

    public int c() {
        return this.f17419a.d();
    }

    public int d() {
        return this.f17419a.f();
    }

    public boolean e() {
        return this.f17419a.e().f();
    }

    public c f() {
        return new c(this.f17419a.a(this.f17419a.e().g()));
    }

    public String toString() {
        try {
            return a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
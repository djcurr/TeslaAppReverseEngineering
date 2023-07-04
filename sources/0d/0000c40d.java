package z2;

import z2.h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Object f60081a;

    /* renamed from: b  reason: collision with root package name */
    private final h.c f60082b;

    /* renamed from: c  reason: collision with root package name */
    private final h.b f60083c;

    /* renamed from: d  reason: collision with root package name */
    private final h.c f60084d;

    /* renamed from: e  reason: collision with root package name */
    private final h.b f60085e;

    public e(Object id2) {
        kotlin.jvm.internal.s.g(id2, "id");
        this.f60081a = id2;
        this.f60082b = new h.c(id2, -2);
        new h.c(id2, 0);
        this.f60083c = new h.b(id2, 0);
        this.f60084d = new h.c(id2, -1);
        new h.c(id2, 1);
        this.f60085e = new h.b(id2, 1);
        new h.a(id2);
    }

    public final h.b a() {
        return this.f60085e;
    }

    public final h.c b() {
        return this.f60084d;
    }

    public final Object c() {
        return this.f60081a;
    }

    public final h.c d() {
        return this.f60082b;
    }

    public final h.b e() {
        return this.f60083c;
    }
}
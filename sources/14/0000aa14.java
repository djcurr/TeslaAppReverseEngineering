package p4;

import p4.w;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: b  reason: collision with root package name */
    private boolean f46172b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f46173c;

    /* renamed from: e  reason: collision with root package name */
    private String f46175e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f46176f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f46177g;

    /* renamed from: a  reason: collision with root package name */
    private final w.a f46171a = new w.a();

    /* renamed from: d  reason: collision with root package name */
    private int f46174d = -1;

    private final void j(String str) {
        boolean w11;
        if (str != null) {
            w11 = kotlin.text.v.w(str);
            if (!w11) {
                this.f46175e = str;
                this.f46176f = false;
                return;
            }
            throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
        }
    }

    public final void a(h00.l<? super b, vz.b0> animBuilder) {
        kotlin.jvm.internal.s.g(animBuilder, "animBuilder");
        b bVar = new b();
        animBuilder.invoke(bVar);
        this.f46171a.b(bVar.a()).c(bVar.b()).e(bVar.c()).f(bVar.d());
    }

    public final w b() {
        w.a aVar = this.f46171a;
        aVar.d(c());
        aVar.j(f());
        if (e() != null) {
            aVar.h(e(), this.f46176f, this.f46177g);
        } else {
            aVar.g(d(), this.f46176f, this.f46177g);
        }
        return aVar.a();
    }

    public final boolean c() {
        return this.f46172b;
    }

    public final int d() {
        return this.f46174d;
    }

    public final String e() {
        return this.f46175e;
    }

    public final boolean f() {
        return this.f46173c;
    }

    public final void g(int i11, h00.l<? super e0, vz.b0> popUpToBuilder) {
        kotlin.jvm.internal.s.g(popUpToBuilder, "popUpToBuilder");
        i(i11);
        j(null);
        e0 e0Var = new e0();
        popUpToBuilder.invoke(e0Var);
        this.f46176f = e0Var.a();
        this.f46177g = e0Var.b();
    }

    public final void h(boolean z11) {
        this.f46172b = z11;
    }

    public final void i(int i11) {
        this.f46174d = i11;
        this.f46176f = false;
    }
}
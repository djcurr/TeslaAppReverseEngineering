package c8;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class p implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8987a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8988b;

    /* renamed from: c  reason: collision with root package name */
    private final b8.h f8989c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8990d;

    public p(String str, int i11, b8.h hVar, boolean z11) {
        this.f8987a = str;
        this.f8988b = i11;
        this.f8989c = hVar;
        this.f8990d = z11;
    }

    @Override // c8.c
    public x7.c a(com.airbnb.lottie.a aVar, d8.b bVar) {
        return new x7.q(aVar, bVar, this);
    }

    public String b() {
        return this.f8987a;
    }

    public b8.h c() {
        return this.f8989c;
    }

    public boolean d() {
        return this.f8990d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f8987a + ", index=" + this.f8988b + CoreConstants.CURLY_RIGHT;
    }
}
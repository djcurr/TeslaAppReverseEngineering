package c8;

import android.graphics.Path;

/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final g f8927a;

    /* renamed from: b  reason: collision with root package name */
    private final Path.FillType f8928b;

    /* renamed from: c  reason: collision with root package name */
    private final b8.c f8929c;

    /* renamed from: d  reason: collision with root package name */
    private final b8.d f8930d;

    /* renamed from: e  reason: collision with root package name */
    private final b8.f f8931e;

    /* renamed from: f  reason: collision with root package name */
    private final b8.f f8932f;

    /* renamed from: g  reason: collision with root package name */
    private final String f8933g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f8934h;

    public e(String str, g gVar, Path.FillType fillType, b8.c cVar, b8.d dVar, b8.f fVar, b8.f fVar2, b8.b bVar, b8.b bVar2, boolean z11) {
        this.f8927a = gVar;
        this.f8928b = fillType;
        this.f8929c = cVar;
        this.f8930d = dVar;
        this.f8931e = fVar;
        this.f8932f = fVar2;
        this.f8933g = str;
        this.f8934h = z11;
    }

    @Override // c8.c
    public x7.c a(com.airbnb.lottie.a aVar, d8.b bVar) {
        return new x7.h(aVar, bVar, this);
    }

    public b8.f b() {
        return this.f8932f;
    }

    public Path.FillType c() {
        return this.f8928b;
    }

    public b8.c d() {
        return this.f8929c;
    }

    public g e() {
        return this.f8927a;
    }

    public String f() {
        return this.f8933g;
    }

    public b8.d g() {
        return this.f8930d;
    }

    public b8.f h() {
        return this.f8931e;
    }

    public boolean i() {
        return this.f8934h;
    }
}
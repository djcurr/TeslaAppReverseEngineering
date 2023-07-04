package c1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final z0 f8461a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8462b;

    /* renamed from: c  reason: collision with root package name */
    private d1.c<Object> f8463c;

    public f0(z0 scope, int i11, d1.c<Object> cVar) {
        kotlin.jvm.internal.s.g(scope, "scope");
        this.f8461a = scope;
        this.f8462b = i11;
        this.f8463c = cVar;
    }

    public final d1.c<Object> a() {
        return this.f8463c;
    }

    public final int b() {
        return this.f8462b;
    }

    public final z0 c() {
        return this.f8461a;
    }

    public final boolean d() {
        return this.f8461a.s(this.f8463c);
    }

    public final void e(d1.c<Object> cVar) {
        this.f8463c = cVar;
    }
}
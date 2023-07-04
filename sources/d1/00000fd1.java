package c8;

/* loaded from: classes.dex */
public class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8970a;

    /* renamed from: b  reason: collision with root package name */
    private final b8.b f8971b;

    /* renamed from: c  reason: collision with root package name */
    private final b8.b f8972c;

    /* renamed from: d  reason: collision with root package name */
    private final b8.l f8973d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8974e;

    public l(String str, b8.b bVar, b8.b bVar2, b8.l lVar, boolean z11) {
        this.f8970a = str;
        this.f8971b = bVar;
        this.f8972c = bVar2;
        this.f8973d = lVar;
        this.f8974e = z11;
    }

    @Override // c8.c
    public x7.c a(com.airbnb.lottie.a aVar, d8.b bVar) {
        return new x7.p(aVar, bVar, this);
    }

    public b8.b b() {
        return this.f8971b;
    }

    public String c() {
        return this.f8970a;
    }

    public b8.b d() {
        return this.f8972c;
    }

    public b8.l e() {
        return this.f8973d;
    }

    public boolean f() {
        return this.f8974e;
    }
}
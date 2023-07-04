package zp;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final l f60616a;

    /* renamed from: b  reason: collision with root package name */
    private final nq.c f60617b;

    /* renamed from: c  reason: collision with root package name */
    private final nq.c f60618c;

    /* renamed from: d  reason: collision with root package name */
    private final nq.c f60619d;

    /* renamed from: e  reason: collision with root package name */
    private final nq.c f60620e;

    public i(l lVar, nq.c cVar, nq.c cVar2, nq.c cVar3, nq.c cVar4) {
        this.f60616a = lVar;
        this.f60617b = cVar;
        this.f60618c = cVar2;
        if (cVar3 != null) {
            this.f60619d = cVar3;
            this.f60620e = cVar4;
            return;
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }

    public nq.c a() {
        return this.f60620e;
    }

    public nq.c b() {
        return this.f60619d;
    }

    public nq.c c() {
        return this.f60617b;
    }

    public l d() {
        return this.f60616a;
    }

    public nq.c e() {
        return this.f60618c;
    }
}
package t6;

/* loaded from: classes.dex */
public final class p implements e7.j {

    /* renamed from: a  reason: collision with root package name */
    private final j7.a<String> f51692a;

    /* renamed from: b  reason: collision with root package name */
    private final j7.a<String> f51693b;

    /* renamed from: c  reason: collision with root package name */
    private final j7.a<String> f51694c;

    /* renamed from: d  reason: collision with root package name */
    private final j7.a<String> f51695d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f51696e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f51697f;

    public p(j7.a<String> holderNameState, j7.a<String> bankAccountNumberState, j7.a<String> sortCodeState, j7.a<String> shopperEmailState, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(holderNameState, "holderNameState");
        kotlin.jvm.internal.s.g(bankAccountNumberState, "bankAccountNumberState");
        kotlin.jvm.internal.s.g(sortCodeState, "sortCodeState");
        kotlin.jvm.internal.s.g(shopperEmailState, "shopperEmailState");
        this.f51692a = holderNameState;
        this.f51693b = bankAccountNumberState;
        this.f51694c = sortCodeState;
        this.f51695d = shopperEmailState;
        this.f51696e = z11;
        this.f51697f = z12;
    }

    public final j7.a<String> a() {
        return this.f51693b;
    }

    public final j7.a<String> b() {
        return this.f51692a;
    }

    public final j7.a<String> c() {
        return this.f51695d;
    }

    public final j7.a<String> d() {
        return this.f51694c;
    }

    public final boolean e() {
        return this.f51697f;
    }

    public final boolean f() {
        return this.f51696e;
    }

    public boolean g() {
        return this.f51692a.a().a() && this.f51693b.a().a() && this.f51694c.a().a() && this.f51695d.a().a() && this.f51696e && this.f51697f;
    }
}
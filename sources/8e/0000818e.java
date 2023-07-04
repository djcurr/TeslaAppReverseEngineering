package l0;

/* loaded from: classes.dex */
public final class n0<S> {

    /* renamed from: d  reason: collision with root package name */
    public static final int f36218d = 0;

    /* renamed from: a  reason: collision with root package name */
    private final c1.o0 f36219a;

    /* renamed from: b  reason: collision with root package name */
    private final c1.o0 f36220b;

    /* renamed from: c  reason: collision with root package name */
    private final c1.o0 f36221c;

    public n0(S s11) {
        c1.o0 d11;
        c1.o0 d12;
        c1.o0 d13;
        d11 = c1.s1.d(s11, null, 2, null);
        this.f36219a = d11;
        d12 = c1.s1.d(s11, null, 2, null);
        this.f36220b = d12;
        d13 = c1.s1.d(Boolean.FALSE, null, 2, null);
        this.f36221c = d13;
    }

    public final S a() {
        return (S) this.f36219a.getValue();
    }

    public final S b() {
        return (S) this.f36220b.getValue();
    }

    public final void c(S s11) {
        this.f36219a.setValue(s11);
    }

    public final void d(boolean z11) {
        this.f36221c.setValue(Boolean.valueOf(z11));
    }

    public final void e(S s11) {
        this.f36220b.setValue(s11);
    }
}
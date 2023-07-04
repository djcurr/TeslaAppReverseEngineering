package f2;

/* loaded from: classes.dex */
public final class f implements y {

    /* renamed from: a  reason: collision with root package name */
    private final j f25573a;

    /* renamed from: b  reason: collision with root package name */
    private final l f25574b;

    /* renamed from: c  reason: collision with root package name */
    private final m f25575c;

    public f(j measurable, l minMax, m widthHeight) {
        kotlin.jvm.internal.s.g(measurable, "measurable");
        kotlin.jvm.internal.s.g(minMax, "minMax");
        kotlin.jvm.internal.s.g(widthHeight, "widthHeight");
        this.f25573a = measurable;
        this.f25574b = minMax;
        this.f25575c = widthHeight;
    }

    @Override // f2.j
    public int S(int i11) {
        return this.f25573a.S(i11);
    }

    @Override // f2.j
    public int T(int i11) {
        return this.f25573a.T(i11);
    }

    @Override // f2.y
    public m0 X(long j11) {
        int u11;
        int S;
        if (this.f25575c == m.Width) {
            if (this.f25574b == l.Max) {
                S = this.f25573a.T(x2.b.m(j11));
            } else {
                S = this.f25573a.S(x2.b.m(j11));
            }
            return new h(S, x2.b.m(j11));
        }
        if (this.f25574b == l.Max) {
            u11 = this.f25573a.a(x2.b.n(j11));
        } else {
            u11 = this.f25573a.u(x2.b.n(j11));
        }
        return new h(x2.b.n(j11), u11);
    }

    @Override // f2.j
    public int a(int i11) {
        return this.f25573a.a(i11);
    }

    @Override // f2.j
    public Object t() {
        return this.f25573a.t();
    }

    @Override // f2.j
    public int u(int i11) {
        return this.f25573a.u(i11);
    }
}
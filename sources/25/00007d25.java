package k20;

/* loaded from: classes5.dex */
public final class p0 extends z0 {

    /* renamed from: a  reason: collision with root package name */
    private final w00.s0 f34309a;

    /* renamed from: b  reason: collision with root package name */
    private final vz.k f34310b;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<d0> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final d0 invoke() {
            return q0.b(p0.this.f34309a);
        }
    }

    public p0(w00.s0 typeParameter) {
        vz.k b11;
        kotlin.jvm.internal.s.g(typeParameter, "typeParameter");
        this.f34309a = typeParameter;
        b11 = vz.m.b(kotlin.b.PUBLICATION, new a());
        this.f34310b = b11;
    }

    private final d0 d() {
        return (d0) this.f34310b.getValue();
    }

    @Override // k20.y0
    public boolean a() {
        return true;
    }

    @Override // k20.y0
    public k1 b() {
        return k1.OUT_VARIANCE;
    }

    @Override // k20.y0
    public d0 getType() {
        return d();
    }

    @Override // k20.y0
    public y0 m(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
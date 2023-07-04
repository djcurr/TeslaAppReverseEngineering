package q00;

/* loaded from: classes5.dex */
public class a extends y00.l<f<?>, vz.b0> {

    /* renamed from: a  reason: collision with root package name */
    private final k f47085a;

    public a(k container) {
        kotlin.jvm.internal.s.g(container, "container");
        this.f47085a = container;
    }

    @Override // y00.l, w00.k
    /* renamed from: p */
    public f<?> l(kotlin.reflect.jvm.internal.impl.descriptors.e descriptor, vz.b0 data) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(data, "data");
        return new l(this.f47085a, descriptor);
    }

    @Override // w00.k
    /* renamed from: q */
    public f<?> i(w00.i0 descriptor, vz.b0 data) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(data, "data");
        int i11 = (descriptor.J() != null ? 1 : 0) + (descriptor.N() != null ? 1 : 0);
        if (descriptor.L()) {
            if (i11 == 0) {
                return new m(this.f47085a, descriptor);
            }
            if (i11 == 1) {
                return new n(this.f47085a, descriptor);
            }
            if (i11 == 2) {
                return new o(this.f47085a, descriptor);
            }
        } else if (i11 == 0) {
            return new r(this.f47085a, descriptor);
        } else {
            if (i11 == 1) {
                return new s(this.f47085a, descriptor);
            }
            if (i11 == 2) {
                return new t(this.f47085a, descriptor);
            }
        }
        throw new b0("Unsupported property: " + descriptor);
    }
}
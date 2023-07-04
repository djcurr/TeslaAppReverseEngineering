package w00;

import java.util.List;
import k20.k1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class a implements s0 {

    /* renamed from: a  reason: collision with root package name */
    private final s0 f55284a;

    /* renamed from: b  reason: collision with root package name */
    private final i f55285b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55286c;

    public a(s0 originalDescriptor, i declarationDescriptor, int i11) {
        kotlin.jvm.internal.s.g(originalDescriptor, "originalDescriptor");
        kotlin.jvm.internal.s.g(declarationDescriptor, "declarationDescriptor");
        this.f55284a = originalDescriptor;
        this.f55285b = declarationDescriptor;
        this.f55286c = i11;
    }

    @Override // w00.s0
    public j20.n K() {
        return this.f55284a.K();
    }

    @Override // w00.s0
    public boolean P() {
        return true;
    }

    @Override // w00.j, w00.i
    public i b() {
        return this.f55285b;
    }

    @Override // w00.l
    public n0 f() {
        return this.f55284a.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f55284a.getAnnotations();
    }

    @Override // w00.s0
    public int getIndex() {
        return this.f55286c + this.f55284a.getIndex();
    }

    @Override // w00.y
    public u10.f getName() {
        return this.f55284a.getName();
    }

    @Override // w00.s0
    public List<k20.d0> getUpperBounds() {
        return this.f55284a.getUpperBounds();
    }

    @Override // w00.s0, w00.e
    public k20.w0 i() {
        return this.f55284a.i();
    }

    @Override // w00.s0
    public k1 k() {
        return this.f55284a.k();
    }

    @Override // w00.e
    public k20.k0 n() {
        return this.f55284a.n();
    }

    public String toString() {
        return this.f55284a + "[inner-copy]";
    }

    @Override // w00.s0
    public boolean v() {
        return this.f55284a.v();
    }

    @Override // w00.i
    public <R, D> R v0(k<R, D> kVar, D d11) {
        return (R) this.f55284a.v0(kVar, d11);
    }

    @Override // w00.i
    public s0 a() {
        s0 a11 = this.f55284a.a();
        kotlin.jvm.internal.s.f(a11, "originalDescriptor.original");
        return a11;
    }
}
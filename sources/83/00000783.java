package androidx.lifecycle;

import androidx.lifecycle.p0;
import androidx.lifecycle.s0;

/* loaded from: classes.dex */
public final class r0<VM extends p0> implements vz.k<VM> {

    /* renamed from: a  reason: collision with root package name */
    private final n00.d<VM> f5211a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.a<t0> f5212b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.a<s0.b> f5213c;

    /* renamed from: d  reason: collision with root package name */
    private VM f5214d;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(n00.d<VM> viewModelClass, h00.a<? extends t0> storeProducer, h00.a<? extends s0.b> factoryProducer) {
        kotlin.jvm.internal.s.g(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.s.g(storeProducer, "storeProducer");
        kotlin.jvm.internal.s.g(factoryProducer, "factoryProducer");
        this.f5211a = viewModelClass;
        this.f5212b = storeProducer;
        this.f5213c = factoryProducer;
    }

    @Override // vz.k
    /* renamed from: a */
    public VM getValue() {
        VM vm2 = this.f5214d;
        if (vm2 == null) {
            VM vm3 = (VM) new s0(this.f5212b.invoke(), this.f5213c.invoke()).a(g00.a.b(this.f5211a));
            this.f5214d = vm3;
            return vm3;
        }
        return vm2;
    }

    @Override // vz.k
    public boolean isInitialized() {
        return this.f5214d != null;
    }
}
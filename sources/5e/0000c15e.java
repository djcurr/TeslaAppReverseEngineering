package y10;

import java.util.List;
import k20.d0;

/* loaded from: classes5.dex */
public class b extends g<List<? extends g<?>>> {

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<w00.x, d0> f58965b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends g<?>> value, h00.l<? super w00.x, ? extends d0> computeType) {
        super(value);
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(computeType, "computeType");
        this.f58965b = computeType;
    }

    @Override // y10.g
    public d0 a(w00.x module) {
        kotlin.jvm.internal.s.g(module, "module");
        d0 invoke = this.f58965b.invoke(module);
        if (!t00.h.c0(invoke) && !t00.h.o0(invoke)) {
            t00.h.B0(invoke);
        }
        return invoke;
    }
}
package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public d<?> f35448a;

    public abstract void a(d<?> dVar, Object obj);

    public final d<?> b() {
        d<?> dVar = this.f35448a;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.s.x("atomicOp");
        return null;
    }

    public abstract Object c(d<?> dVar);

    public final void d(d<?> dVar) {
        this.f35448a = dVar;
    }
}
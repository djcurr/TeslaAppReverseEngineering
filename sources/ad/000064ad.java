package d;

import c1.v1;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g<I, O> extends androidx.activity.result.d<I> {

    /* renamed from: a  reason: collision with root package name */
    private final a<I> f23244a;

    /* renamed from: b  reason: collision with root package name */
    private final v1<f.a<I, O>> f23245b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(a<I> launcher, v1<? extends f.a<I, O>> contract) {
        s.g(launcher, "launcher");
        s.g(contract, "contract");
        this.f23244a = launcher;
        this.f23245b = contract;
    }

    @Override // androidx.activity.result.d
    public f.a<I, ?> a() {
        return (f.a<I, O>) this.f23245b.getValue();
    }

    @Override // androidx.activity.result.d
    public void c(I i11, androidx.core.app.b bVar) {
        this.f23244a.a(i11, bVar);
    }

    @Override // androidx.activity.result.d
    public void d() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
package s2;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final v f50068a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<h0> f50069b;

    public c0(v platformTextInputService) {
        kotlin.jvm.internal.s.g(platformTextInputService, "platformTextInputService");
        this.f50068a = platformTextInputService;
        this.f50069b = new AtomicReference<>(null);
    }

    public final h0 a() {
        return this.f50069b.get();
    }

    public final void b() {
        this.f50068a.d();
    }

    public final void c() {
        if (this.f50069b.get() != null) {
            this.f50068a.e();
        }
    }

    public h0 d(a0 value, m imeOptions, h00.l<? super List<? extends d>, vz.b0> onEditCommand, h00.l<? super l, vz.b0> onImeActionPerformed) {
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(imeOptions, "imeOptions");
        kotlin.jvm.internal.s.g(onEditCommand, "onEditCommand");
        kotlin.jvm.internal.s.g(onImeActionPerformed, "onImeActionPerformed");
        this.f50068a.f(value, imeOptions, onEditCommand, onImeActionPerformed);
        h0 h0Var = new h0(this, this.f50068a);
        this.f50069b.set(h0Var);
        return h0Var;
    }

    public void e(h0 session) {
        kotlin.jvm.internal.s.g(session, "session");
        if (this.f50069b.compareAndSet(session, null)) {
            this.f50068a.b();
        }
    }
}
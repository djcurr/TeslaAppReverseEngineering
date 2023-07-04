package b6;

import java.util.UUID;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class l implements d {

    /* renamed from: a  reason: collision with root package name */
    private final UUID f7507a;

    /* renamed from: b  reason: collision with root package name */
    private final d6.c<?> f7508b;

    public l(UUID requestId, d6.c<?> target) {
        s.g(requestId, "requestId");
        s.g(target, "target");
        this.f7507a = requestId;
        this.f7508b = target;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public boolean a() {
        return !s.c(g6.e.g(this.f7508b.getView()).b(), this.f7507a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    @Override // b6.d
    public void dispose() {
        if (a()) {
            return;
        }
        g6.e.g(this.f7508b.getView()).a();
    }
}
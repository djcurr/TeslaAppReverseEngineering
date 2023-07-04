package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f35591a = AtomicLongFieldUpdater.newUpdater(f.class, "number");
    private volatile /* synthetic */ long number = 1;

    public final long a() {
        return f35591a.incrementAndGet(this);
    }
}
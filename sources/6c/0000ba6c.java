package vy;

import hy.l;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes5.dex */
public final class g extends hy.l {

    /* renamed from: d  reason: collision with root package name */
    private static final j f54716d = new j("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())));

    /* renamed from: c  reason: collision with root package name */
    final ThreadFactory f54717c;

    public g() {
        this(f54716d);
    }

    @Override // hy.l
    public l.c c() {
        return new h(this.f54717c);
    }

    public g(ThreadFactory threadFactory) {
        this.f54717c = threadFactory;
    }
}
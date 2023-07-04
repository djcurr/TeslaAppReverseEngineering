package jf;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public class b implements f {

    /* renamed from: b  reason: collision with root package name */
    private final Executor f33469b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f33470c;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f33472e;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f33468a = Executors.newFixedThreadPool(2, new n(10, "FrescoIoBoundExecutor", true));

    /* renamed from: d  reason: collision with root package name */
    private final Executor f33471d = Executors.newFixedThreadPool(1, new n(10, "FrescoLightWeightBackgroundExecutor", true));

    public b(int i11) {
        this.f33469b = Executors.newFixedThreadPool(i11, new n(10, "FrescoDecodeExecutor", true));
        this.f33470c = Executors.newFixedThreadPool(i11, new n(10, "FrescoBackgroundExecutor", true));
        this.f33472e = Executors.newScheduledThreadPool(i11, new n(10, "FrescoBackgroundExecutor", true));
    }

    @Override // jf.f
    public Executor a() {
        return this.f33471d;
    }

    @Override // jf.f
    public Executor b() {
        return this.f33468a;
    }

    @Override // jf.f
    public ScheduledExecutorService c() {
        return this.f33472e;
    }

    @Override // jf.f
    public Executor d() {
        return this.f33469b;
    }

    @Override // jf.f
    public Executor e() {
        return this.f33470c;
    }

    @Override // jf.f
    public Executor f() {
        return this.f33468a;
    }

    @Override // jf.f
    public Executor g() {
        return this.f33468a;
    }
}
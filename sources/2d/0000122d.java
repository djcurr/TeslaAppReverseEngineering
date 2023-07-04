package coil.memory;

import androidx.lifecycle.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import v20.a2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil/memory/BaseRequestDelegate;", "Lcoil/memory/RequestDelegate;", "Landroidx/lifecycle/p;", "lifecycle", "Lv20/a2;", "job", "<init>", "(Landroidx/lifecycle/p;Lv20/a2;)V", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class BaseRequestDelegate extends RequestDelegate {

    /* renamed from: a  reason: collision with root package name */
    private final p f9309a;

    /* renamed from: b  reason: collision with root package name */
    private final a2 f9310b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRequestDelegate(p lifecycle, a2 job) {
        super(null);
        s.g(lifecycle, "lifecycle");
        s.g(job, "job");
        this.f9309a = lifecycle;
        this.f9310b = job;
    }

    @Override // coil.memory.RequestDelegate
    public void a() {
        this.f9309a.c(this);
    }

    @Override // coil.memory.RequestDelegate
    public void b() {
        a2.a.a(this.f9310b, null, 1, null);
    }
}
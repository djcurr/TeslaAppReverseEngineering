package coil.memory;

import androidx.lifecycle.u;
import b6.g;
import g6.e;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import r5.d;
import v20.a2;
import z5.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcoil/memory/ViewTargetRequestDelegate;", "Lcoil/memory/RequestDelegate;", "Lr5/d;", "imageLoader", "Lb6/g;", "request", "Lz5/t;", "targetDelegate", "Lv20/a2;", "job", "<init>", "(Lr5/d;Lb6/g;Lz5/t;Lv20/a2;)V", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class ViewTargetRequestDelegate extends RequestDelegate {

    /* renamed from: a  reason: collision with root package name */
    private final d f9311a;

    /* renamed from: b  reason: collision with root package name */
    private final g f9312b;

    /* renamed from: c  reason: collision with root package name */
    private final t f9313c;

    /* renamed from: d  reason: collision with root package name */
    private final a2 f9314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTargetRequestDelegate(d imageLoader, g request, t targetDelegate, a2 job) {
        super(null);
        s.g(imageLoader, "imageLoader");
        s.g(request, "request");
        s.g(targetDelegate, "targetDelegate");
        s.g(job, "job");
        this.f9311a = imageLoader;
        this.f9312b = request;
        this.f9313c = targetDelegate;
        this.f9314d = job;
    }

    @Override // coil.memory.RequestDelegate
    public void b() {
        a2.a.a(this.f9314d, null, 1, null);
        this.f9313c.a();
        e.o(this.f9313c, null);
        if (this.f9312b.G() instanceof u) {
            this.f9312b.v().c((u) this.f9312b.G());
        }
        this.f9312b.v().c(this);
    }

    public final void d() {
        this.f9311a.a(this.f9312b);
    }
}